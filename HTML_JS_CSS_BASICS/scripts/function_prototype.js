window.addEventListener("load", myTest, false);
window.addEventListener("load", myTest2, false);
var backupAlert = window.alert;

window.alert = function myNewAlert(msg) {
	function backupAlert() {
		console.log("end of day, still inside this scope!!!");
	}
	
	// console.log(msg);
	backupAlert(msg);
}

function myTest() {
	var msg;
	// msg = "foobar";
	// msg = "hello world";
	msg	= "Hello World";
	alert(msg);
	return msg;
}
function myTest2() {
	// console.log("Can I play too?");
	backupAlert2("Can I play too? Please??");
}
