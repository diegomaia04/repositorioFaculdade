
package a3;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.BorderLayout;


/**
 *
 * @author Pichau
 */
public class tela1 extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form tela1
     */
    public tela1() {
		setResizable(false);
		setTitle("Sorveteria Orland ");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(tela1.class.getResource("/a3/555.jpg")));
        initComponents();
        
    }
    private void initComponents() {

        btnpedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        btnpedido.setBackground(new java.awt.Color(0, 255, 255));
        btnpedido.setText("Faça seu pedido");
        btnpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnpedido, BorderLayout.SOUTH);
        btnpedido.setBounds(210, 450, 140, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/555.jpg"))); // NOI18N
        getContentPane().add(jLabel1, BorderLayout.NORTH);
        jLabel1.setBounds(-10, 0, 540, 500);

        pack();
    }

    private void btnpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpedidoActionPerformed   
       tela2 novaTela = new tela2();
       novaTela.setVisible(true);
       
    }//GEN-LAST:event_btnpedidoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpedido;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}