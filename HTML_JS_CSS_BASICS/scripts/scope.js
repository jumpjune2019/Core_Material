window.addEventListener("load", init, false);
function init() {
		// was for the purpose of checking the scaffolding of this app
		console.log("*** was for the purpose of checking the scaffolding of this app ***");
		console.log("this works");
		console.log("\n");
		
		// demo straightforward function call with parameters
		function func1(name, starsign) {
			console.log(name + " " + starsign);
		}
		
		console.log("*** demo straightforward function call with parameters ***");
		func1("Claude", "Cancer");
		func1("Alex", "Libra");
		console.log("\n");
		
		// the ability to pass scope using this	
		function flexibleFunc() {
			console.log(this.name + " " + this.starsign + this.dob);
		}
		
		var aScope = {
			name: "Victoria",  starsign: "Leo", dob: "July 27"
		}

		console.log("*** the ability to pass scope using this ***");		
		flexibleFunc.call(aScope);
		console.log("\n");
		
		// listing 3 ways of creating functions
		// typical function definition
		function myNormalFunction() {}
		
		// anonymous function attached to var
		var myVarNoNameFunction = function() {}
		
		// function declaration attached to var
	    var myVarNameFunction = function iGotName() {}

		// demonstration of using scope to create a factory pattern
		// where an expected method is provided from objects
		function factoryPatternFunction() {
			console.log(this.toString());
		}
		
		var factoryObj1 = {
			name: "Yvonne",
			starsign: "Sagittarius",
			toString: function() {
				return this.name + " " + this.starsign;
			}
		}
		
		var factoryObj2 = {
			food: "pizza",
			condiments: "cheese, sauce, pepperoni",
			toString: function() {
				return this.food + ": condiments > " + this.condiments;
			}
		}

		console.log("*** demonstration of using scope to create a factory pattern ");		
		console.log("    where an expected method is provided from objects ***");		
		flexibleFunc.call(aScope);
		console.log("\n");

		factoryPatternFunction.call(factoryObj1);
		factoryPatternFunction.call(factoryObj2);
}
