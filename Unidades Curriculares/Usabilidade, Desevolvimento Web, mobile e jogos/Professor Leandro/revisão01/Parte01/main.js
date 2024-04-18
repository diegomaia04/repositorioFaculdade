const button = document.querySelector('.button');

// function handleButtonClick() {
//     alert('O botão foi clicado')
// }

const handleButtonClick = () => {
    alert('O botão foi clicado');
}


button.addEventListener('click', handleButtonClick);