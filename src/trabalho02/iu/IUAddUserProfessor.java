/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.iu;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import trabalho02.controlador.Controlador;
import trabalho02.modelo.Aluno;
import trabalho02.modelo.Professor;
import trabalho02.modelo.Usuario;

/**
 *
 * @author MrFELIS
 */
public class IUAddUserProfessor extends javax.swing.JDialog {

    /**
     * Creates new form UIAddUserProfessor
     */
    public IUAddUserProfessor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        completar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        codText = new javax.swing.JTextField();
        nomeText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cursoBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cadastrarBotao = new javax.swing.JButton();
        cancelarBotao = new javax.swing.JButton();
        alerta = new javax.swing.JLabel();
        sairBotao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        removerBotao = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        atualizarBotao = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Professor"));

        codText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codTextActionPerformed(evt);
            }
        });
        codText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codTextKeyReleased(evt);
            }
        });

        nomeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeTextKeyReleased(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Nome do Professor");

        cursoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Especialização", "MBA", "Mestrado", "Mestrado Profissional", "Douturado" }));
        cursoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoBoxActionPerformed(evt);
            }
        });
        cursoBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cursoBoxKeyPressed(evt);
            }
        });

        jLabel3.setText("Titulação");

        cadastrarBotao.setText("Cadastrar");
        cadastrarBotao.setPreferredSize(new java.awt.Dimension(80, 20));
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });

        cancelarBotao.setText("Limpar");
        cancelarBotao.setPreferredSize(new java.awt.Dimension(80, 20));
        cancelarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotaoActionPerformed(evt);
            }
        });

        alerta.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomeText)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cursoBox, 0, 389, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(cadastrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cursoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(alerta))
        );

        sairBotao.setText("Voltar");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Professores Cadastrados"));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Titulação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.getTableHeader().setResizingAllowed(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabela);

        removerBotao.setText("Remover");
        removerBotao.setToolTipText("Remover Selecionado [Todos Apenas em Configurações ]");
        removerBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBotaoActionPerformed(evt);
            }
        });

        pesquisa.setText("Pesquisar por Nome dos Professores Cadastrados");
        pesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesquisaFocusLost(evt);
            }
        });
        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaKeyReleased(evt);
            }
        });

        atualizarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atualizar.png"))); // NOI18N
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(removerBotao)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atualizarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removerBotao)
                        .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sairBotao))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sairBotao)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void completar(){
        cancelarBotao.setToolTipText("Limpa Todos Os Campos Preenchidos");
        atualizarBotao.setToolTipText("Atualizar Tabela");
       Controlador control = new Controlador();
       ArrayList<Usuario> usuario = control.getUserBusca("Professor");
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       
       Professor prof = null;
       if(usuario !=null){
       for(Usuario user: usuario){
        prof=(Professor) user;
        Object linha[] = new Object[4];
        linha[0] = user.getCodUsuario();
        linha[1] = user.getNome();
        linha[2] = prof.getTitulacao();
        model.addRow(linha);
        }
       }
    }
    private void codTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codTextActionPerformed

    private void codTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            nomeText.requestFocus();
        }
    }//GEN-LAST:event_codTextKeyPressed

    private void codTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTextKeyReleased
        // TODO add your handling code here:

        TableRowSorter<TableModel> sorter = null;
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        sorter = new TableRowSorter<>(model);

        codText.setText(codText.getText().replaceAll("[^0-9 | ^.]",""));
        Controlador control = new Controlador();
        String cod = codText.getText();
        Usuario codigo = control.buscarUsuario(cod);
        if(codigo!=null){
            cadastrarBotao.setEnabled(false);
            if(codigo.getTipo().equals("Aluno"))
            alerta.setText("Codigo de Aluno Já Cadastrado");
            else alerta.setText("Codigo de Professor Já Cadastrado");
            alerta.setVisible(true);

            tabela.setRowSorter(sorter);
            String texto = codText.getText();
            if(texto.length() != 0){
                sorter.setRowFilter(RowFilter.regexFilter(texto, 0));
            }
        }
        else{
            tabela.setRowSorter(sorter);
            cadastrarBotao.setEnabled(true);
            alerta.setVisible(false);
        }
    }//GEN-LAST:event_codTextKeyReleased

    private void nomeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cursoBox.requestFocus();
        }
    }//GEN-LAST:event_nomeTextKeyPressed

    private void nomeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyReleased
        // TODO add your handling code here:
        nomeText.setText(nomeText.getText().replaceAll("[^A-Z | ^a-z]",""));
    }//GEN-LAST:event_nomeTextKeyReleased

    private void cursoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoBoxActionPerformed

    private void cursoBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cursoBoxKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            getRootPane().setDefaultButton(cadastrarBotao);
        }
    }//GEN-LAST:event_cursoBoxKeyPressed

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        String cod = codText.getText();
        String nome = nomeText.getText();
        String curso = (String) cursoBox.getSelectedItem();
        if(cod.isEmpty() || nome.isEmpty() ||  curso == "."){
            alerta.setText("Preencha todos os campos");
            alerta.setVisible(true);
        }
        else{
            Controlador control = new Controlador();
            control.addProfessor(cod, nome, curso);

            Object linha[] = new Object[4];
            linha[0] = cod;
            linha[1] = nome;
            linha[2] = curso;

            model.addRow(linha);
            alerta.setText("Professor Cadastrado");
            alerta.setVisible(true);
            codText.setText("");
            codText.requestFocus();
            nomeText.setText("");
            cursoBox.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void cancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotaoActionPerformed
        // TODO add your handling code here:
        alerta.setVisible(false);
        codText.setText("");
        codText.requestFocus();
        nomeText.setText("");
        cursoBox.setSelectedIndex(0);
    }//GEN-LAST:event_cancelarBotaoActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_sairBotaoActionPerformed

    private void removerBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBotaoActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        TableRowSorter<TableModel> sorter = null;
        int linha=-1;
        linha = tabela.getSelectedRow();
        
        if(linha>=0){
            String cod;
            cod = (String) (tabela.getValueAt(linha, 0));           
            control.removerUsuario(cod);
            linha=tabela.convertRowIndexToModel(linha);
            model.removeRow(linha);
            pesquisa.setText("Pesquisar por Nome dos Professores Cadastrados");   
            
            tabela.setRowSorter(null);
        }
    }//GEN-LAST:event_removerBotaoActionPerformed

    private void pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyReleased
        // TODO add your handling code here:
        pesquisa.setText(pesquisa.getText().replaceAll("[^A-Z | ^a-z]",""));
        TableRowSorter<TableModel> sorter = null;
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        sorter = new TableRowSorter<>(model);
        tabela.setRowSorter(sorter);
        String texto = pesquisa.getText();
        if(texto.length() != 0){
            sorter.setRowFilter(RowFilter.regexFilter(texto));
        }
    }//GEN-LAST:event_pesquisaKeyReleased

    private void pesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaFocusGained
        // TODO add your handling code here:
        pesquisa.setText("");
    }//GEN-LAST:event_pesquisaFocusGained

    private void pesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaFocusLost
        // TODO add your handling code here:
        pesquisa.setText("Pesquisar por Nome dos Professores Cadastrados");
    }//GEN-LAST:event_pesquisaFocusLost

    private void removerTabela(){
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       int tam = tabela.getRowCount();
       for(int i=0; i<tam; i++){
           model.removeRow(0);
       }
    } 
    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBotaoActionPerformed
        // TODO add your handling code here:
       removerTabela();
       completar();
    }//GEN-LAST:event_atualizarBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IUAddUserProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUAddUserProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUAddUserProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUAddUserProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUAddUserProfessor dialog = new IUAddUserProfessor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
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
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JButton cancelarBotao;
    private javax.swing.JTextField codText;
    private javax.swing.JComboBox<String> cursoBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton removerBotao;
    private javax.swing.JButton sairBotao;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
