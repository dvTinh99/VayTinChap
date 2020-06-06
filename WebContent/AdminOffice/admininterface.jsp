<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Danh sách công ty</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./css/frame.css">
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
								<a id="formkh" href="#listcustomer">Danh sách khách hàng</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#listcompany" class="itemselected">Danh sách công ty</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#addcustomer">Thêm hồ sơ</a>
							</div>
							<div class="iteminleftmenu">
								<a id="formcty" href="#addcompany">Thêm công ty</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="main">
				<div class="container">
					<div class="top">
						<a href="./logout" class="btn btn-info">Logout</a>
					</div>
					<div class="layer-master">
						<div id="listcustomer" class="layer-item">
							<div class="flex-table">
								<div class="th sticky-top">
									<div class="flex-row">
										<div class="flex-grow-3 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="khachhang" placeholder="Hồ sơ">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="cvstatus" placeholder="CV status">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="fvstatus" placeholder="FV status">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="ivstatus" placeholder="IV status">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="rostatus" placeholder="RO status">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="company" placeholder="Công ty">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-3 td">
											<div class="searchitem">
												<a href="#addcustomer" class="spanbtn">+ Thêm hồ sơ</a>
											</div>
										</div>
									</div>
									<div class="flex-row">
										<div class="flex-grow-3 td">
											<div>Hồ sơ</div>
										</div>
										<div class="flex-grow-2 td">
											<div>CV status</div>
										</div>
										<div class="flex-grow-2 td">
											<div>FV status</div>
										</div>
										<div class="flex-grow-2 td">
											<div>IV status</div>
										</div>
										<div class="flex-grow-2 td">
											<div>RO status</div>
										</div>
										<div class="flex-grow-2 td">
											<div>Công ty</div>
										</div>
										<div class="flex-grow-3 td">
											<div>Trạng thái</div>
										</div>
										
									</div>
								</div>
								<div id="contenttable" class="flex-table-content">
									<div class="flex-row tr">
										<div class="flex-grow-3 td">Hồ sơ</div>
										<div class="flex-grow-2 td">CV status</div>
										<div class="flex-grow-2 td">Đây là đài tiếng nói Việt Nam, phát thanh từ đài phát thanh Hà Nội</div>
										<div class="flex-grow-2 td">IV status</div>
										<div class="flex-grow-2 td">RO status</div>
										<div class="flex-grow-2 td">Công ty</div>
										<div class="flex-grow-3 td">Trạng thái</div>
									</div>
									<div class="flex-row tr">
										<div class="flex-grow-3 td">Hồ sơ</div>
										<div class="flex-grow-2 td">CV status</div>
										<div class="flex-grow-2 td">FV status</div>
										<div class="flex-grow-2 td">IV status</div>
										<div class="flex-grow-2 td">RO status</div>
										<div class="flex-grow-2 td">Công ty</div>
										<div class="flex-grow-3 td">Trạng thái</div>
									</div>
								</div>
							</div>
						</div>
					
						<div id="listcompany" class="layer-item">
							<div class="flex-table">
								<div class="th sticky-top">
									<div class="flex-row">
										<div class="flex-grow-3 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="name" placeholder="Tìm theo tên công ty">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="mst" placeholder="Tìm theo mã số thuế"/>
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="address" placeholder="Địa chỉ">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='' type="text" name="type" placeholder="Loại công ty">
													<span id="" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="flex-grow-2 td">
											<div class="searchitem">
												<a href="#addcustomer" class="spanbtn">+ Thêm công ty</a>
											</div>
										</div>
									</div>
									<div class="flex-row">
										<div class="flex-grow-3 td">
											<div>Tên Công ty</div>
										</div>
										<div class="flex-grow-2 td">
											<div>Mã số thuế</div>
										</div>
										<div class="flex-grow-2 td">
											<div>Địa chỉ</div>
										</div>
										<div class="flex-grow-2 td">
											<div>Loại công ty</div>
										</div>
										<div class="flex-grow-2 td">
											<div>Tình trạng</div>
										</div>
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
						<div id="addcompany" class="layer-item">
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
														<input id="tienvaythucte" name="mst" placeholder="Mã số thuế"></input>
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
													<textarea id="textareastatus" placeholder="Ghi rõ lí do nếu công ty không được hỗ trợ" rows="8" name="ghichu" dirname="ghichu.dir" required></textarea>
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

						<div id="addcustomer" class="layer-item">
							<div class="nothing">
								<form id="form-add-customer" action="./themkhachhang" method="POST">
									<div class="row">
										<div class="col-sm-4">
											<div class="locate-again">
												<div class="col-input">
													<div class="inputitem">
														<label for="">Số CMND/Hộ chiếu<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="cmnd" placeholder="Số CMND/Hộ chiếu"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Tên khách hàng<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="name" required="required" placeholder="Tên khách hàng"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Giới tính<span class="important">*</span></label>
														<div class="inputiteminner">
															<div class="row">
																<div class="col-sm-6">
																	<input style="width: 30px;" id="male" name="gender" type="radio" value="1"/>
																	Nam
																</div>
																<div class="col-sm-6">
																	<input style="width: 30px;" id="female" name="gender" type="radio" value="0"/>
																	Nữ
																</div>
															</div>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Ngày sinh<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="cmnd" placeholder="Số CMND/Hộ chiếu"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Địa chỉ<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="address" placeholder="Địa chỉ"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Số hợp đồng lao động<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="sohdld" placeholder="Số hợp đồng lao động"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Hình thức nhận lương<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="typenhanluong" placeholder="Hình thức nhận lương"></input>
														</div>
													</div>
												</div>
											</div>
										</div>
										<div class="col-sm-4">
											<div class="locate-again">
												<div class="col-input">
													<div class="inputitem">
														<label for="">Số điện thoại cá nhân<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="sdt" placeholder="Số điện thoại cá nhân"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Số điện thoại xác nhận<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="sdtxacnhan" placeholder="Số điện thoại xác nhận"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Số sổ hộ khẩu<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="soshk" placeholder="Số sổ hộ khẩu"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Số bảo hiểm y tế<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="sobhyt" placeholder="Số bảo hiểm y tế"></input>
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
															<input id="" type="number" name="sotienvay" placeholder="Số tiền vay"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Thời hạn vay<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" type="number" name="thoihanvay" placeholder="Thời hạn vay"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Mã số thuế công ty làm việc<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="mstcty" placeholder="Mã số thuế công ty làm việc"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Ngày vào làm việc<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" name="ngaylamviec" placeholder="Ngày vào làm việc"></input>
														</div>
													</div>
													<div class="inputitem">
														<label for="">Lương<span class="important">*</span></label>
														<div class="inputiteminner">
															<input id="" type="number" name="luong" placeholder="Lương"></input>
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
		</div>
	</div>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

	<script type="text/javascript" src='./js/adminhandle.js' charset="UTF-8"></script>
</body>
</html>