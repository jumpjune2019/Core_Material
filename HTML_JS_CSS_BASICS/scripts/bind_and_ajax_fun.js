window.addEventListener("load", init, false);
function init() {
	
	var xhr = new XMLHttpRequest();
	
	xhr.successCallBack = function() {

		function flexible() {
			console.log(this.name);
		}

		// I am an array, if I can be parsed correctly
		var data = JSON.parse(xhr.responseText);

		var flexArrFuncs = [];
		var length = data.data.length;
		var x;

		// assigning dynamically
		for(x = 0; x < length; x++) {
			flexArrFuncs.push(flexible.bind(data.data[x]));
		}
		
		var btn;
		var br;
		
		// dynamically create buttons and assign them to the DOM
		var length = flexArrFuncs.length;
		for(x = 0; x < length; x++) {
			btn = document.createElement("button");
			btn.innerHTML = "Button " + (x + 1);
			btn.addEventListener("click", flexArrFuncs[x]);
			document.body.appendChild(btn);
			if(x < (length - 1)) {
				br = document.createElement("br");
				document.body.appendChild(br);
			}
		}
		
		btn.click();
	}
	
	xhr.failureCallback = function() {
		alert('Request failed.  Returned status of ' + xhr.status);
	}
	
	xhr.open('GET', 'data/bind_and_ajax_fun.json');

	xhr.onload = function() {
		if (xhr.status === 200) {
			xhr.successCallBack();
		}
		else {
			xhr.failureCallback();
		}
	};
	xhr.send();
}