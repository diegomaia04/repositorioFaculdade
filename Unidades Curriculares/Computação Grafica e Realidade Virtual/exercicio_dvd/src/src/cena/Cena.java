package src.cena;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;

/**
 *
 * @author Kakugawa
 */
public class Cena implements GLEventListener {

    private float xMin, xMax, yMin, yMax, zMin, zMax;
    public double translacaoX = 0;
    public double VelocidadeX = 0.01;
    public double translacaoY = 0;
    public double VelocidadeY = 0.01;

    public double rotacaoY = 0, rotacaoX = 0;

    @Override
    public void init(GLAutoDrawable drawable) {
        //dados iniciais da cena
        GLU GLU = new GLU();
        //Estabelece as coordenadas do SRU (Sistema de Referencia do Universo)
        xMin = yMin = zMin = -1;
        xMax = yMax = zMax = 1;
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        //obtem o contexto Opengl
        GL2 gl = drawable.getGL().getGL2();
        //define a cor da janela (R, G, G, alpha)
        gl.glClearColor(0, 0, 0, 1);
        //limpa a janela com a cor especificada
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        gl.glLoadIdentity(); //lê a matriz identidade

        // gl.glTranslatef(translacaoX, yMin, zMin);
        gl.glTranslated(translacaoX, translacaoY, 0);
        gl.glColor3f(1f, 0, 0); // Cor vermelha

        gl.glBegin(GL2.GL_QUADS);
        // Desenho do losango
        gl.glVertex2f(-0.2f, 0f); // Vértice inferior esquerdo
        gl.glVertex2f(0f, 0.2f);  // Vértice superior
        gl.glVertex2f(0.2f, 0f);  // Vértice inferior direito
        gl.glVertex2f(0f, -0.2f); // Vértice inferior
        gl.glEnd();

        /*
        translacaoX = translacaoX + VelocidadeX;

            VelocidadeX = -VelocidadeX;
        }  if (translacaoX >= 0.7 || translacaoX <= -0.7) {
            VelocidadeX = -VelocidadeX;
        }
        
          translacaoY = translacaoY + VelocidadeY;

        if (translacaoY >= 0.8 || translacaoY <= -0.8) {
            VelocidadeY = -VelocidadeY;
        }
        
         */
        gl.glFinish();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        //obtem o contexto grafico Opengl
        GL2 gl = drawable.getGL().getGL2();

        //evita a divisão por zero
        if (height == 0) {
            height = 1;
        }
        //calcula a proporção da janela (aspect ratio) da nova janela
        float aspect = (float) width / height;

        //seta o viewport para abranger a janela inteira
        gl.glViewport(0, 0, width, height);

        //ativa a matriz de projeção
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity(); //lê a matriz identidade

        //Projeção ortogonal
        //true:   aspect >= 1 configura a altura de -1 para 1 : com largura maior
        //false:  aspect < 1 configura a largura de -1 para 1 : com altura maior
        if (width >= height) {
            gl.glOrtho(xMin * aspect, xMax * aspect, yMin, yMax, zMin, zMax);
        } else {
            gl.glOrtho(xMin, xMax, yMin / aspect, yMax / aspect, zMin, zMax);
        }

        //ativa a matriz de modelagem
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity(); //lê a matriz identidade
        System.out.println("Reshape: " + width + ", " + height);
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
    }
}
