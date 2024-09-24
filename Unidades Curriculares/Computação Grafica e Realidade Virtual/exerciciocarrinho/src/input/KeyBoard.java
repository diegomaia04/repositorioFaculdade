package cena;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
/**
 *
 * @author Kakugawa
 */
public class KeyBoard implements KeyListener{
    private Cena cena;
    
    public KeyBoard(Cena cena){
        this.cena = cena;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {        
        //System.out.println("Key pressed: " + e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            System.exit(0);
        
        if(e.getKeyCode() == KeyEvent.VK_UP)
            cena.anguloX -= 5;
        
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            cena.anguloX += 5;
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            cena.anguloY += 5;
        
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            cena.anguloY -= 5;
        
        if(e.getKeyCode() == KeyEvent.VK_SPACE)
            cena.anguloZ -= 5;
        
        if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
            cena.anguloZ += 5;
        
        //if(e.getKeyChar() == 'a')
           // System.out.println("Pressionou tecla a");
    }

    @Override
    public void keyReleased(KeyEvent e) { }

}
