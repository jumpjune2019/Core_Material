// the immediate function as a closure
// self executes
// (function(){})()
(function(window) {
	var	launchFn,
		JUMPJS = {
			launchMyApp: function(fn) {
				launchFn = fn;
			}
		},
		initJUMPJS = function() {
			launchFn.call(JUMPJS);
		}
	
	if ( typeof window === "object" && typeof window.document === "object" ) {
		window.JUMPJS = window.$ = JUMPJS;
	} 
	
	window.onload = initJUMPJS;
	
})(window);

// the instance returned by the immediate function.
$.launchMyApp(function() {
	console.log("I am as ready as they come");
});