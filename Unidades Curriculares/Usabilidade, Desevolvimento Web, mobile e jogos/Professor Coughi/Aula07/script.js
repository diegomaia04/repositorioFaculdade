function mensagem(nome) {
    alert(`Olá ${nome}`);
    return;
    alert("Xiiii, deu erro");
}

let nome = window.prompt("Nome?");
mensagem(nome);

function soma(a, b) {
    return parseInt(a) + parseInt(b);
}

let Conta = soma;
alert(conta("3", 4)); // number
alert(typeof Conta); // function

function maioridade(idade) {
    if(!(typeof idade == "number")) {
        alert("Entrada inválida")
    } else {
        if(idade >= 18) {
            alert("Acesso permitido");
        } else {
            alert("Bolqueado");
        }
    }  
}

const idade = window.prompt("Idade?");
maioridade(parseInt(idade));

//Recursividade
function ultimoCarater(texto) {
    if(texto.length == 1) {
        alert(texto);
    } else {
        ultimoCarater(texto.slice(1));
    }
}

function primeiroCaracter(texto) {
    if(texto.length == 1) {
        alert(texto);
    } else {
        primeiroCaracter(texto.slice(0, 1));
    }
}

primeiroCaracter("Abacate");

// Fatorial com recursividade 
function fatorial(num) { 
    if(num <= 1) { //false   false   true
        return 1;
    } else { //
        num *= fatorial(num - 1);
        return num;
    }
}

let num = window.prompt("Escolha um número para calcular o fatorial");
alert(`${num}! = ${fatorial(num)}`);

// Crie uma função recursiva para retornar o enésimo elemento da sequência de Fibonacci
function fibonacci(num) {
    if (num == 0) {
        return 0;
    } else if(num  == 1 && num <= 2) {
        return 1;
    }
     else {
        return fibonacci(num - 1) + fibonacci(num -2);
    }
}

let numero = window.prompt("nésimo número de Fibonacci");
alert(fibonacci(numero));


// Funções como Argumentos
function soma(a, b) {
    return parseInt(a) + parseInt(b);
}

function multiplica(a, b) {
    return a * b;
}

let conta = multiplica(soma(2,3), 5);
alert(conta);



// Função Anônima
var count = 0;

let contador = function() {
    return count++;
}

alert(contador());
alert(contador());
alert(contador());

// Função Seta ou Arrow Function
var count = 0;
let Contador = () => count++;
alert(Contador());
alert(Contador());
alert(Contador());

// Vetor de Objetos
let pessoas = [
    {nome: "João", idade : 42},
    {nome: "Felipe", idade : 50},
    {nome: "Miguel", idade : 5}
];

for(let pessoa of pessoas) {
    alert(`${pessoa.nome} tem ${pessoa.idade}`);
}


// DOM -> Document Object Model
document.addEventListener("DOMContentLoaded", function(event) {
    const btn = document.querySelector('button');
    const saida = document.querySelector(".saida");
    const nome = document.querySelector("#nome");

    btn.onclick = () => saida.innerHTML = `Olá ${nome.value}`;
});
