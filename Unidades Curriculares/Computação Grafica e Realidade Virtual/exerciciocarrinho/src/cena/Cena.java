package cena;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT; //ADICIONADO (primitivas 3D)

/**
 *
 * @author Kakugawa
 */
public class Cena implements GLEventListener {

    private float xMin, xMax, yMin, yMax, zMin, zMax;
    GLU glu;
    float anguloX, anguloY, anguloZ;

    @Override
    public void init(GLAutoDrawable drawable) {
        //dados iniciais da cena
        glu = new GLU();
        GL2 gl = drawable.getGL().getGL2();
        //Estabelece as coordenadas do SRU (Sistema de Referencia do Universo)
        xMin = yMin = zMin = -100;
        xMax = yMax = zMax = 100;

        //Habilita o buffer de profundidade
        gl.glEnable(GL2.GL_DEPTH_TEST);

        anguloX = anguloY = anguloZ = 0;
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        //obtem o contexto Opengl
        GL2 gl = drawable.getGL().getGL2();
        GLUT glut = new GLUT(); //objeto para desenho 3D

        //define a cor da janela (R, G, G, alpha)
        gl.glClearColor(0, 0, 0, 1);
        //limpa a janela com a cor especificada
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT); // MODIFICADO      
        gl.glLoadIdentity(); //lê a matriz identidade

        /*
            desenho da cena        
        *
         */
        gl.glRotated(anguloX, 1, 0, 0);
        gl.glRotated(anguloY, 0, 1, 0);
        gl.glRotated(anguloZ, 0, 0, 1);

        desenhaCarroceria(gl, glut);
        desenhaCapota(gl, glut);
        desenhaRodas(gl, glut);
        desenhaFarois(gl,glut);

        gl.glFlush();
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

    public void desenhaCarroceria(GL2 gl, GLUT glut) {
        gl.glPushMatrix();
        gl.glTranslated(0, -12.5, 0);
        gl.glScaled(2, 0.5, 1);
        gl.glColor3d(0.6, 0, 0.6);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        glut.glutSolidCube(50);

        gl.glColor3d(0, 0, 0);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_LINE);
        glut.glutSolidCube(50);
        gl.glPopMatrix();
    }

    public void desenhaCapota(GL2 gl, GLUT glut) {
        gl.glPushMatrix();
        gl.glTranslated(-25, 12.5, 0);
        gl.glScaled(1, 0.5, 1);
        gl.glColor3d(0, 0.4, 0);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        glut.glutSolidCube(50);

        gl.glColor3d(0, 0, 0);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_LINE);
        glut.glutSolidCube(50);
        gl.glPopMatrix();
    }

    public void desenhaRodas(GL2 gl, GLUT glut) {
        gl.glPushMatrix();
        gl.glTranslated(-30, -25, 28);
        gl.glScaled(1, 1, 0.5);
        gl.glRotated(0, 0, 0, 0);
        gl.glColor3d(0.4, 0.4, 0.4);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        glut.glutSolidTorus(6.25, 12.5, 15, 15);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(30, -25, 28);
        gl.glScaled(1, 1, 0.5);
        gl.glRotated(0, 0, 0, 0);
        gl.glColor3d(0.4, 0.4, 0.4);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        glut.glutSolidTorus(6.25, 12.5, 15, 15);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(-30, -25, -28);
        gl.glScaled(1, 1, 0.5);
        gl.glRotated(0, 0, 0, 0);
        gl.glColor3d(0.4, 0.4, 0.4);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        glut.glutSolidTorus(6.25, 12.5, 15, 15);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(30, -25, -28);
        gl.glScaled(1, 1, 0.5);
        gl.glRotated(0, 0, 0, 0);
        gl.glColor3d(0.4, 0.4, 0.4);
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        glut.glutSolidTorus(6.25, 12.5, 15, 15);
        gl.glPopMatrix();
    }

    public void desenhaFarois(GL2 gl, GLUT glut) {
        
        gl.glPushMatrix();
            gl.glTranslated(50, -12.5, 17.5);
            gl.glRotated(90, 0, 1, 0);
            gl.glColor3d(1, 1, 0);
            gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
            glut.glutSolidCylinder(5,2.5,15,15);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslated(50, -12.5, -17.5);
            gl.glRotated(90, 0, 1, 0);
            gl.glColor3d(1, 1, 0);
            gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
            glut.glutSolidCylinder(5,2.5,15,15);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glTranslated(-51, -12.5, -17.5);
            gl.glRotated(90, 0, 1, 0);
            gl.glColor3d(1, 0, 0);
            gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
            glut.glutSolidCylinder(5,2.5,15,15);
        gl.glPopMatrix();
        
         gl.glPushMatrix();
            gl.glTranslated(-51, -12.5, 17.5);
            gl.glRotated(90, 0, 1, 0);
            gl.glColor3d(1, 0, 0);
            gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
            glut.glutSolidCylinder(5,2.5,15,15);
        gl.glPopMatrix();
    }
}
