describe("Our first test!", function () {
	describe("JS overrides", function() {
		it("backupAlert must have a .name of alert", function () {
			expect(backupAlert.name).toBe("alert");
		});
		it("window.alert must have a .name of myNewAlert", function () {
			expect(window.alert.name).toBe("myNewAlert");
		});
	});

	describe("Main app functions", function() {
		it("myTest must return Hello World", function () {
			expect(myTest()).toBe("Hello World");
		});
	});
	
	describe("SpyOn backupAlert", function() {
		beforeEach(function() {
			oldBackupAlert = backupAlert;
			backupAlert = spyOn(window, "backupAlert");
			alert('test');
		});
		
		it("is backupAlert being called?", function () {
			expect(backupAlert).toHaveBeenCalled();
		});
		
		it("backupAlert has to be called only 1 time", function() {
			 // compatible with older versions of Jasmine
			 expect(backupAlert.calls.count()).toEqual(1);
		});
		
		it("Yvonne's version of backupAlert has to be called only 1 time", function() {
			 // supported by newer versions of jasmine
			 expect(backupAlert).toHaveBeenCalledTimes(1);
		});
		
		afterEach(function() {
			backupAlert = oldBackupAlert;
		});
	});
});