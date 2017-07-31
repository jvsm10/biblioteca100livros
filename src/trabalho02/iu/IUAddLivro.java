/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.iu;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import trabalho02.controlador.Controlador;
import trabalho02.modelo.Livro;

/**
 *
 * @author MrFELIS
 */
public class IUAddLivro extends javax.swing.JDialog {

    /**
     * Creates new form IUAddLivro
     */
    public IUAddLivro(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        codText = new javax.swing.JTextField();
        nomeText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cadastrarBotao = new javax.swing.JButton();
        cancelarBotao = new javax.swing.JButton();
        alerta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        removerBotao = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        atualizarBotao = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 560));
        setMinimumSize(new java.awt.Dimension(720, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Livro"));

        codText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codTextFocusLost(evt);
            }
        });
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codTextKeyTyped(evt);
            }
        });

        nomeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeTextFocusLost(evt);
            }
        });
        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });
        nomeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeTextKeyTyped(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Nome do Livro");

        anoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                anoTextFocusLost(evt);
            }
        });
        anoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anoTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                anoTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anoTextKeyTyped(evt);
            }
        });

        jLabel4.setText("Ano");

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
                    .addComponent(alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(281, 281, 281))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomeText))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cadastrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoText, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(codText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(alerta))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Livros Cadastrados"));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Ano", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        pesquisa.setText("Pesquisar por Nome dos Livros Cadastrados");
        pesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesquisaFocusLost(evt);
            }
        });
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerBotao)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        sairBotao.setText("Voltar");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 586, Short.MAX_VALUE)
                        .addComponent(sairBotao))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sairBotao)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codTextFocusLost
        // TODO add your handling code here:
        String codFormatar = codText.getText();
        if(!codFormatar.isEmpty()){
        while(codFormatar.length()<6){
            codFormatar = "0"+codFormatar;
        }
        codText.setText(codFormatar);

        Controlador control = new Controlador();
        String cod = codText.getText();
        Livro codigo = control.buscaLivro(cod);
        if(codigo!=null){
            cadastrarBotao.setEnabled(false);
            alerta.setText("Codigo '"+codFormatar+"' do Livro '"+codigo.getNome()+"' Já Está Cadastrado");
            alerta.setVisible(true);
            codText.requestFocus();
            codText.setText("");
        }
        else{   

            cadastrarBotao.setEnabled(true);
            alerta.setVisible(false);
        }
        }
    }//GEN-LAST:event_codTextFocusLost

    private void codTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codTextActionPerformed

    private void codTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            nomeText.requestFocus();
        }
    }//GEN-LAST:event_codTextKeyPressed

    private void nomeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTextFocusLost
        // TODO add your handling code here:
        TableRowSorter<TableModel> sorter = null;
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        tabela.setRowSorter(sorter);
    }//GEN-LAST:event_nomeTextFocusLost

    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void nomeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            anoText.requestFocus();
        }
    }//GEN-LAST:event_nomeTextKeyPressed

    private void nomeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyReleased
        // TODO add your handling code here:
        TableRowSorter<TableModel> sorter = null;
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        sorter = new TableRowSorter<>(model);
        tabela.setRowSorter(sorter);
        String texto = nomeText.getText();
        if(texto.length() != 0){
            sorter.setRowFilter(RowFilter.regexFilter(texto));       
               }
    }//GEN-LAST:event_nomeTextKeyReleased

    private void anoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoTextKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrarBotao.requestFocus();
            }

    }//GEN-LAST:event_anoTextKeyPressed

    private void anoTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoTextKeyReleased
        // TODO add your handling code here:
        anoText.setText(anoText.getText().replaceAll("[^0-9]",""));
    }//GEN-LAST:event_anoTextKeyReleased

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        String cod = codText.getText();
        String nome = nomeText.getText();
        String ano= anoText.getText();

        if(cod.isEmpty() || nome.isEmpty() || ano.isEmpty()){
            alerta.setText("Preencha todos os campos");
            alerta.setVisible(true);
        }
        else if(Integer.parseInt(ano)>2017 || ano.length() == 1 || ano.length() == 3){
            alerta.setText("Ano Inválido, (dois ou quatro digítos) e Dentro o Ano no Intervalo {0000..2017}");
            alerta.setVisible(true);
            anoText.setText("");
            anoText.requestFocus();    
        }
        else{

            Controlador control = new Controlador();
            control.addLivro(cod, nome, ano);

            Object linha[] = new Object[4];
            linha[0] = cod;
            linha[1] = nome;
            linha[2] = ano;
            linha[3] = "Livre";
            model.addRow(linha);

            alerta.setText("Livro Cadastrado");
            alerta.setVisible(true);
            codText.setText("");
            codText.requestFocus();
            nomeText.setText("");
            anoText.setText("");

        }
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void cancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotaoActionPerformed
        // TODO add your handling code here:
        alerta.setVisible(false);
        codText.setText("");
        codText.requestFocus();
        nomeText.setText("");
        anoText.setText("");
    }//GEN-LAST:event_cancelarBotaoActionPerformed

    private void removerBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBotaoActionPerformed
        // TODO add your handling code here:
       Controlador control = new Controlador();
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        int linha=-1;
        
        TableRowSorter<TableModel> sorter = null;
        linha = tabela.getSelectedRow();
        
        if(linha>=0){
            String cod;
            cod = (String) (tabela.getValueAt(linha, 0));
            control.removerLivro(cod);
            linha=tabela.convertRowIndexToModel(linha);     
            model.removeRow(linha);
            pesquisa.setText("Pesquisar por Nome dos Livros Cadastradas");
            tabela.setRowSorter(null);
        }
    }//GEN-LAST:event_removerBotaoActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_sairBotaoActionPerformed

    private void pesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaFocusGained
        // TODO add your handling code here:
        pesquisa.setText("");
    }//GEN-LAST:event_pesquisaFocusGained

    private void pesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaFocusLost
        // TODO add your handling code here:
        pesquisa.setText("Pesquisar por Nome dos Livros Cadastrados");
    }//GEN-LAST:event_pesquisaFocusLost

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

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

    private void codTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTextKeyTyped
        // TODO add your handling code here:
        if(codText.getText().length() == 6){
            evt.consume();
        }
    }//GEN-LAST:event_codTextKeyTyped

    private void nomeTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyTyped
        // TODO add your handling code here:
        if(nomeText.getText().length() == 60){
            evt.consume();
        }
    }//GEN-LAST:event_nomeTextKeyTyped

    private void anoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoTextKeyTyped
        // TODO add your handling code here:
        if(anoText.getText().length() == 4){
            evt.consume();
        }
    }//GEN-LAST:event_anoTextKeyTyped

    private void codTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTextKeyReleased
        // TODO add your handling code here:
      codText.setText(codText.getText().replaceAll("[^0-9]",""));
    }//GEN-LAST:event_codTextKeyReleased

    private void anoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_anoTextFocusLost
        // TODO add your handling code here:
        String sano= anoText.getText();
        String ano;
        int nano=0;
        if(!sano.isEmpty()) nano = Integer.parseInt(sano);
        if(sano.length() == 2){
            alerta.setVisible(false);
            if(nano>17){
                ano = "19"; 
        }   
            else ano = "20";
            anoText.setText(ano+sano);
        }
        else if(sano.length() == 3 || sano.length() == 1){
            alerta.setText("Ano Inválido, (dois ou quatro digítos) e Dentro o Ano no Intervalo {0000..2017}");
            alerta.setVisible(true);
          //  anoText.requestFocus();
        }    
    }//GEN-LAST:event_anoTextFocusLost

    private void completar(){
        cancelarBotao.setToolTipText("Limpa Todos Os Campos Preenchidos");
        atualizarBotao.setToolTipText("Atualizar Tabela");
       Controlador control = new Controlador();
       ArrayList<Livro> li = control.getLivroBusca();
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       String estado;
       
       if(li != null){    
           for(Livro livro: li){      
               if(livro.estaEmprestado()) estado="Emprestado";      
               else estado="Livre";      
               Object linha[] = new Object[4];       
               linha[0] = livro.getCodLivro();      
               linha[1] = livro.getNome();        
               linha[2] = livro.getAno();       
               linha[3] = estado;    
               model.addRow(linha);
        }
       }
    }
      
    
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
            java.util.logging.Logger.getLogger(IUAddLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUAddLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUAddLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUAddLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUAddLivro dialog = new IUAddLivro(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField anoText;
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JButton cancelarBotao;
    private javax.swing.JTextField codText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton removerBotao;
    private javax.swing.JButton sairBotao;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
