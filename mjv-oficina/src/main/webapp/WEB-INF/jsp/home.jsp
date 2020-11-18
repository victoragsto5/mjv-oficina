<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

<!-- CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<!-- jQuery and JS bundle w/ Popper.js -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>
</head>

<body>

	<header>
		<nav class="navbar navbar-light bg-light">
			<span class="navbar-brand mb-0 h1">MJV Oficina</span>
		</nav>
	</header>

	<!-- Trigger the modal with a button -->
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#myModal">Abrir Sistema da Oficina</button>

	<!-- Modal -->
	<div id="myModal" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" class="text-center">Sistema da oficina da MJV!</h4>
				</div>
				<div class="modal-body">
					<div>
						<button type="button" class="btn btn-info">Registro de
							defeitos veículares</button
					</div>
					<div>
						<div class="row">
							<button type="button" class="btn btn-info">Cadastrar
								tipos de veículos</button>
						</div>
					</div>
					<div>
						<div class="row">
							<button type="button" class="btn btn-info">Cadastrar
								Peças</button>
						</div>
					</div>
					<div>
						<div class="row">
							<button type="button" class="btn btn-info">Cadastrar
								defeitos</button>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Fechar
					</button>
				</div>
			</div>

		</div>
	</div>
	</div>
</body>
</html>