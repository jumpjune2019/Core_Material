window.addEventListener("load", init, false);
function init() {

	// get the H1 tag with the id of "h1" and when clicking
	// it will console.log it's content 
	
	var h1Elem = document.getElementById("h1");
	var onClickFunc = function (evt) {
		console.log(evt.currentTarget.innerText);
	}
	h1Elem.addEventListener("click", onClickFunc, false);
	
	var h2Elem = document.getElementById("h2contextmenu");
	var onContextMenuFunc = function (evt) {
		
		console.log(evt.currentTarget.innerText);
		evt.preventDefault();
	}
	h2Elem.addEventListener("contextmenu", onContextMenuFunc, false);	
	
	var toElem = document.getElementById("todo");
	var onTodoClickFunc = function (evt) {
		console.log(evt.target.innerText);
	}
	toElem.addEventListener("click", onTodoClickFunc, false);	

	var wishElem = document.getElementById("wishlist");
	var onWishClickFunc = function (evt) {
		console.log("wishlist fired");
		console.log(evt.target.innerText);
	}
	wishElem.addEventListener("click", onWishClickFunc, false);	

	var beHealthyElem = document.getElementById("behealthy");
	var onBeHealthyClickFunc = function (evt) {
		evt.stopPropagation();
		console.log("behealthy fired");
		console.log(evt.target.innerText);
	}
	beHealthyElem.addEventListener("click", onBeHealthyClickFunc, false);	
	
	var addSurviveBtn = document.getElementById("addSurvive");
	
	var onAddSurviveFunc = function (evt) {
		console.log('oh yeah!');
		var todoElem = document.getElementById("todo");
		var childrenCollection = todo.children;
		var firstItem = childrenCollection[0];
		var tag = document.createElement("li");
		var textNode = document.createTextNode("Survive");
		tag.appendChild(textNode);
		todoElem.insertBefore(tag, todoElem.childNodes[2]);
	}
	addSurviveBtn.addEventListener("click", onAddSurviveFunc, false);	
	
}
