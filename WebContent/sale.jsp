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
					<div class="frameavatar">
						<div class="frameavatarinner">
							<img src="./img/avatar.jpg" width="100%">
						</div>
					</div>
					<div class="horizontaltab">
						<div class="horizontaltabinner">
							<div class="listitems">
								<div class="iteminleftmenu">
									<a id="formcty" href="#tablecty" class="itemselected">Tìm thông tin công ty</a>
								</div>
								<div class="iteminleftmenu">
									<a id="formkh" href="#tablekh">Tìm thông tin khách hàng</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div id="main" class="main">
					<div class="container">
						<div id='top' class="top">
							<button class="btn btn-info">Logout</button>
						</div>
						<form action="./homesale" method="post">
							<div id="row" class="row">
								<div class="col-sm-3 center">
									<div class="col-input stickytop">
										<div class="inputitem">
											<label for="inputitem1">Tên khách hàng</label>										
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='inputitem1' type="text" name="ten" placeholder="Tên khách hàng">
													<span id="searchreset" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="inputitem">
											<label for="inputitem2">Ngày sinh</label>										
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='inputitem2' type="text" name="ngaysinh" placeholder="Ngày sinh">
													<span id="searchreset" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="inputitem">
											<label for="inputitem3">Số CMND</label>										
											<div class="searchitem">
												<div class="style-scope-inner">
													<input class="search" id='inputitem3' type="text" name="socmnd" placeholder="Số CMND">
													<span id="searchreset" class="btnreset">x</span>
												</div>
											</div>
										</div>
										<div class="" style="text-align: center;">
											<button id="btntimkiem" type="submit" class="btn btn-info">
										     	<span class="glyphicon glyphicon-search"></span> Search
										    </button>
											<input id="typeofsubmit" type="hidden" name="typeofsubmit" value="formkh">
										</div>
									</div>
								</div>
								<div id="tablecty" class="col-sm-9 center">
									<div class="container table">
										<div class="row th stickytop">
											<div class="col-sm-4">
												Tên
											</div>
											<div class="col-sm-2">
												Mã số thuế
											</div>
											<div class="col-sm-4">
												Địa chỉ
											</div>
											<div class="col-sm-2">
												Tình trạng
											</div>
										</div>
										<div id="tablecontent">
											<div class="row tr">
												<div class="col-sm-5">
													Tên khách hàng
												</div>
												<div class="col-sm-7">
													Zoãn Chí Bình
												</div>
											</div>
										</div>
									</div>
								</div>
								<div id="tablekh" class="col-sm-9 center" style="display: none;">
									<div class="container table">
										<div class="row th stickytop">
											<div class="col-sm-2">
												Tên
											</div>
											<div class="col-sm-2">
												Hộ chiếu
											</div>
											<div class="col-sm-2">
												Ngày sinh
											</div>
											<div class="col-sm-2">
												Giới tính
											</div>
											<div class="col-sm-2">
												Trạng thái
											</div>
											<div class="col-sm-2">
												Tình trạng
											</div>
										</div>
										<div id="tablecontent">
											<div class="row tr">
												<div class="col-sm-5">
													Tên khách hàng
												</div>
												<div class="col-sm-7">
													Zoãn Chí Bình
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>