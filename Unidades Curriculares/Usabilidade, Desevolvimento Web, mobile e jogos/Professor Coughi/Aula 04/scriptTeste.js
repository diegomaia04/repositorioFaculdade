// verificar se o ano é bisexto
let ano = 2023

if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
  let reposta 
  console.log(`${ano} é bissexto`)
} else{
  console.log(`${ano} não é bissexto`	)
}

// condição acima, porem ternaria
let reposta = (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) ? console.log(`${ano} é bissexto`):  console.log(`${ano} não é bissexto`	)
console.log(reposta)

// verificar se o nuemro e par impar
var numero = 15

if (numero % 2 == 0) {
  console.log(`${numero} o numero é par`)
} else {
  console.log(`${numero} o numero é impar`)
}
