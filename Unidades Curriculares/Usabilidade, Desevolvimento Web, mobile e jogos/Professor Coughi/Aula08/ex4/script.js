document.addEventListener('DOMContentLoaded', () => {
    const h1 = document.querySelector('h1')
    const btn = document.querySelector('button')
    const entrada = document.querySelector('#entrada');

    btn.onclick = () => {
        h1.innerHTML = entrada.value;

    }
})