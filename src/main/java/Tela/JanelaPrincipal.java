package Tela;

import AdicionaProcesso.Processo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingUtilities;

/**
 *
 * @author AFMS
 */
public class JanelaPrincipal extends javax.swing.JFrame{
    Processo processos = new Processo();
    Timer timer = new Timer();
    
    private javax.swing.JTextPane InformacoesSaida;
    private javax.swing.JMenuBar MenuGeral;
    private javax.swing.JPanel PainelAdicionar;
    private javax.swing.JPanel PainelRemover;
    private javax.swing.JPanel PainelTempo;
    private javax.swing.JTextPane SaidaDosProcessos;
    private javax.swing.JCheckBox VerificarTodoOTempo;
    private javax.swing.JButton btnInserirOProcesso;
    private javax.swing.JButton btnLimparSaidas;
    private javax.swing.JButton btnRemoverProcesso;
    private javax.swing.JSpinner entradaDeTempo;
    private javax.swing.JTextField entradaInserirOProcesso;
    private javax.swing.JTextField entradaRemoverProcesso;
    private javax.swing.JToggleButton iniciarProcesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelGeralConfig;
    private javax.swing.JMenuItem sobreAutor;
    private javax.swing.JMenuItem sobrePrograma;
    
    public JanelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        VerificarTodoOTempo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        SaidaDosProcessos = new javax.swing.JTextPane();
        painelGeralConfig = new javax.swing.JPanel();
        PainelAdicionar = new javax.swing.JPanel();
        entradaInserirOProcesso = new javax.swing.JTextField();
        btnInserirOProcesso = new javax.swing.JButton();
        PainelTempo = new javax.swing.JPanel();
        entradaDeTempo = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        PainelRemover = new javax.swing.JPanel();
        entradaRemoverProcesso = new javax.swing.JTextField();
        btnRemoverProcesso = new javax.swing.JButton();
        btnLimparSaidas = new javax.swing.JButton();
        iniciarProcesso = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        InformacoesSaida = new javax.swing.JTextPane();
        MenuGeral = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sobrePrograma = new javax.swing.JMenuItem();
        sobreAutor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exclusor - AFMS");

        VerificarTodoOTempo.setText("Verificar todo Tempo");

        SaidaDosProcessos.setEditable(false);
        SaidaDosProcessos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Processos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jScrollPane1.setViewportView(SaidaDosProcessos);

