$(document).ready(function(){
	listObj = `[{"lichSuGoi":"2018-04-20","noteTinhTrang":"khach hang khong song tai dia chi cung cap","trangThai":2,"list":[],"tenKH":"Le Thi Thanh Ha","cmnd":"125478546","ngaySinh":"Aug 15, 1976","gioiTinh":false},{"lichSuGoi":"2018-09-13","noteTinhTrang":"Khach hang tu choi lam ho so vay","trangThai":1,"list":[{"tenTC":"So dien thoai","alias":"SDT","quyen":0,"thamDinh":true,"thongTin":"0986410654"},{"tenTC":"Dia chi dang ki tren so ho khau","alias":"DCSHK","quyen":0,"thamDinh":false,"thongTin":"To 14. phuong Hoa Xuan, quan Cam Le, Da Nang"},{"tenTC":"So dien thoai tham chieu","alias":"SDTTT","quyen":0,"thamDinh":false,"thongTin":"0986410645;0986410646;0986410647"},{"tenTC":"Hop dong lao dong","alias":"HDLD","quyen":0,"thamDinh":false,"thongTin":"124"}],"tenKH":"Nguyen Quy Hoi","cmnd":"231546952","ngaySinh":"Sep 6, 1997","gioiTinh":false}]`;
	listObjchuacv = {};
	listObjdacv = {};
	
	
	containerTable = $(".container.table");
	lastIDSelected = -1;
	
	tachObj = listO => {
		let newList = {};
		$.each(listO, (k,v) => {
			let cmnd = v.cmnd.trim();
			if (listO[k].trangThai == "1") listObjchuacv[cmnd] = v;
			else listObjdacv[cmnd] = v;
			newList[cmnd] = v;
		});
		listObj = newList;
	}
	
	var tabbar = $('#lisitems');
//	listObj = JSON.parse(listObj);
//	tachObj(listObj);
//	setListItem(listObj, tabbar);
	$.get("./hosothamdinhcv",
	{
	  name: "Donald Duck",
	  city: "Duckburg"
	}, function(data, status){
		var tabbar = $('#lisitems');
		listObj = JSON.parse(data);
		tachObj(listObj);
		setListItem(listObj, tabbar);
	});
	
	function setListItem(listObj, container, condition){
		$.each(listObj, function(k, v) {
			if (condition == undefined || v.trangThai == condition){
				var item = $('<div></div>').attr('class', 'iteminleftmenu');
				var a = $('<a></a>').attr({
					'href': '#' + k, 
					'id'	: v.cmnd }).text(v.tenKH);
					item.append(a);
					container.append(item);
			}
		});
		initializationevent();
	};
	
	emptyTabbar = () => {
		$("#lisitems").empty();
	};
	
	$("div.tabbar a").click(function (){
		emptyTabbar();
		
		$(this).siblings("a").removeClass("tabselected");
		$(this).addClass("tabselected");
		console.log($(this).attr("href"));
		
		let listSelected = null;
		switch ($(this).attr("href").toString()){
			case "#all": listSelected = listObj; break;
			case "#chua":listSelected = listObjchuacv; break;
			case "#xong":listSelected = listObjdacv; break;
			default: console.log("ko dc");
		}
		setListItem(listSelected, tabbar);
		initializationevent();
	});
	
	function initializationevent(){
		$("#lisitems .iteminleftmenu a").click(function() {
			let id = $(this).attr("href").replace("#", "");
			if (lastIDSelected != id){
				lastIDSelected = id;
				containerTable.children().remove(".row.tr")
				lietKeThongTin(listObj[id]);
			}
		});
	};
	
	lietKeThongTin = (info) => {
		containerTable.append(themrow("Tên khách hàng", info.tenKH).append($("<input type='hidden' name='idHoSo' value='" + info.idHoSo + "'/>")));
		containerTable.append(themrow("Chứng minh nhân dân", info.cmnd));
		containerTable.append(themrow("Giới tính", info.gioiTinh ? "Nữ" : "Nam"));
		containerTable.append(themrow("Ngày sinh", info.ngaySinh));
		
		$.each(info.list, (k, v) => {
			containerTable.append(themrow(info.list[k].tenTC, info.list[k].thongTin, info.list[k].quyen, info.list[k].thamDinh, info.list[k].alias));
		});
		themghichu(info);
	}
	
	themrow = (tc, thongtin, quyen, thamdinh, name) => {
		let div = "<div></div>";
		let input = "<input type='radio'>";
		let divrow = $(div).addClass("row tr");
		let divtc = $(div).addClass("col-sm-4").text(tc);
		let divtt = $(div).addClass("col-sm-6").text(thongtin);
		let divtrue = $(div).addClass("col-sm-1");
		let divfalse = $(div).addClass("col-sm-1");
		if (quyen == 0 || quyen == 2){
			let inputtrue = $(input).attr("name", name).val("1");
			let inputfalse = $(input).attr("name", name).val("0");
			if (thamdinh != undefined){
				if (thamdinh) inputtrue.prop("checked", true);
				else inputfalse.prop("checked", true);
			}
			divtrue.append(inputtrue);
			divfalse.append(inputfalse);
		}
		divrow.append(divtc, divtt, divtrue, divfalse);
		return divrow;
	}
	
	themghichu = info => {
		$("#textareahistory").text(info.lichSuGoi);
		$("#textareastatus").text(info.noteTinhTrang);
	}
});