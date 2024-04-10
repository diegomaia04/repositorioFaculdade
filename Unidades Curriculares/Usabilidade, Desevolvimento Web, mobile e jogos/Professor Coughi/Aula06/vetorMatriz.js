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

// esse jeito retorna true or false
console.log(vetor.includes(nome));

// esse jeito vai verificar o nome se esta dentro do vetor utilizando o ifelse 
if(vetor.indexOf(nome.toLocaleUpperCase) !== -1){
  console.log("encontrado")
} else {
  console.log("não encontrado")
}




