var newScope = {
	"scope": "I'm a callback scope"
}

function init() {

	console.log("*****************");
	console.log("scope has scope: " + this.scope);
	console.log("*****************\n\n");

	function flexible( ) {
		console.log(this.name);
	}

	// binding allows scope to be attached
	// without invoking the method
	// as opposed to .call or .apply

	var flex1 = flexible.bind({
		name: "Claude"
	}), 
	flex2 = flexible.bind({
		name: "Schnookums"
	}),
	flex3 = flexible.bind({
		name: "Lulu"
	});
	
	flex1();
	flex2();
	flex3();
	
}
init = init.bind(newScope);
window.addEventListener("load", init, false);