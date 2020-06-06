<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Danh sách công ty</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./css/frame.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

	<script type="text/javascript" src='./js/adminhandle.js' charset="UTF-8"></script>
</head>
<body>
	<div class="container-fuild">
		<div class="">
			<div class='sidebar'>
				<div class="frameavatar">
					<div class="frameavatarinner">
						<img src="./img/avatar.jpg" width="100%">
					</div>
				</div>
				<div class="horizontaltab">
					<div class="horizontaltabinner">
						<div class="listitems">
							<div class="iteminleftmenu">
								<a id="formkh" href="#012345">Danh sách khách hàng</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#012345" class="itemselected">Danh sách công ty</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#012345">Thêm hồ sơ</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#012345">Thêm công ty</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="main">
				<div class="container">
					<div class="top">
						<button class="btn btn-info">Logout</button>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<div class="flex-table">
								<div class="flex-row th sticky-top">
									<div class="flex-grow-3 td">
										<div class="searchitem">
											<div class="style-scope-inner">
												<input class="search" id='inputitem2' type="text" name="ngaysinh" placeholder="Tìm theo tên công ty">
												<span id="searchreset" class="btnreset">x</span>
											</div>
										</div>
										<div>Tên Công ty</div>
									</div>
									<div class="flex-grow-2 td">
										<div class="searchitem">
											<div class="style-scope-inner">
												<input class="search" id='inputitem2' type="text" name="ngaysinh" placeholder="Tìm theo mã số thuế">
												<span id="searchreset" class="btnreset">x</span>
											</div>
										</div>Mã số thuế</div>
									<div class="flex-grow-2 td">
										<div class="searchitem">
											<div class="style-scope-inner">
												<input class="search" id='inputitem2' type="text" name="ngaysinh" placeholder="Địa chỉ">
												<span id="searchreset" class="btnreset">x</span>
											</div>
										</div>
										<div>Địa chỉ</div>
									</div>
									<div class="flex-grow-2 td">
										<div class="searchitem">
											<div class="style-scope-inner">
												<input class="search" id='inputitem2' type="text" name="ngaysinh" placeholder="Loại công ty">
												<span id="searchreset" class="btnreset">x</span>
											</div>
										</div>
										<div>Loại công ty</div>
									</div>
									<div class="flex-grow-2 td">
										<div class="searchitem">
											<div class="style-scope-inner">
												<input class="search" id='inputitem2' type="text" name="ngaysinh" placeholder="Tình trạng">
												<span id="searchreset" class="btnreset">x</span>
											</div>
										</div>
										<div>Tình trạng</div>
									</div>
								</div>
								<div id="contenttable" class="flex-table-content">
									<div class="flex-row tr">
										<div class="flex-grow-3 td">Fpt Software</div>
										<div class="flex-grow-2 td">012365910</div>
										<div class="flex-grow-2 td">Nam Kỳ Khởi Nghĩa - Ngũ Hành Sơn</div>
										<div class="flex-grow-2 td">PS</div>
										<div class="flex-grow-2 td">Đang Hoạt động</div>
									</div>
									<div class="flex-row tr">
										<div class="flex-grow-3 td">TNHH MTV SandagoSG</div>
										<div class="flex-grow-2 td">16848461684</div>
										<div class="flex-grow-2 td">Bán đảo Sơn Trà</div>
										<div class="flex-grow-2 td">Không hỗ trợ</div>
										<div class="flex-grow-2 td">Vốn điều lệ thấp</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>