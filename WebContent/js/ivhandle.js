$(document).ready(function(){
	listObj = `[{"sdt":"SDTCN001","diaChi":"Dia Chi 001","trangThai":3,"tenKH":"DOAN VAN TINH","cmnd":"SCMND001 ","gioiTinh":false,"idHoSo":"8523584641"},{"sdt":"SDTCN002","diaChi":"DIACHI002","trangThai":3,"tenKH":"Nguyen Chi Cong","cmnd":"SCMND002 ","gioiTinh":false,"idHoSo":"0886087791"},{"sdt":"SDTCN003","diaChi":"DIACHI003","trangThai":3,"tenKH":"DINH VAN TOAN","cmnd":"SCMND003 ","gioiTinh":false,"idHoSo":"1780200993"}]`;
	listObjchuaiv = {};
	listObjdaiv = {};
	
	
	containerTable = $(".container.table");
	lastIDSelected = -1;
	
	tachObj = listO => {
		let newList = {};
		$.each(listO, (k,v) => {
			let cmnd = v.cmnd.trim();
			if (listO[k].trangThai == "3") listObjchuaiv[cmnd] = v;
			else listObjdaiv[cmnd] = v;
			newList[cmnd] = v;
		});
		listObj = newList;
	}
	
	var tabbar = $('#lisitems');
	listObj = JSON.parse(listObj);
	tachObj(listObj);
	setListItem(listObj, tabbar);
//	$.get("./hosothamdinhiv",
//	{
//	  name: "Donald Duck",
//	  city: "Duckburg"
//	}, function(data, status){
//		var tabbar = $('#lisitems');
//		listObj = JSON.parse(data);
//		tachObj(listObj);
//		setListItem(listObj, tabbar);
//	});
	
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
			case "#chua":listSelected = listObjchuaiv; break;
			case "#xong":listSelected = listObjdaiv; break;
			default: console.log("ko dc");
		}
		setListItem(listSelected, tabbar);
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
		containerTable.append(themrow("Số hồ sơ", info.idHoSo));
		containerTable.append(themrow("Tên khách hàng", info.tenKH).append($("<input type='hidden' name='idHoSo' value='" + info.idHoSo + "'/>")));
		containerTable.append(themrow("Chứng minh nhân dân", info.cmnd));
		containerTable.append(themrow("Giới tính", info.gioiTinh ? "Nữ" : "Nam"));
		containerTable.append(themrow("Ngày sinh", info.ngaySinh));
		containerTable.append(themrow("Địa chỉ", info.diaChi));
		
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