        painelGeralConfig.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray), "Configuração", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        PainelAdicionar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Adicionar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        entradaInserirOProcesso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entradaInserirOProcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        entradaInserirOProcesso.setName(""); // NOI18N

        btnInserirOProcesso.setText("Inserir");
        btnInserirOProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirOProcessoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelAdicionarLayout = new javax.swing.GroupLayout(PainelAdicionar);
        PainelAdicionar.setLayout(PainelAdicionarLayout);
        PainelAdicionarLayout.setHorizontalGroup(
            PainelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInserirOProcesso)
                    .addComponent(entradaInserirOProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelAdicionarLayout.setVerticalGroup(
            PainelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entradaInserirOProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserirOProcesso)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        PainelTempo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Temporizador", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        entradaDeTempo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel1.setText("SEG.");

        javax.swing.GroupLayout PainelTempoLayout = new javax.swing.GroupLayout(PainelTempo);
        PainelTempo.setLayout(PainelTempoLayout);
        PainelTempoLayout.setHorizontalGroup(
            PainelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entradaDeTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PainelTempoLayout.setVerticalGroup(
            PainelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaDeTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelRemover.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Remover", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        entradaRemoverProcesso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entradaRemoverProcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        entradaRemoverProcesso.setName(""); // NOI18N

        btnRemoverProcesso.setText("Remover");
        btnRemoverProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProcessoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelRemoverLayout = new javax.swing.GroupLayout(PainelRemover);
        PainelRemover.setLayout(PainelRemoverLayout);
        PainelRemoverLayout.setHorizontalGroup(
            PainelRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRemoverProcesso)
                    .addComponent(entradaRemoverProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelRemoverLayout.setVerticalGroup(
            PainelRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entradaRemoverProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverProcesso)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btnLimparSaidas.setText("Limpar Saidas");
        btnLimparSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparSaidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelGeralConfigLayout = new javax.swing.GroupLayout(painelGeralConfig);
        painelGeralConfig.setLayout(painelGeralConfigLayout);
        painelGeralConfigLayout.setHorizontalGroup(
            painelGeralConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGeralConfigLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelGeralConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGeralConfigLayout.createSequentialGroup()
                        .addGroup(painelGeralConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PainelTempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PainelRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGeralConfigLayout.createSequentialGroup()
                        .addComponent(btnLimparSaidas)
                        .addGap(30, 30, 30))))
        );
        painelGeralConfigLayout.setVerticalGroup(
            painelGeralConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGeralConfigLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(PainelAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnLimparSaidas)
                .addGap(17, 17, 17))
        );

        iniciarProcesso.setText("Iniciar");
        iniciarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarProcessoActionPerformed(evt);
            }
        });

        InformacoesSaida.setEditable(false);
        InformacoesSaida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jScrollPane2.setViewportView(InformacoesSaida);

        jMenu1.setText("Informações Gerais");

        sobrePrograma.setText("Sobre o Programa");
        sobrePrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreProgramaActionPerformed(evt);
            }
        });
        jMenu1.add(sobrePrograma);

        sobreAutor.setText("Sobre o Autor");
        sobreAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreAutorActionPerformed(evt);
            }
        });
        jMenu1.add(sobreAutor);

        MenuGeral.add(jMenu1);

        setJMenuBar(MenuGeral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerificarTodoOTempo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(painelGeralConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iniciarProcesso)
                .addGap(331, 331, 331))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(VerificarTodoOTempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelGeralConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(13, 13, 13)
                .addComponent(iniciarProcesso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void matarProcessosComTemporizador(){      

        if (timer == null) {
            timer = new Timer();
        } 
        
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    matarProcessos();
                });
            }
        };

        long delay = ((Integer) this.entradaDeTempo.getValue()).longValue()* 1000; // Tempo de espera inicial em milissegundos (1 segundo)
        long period = 3000L; // Intervalo entre execuções em milissegundos (3 segundos)

        // Agendar a tarefa para ser executada repetidamente
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }
    
    private void pararTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null; // Define o temporizador como nulo após cancelá-lo
        }
    }
    
    private void matarProcessos(){
        
        this.InformacoesSaida.setText("");
        Document doc = this.InformacoesSaida.getDocument();
        
        for(String processo : processos.listaDeProcesso()){
            try {
                // Lista todos os processos
                Process processList = Runtime.getRuntime().exec("tasklist");
                BufferedReader reader = new BufferedReader(new InputStreamReader(processList.getInputStream()));
                String line;
                boolean processFound = false;

                // Verifica se o processo está na lista
                while ((line = reader.readLine()) != null) {
                    if (line.contains(processo)) {
                        processFound = true;
                        break;
                    }
                }

                // Se o processo foi encontrado, tenta finalizá-lo
                if (processFound) {
                    String killCommand = "taskkill /F /IM " + processo;
                    Process killProcess = Runtime.getRuntime().exec(killCommand);
                    BufferedReader killReader = new BufferedReader(new InputStreamReader(killProcess.getInputStream()));
                    while ((line = killReader.readLine()) != null) {                      
                        try {
                            doc.insertString(doc.getLength(), line + "\n", null);
                        } 
                        catch (BadLocationException e) {
                            e.printStackTrace();
                        }
                    }                    
                    
                    try {
                        doc.insertString(doc.getLength(), "Processo " + processo + " finalizado." + "\n", null);
                    } 
                    catch (BadLocationException e) {
                        e.printStackTrace();
                    }                    
                } 
                /*else {                    
                    try {
                        doc.insertString(doc.getLength(), "Processo " + processo + " não encontrado." + "\n", null);
                    } 
                    catch (BadLocationException e) {
                        e.printStackTrace();
                    }
                }*/
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void habilitarDesabilitarEntradasAcoes(boolean valor){
        this.VerificarTodoOTempo.setEnabled(valor);        
        this.entradaInserirOProcesso.setEnabled(valor);
        this.btnInserirOProcesso.setEnabled(valor);
        this.entradaRemoverProcesso.setEnabled(valor);
        this.btnRemoverProcesso.setEnabled(valor);
        this.entradaDeTempo.setEnabled(valor);
        this.btnLimparSaidas.setEnabled(valor);
        //this.SaidaDosProcessos.setEnabled(valor);
        //this.InformacoesSaida.setEnabled(valor);
        //this.btnSetarTempo.setEnabled(valor);
    }

    private void btnInserirOProcessoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        if(this.entradaInserirOProcesso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite Algum processo\nEX: processo.exe.");
        }
        else{
            processos.adicionarProcessoNaLista(this.entradaInserirOProcesso.getText());            
            this.SaidaDosProcessos.setText(processos.mostrarProcessos());
            this.entradaInserirOProcesso.setText("");
        }        
    }

    private void btnRemoverProcessoActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        if(this.entradaRemoverProcesso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite Algum processo\nEX: processo.exe.");
        }
        else{
            processos.removeProcessoDaLista(this.entradaRemoverProcesso.getText());
            this.SaidaDosProcessos.setText(processos.mostrarProcessos());
            this.entradaRemoverProcesso.setText("");
        }
    }                                                  

    private void iniciarProcessoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        if (iniciarProcesso.isSelected()) {
            this.habilitarDesabilitarEntradasAcoes(false);
            
            if(this.VerificarTodoOTempo.isSelected()){
                this.matarProcessosComTemporizador();
            }
            else{
                this.matarProcessos();
                //pararTimer();
                iniciarProcesso.setSelected(false);
                this.habilitarDesabilitarEntradasAcoes(true);
                iniciarProcesso.setSelected(false);
            }           
        } 
        else {
            this.habilitarDesabilitarEntradasAcoes(true);
            pararTimer();
            
        }
    }                                               

    private void btnLimparSaidasActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //this.SaidaDosProcessos.setText("");
        this.InformacoesSaida.setText("");
        JOptionPane.showMessageDialog(null, "Áreas limpas...");
    }                                               

    private void sobreProgramaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        JOptionPane.showMessageDialog(null, "O programa tem como objetivo a automatização de exclusão de processos indesejáveis.\n"
                + "Além disso, o software é bem simples de ser usado, onde você deve inserir o nome do processo com sua extensão(geralmente é .exe).\n"
                + "Na parte de remoção, funciona da mesma forma, porém o processo já deve ter sido insirido.\n"
                + "Na parte do temporizador, você pode definir o período de tempo que o sistema irá verificar, isso caso você tenha marcado a opção VERIFICAR O TEMPO TODO.\n"
                + "O botão de LIMPAR SAÍDA, serve para limpar a parte de INFORMAÇÕES.\n"
                + "O Botão(Iniciar) quando clicado, iniciará o processo, para parar o processo, clique novamente nele.");
    }                                             

    private void sobreAutorActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(null, "Olá, me chamo Arthur Felipe MS.\n"
                + "Obrigado por baixar essa aplicação, espero que goste!\n\n\n"
                + "Sou técnico em informática pela Escola Técnica Redentorista - ETER.\n"
                + "Estudande do curso Ciência da Computação - UEPB.\n"
                + "Além disso, tenho alguns outros cursos, que me deram mais conhecimentos na área, abaixo listo alguns...\n"
                + "( Java, C, C#, JavaScript, GitHub, Bancos de Dados Relacionais e não Relacionais, HTML5, CSS6, React e etc... )\n\n"
                + "Caso queiram me adicionar ou entrar em contato, segue as informações:\n"
                + "Linkedin:       https://www.linkedin.com/in/arthur-muniz-07b87b119/ \n"
                + "Git:       https://github.com/ArthurSalesFM \n"
                + "\n\n\n"
                + ":)");
    }

}
