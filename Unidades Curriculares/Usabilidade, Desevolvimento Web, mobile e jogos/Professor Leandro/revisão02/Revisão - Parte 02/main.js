const button = document.querySelector('.button');

function generateRandomNumber() {
    return Math.random();
}

const handleButtonClick = () => {
    const number = generateRandomNumber();
    console.log(`O botão foi apertado e gerou o número: ${number}`);
}

button.addEventListener('click', handleButtonClick);