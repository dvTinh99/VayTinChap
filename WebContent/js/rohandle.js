$(document).ready(function(){
	listObj = `[{"list":[{"tenTC":"So dien thoai","alias":"SDT","quyen":0,"thamDinh":true,"thongTin":"SDTCN002"},{"tenTC":"Dia chi ","alias":"DC","quyen":2,"thamDinh":true,"thongTin":"DIACHI002"},{"tenTC":"Dia chi dang ki tren so ho khau","alias":"DCSHK","quyen":0,"thamDinh":true,"thongTin":"SSHK002"},{"tenTC":"So dien thoai tham chieu","alias":"SDTTT","quyen":0,"thamDinh":true,"thongTin":"SDTXN002"},{"tenTC":"Ma so thue cong ty","alias":"MST","quyen":2,"thamDinh":true,"thongTin":"MSTCY002"},{"tenTC":"Luong","alias":"L","quyen":2,"thamDinh":true,"thongTin":"20000000"},{"tenTC":"Hinh thuc nhan luong","alias":"HTNL","quyen":2,"thamDinh":true,"thongTin":"HTNL002"},{"tenTC":"Hop dong lao dong","alias":"HDLD","quyen":0,"thamDinh":true,"thongTin":"SHDLD002"},{"tenTC":"Bao hiem y te","alias":"BHYT","quyen":2,"thamDinh":true,"thongTin":"SBHYT002"},{"tenTC":"Ngay vao lam viec","alias":"NVLV","quyen":2,"thamDinh":true,"thongTin":"1995/03/11"},{"tenTC":"So tien vay","alias":"STV","quyen":0,"thamDinh":true,"thongTin":"200000000"},{"tenTC":"Thoi Han Vay","alias":"THV","quyen":1,"thamDinh":false,"thongTin":"11"}],"tenKH":"Nguyen Chi Cong","cmnd":"SCMND002 ","gioiTinh":false,"tinhTrang":"4","idHoSo":"0886087791"},{"list":[{"tenTC":"So dien thoai","alias":"SDT","quyen":0,"thamDinh":false,"thongTin":"SDTCN003"},{"tenTC":"Dia chi ","alias":"DC","quyen":2,"thamDinh":true,"thongTin":"DIACHI003"},{"tenTC":"Dia chi dang ki tren so ho khau","alias":"DCSHK","quyen":0,"thamDinh":false,"thongTin":"SSHK003"},{"tenTC":"So dien thoai tham chieu","alias":"SDTTT","quyen":0,"thamDinh":true,"thongTin":"SDTXN003"},{"tenTC":"Ma so thue cong ty","alias":"MST","quyen":2,"thamDinh":true,"thongTin":"MST003"},{"tenTC":"Luong","alias":"L","quyen":2,"thamDinh":true,"thongTin":"200000000"},{"tenTC":"Hinh thuc nhan luong","alias":"HTNL","quyen":2,"thamDinh":true,"thongTin":"HTNL003"},{"tenTC":"Hop dong lao dong","alias":"HDLD","quyen":0,"thamDinh":true,"thongTin":"SHDLD003"},{"tenTC":"Bao hiem y te","alias":"BHYT","quyen":2,"thamDinh":true,"thongTin":"SBHYT003"},{"tenTC":"Ngay vao lam viec","alias":"NVLV","quyen":2,"thamDinh":true,"thongTin":"20112/04/11"},{"tenTC":"So tien vay","alias":"STV","quyen":0,"thamDinh":true,"thongTin":"200000000"},{"tenTC":"Thoi Han Vay","alias":"THV","quyen":1,"thamDinh":false,"thongTin":"22"}],"tenKH":"DINH VAN TOAN","cmnd":"SCMND003 ","gioiTinh":false,"tinhTrang":"4","idHoSo":"1780200993"}]`;
	listObjchuaro = {};
	listObjdaro = {};
	
	
	containerTable = $(".container.table");
	lastIDSelected = -1;
	
	tachObj = listO => {
		let newList = {};
		$.each(listO, (k,v) => {
			let cmnd = v.cmnd.trim();
			if (listO[k].trangThai == "4") listObjchuaro[v.cmnd] = v;
			else listObjdaro[v.cmnd] = v;
			newList[v.cmnd] = v;
		});
		listObj = newList;
	}
	
	var tabbar = $('#lisitems');
	listObj = JSON.parse(listObj);
	tachObj(listObj);
	setListItem(listObj, tabbar);
//	$.get("./hosothamdinhro",
//	{
//	  name: "Donald Duck",
//	  city: "Duckburg"
//	}, function(data, status){
//		var tabbar = $('#lisitems');
//		listObj = JSON.parse(data);
//		tachObj(listObj);
//		setListItem(listObj, tabbar);
//	});
	
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
			case "#chua":listSelected = listObjchuaro; break;
			case "#xong":listSelected = listObjdaro; break;
			default: console.log("ko dc");
		}
		setListItem(listSelected, tabbar);
		initializationevent();
	});
	
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
		let divtc = $(div).addClass("col-sm-6").text(tc);
		let divtt = $(div).addClass("col-sm-6").text(thongtin);
		divrow.append(divtc, divtt);
		return divrow;
	}
	
	themghichu = info => {
		$("#textareahistory").text(info.lichSuGoi);
		$("#textareastatus").text(info.noteTinhTrang);
	}
});