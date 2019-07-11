window.addEventListener("load", init, false);
function init() {
		// simple hoisting when a variable in a function has the same name
		// as the variable in the parent the process is called hoisting

		console.log("*** simple hoisting when a variable in a function has the same name ***");
		console.log("*** as the variable in the parent the process is called hoisting ***");
		console.log("\n");
		
		var parentVar = "I'm the real parent!";
		var singleVar = "I'm just single...";

		function hoisting() {
			console.log("*** logging to console from the hoisting function which is inside init() ***");
			var parentVar = "Where's the real slim parent in da house?";
			console.log("parentVar: " + parentVar);
			console.log("singleVar: " + singleVar);
			console.log("\n");
		}
		hoisting();
		console.log("*** logging to console from the init function ***");
		console.log("parentVar: " + parentVar);
		console.log("singleVar: " + singleVar);
		console.log("\n");
		
		// simple closure - a function whose execution context doesn't die
		console.log("*** simple closure - a function whose execution context doesn't die ***");
		console.log("\n");
		
		var iAintAvailableGoAway = "Bug Off!";
		
		var myClosureDef = function() {
			
			var namePrefix = "Name: ";
			this.gimmeSomething = "Whatever: ";
			
			return function myClosure(name, newPrefix) {

				if(!this.gimmeSomething) {
					this.gimmeSomething = gimmeSomething;
				}

				if(!name) {
					name = "Default";
				}

				if(newPrefix) {
					namePrefix = newPrefix;
				}

				console.log(namePrefix + " " + name);
				console.log(iAintAvailableGoAway);
				console.log(this.gimmeSomething);
			}
		}

		var myUseOfClosure = myClosureDef();
		var myUseOfClosure2 = myClosureDef();
		
		myUseOfClosure.call({
			gimmeSomething: "Whatever else!"
		}, "Claude", "Master: ");
		
		myUseOfClosure2.call({
			gimmeSomething: "Whatever you say!"
		}, "Joseph");
		
		myUseOfClosure2.call();
		
}
