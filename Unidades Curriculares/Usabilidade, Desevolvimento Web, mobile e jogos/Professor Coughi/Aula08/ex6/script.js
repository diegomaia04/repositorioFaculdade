document.addEventListener('DOMContentLoaded', () =>{
    const body = document.querySelector('body')
    const h1 = document.querySelector('h1')
    const btn = document.querySelector('button')
    const entrada = document.querySelector('#entrada');

    // altear o texto do h1, a cord do texto e a cor do fundo do body
    btn.onclick = () => {
        h1.innerHTML = entrada.value;
        h1.style.color = "dark"
        body.style.backgroundColor = "red"
    }
});