var serializeToJson = function(qs) {
	qs = qs || location.search.slice(1);
	var pairs = qs.split('&');
	var result = {};
	pairs.forEach(function(p) {
		var pair = p.split('=');
		var key = pair[0];
		var value = decodeURIComponent(pair[1] || '');

		if (result[key]) {
			if (Object.prototype.toString.call(result[key]) === '[object Array]') {
				result[key].push(value);
			} else {
				result[key] = [result[key], value];
			}
		} else {
			result[key] = value;
		}
	});
	return JSON.stringify(result);
}

var openLoader = function(options) {
	HoldOn.open(options);
}

var closeLoader = function() {
	HoldOn.close();
}

var confirmDialog = function(options) {
	$.confirm({
		title: options.title,
		content: options.content,
		theme: 'black',
		buttons: {
			confirm: function() {
		options.confirm;
	},
		cancel: function() {
			options.cancle;
		}
		}
	});
}

var notify = function(options) {
	jNotify.push(options.title, options.message, {
		delay: options.delay, //2500
		fadeDelay: options.fadedelay, //1000
		closeButton: options.closeBtn,
		titleBold: options.bold,
		offset: options.offset, //40
	});
}
