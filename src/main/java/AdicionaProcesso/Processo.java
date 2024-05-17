package AdicionaProcesso;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AFMS
 */
public class Processo {
 
    private List<String> listaDeProcessos = new ArrayList<>();
    
    public void adicionarProcessoNaLista(String processo){
        this.listaDeProcessos.add(processo);
        JOptionPane.showMessageDialog(null, "Processo(" + processo +") adiconado na lista.");
    }
    
    public void removeProcessoDaLista(String processo){        
        //this.listaDeProcessos.removeIf(processoAtual -> processoAtual.equals(processo));
        if (this.listaDeProcessos.removeIf(processoAtual -> processoAtual.equals(processo))) {
            JOptionPane.showMessageDialog(null, "O processo foi removido com sucesso.");
        } 
        else {
            JOptionPane.showMessageDialog(null, "O processo não existe na lista.");
        }
    }
    
    public String mostrarProcessos(){
        int qtdProc = 0;
        String saida = "";
        
        if(this.listaDeProcessos.isEmpty()){
            return null;
        }
        else{
            for(String processo : this.listaDeProcessos){
                qtdProc++;
                saida += qtdProc + "º - " + processo + "\n";
            }   
            return saida;
        }        
    }
    
    public List<String> listaDeProcesso(){

        if(this.listaDeProcessos.isEmpty()){
            return null;
        }
        else{
            return this.listaDeProcessos;
        }                
    }
    
}
