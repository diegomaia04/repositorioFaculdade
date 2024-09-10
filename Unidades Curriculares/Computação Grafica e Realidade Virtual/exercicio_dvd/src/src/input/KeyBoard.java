package src.input;

import src.cena.Cena;
import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;

/**
 *
 * @author Kakugawa
 */
public class KeyBoard implements KeyListener {

    private final Cena cena;

    public KeyBoard(Cena cena) {
        this.cena = cena;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyCode());

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(cena.translacaoX <= 0.8){
            cena.translacaoX = cena.translacaoX + cena.VelocidadeX;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(cena.translacaoX >= - 0.8){
            cena.translacaoX = cena.translacaoX - cena.VelocidadeX;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
           
            cena.translacaoY = cena.translacaoY + cena.VelocidadeY;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            cena.translacaoY = cena.translacaoY - cena.VelocidadeY;
        }

        /*
        if (e.getKeyCode() == KeyEvent.VK_A) {
            cena.translacaoY = cena.translacaoY + cena.VelocidadeY;
            cena.translacaoX = cena.translacaoX - cena.VelocidadeX;
        }

        if (e.getKeyCode() == KeyEvent.VK_D) { // right and up
            
            
            cena.translacaoY = cena.translacaoY + cena.VelocidadeY;
            cena.translacaoX = cena.translacaoX + cena.VelocidadeX;
            
        }

        if (e.getKeyCode() == KeyEvent.VK_W) {
            cena.translacaoY = cena.translacaoY - cena.VelocidadeY;
            cena.translacaoX = cena.translacaoX - cena.VelocidadeX;
        }

        if (e.getKeyCode() == KeyEvent.VK_S) {
            cena.translacaoY = cena.translacaoY - cena.VelocidadeY;
            cena.translacaoX = cena.translacaoX + cena.VelocidadeX;
        }
*/
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
