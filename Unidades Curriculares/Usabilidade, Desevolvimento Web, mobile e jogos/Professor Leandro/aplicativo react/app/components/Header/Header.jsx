import styles from './header.module.css';
import HomeComponent from "./HomeComponent/HomeComponent";
import SearchBar from './SearchBar/SearchBar';

export default function HeaderComponent() {
    return (
        <div className={styles.container}>
            <HomeComponent />
            <SearchBar />
        </div>
    )
}