<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="common.Variable" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>Welcome <%=request.getAttribute(Variable.TYPE_OF_USER) %></title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="./css/frame.css">
	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	
		<script type="text/javascript" src='<%=request.getAttribute(Variable.THE_JSFILE_INTERFACE) %>' charset="UTF-8"></script>
		<script type="text/javascript" src='<%=request.getAttribute(Variable.THE_JSFILE_HANDLE) %>' charset="UTF-8"></script>
	</head>
	<body>
		<div class="container-fuild">
			<div class="">
				<div id="sidebar" class='sidebar'>
					<div class="info">
						<div class="container avatar">
							<img src="./img/avatar.jpg" width="100%">
						</div>
						<div class="searchbar">
							<div class="style-scope">
								<input class="search" id='search' type="text" name="search" placeholder="Search">
								<span id="searchreset" class="btnreset">x</span>
							</div>
						</div>
					</div>
					<div class="leftmenuinner">
						<div class="leftmenuinnerinner">
							<div class="tabbar">
								<a id="listall" href="#all">Tất cả</a>
								<a id="listchua" href="#chua">Chưa RO</a>
								<a id="listxong" href="#xong" class="tabselected">Đã RO</a>
							</div>
							<div id='lisitems'>
								
							</div>
						</div>
					</div>
				</div>
				<div id="main" class="main">
					<div class="container">
						<div id='top' class="top">
							<button name="submit" form="thamdinhhoso" value="success" class="btn btn-info">Hoàn tất</button>
							<button name="submit" form="thamdinhhoso" value="reject" class="btn btn-warning">Đánh rớt</button>
						</div>
						<div id="row" class="row">
							<div class="col-sm-6 center">
								<div class="container table">
									<div class="row th stickytop">
										<div class="col-sm-6">
											Tiêu chí
										</div>
										<div class="col-sm-6">
											Thông tin
										</div>
									</div>
								</div>
							</div>
							<div class="col-sm-3 center">
								<div class="col-input stickytop">
									<form id="thamdinhhoso" action="./hosothamdinhro" method="POST">
										<div class="inputitem">
											<label for="tienvaythucte">Số tiền vay thực tế</label>
											<div class="inputiteminner">
												<input id="tienvaythucte" placeholder="Đơn vị: triệu đồng"></input>
											</div>
										</div>
										<div class="inputitem">
											<label for="thoihanvay">Thời hạn vay</label>
											<div class="inputiteminner">
												<input id="thoihanvay" placeholder="Đơn vị: tháng"></input>
											</div>
										</div>
										<div class="inputitem">
											<label for="laisuat">Lãi suất</label>
											<div class="inputiteminner">
												<input id="laisuat" placeholder="Đơn vị phần trăm"></input>
											</div>
										</div>
										<div class="inputitem">
											<label for="thoigianky">Thời gian ký hợp đồng</label>
											<div class="inputiteminner">
												<input id="thoigianky" placeholder="dd-mm-YYYY"></input>
											</div>
										</div>
									</form>
								</div>
							</div>
							<div class="col-sm-3 center">
								<div class="stickytop">
									<div class="textarea">
										<label for="textareahistory">Lịch sử hẹn</label>
										<textarea form="thamdinhhoso" name="callhistory" dirname="callhistory.dir" rows="8" id="textareahistory" placeholder="dd/mm/YYYY: Ghi chú"></textarea>
									</div>
									<div class="textarea">
										<label for="textareastatus">Tình trạng</label>
										<textarea form="thamdinhhoso" name="status" dirname="status.dir" rows="8" id="textareastatus" placeholder="Ghi rõ lí do nếu đánh rớt"></textarea>
										</div>
									<div>
										<button form="thamdinhhoso" name="submit" value="save" type="submit">Lưu</button>
										<button form="thamdinhhoso" type="reset">Hủy</button>
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