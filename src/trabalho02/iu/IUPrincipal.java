/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IUPrincipal.java
 *
 * Created on 24/05/2013, 23:19:53
 */
package trabalho02.iu;



import javax.swing.JOptionPane;
import trabalho02.controlador.Controlador;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class IUPrincipal extends javax.swing.JFrame {

    /** Creates new form IUPrincipal */
    public IUPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        canvas1 = new java.awt.Canvas();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        botaoSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Olá Marilene");
        jLabel1.setEnabled(false);

        jMenu5.setText("Dados");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Salvar Dados");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Carregar Dados");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);
        jMenu5.add(jSeparator3);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("Configurações");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);
        jMenu5.add(jSeparator6);

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        jMenu5.add(botaoSair);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Cadastros");

        jMenu3.setText("Usuários");

        jMenuItem1.setText("Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Professor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenuItem3.setText("Livros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentação");

        jMenuItem4.setText("Empréstimo");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Devolução");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");

        jMenuItem6.setText("Todos Usuários");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Todos Alunos");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Todos Professores");
        jMenu4.add(jMenuItem8);

        jMenuItem17.setText("Todos Livros já Emprestados para um Usuário");
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Livros não Devolvidos por um Usuário");
        jMenu4.add(jMenuItem18);
        jMenu4.add(jSeparator1);

        jMenuItem9.setText("Todos os Livros");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Livros Disponíveis");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Livros Emprestados");
        jMenu4.add(jMenuItem11);
        jMenu4.add(jSeparator2);

        jMenuItem12.setText("Livros com Atraso");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Usuários com Atraso");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(354, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        IUConfig iuConfig = IUConfig.getInstancia(this);
        iuConfig.exibir(control.getConfiguracoes());

        //alternativamente, podemos chamar assim:
        //IUConfig.getInstancia(this).exibir(biblioteca.getConfiguracoes());
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        if(!control.salvarLivros()) JOptionPane.showMessageDialog(rootPane, "Caminho Especificado Sem Permissão,\nPor Favor Altere-o em Configurações(CTRL-F)",
                "ERROR: caminho do Arquivo", HEIGHT); //salva livros para arquivo
        if(!control.salvarUsuarios())JOptionPane.showMessageDialog(rootPane, "Caminho Especificado Sem Permissão,\nPor Favor Altere-o em Configurações(CTRL-F)",
                "ERROR: caminho do Arquivo", HEIGHT); //salva livros para arquivo;
        if(!control.salvarUsuarios())JOptionPane.showMessageDialog(rootPane, "Caminho Especificado Sem Permissão,\nPor Favor Altere-o em Configurações(CTRL-F)",
                "ERROR: caminho do Arquivo", HEIGHT); //salva livros para arquivo;
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        control.recuperarLivros(); //carrega livros do arquivo
        control.recuperarUsuarios();
        control.recuperarEmprestimos();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    IUAddUserAlunos alunos = new IUAddUserAlunos(this, true);
    alunos.setLocationRelativeTo(this);
    alunos.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        IUAddUserProfessor prof = new IUAddUserProfessor(this, true);
        prof.setLocationRelativeTo(this);
        prof.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IUAddLivro livro = new IUAddLivro(this, true);
        livro.setLocationRelativeTo(this);
        livro.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botaoSair;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
