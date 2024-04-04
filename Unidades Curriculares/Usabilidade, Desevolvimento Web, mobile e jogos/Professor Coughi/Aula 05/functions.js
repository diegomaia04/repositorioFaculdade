// funções sem argumentos
function main() {
  console.log("Hello World");
}

main();

// funçao com argumento

function meuNome(name, age) {
  console.log(`Ola ${name}, ${age}`);
}

meuNome("diego", 19);
console.log(meuNome);


// função anom=nima
let a = function(){
  "ola"
};
console.log("a")

// função quando o codigo sera utilizado apenas umavez
(function() {
  console.log("ola")
})();

function imc(peso, altura){
  let imc = peso / (altura**2)
  return fatorObesidade(imc);
}

function fatorObesidade(imc) {
  if(imc < 20){
    return "Muito magro"
  } else if(imc > 20 && imc <= 30 ){
    return "tá no shape"
  } else if(imc > 30 && imc <= 35 ){
  return "olha a pochete"
}else if(imc > 35 && imc <= 40 ){
  return "eitaaaaaaaaaaaaaaaaaaa"
  }}

console.log(imc(50, 1.67))
