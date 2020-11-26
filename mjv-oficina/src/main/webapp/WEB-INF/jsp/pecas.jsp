<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Oficina MJV</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

	<div class="container">

		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-12">
						<div class="p-5">
							<div class="text-center">
								<h1 class="h4 text-gray-900 mb-4">Registro</h1>
							</div>
							<form>
								<div class="form-group row">
									<div class="col-sm-5">
										<input type="text" class="form-control" name="nomeCliente">
									</div>
									<div class="col-sm-4">
										<select name="idTipoVeiculo" id="idTipoVeiculo" class="form-control">
											<option value="">-- Selecione --</option>
											<c:forEach items="${tiposVeiculoList}" var="tipoVeiculo">
												<option value="${tipoVeiculo.id}">${tipoVeiculo.descricao}</option>
											</c:forEach>
										</select>
									</div>
									<div class="col-sm-3">
										<input class="btn btn-primary btn-block"
											value="Listar Peças" onclick="listarPecas()" />
									</div>
								</div>
							</form>
<!-- 							<form action="/teste/salvar" method="post"> -->
							<form>

								<c:if test="${not empty listaPecas}">
									<table>
										<tr>
											<th></th>
											<th>Peça</th>
											<th>Defeito</th>
										</tr>
										<c:forEach items="${listaPecas}" var="peca">
											<tr>
												<td><input type="checkbox" name="selecionados"
													value="${peca.id}_${peca.descricao}" /></td>
												<td>${peca.id}</td>
												<td>${peca.descricao}</td>
											</tr>
										</c:forEach>
									</table>
									<input class="btn btn-primary btn-block" value="Salvar" />
								</c:if>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>
	
	<script>
		function listarPecas() {
			$.ajax({
			    url: '/pecas/listarPecas',
			    method: 'POST',
			    success: function(data){
			    	console.log('SUCESS: ' + data);
			    },
			    error: function (error){
			    	console.log('ERRO: ' + error);
			    }
			});
		}
	
	</script>

</body>

</html>