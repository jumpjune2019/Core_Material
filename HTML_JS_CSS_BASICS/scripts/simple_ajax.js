window.addEventListener("load", init, false);
function init() {

	// the AJAX functionality a browser provides via JS
	var xhr = new XMLHttpRequest();
	// when status == 200, the file is loaded successfully
	// the callback will be executed;

	xhr.successCallBack = function() {
		console.log(xhr.responseText);
		var obj = JSON.parse(xhr.responseText);
		debugger;
	}

	// hitting a failure
	xhr.failureCallback = function() {
		console.log('Request failed.  Returned status of ' + xhr.status);
	}
	// setting up the file to load
	// this will fail
	// xhr.open('GET', 'data/simple_ajax_1.json');
	
	xhr.open('GET', 'data/simple_ajax.json');
	
	// setting up the event and wait for the file to load
	
	// students will look up this event and figure out how to trigger it!
	xhr.onerror = function() {
		console.log("Oh crap! Poop has hit the fan!!");
		console.log("status = " + xhr.status);
	}
	
	xhr.onload = function() {
		if (xhr.status === 200) {
			xhr.successCallBack();
		}
		else {
			xhr.failureCallback();
		}
	};
	
	// peeking at the inner of the AJAX lifecycle
	// 
/*	xhr.onreadystatechange = function() {
		console.log("readyState: " + xhr.readyState);
		
		// case 0 and 1 - not all browsers will display
		// especially newer ones.

		switch(xhr.readyState) {
			case 0:
				console.log("UNSENT: The XMLHttpRequest client has been created, but the open() method hasn't been called yet.");
			break;

			case 1:
				console.log("OPENED: open() method has been invoked. During this state, the request headers can be set using the setRequestHeader() method and the send() method can be called which will initiate the fetch.");
				
			break;
			
			case 2:
				console.log("HEADERS_RECEIVED: send() has been called, and headers and status are available.");
			break;

			case 3:
				console.log("LOADING: Response's body is being received. If responseType is 'text' or empty string, responseText will have the partial text response as it loads.");
			break;
			
			case 4:
				console.log("DONE: The fetch operation is complete. This could mean that either the data transfer has been completed successfully or failed.");
			break;
			
		}
	} */
	
	// invoking the AJAX call
	xhr.send();
}
