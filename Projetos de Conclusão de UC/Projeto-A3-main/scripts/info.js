const botao = document.querySelectorAll(".botao");

botao.forEach((botao, i) => {
  botao.addEventListener("click", () => {
    botao.forEach((item, j) => {
      item.className = "botao";
    });
    botao.className = "botao active";
  });
});

window.addEventListener('scroll', function () {
  const parallax = document.getElementById('parallax');
  let scrollPosition = window.scrollY;

  parallax.style.backgroundPositionY = (scrollPosition * 0.5) + 'px';
})

document.getElementById('advancedForm').addEventListener('submit', function (event) {
  event.preventDefault();

  // Validação adicional se necessário
  const phone = document.getElementById('phone').value;

  // Se todas as validações passarem, submeter o formulário
  alert('Obrigado pelos envios dos daods! Entraremos em Contato');
  this.submit();
});

// ------------------------------------------------------------------------------------------------

let count = 1;
document.getElementById("radio1").checked = true;

setInterval(function () {
  nextImage();
}, 5000)

function nextImage() {
  count++
  if (count > 4) {
    count = 1;
  }

  document.getElementById("radio" + count).checked = true;

}