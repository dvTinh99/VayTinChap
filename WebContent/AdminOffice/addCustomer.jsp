<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
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
								<a id="formcty" href="#012345">Danh sách công ty</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#012345">Thêm hồ sơ</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#012345" class="itemselected">Thêm công ty</a>
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
					<div class="nothing">
						<form id="form-add-customer" action="./themkhachhang" method="POST">
							<div class="row">
								<div class="col-sm-4">
									<div class="locate-again">
										<div class="col-input">
											<div class="inputitem">
												<label for="">Tên khách hàng<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" required="required" placeholder="Tên công ty"></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Địa chỉ<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder="Đơn vị: triệu đồng"></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Số điện thoại xác nhận<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder="Địa chỉ công ty"></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Số hợp đồng lao động<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder="Địa chỉ công ty"></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Hình thức nhận lương<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder="Địa chỉ công ty"></input>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="locate-again">
										<div class="col-input">
											<div class="inputitem">
												<label for="">Số CMND/Hộ chiếu<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Số điện thoại cá nhân<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Số sổ hộ khẩu<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Số bảo hiểm y tế<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="locate-again">
										<div class="col-input">
											<div class="inputitem">
												<label for="">Số tiền vay<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Thời hạn vay<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Mã số thuế công ty làm việc<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Ngày vào làm việc<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="">Lương<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="" name="" placeholder=""></input>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</form>
						<div class="bottom">
							<button class="btn btn-warning" form="form-add-customer" type="reset">Hủy</button>
							<button class="btn btn-info" form="form-add-customer" type="submit" value="submit">Lưu</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>