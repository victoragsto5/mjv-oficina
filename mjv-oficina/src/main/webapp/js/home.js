// Abre e fecha o modal do sistema ao clicar no botão Sistema na home
var botaoModal = document.querySelector('.sistema');
var modal = document.querySelector('.modal-bg');
var menuModal = document.querySelector('.modal-menu');
var botaoFechar = document.querySelector('.botao-fechar');

botaoModal.addEventListener('click', function() {
    modal.classList.add('ativo');
    menuModal.classList.add('ativo');
});

modal.addEventListener('click', function() {
    modal.classList.remove('ativo');
    menuModal.classList.remove('ativo');
});

botaoFechar.addEventListener('click', function() {
    modal.classList.remove('ativo');
    menuModal.classList.remove('ativo');
});


// Valida input
var input = document.querySelector('.input');
var retornoInput = document.querySelectorAll('.cadastro');
var formulario = document.querySelector('.input-group');

input.addEventListener('input', function(){
    if (formulario.dados.value) {
        retornoInput[0].classList.add('ativo');
    }

    else {
        retornoInput[0].classList.remove('ativo');
    }
});
