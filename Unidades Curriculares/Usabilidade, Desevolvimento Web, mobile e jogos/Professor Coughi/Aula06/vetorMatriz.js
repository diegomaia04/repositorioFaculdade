// vetor homogeno
let vetor1 = ["joão", "felipe"];
console.log(vetor1);
console.log(vetor1[0]);

//propriedades dos vetores
console.log(vetor1.pop()) // tira ultimo elemento.
vetor1.push("diego") // adiciona um elemento

// vetor heterogeno
let vetor2 = ["joao", 42, true];
console.log(vetor2);
console.log(vetor2[1]);

// matriz e um conjunto de vetores
let matriz = [["pacu, salmão"], ["lagosta, polvo"]];
console.log(matriz[0]);
console.log(matriz[1]);

// acessadno um elemento dentro de um vetor dentro de uma matriz
console.log(matriz[1][0]);

// objeto em js
 let pessoa = {
   "nome": "diego",
   "idade": 19,
   "email": "maiadiego290@gmail.com"
 }
 let pessoa2 = {
   "nome": "luciano",
   "idade": 26,
   "email": "luciano@spfc.com"
 }

console.log(typeof(pessoa))

for (l in pessoa){
  console.log(l)
}

// criando um vetor simulando um banco de dados
let pessoas = [
  { "nome": "diego",
     "idade": 19,
     "email": "maiadiego290@gmail.com"},
  {"nome": "luciano",
     "idade": 26,
     "email": "luciano@spfc.com"},
   {"nome": "calleri",
    "idade": 26,
    "email": "calleri@spfc.com"},
  ]

console.log(pessoas) // printa todas as infromações do vetor

let peixes = ["pacu", "salmao", "tilapia"];
let aves = ["galinha", "aguia", "urubu"];
let animais = peixes.concat(aves); // junta dois vetores, e necessario cirar um novo vetor ara unir vetores
console.log(animais);
console.log(animais.indexOf("galinha"));

// exxercio pra verificar se o nome est contido na variavel
let vetor = ["calleri", "luciano", "alisson", "rafael", "pablo"]; 
let nome = "diego";
//let nome = "luciano";

// esse jeito retorna true or false
console.log(vetor.includes(nome));

// esse jeito vai verificar o nome se esta dentro do vetor utilizando o ifelse 
if(vetor.indexOf(nome.toLocaleUpperCase) !== -1){
  console.log("encontrado")
} else {
  console.log("não encontrado")
}

// let nome = window.prompt("nome : ")
// alert(nome)

// let num1 = window.prompt("digite um numero: ")
// let num2 = window.prompt("digite um numero: ")

// let soma = (num1 + num2)

// alert(parseInt(num1) + parseInt(num2))

// let vetor = ["calleri", "luciano", "alisson", "rafael", "pablo"];
// let nome = window.prompt("digite um nome: ")
// //let nome = "luciano";

// // esse jeito retorna true or false
// alert(vetor.includes(nome));

// // esse jeito vai verificar o nome se esta dentro do vetor utilizando o ifelse 
// if (vetor.includes(nome)) {
//     alert(`o nome: ${nome} esta dentro do vetor`)
// } else {
//     alert(`o nome: ${nome} não esta dentro do vetor`)
// }

const usuarios = ['joao', "mario", "felipe", ]
const senhas = [123, 456, 789]

let user = window.prompt("login").toLocaleLowerCase();
let senha = window.prompt("login").toLocaleLowerCase();

if(usuarios.indexOf(user !== -1 )){
    if(usuarios.indexOf(user) === senhas.indexOf(senha) {
        alert("bem vindo")
    } else {
        alert("senha invalida")
    }
} else {
    alert("usse invalido")
}






