package Main;

import Tela.JanelaPrincipal;
/**
 *
 * @author AFMS
 */
public class main {

    public static void main(String[] args) {
        /*Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGeral_Tela().setVisible(true);
            }
        });*/
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new JanelaPrincipal().setVisible(true);
            }
        });
    }  
    
        
}
