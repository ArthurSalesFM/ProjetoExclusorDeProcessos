package Main;

import Tela.JanelaPrincipal;
/**
 *
 * @author AFMS
 */
public class main {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new JanelaPrincipal().setVisible(true);
            }
        });
    }  
    
        
}
