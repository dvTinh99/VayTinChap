$(document).ready(function() {
	
	listObj = ``;
	
	
	var selecteditem = $("a.itemselected");
	displayselected(selecteditem);
	console.log(selecteditem);
	
	function setselected(tag) {
		$("div.iteminleftmenu a").removeClass("itemselected");
		$(tag).addClass("itemselected");		
	}
	
	function displayselected(tag) {
		$("div.layer-master div.layer-item").css("display", "none")
		$($(tag).attr("href")).css("display", "block")
	}
	
	$("div.iteminleftmenu a").click(function() {
		setselected(this)
		displayselected(this);
	})
	
	$("div.style-scope-inner span.btnreset").click(function() {
		$(this).siblings("input").val("");
	});
});