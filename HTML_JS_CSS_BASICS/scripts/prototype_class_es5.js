window.onload = init;
function init() {

	// ES5 "class"
	function Person (name) {
		this.name = name;
	}
	// method for the class
	Person.prototype.identify = function identify () {
		console.log("\nI am " + this.name);
	}
// ES5 "class"
	function Contractor (name, type) {
		Person.call(this, name, "contractor");
		this.type = type;
	}
	// creating an instance to generate a constructor
	// polymorphism at work JS style
	Contractor.prototype = Object.create(Person.prototype);
	Contractor.prototype.constructor = Contractor;
	// Ensuring we link the relationship
	Contractor.parent = Person.prototype;
	// Creating a super class
	// polymorphism at work JS style
	Contractor.prototype.identify = function() {
		this.constructor.parent.identify.call(this);
		console.log("Contractor Type: " + this.type);
	} 	
	// instance in action
	var person = new Person("Claude");
	person.identify();
	var contractor = new Contractor("Ben", "Repairs");
	contractor.identify();

	// extending a class live at run time!
	Person.prototype.addToThePain = function addToThePain (whateverHurts) {
		console.log(whateverHurts);
	}
	person.addToThePain("my back hurts like crazy!");
	contractor.addToThePain("my toes hurt like hell!");
	
}