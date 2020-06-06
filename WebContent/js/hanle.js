$(document).ready(function () {
	$('#listall').click(function () {
		$(this).addClass('tabselected');
		$('#listchua, #listxong').removeClass('tabselected');
	});
	$('#listchua').click(function () {
		$(this).addClass('tabselected');
		$('#listall, #listxong').removeClass('tabselected');
	});
	$('#listxong').click(function () {
		$(this).addClass('tabselected');
		$('#listchua, #listall').removeClass('tabselected');
	});
	$('#searchreset').click(function () {
		$('#search').val('');
	});
});

$(document).ready(function() {
	var sidebar = ``
	var top = ``
	var row = ``
	
	$('#top').append(top);
	$('#sidebar').append(sidebar);
	$('#row').append(row);
});