// IMC

let altura = 1.8;
let Genero = "F";

if (Genero === "M") {
  pesoIdeal = 72.7 * altura - 58;
  console.log(`o seu peso é ideal é ${pesoIdeal}`);
} else if (Genero === "F") {
  IMC = 62.1 * altura - 44.7;
  console.log(`o seu peso é ideal é ${IMC}`);
} else {
  console.log("informe os dados corretamente");
}

//
pesoPeixe = 51;

if (pesoPeixe > 50) {
  dif = (pesoPeixe - 50) * 4;
  console.log(`voce devera pagar uma taxa de R$${dif}`);
} else {
  console.log("voce nao precisa pagar taxa");
}

//
nome = "diego";
idade = 19;
sexo = "M";
hemo = 14.5;
gravida = "S"

if ((idade >= 2 && idade < 6) || (hemo > 11.5 && hemo <= 13.5)) {
  console.log("o seu nivel esta normal");
} else if ((idade >= 6 && idade <= 12) || (hemo > 11.5 && hemo <= 15.5)) {
  console.log("o seu nivel esta normal");
} else if (sexo === "M" && (hemo > 14 && hemo <= 18 )) {
   console.log("o seu nivel esta normal");
} else if ((sexo === "F" && hemo > 12 && hemo <= 16 )) {
  console.log("o seu nivel esta normal");
} else if (gravida === "S" && hemo == 11 ) {
    console.log("o seu nivel esta normal");
} else {
  console.log("o nivel esta alterado");
}
