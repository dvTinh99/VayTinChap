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
						<form id="form-add-company" action="./themcongty" method="POST">
							<div class="row">
								<div class="col-sm-6">
									<div class="content-inner">
										<div class="col-input">
											<div class="inputitem">
												<label for="tienvaythucte">Tên công ty<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="tienvaythucte" name="name" required="required" placeholder="Tên công ty"></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="tienvaythucte">Mã số thuế<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="tienvaythucte" name="mst" placeholder="Đơn vị: triệu đồng"></input>
												</div>
											</div>
											<div class="inputitem">
												<label for="tienvaythucte">Địa chỉ công ty<span class="important">*</span></label>
												<div class="inputiteminner">
													<input id="tienvaythucte" name="address" placeholder="Địa chỉ công ty"></input>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="content-inner">
										<div class="col-input">
											<div class="inputitem">
												<label for="tienvaythucte">Loại hỗ trợ<span class="important">*</span></label>
												<select required="required" name="type">
													<option disabled selected value hidden>---Chọn loại ưu tiên---</option>
													<option value="1">Hỗ trợ ưu tiên</option>
													<option value="2">Hỗ trợ không ưu tiên</option>
													<option value="3">Không hỗ trợ</option>
												</select>
											</div>
											<div class="textarea">
												<label for="textareastatus">Tình trạng<span class="important">*</span></label>
												<textarea id="textareastatus" placeholder="Ghi rõ lí do nếu đánh rớt" rows="8" name="ghichu" dirname="ghichu" required></textarea>
											</div>
										</div>
									</div>
								</div>
							</div>
						</form>
						<div class="bottom">
							<button class="btn btn-warning" form="form-add-company" type="reset">Hủy</button>
							<button class="btn btn-info" form="form-add-company" type="submit" value="submit">Lưu</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>