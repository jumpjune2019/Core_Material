var Model = (function() {

	var data = [];
	var widgets = [];
	var scope;
	var view;

	var constructor = function() {
		this.Add = function(item) {
			data.push(item);
			this.refreshWidgets(view, this);
		};
		
		this.Delete = function(val) {
			var itemIdx = data.indexOf(val);
			data.splice(itemIdx, 1);
			this.refreshWidgets(view, this);
		
		};

		this.notDuplicate = function(val) {
			result = false;
			if(this.getData().indexOf(val) == -1) {
				result = true;
			}
			return result;
		}

		this.getData = function() {
			return data;
		}
		
		this.getCount = function() {
			return data.length;
		};
		
		this.setScope = function(s) {
			scope = s;
		};
		
		this.setView = function(v) {
			view = v;
		};
		
		this.registerWidget = function(widget) {
			// expect view to have it's refresh method
			widgets.push(widget);
		};
		
		this.refreshWidgets = function(mainview, model) {
			// will loop if any views are around and invoke their refresh method
			var x; l = widgets.length;
			if(l) {
				for(x = 0; x < l; x++) {
					widgets[x].refresh.apply(widgets[x], [mainview, scope, model]);
				}
			}		
		};
		
		// for testing content in console.log();
		this.toString = function() {
			return data.split(",");
		};
		
	};
	
	return new constructor();
	
});