/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.iu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import trabalho02.controlador.Controlador;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Item;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Usuario;

/**
 *
 * @author JOÃO VICTOR
 */
public class IUEmprestimo extends javax.swing.JDialog {

    /**
     * Creates new form IUEmprestimo
     */
    public IUEmprestimo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        procuralivro();
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
        empretext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        empretext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                empretextFocusLost(evt);
            }
        });
        empretext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empretextActionPerformed(evt);
            }
        });
        empretext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empretextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empretextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empretextKeyTyped(evt);
            }
        });

        jLabel2.setText("Código/Nome usuário");

        jScrollPane1.setViewportView(lista2);
        lista2.getAccessibleContext().setAccessibleDescription("");

        jScrollPane2.setViewportView(lista1);

        jButton3.setText("Adicionar >>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Terminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Escolha os livros para empréstimo");

        jLabel4.setText("Código empréstimo");

        cb1.setNextFocusableComponent(lista1);

        jButton1.setText("<< Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Livros para empréstimos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(empretext, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empretext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empretextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empretextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empretextActionPerformed

    DefaultListModel<String> list = new DefaultListModel();
    DefaultListModel<String> list2 = new DefaultListModel();

    public void procuralivro(){
        Controlador control = new Controlador();
       ArrayList<Livro> livro = control.getLivroBusca();
       if(livro!= null){
           for(Livro li: livro){
               if(li.estaEmprestado()==false){
                   String msg = li.getCodLivro() + " " + li.getNome();
                   list.addElement(msg);
               }
           }
       }
       lista1.setModel(list);
       lista2.setModel(list2);
       ArrayList<Usuario> usuario = control.buscarUsuarioTodos();
       if(usuario!=null){
       String str = null;  
            for(int i = 0;i<usuario.size(); i++ ){  
                str = usuario.get(i).getCodUsuario();
                str = str + " " + usuario.get(i).getNome();
               cb1.addItem(str);  
           }
    }}
    
    private void empretextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empretextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_empretextKeyPressed
   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(lista1.getSelectedValue()!=null){
        list2.addElement(lista1.getSelectedValue());
        list.remove(lista1.getSelectedIndex());
        lista2.setModel(list2);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        Usuario usuario;
        ArrayList<Item> itens = new ArrayList<Item>();
        Item it;
        Livro livro;
        Calendar d = Calendar.getInstance();
        int i;
        String msg;
        if(!empretext.getText().isEmpty() && cb1.getItemAt(cb1.getSelectedIndex()) != null && !list2.isEmpty()){
        if(control.procuraEmprestimo(empretext.getText())==true)
            JOptionPane.showMessageDialog(null, "Código ja existente, digite outro");
        else{
        usuario = control.buscarUsuario(cb1.getItemAt(cb1.getSelectedIndex()).substring(0,6));
        int dia = usuario.getDiasEmprestimo();
        for(i=0;i<list2.getSize();i++){
            msg = list2.getElementAt(i);
            livro = control.buscaLivro(msg.substring(0,6));
            livro.emprestar();
            it = new Item(empretext.getText(),msg.substring(0,6));
            d.add(Calendar.DAY_OF_MONTH, dia);
            it.setDataDevolucao(d);
            it.setCodLivro(livro.getCodLivro());
            itens.add(it);
                }
        control.emprestimo(empretext.getText(), usuario,itens);
        JOptionPane.showMessageDialog(null, "Emprestimo realizado com sucesso");
        this.dispose();
        }
        }
        else  JOptionPane.showMessageDialog(null, "Campo faltando");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void empretextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empretextKeyReleased
        // TODO add your handling code here:
        empretext.setText(empretext.getText().replaceAll("[^0-9]",""));
    }//GEN-LAST:event_empretextKeyReleased

    private void empretextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empretextFocusLost
        // TODO add your handling code here:
        String codFormatar = empretext.getText();
        if(!codFormatar.isEmpty()){
        while(codFormatar.length()<6){
            codFormatar = "0"+codFormatar;
        }
        empretext.setText(codFormatar);

        Controlador control = new Controlador();
        String cod = empretext.getText();
        Emprestimo codigo = control.buscarEmprestimo(codFormatar);
        if(codigo!=null){
            JOptionPane.showMessageDialog(null,"Codigo "+codFormatar+ " Já Está Cadastrado" );
            empretext.requestFocus();
            empretext.setText("");
        }
        }
    }//GEN-LAST:event_empretextFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(lista2.getSelectedValue()!=null){
        list.addElement(lista2.getSelectedValue());
        list2.remove(lista2.getSelectedIndex());
        lista1.setModel(list);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empretextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empretextKeyTyped
        // TODO add your handling code here:
        if(empretext.getText().length() == 6){
            evt.consume();
        }
    }//GEN-LAST:event_empretextKeyTyped

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
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUEmprestimo dialog = new IUEmprestimo(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JTextField empretext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    // End of variables declaration//GEN-END:variables

    private void isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
