const instagramIcon = document.querySelector('.icon.instagram');
const emailIcon = document.querySelector('.icon.email');

const handleInstagramClick = () => {
    window.location.assign('https://www.instagram.com/');
}
const handleEmailClick = () => {
    window.location.assign('https://accounts.google.com/login?hl=en_GB');
}

instagramIcon.addEventListener('click', handleInstagramClick);
emailIcon.addEventListener('click', handleEmailClick);