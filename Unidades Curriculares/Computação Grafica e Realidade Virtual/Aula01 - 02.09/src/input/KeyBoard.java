package input;
import cena.Cena;
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
        System.out.println("Key pressed: " + e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            System.exit(0);
        
        if(e.getKeyCode() == KeyEvent.VK_UP)
            cena.rotacaoX-=5;
        
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            cena.rotacaoX+=5;
        
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            cena.rotacaoY-=5;
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            cena.rotacaoY+=5;
    }

    @Override
    public void keyReleased(KeyEvent e) { }

}

