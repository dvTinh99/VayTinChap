$(document).ready( function() {
	tablekh = $("#tablekh");
	tablecty = $("#tablecty");
	
	typeofsubmit = '#formcty';
	
	$('#formkh').click(function() {
		$(this).addClass('itemselected');
		$('#formcty').removeClass('itemselected');
		$('#inputitem1').attr('placeholder', 'Tên khách hàng').attr('name', 'tenkh').parent().parent().siblings('label').text('Tên khách hàng');
		$('#inputitem2').attr('placeholder', 'Ngày sinh').attr('name', 'ngsinh').parent().parent().siblings('label').text('Ngày sinh');
		$('#inputitem3').attr('placeholder', 'Số CMND').attr('name', 'socmnd').parent().parent().siblings('label').text('Số CMND');
		$('#typeofsubmit').val('formkh');
		tablekh.css("display", "block");
		tablecty.css("display", "none");
	});
	
	$('#formcty').click(function() {
		$(this).addClass('itemselected');
		$('#formkh').removeClass('itemselected');
		$('#inputitem1').attr('placeholder', 'Tên công ty').attr('name', 'tencty').parent().parent().siblings('label').text('Tên công ty');
		$('#inputitem2').attr('placeholder', 'Mã số thuế').attr('name', 'msthue').parent().parent().siblings('label').text('Mã số thuế');
		$('#inputitem3').attr('placeholder', 'Địa chỉ').attr('name', 'diachi').parent().parent().siblings('label').text('Địa chỉ');
		$('#typeofsubmit').val('formkh');
		tablekh.css("display", "none");
		tablecty.css("display", "block");
	});
	
	$('.btnreset').click(function() {
		$(this).siblings('input').val('');
	});
	
});