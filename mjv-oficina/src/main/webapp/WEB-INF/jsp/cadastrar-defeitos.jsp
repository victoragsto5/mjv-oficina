<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Home | Oficina MJV</title>

    <!-- CSS -->
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/home.css">
    <link rel="stylesheet" href="./css/defeitos.css">

    <!-- Fontes -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;700&family=Catamaran:wght@400;700&display=swap" rel="stylesheet">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
</head>

<body>
    <div class="container-home">
        <nav class="home-menu">
            <img class="menu-logo" src="./images/logo.jpg" alt="Logo da oficina">
            
            <ul>
                <li><a href="/">Home</a></li>
                <li><a class="menu-ativo sistema" href="#">Sistema da Oficina</a></li>
            </ul>

        </nav>
    </div>

    <section class="home">
        <img src="./images/logo.jpg" alt="Logo da oficina">
        <div class="home-texto">
            <h3 class="home-titulo">Bem-vindo!</h3>
        </div>
    </section>

    <div class="modal">
        <div class="modal-bg ativo"></div>

        <div class="modal-menu ativo">
            <span class="botao-fechar">x</span>

            <h2 class="titulo">Cadastro de defeito</h2>

            <p class="subtitulo">Cadastre todo tipo de defeito relacionado ao veículo:</p>

            <form method="POST" class="input-group">
                <label for="defeito" class="input-icone"><i class="far fa-edit"></i></label>
                <input type="text" class="input" id="defeito" name="dados" placeholder="Digite aqui o nome do defeito" required>

                <span class="cadastro valido"><i class="fas fa-check"></i></span>
                <span class="cadastro erro"><i class="fas fa-times"></i></span>

                <div class="botoes">
                    <a class="botao-voltar" href="/menu"><span class="botao-voltar-seta"><i class="fas fa-arrow-left"></i></span>Voltar ao menu</a>
                    <button class="botao-salvar" type="submit">Salvar</button>
                </div>
            </form>
        </div>
    </div>
</body>

<script src="./js/home.js"></script>

</html>