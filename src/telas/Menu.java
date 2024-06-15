package telas;

import Classes.Usuario;
import javax.swing.JOptionPane;
import telas.Index;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage()); 
        initComponents();
        
        lblUsuarioLogado.setText(System.getProperty("usuario"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        menuFunc = new javax.swing.JLabel();
        menuEst = new javax.swing.JLabel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        menuSaf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 532));
        setMinimumSize(new java.awt.Dimension(860, 532));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Container.setBackground(new java.awt.Color(212, 212, 234));

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(860, 50));
        navbar.setMinimumSize(new java.awt.Dimension(860, 50));
        navbar.setName(""); // NOI18N
        navbar.setPreferredSize(new java.awt.Dimension(860, 50));

        menuFunc.setBackground(new java.awt.Color(153, 153, 153));
        menuFunc.setForeground(new java.awt.Color(0, 0, 0));
        menuFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Funcionarios.png"))); // NOI18N
        menuFunc.setText("Funcionarios");
        menuFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFunc.setMaximumSize(new java.awt.Dimension(110, 50));
        menuFunc.setMinimumSize(new java.awt.Dimension(110, 50));
        menuFunc.setPreferredSize(new java.awt.Dimension(110, 50));
        menuFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFuncMouseClicked(evt);
            }
        });

        menuEst.setBackground(new java.awt.Color(153, 153, 153));
        menuEst.setForeground(new java.awt.Color(0, 0, 0));
        menuEst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Caixa.png"))); // NOI18N
        menuEst.setText("Estoque");
        menuEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEst.setMaximumSize(new java.awt.Dimension(110, 50));
        menuEst.setMinimumSize(new java.awt.Dimension(110, 50));
        menuEst.setName(""); // NOI18N
        menuEst.setPreferredSize(new java.awt.Dimension(110, 50));
        menuEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEstMouseClicked(evt);
            }
        });

        quadroInfoSessao.setBackground(new java.awt.Color(0, 255, 255));
        quadroInfoSessao.setPreferredSize(new java.awt.Dimension(200, 50));

        lblUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioLogado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout quadroInfoSessaoLayout = new javax.swing.GroupLayout(quadroInfoSessao);
        quadroInfoSessao.setLayout(quadroInfoSessaoLayout);
        quadroInfoSessaoLayout.setHorizontalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroInfoSessaoLayout.createSequentialGroup()
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        quadroInfoSessaoLayout.setVerticalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroInfoSessaoLayout.createSequentialGroup()
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSair.setBackground(new java.awt.Color(204, 0, 0));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(0, 0, 0));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSair.setText("Deslogar");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout btnSairLayout = new javax.swing.GroupLayout(btnSair);
        btnSair.setLayout(btnSairLayout);
        btnSairLayout.setHorizontalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSairLayout.setVerticalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuSaf.setBackground(new java.awt.Color(153, 153, 153));
        menuSaf.setForeground(new java.awt.Color(0, 0, 0));
        menuSaf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSaf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Trigo.png"))); // NOI18N
        menuSaf.setText("Safras");
        menuSaf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSaf.setMaximumSize(new java.awt.Dimension(110, 50));
        menuSaf.setMinimumSize(new java.awt.Dimension(110, 50));
        menuSaf.setPreferredSize(new java.awt.Dimension(110, 50));
        menuSaf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSafMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(menuFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(menuSaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(menuEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menuFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menuSaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 482, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncMouseClicked
        if(System.getProperty("adm").equals("true")){
            dispose();
            TelaCadFunc gerenciarFunc = new TelaCadFunc();
            gerenciarFunc.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem acesso a está aba!", "Não Autorizado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuFuncMouseClicked

    private void menuEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEstMouseClicked
        dispose();
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_menuEstMouseClicked

    private void menuSafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSafMouseClicked
        dispose();
        new Safra().setVisible(true);
    }//GEN-LAST:event_menuSafMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario validarPermanencia = new Usuario();
        
        if(!validarPermanencia.validarPermanencia()){
            this.dispose();
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        Usuario deslogar = new Usuario();
        JOptionPane.showMessageDialog(null, "Deslogando, atá a proxima " + System.getProperty("nome") + "!", "log out", JOptionPane.INFORMATION_MESSAGE);
        deslogar.deslogar();
        dispose();
        Index logar = new Index();
        logar.setVisible(true);
    }//GEN-LAST:event_btnSairMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);;
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel btnSair;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel menuEst;
    private javax.swing.JLabel menuFunc;
    private javax.swing.JLabel menuSaf;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel quadroInfoSessao;
    // End of variables declaration//GEN-END:variables

    
    
}
