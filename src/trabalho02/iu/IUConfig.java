/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IUConfig.java
 *
 * Created on 25/05/2013, 08:37:14
 */

package trabalho02.iu;

import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import trabalho02.controlador.Controlador;
import trabalho02.modelo.Config;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Usuario;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class IUConfig extends javax.swing.JDialog {
    private static IUConfig instancia = null; ///padrão Singleton
    private Config configuracoes;
    /** Creates new form IUConfig */
    public IUConfig(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        alerta.setVisible(false);
        carregaBotao.setEnabled(false);
    }

    ///padrao Singleton -- retorna sempre a mesma instancia
    //se ela nao existir, será criada
    public static IUConfig getInstancia(JFrame parent){
        if (instancia == null){
            instancia = new IUConfig(parent, true);
        }
        return instancia;
    }

    public void exibir(Config configuracoes){
        this.configuracoes = configuracoes;

        this.diasAluno_Text.setText(Integer.toString( configuracoes.getDiasAluno() ));
        this.diasProfessor_Text.setText(Integer.toString( configuracoes.getDiasProfessor() ));
        this.livrosText.setText(configuracoes.getArquivoLivros());
        this.usuariosText.setText(configuracoes.getArquivoUsuarios());
        this.emprestimosText.setText(configuracoes.getArquivoEmprestimos());

        this.pack();
        this.setLocationRelativeTo(this.getParent());
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        diasAluno_Text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        diasProfessor_Text = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        livrosText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        usuariosText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emprestimosText = new javax.swing.JTextField();
        botao = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        arq2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        carregaBotao = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        alerta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        removerlivro = new javax.swing.JButton();
        removeraluno = new javax.swing.JButton();
        removerprofessor = new javax.swing.JButton();
        removertudo = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações");
        setMinimumSize(new java.awt.Dimension(770, 550));
        setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Empréstimo"));

        jLabel4.setText("Dias permitidos para Aluno");

        diasAluno_Text.setText("10");
        diasAluno_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diasAluno_TextActionPerformed(evt);
            }
        });

        jLabel5.setText("Dias permitidos para Professor");

        diasProfessor_Text.setText("30");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diasAluno_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diasProfessor_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(diasAluno_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5)
                .addComponent(diasProfessor_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Arquivos"));
        jPanel2.setMaximumSize(new java.awt.Dimension(750, 660));
        jPanel2.setMinimumSize(new java.awt.Dimension(730, 650));

        jLabel1.setText("Livros");

        livrosText.setText("livros.dat");
        livrosText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                livrosTextFocusLost(evt);
            }
        });
        livrosText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuarios");

        usuariosText.setText("usuarios.dat");
        usuariosText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuariosTextFocusLost(evt);
            }
        });

        jLabel3.setText("Emprestimos");

        emprestimosText.setText("emprestimos.dat");
        emprestimosText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emprestimosTextFocusLost(evt);
            }
        });

        botao.setText("ProcurarPasta");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        jLabel6.setText("Carregar Outro Arquivo no Sistema (.dat)");

        texto.setText(".\\");
            texto.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    textoFocusGained(evt);
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    textoFocusLost(evt);
                }
            });
            texto.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    textoKeyReleased(evt);
                }
            });

            arq2.setText("...");
            arq2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    arq2ActionPerformed(evt);
                }
            });

            jLabel7.setText("Caminho Padrão dos Arquivos");

            botao1.setText("ProcurarPasta");
            botao1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botao1ActionPerformed(evt);
                }
            });

            botao2.setText("ProcurarPasta");
            botao2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botao2ActionPerformed(evt);
                }
            });

            carregaBotao.setText("Carregar");
            carregaBotao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    carregaBotaoActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(usuariosText)
                                .addComponent(livrosText)
                                .addComponent(emprestimosText, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(botao2)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botao1)
                                        .addComponent(botao))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(arq2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(carregaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(livrosText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usuariosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addGap(13, 13, 13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emprestimosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carregaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arq2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32))
            );

            jButton2.setText("Restaurar Padrão");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setText("Sair sem Salvar");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            alerta.setForeground(new java.awt.Color(255, 0, 0));
            alerta.setText("Arquivo Carregado Com sucesso!");

            jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Remover (IRREVERSÍVEL)"));

            removerlivro.setText("Livros");
            removerlivro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    removerlivroActionPerformed(evt);
                }
            });

            removeraluno.setText("Alunos");
            removeraluno.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    removeralunoActionPerformed(evt);
                }
            });

            removerprofessor.setText("Professores");
            removerprofessor.setToolTipText("");
            removerprofessor.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    removerprofessorActionPerformed(evt);
                }
            });

            removertudo.setText("APAGAR TUDO");
            removertudo.setToolTipText("VOCÊ TEM CERTEZA?");
            removertudo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    removertudoActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(removerlivro)
                    .addGap(18, 18, 18)
                    .addComponent(removeraluno)
                    .addGap(18, 18, 18)
                    .addComponent(removerprofessor)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removertudo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removerlivro)
                        .addComponent(removeraluno)
                        .addComponent(removerprofessor)
                        .addComponent(removertudo))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(salvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3))
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(63, 63, 63))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(alerta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salvar)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addContainerGap(21, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        configuracoes.setDiasAluno(Integer.parseInt( diasAluno_Text.getText() ));
        configuracoes.setDiasProfessor(Integer.parseInt( diasProfessor_Text.getText() ));
        configuracoes.setArquivoLivros( livrosText.getText() );
        configuracoes.setArquivoUsuarios( usuariosText.getText() );
        configuracoes.setArquivoEmprestimos( emprestimosText.getText());
        texto.setText("");
        alerta.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_salvarActionPerformed
    private String abrirPasta(){
        JFileChooser procurar = new JFileChooser("..\\");
        procurar.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int pasta = procurar.showOpenDialog(null);
        if(pasta == JFileChooser.APPROVE_OPTION){
            File dir = procurar.getSelectedFile();
            String nomeDir = dir.getAbsolutePath();
            return nomeDir;
        }
        return "";
    }
    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed

        String msg= abrirPasta();
        if(msg.isEmpty());
        else{
            livrosText.setText(msg+"\\livros.dat");
        }

    }//GEN-LAST:event_botaoActionPerformed

    private void arq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arq2ActionPerformed
        // TODO add your handling code here:
        JFileChooser procurar = new JFileChooser(".\\");
        FileFilter filter = new FileNameExtensionFilter("Arquivo Bliblioteca100Livros [.dat]","dat");
        procurar.setFileFilter(filter);
        procurar.addChoosableFileFilter(filter);
       int pasta = procurar.showOpenDialog(null);
        if(pasta == JFileChooser.APPROVE_OPTION){
            File dir = procurar.getSelectedFile();
            String nomeDir = dir.getAbsolutePath();
            if(nomeDir.endsWith(".dat")){ 
                texto.setText(nomeDir);
                carregaBotao.setEnabled(true);
                carregaBotao.requestFocus();
            }
            else{
                alerta.setText("Arquivo Inválido");
                
            }
        }

    }//GEN-LAST:event_arq2ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
        String msg= abrirPasta();
        if(msg.isEmpty());
        else{
            usuariosText.setText(msg+".\\usuarios.dat");
        }
        
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        // TODO add your handling code here:
         String msg= abrirPasta();
        if(msg.isEmpty());
        else{
            emprestimosText.setText(msg+".\\emprestimos.dat");
        }

    }//GEN-LAST:event_botao2ActionPerformed

    private void livrosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_livrosTextActionPerformed

    private void configPadrao(){
        diasAluno_Text.setText("10");
        diasProfessor_Text.setText("30");
        livrosText.setText(".\\livros.dat");
        usuariosText.setText(".\\usuarios.dat");
        emprestimosText.setText(".\\emprestimos.dat");
        texto.setText("");
        alerta.setText("Configurações Padrão");
        salvar.requestFocus();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        configPadrao();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void diasAluno_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diasAluno_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diasAluno_TextActionPerformed

    private void carregaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaBotaoActionPerformed
        // TODO add your handling code here:
        if(texto.getText().length()!=0){
            Controlador control = new Controlador();
            String t = texto.getText();
         
                if(t.endsWith("livros.dat")){
                    control.recuperarLivros();
                    alerta.setText("Dados Livros Carregados");
                    alerta.setVisible(true);
                    texto.setText("");
                    carregaBotao.setEnabled(false);
                }
                else if(t.endsWith("usuarios.dat")){
                    control.recuperarUsuarios();
                    alerta.setText("Dados Usuarios Carregados");
                    alerta.setVisible(true);
                    texto.setText("");
                    carregaBotao.setEnabled(false);
               }
                else if(t.endsWith("emprestimos.dat")){
                    control.recuperarEmprestimos();
                    alerta.setText("Dados Emprestimos Carregados");
                    alerta.setVisible(true);
                    texto.setText("");
                    carregaBotao.setEnabled(false);
                }
                else if(t.endsWith("config.dat")){
                    control.recuperarConfig();
                    alerta.setText("Configurações Carregadas");
                    alerta.setVisible(true); 
                    carregaBotao.setEnabled(false);
                }
                else{
                    alerta.setText("Arquivo Inválido");
                    alerta.setVisible(true);
            }
        }
    }//GEN-LAST:event_carregaBotaoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        alerta.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void removertudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removertudoActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        ArrayList<Usuario> usuario = control.buscarUsuarioTodos();
        ArrayList<Livro> livro = control.buscarLivroTodos();
        ImageIcon icon = new ImageIcon(".\\src\\Imagens\\atencao.png");
        if(usuario!= null || livro !=null){ 
            if(JOptionPane.showConfirmDialog(null, "Deseja Realmente DELETAR TODOS os Dados?", "ATENCAO", HEIGHT,HEIGHT, icon)==0){
            if(usuario != null) usuario.clear();
            if(livro != null)   livro.clear();
            configPadrao();
            alerta.setText("A Biblioteca 100Livros Foi Restaurada Com Sucesso");
            alerta.setVisible(true);
            }
        }
        else{
             alerta.setText("Biblioteca 100Livros Vazia");
             alerta.setVisible(true);
        }
        
        
    }//GEN-LAST:event_removertudoActionPerformed

    private void removerlivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerlivroActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        ArrayList<Livro> livro = control.buscarLivroTodos();
         if(livro!=null){    livro.clear();
            alerta.setText("Todos Livros foram Deletado");
         }
         else alerta.setText("Não há Livros");
         alerta.setVisible(true);
    }//GEN-LAST:event_removerlivroActionPerformed

    private void removeralunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeralunoActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        ArrayList<Usuario> usuario = control.getUserBusca("Aluno");
        
        if(usuario!=null && !usuario.isEmpty())  {
            int tam = usuario.size();
            for(int i=0; i<tam; i++){
                control.removerUsuario(usuario.get(i).getCodUsuario());
            }
            alerta.setText("Todos os Alunos foram Deletado");
        }
        else alerta.setText("Não há Alunos");
        alerta.setVisible(true);
    }//GEN-LAST:event_removeralunoActionPerformed

    private void removerprofessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerprofessorActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        ArrayList<Usuario> usuario = control.getUserBusca("Professor");
       
        if(usuario!=null && !usuario.isEmpty())  {
            int tam = usuario.size();
            for(int i=0; i<tam; i++){
                control.removerUsuario(usuario.get(i).getCodUsuario());
            }
            alerta.setText("Todos os Professores foram Deletado");
        }
        else alerta.setText("Não há Professores");
        alerta.setVisible(true);
    }//GEN-LAST:event_removerprofessorActionPerformed

    private void livrosTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_livrosTextFocusLost
        // TODO add your handling code here:
        String msg = livrosText.getText();
        if(!msg.endsWith("\\livros.dat")){
            alerta.setText("Caminho Inválido");
            alerta.setVisible(true);
            livrosText.setText(".\\livros.dat");
        }
        if(msg.charAt(0) == '\\')
            livrosText.setText('.'+msg);
    }//GEN-LAST:event_livrosTextFocusLost

    private void usuariosTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuariosTextFocusLost
        // TODO add your handling code here:
        String msg = usuariosText.getText();
        if(!msg.endsWith("\\usuarios.dat")){
            alerta.setText("Caminho Inválido");
            alerta.setVisible(true);
            usuariosText.setText(".\\usuarios.dat");
        }
        if(msg.charAt(0) == '\\')
            usuariosText.setText('.'+msg);
    }//GEN-LAST:event_usuariosTextFocusLost

    private void emprestimosTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emprestimosTextFocusLost
        // TODO add your handling code here:
        String msg = emprestimosText.getText();
        if(!msg.endsWith("\\emprestimos.dat")){
            alerta.setText("Caminho Inválido");
            alerta.setVisible(true);
            emprestimosText.setText(".\\emprestimos.dat");
        }
        if(msg.charAt(0) == '\\')
            emprestimosText.setText('.'+msg);
    }//GEN-LAST:event_emprestimosTextFocusLost

    private void textoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoFocusLost
        // TODO add your handling code here:
       String msg = texto.getText();
        if(msg.charAt(0) == '\\')
            texto.setText('.'+msg);
    }//GEN-LAST:event_textoFocusLost

    private void textoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyReleased
        // TODO add your handling code here:
        if(texto.getText().length()!=0){
            Controlador control = new Controlador();
            String t = texto.getText();
         
                if(t.endsWith("\\livros.dat")){
                    carregaBotao.setEnabled(true);
                    alerta.setVisible(false);
                }
                else if(t.endsWith("\\usuarios.dat")){
                    carregaBotao.setEnabled(true);
                    alerta.setVisible(false);
                }
                else if(t.endsWith("\\emprestimos.dat")){
                    carregaBotao.setEnabled(true);
                    alerta.setVisible(false);
                }
                else if(t.endsWith("\\config.dat")){
                    carregaBotao.setEnabled(true);
                    alerta.setVisible(false);
                }
                else{
                    alerta.setText("Arquivo Inválido");
                    alerta.setVisible(true);
                    carregaBotao.setEnabled(false);
            }
        }
    }//GEN-LAST:event_textoKeyReleased

    private void textoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoFocusGained
        // TODO add your handling code here:
        texto.setText(".\\");
    }//GEN-LAST:event_textoFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUConfig dialog = new IUConfig(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta;
    private javax.swing.JButton arq2;
    private javax.swing.JButton botao;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton carregaBotao;
    private javax.swing.JTextField diasAluno_Text;
    private javax.swing.JTextField diasProfessor_Text;
    private javax.swing.JTextField emprestimosText;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField livrosText;
    private javax.swing.JButton removeraluno;
    private javax.swing.JButton removerlivro;
    private javax.swing.JButton removerprofessor;
    private javax.swing.JButton removertudo;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField texto;
    private javax.swing.JTextField usuariosText;
    // End of variables declaration//GEN-END:variables

}
