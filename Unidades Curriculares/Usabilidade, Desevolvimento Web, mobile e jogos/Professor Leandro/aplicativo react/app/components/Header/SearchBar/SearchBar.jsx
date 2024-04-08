'use client';
import styles from './searchBar.module.css';

export default function SearchBar() {
    const handleSearchClick = () => {
        alert(`You've searched something...`);
    }

    const handleKeyDown = (e) => {
        if(e.key === 'Enter') {
            handleSearchClick();
        }
    }

    return (
        <div className={styles.container}>
            <div className={styles.searchContainer}>
                <img 
                    className={styles.searchIcon}
                    src='/search-icon.svg'
                    alt='Search Icon Image'
                    width={18}
                    height={18}
                />
                <input
                    className={styles.searchBar}
                    type='email'
                    placeholder='How about a quote today?'
                    autoComplete='off'
                    onKeyDown={handleKeyDown}
                />
            </div>
            <button className={styles.searchButton} onClick={handleSearchClick}>Search</button>
        </div>
    )
}