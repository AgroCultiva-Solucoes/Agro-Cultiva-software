package telas;

import Classes.Usuario;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {
    
    public TelaMenu() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage());
    }

    public TelaMenu(Usuario userlogado) {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        navBar = new javax.swing.JMenuBar();
        menuFuncionarios = new javax.swing.JMenu();
        mItemVerFuncionarios = new javax.swing.JMenuItem();
        menuMaquinario = new javax.swing.JMenu();
        menuAtividades = new javax.swing.JMenu();
        menuEstoque = new javax.swing.JMenu();
        mItemVerEstoque = new javax.swing.JMenuItem();
        menuSafras = new javax.swing.JMenu();
        mItemHistoricoSafras = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu ");
        setMinimumSize(new java.awt.Dimension(650, 390));
        setResizable(false);
        getContentPane().setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(51, 102, 255));
        jDesktopPane1.setForeground(new java.awt.Color(55, 93, 10));
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 640, 330);

        navBar.setBackground(new java.awt.Color(252, 233, 204));

        menuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Usuario.png"))); // NOI18N
        menuFuncionarios.setText("Funcionarios");
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });

        mItemVerFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder_user.png"))); // NOI18N
        mItemVerFuncionarios.setText("Cadastrar");
        mItemVerFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemVerFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionarios.add(mItemVerFuncionarios);

        navBar.add(menuFuncionarios);

        menuMaquinario.setText("Maquinario");
        navBar.add(menuMaquinario);

        menuAtividades.setText("Atividades");
        navBar.add(menuAtividades);

        menuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_cesta.png"))); // NOI18N
        menuEstoque.setText("Estoque");

        mItemVerEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        mItemVerEstoque.setText("Ver Estoque");
        mItemVerEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemVerEstoqueActionPerformed(evt);
            }
        });
        menuEstoque.add(mItemVerEstoque);

        navBar.add(menuEstoque);

        menuSafras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_white_paste.png"))); // NOI18N
        menuSafras.setText("Safras");

        mItemHistoricoSafras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_white_magnify.png"))); // NOI18N
        mItemHistoricoSafras.setText("Historico");
        mItemHistoricoSafras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemHistoricoSafrasActionPerformed(evt);
            }
        });
        menuSafras.add(mItemHistoricoSafras);

        navBar.add(menuSafras);

        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_sair.png"))); // NOI18N
        menuLogout.setText("Sair");
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });
        navBar.add(menuLogout);

        setJMenuBar(navBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mItemVerFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVerFuncionariosActionPerformed
        // TODO add your handling code here:
        new TelaFuncionarios().setVisible(true);
    }//GEN-LAST:event_mItemVerFuncionariosActionPerformed

    public void deslogar(){
    dispose();

    Index telaIndex = new Index();
    telaIndex.setVisible(true);
    }
    
    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void mItemVerEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVerEstoqueActionPerformed
        dispose();
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_mItemVerEstoqueActionPerformed

    private void mItemHistoricoSafrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemHistoricoSafrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemHistoricoSafrasActionPerformed

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Até a proxima!");
        deslogar();
    }//GEN-LAST:event_menuLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem mItemHistoricoSafras;
    private javax.swing.JMenuItem mItemVerEstoque;
    private javax.swing.JMenuItem mItemVerFuncionarios;
    private javax.swing.JMenu menuAtividades;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuMaquinario;
    private javax.swing.JMenu menuSafras;
    private javax.swing.JMenuBar navBar;
    // End of variables declaration//GEN-END:variables
}
