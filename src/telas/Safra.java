package telas;

import Classes.Usuario;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Safra extends javax.swing.JFrame {

    public Safra() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage()); 
        initComponents();
        lblUsuarioLogado.setText(System.getProperty("usuario"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JMenuBar();
        menuFuncionarios = new javax.swing.JMenu();
        mItemVerFuncionarios = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();
        mItemVerEstoque = new javax.swing.JMenuItem();
        menuSafras = new javax.swing.JMenu();
        mItemHistoricoSafras = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();
        jSlider1 = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        pSoja = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbSoja = new javax.swing.JLabel();
        lbSojaN = new javax.swing.JLabel();
        pArroz = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbArroz = new javax.swing.JLabel();
        lbArrozN = new javax.swing.JLabel();
        pTrigo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbTrigo = new javax.swing.JLabel();
        lbTrigoN = new javax.swing.JLabel();
        navbar = new javax.swing.JPanel();
        menuEst1 = new javax.swing.JLabel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        menuUsu1 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(835, 532));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(212, 212, 234));
        jPanel1.setMaximumSize(new java.awt.Dimension(835, 532));
        jPanel1.setMinimumSize(new java.awt.Dimension(835, 532));
        jPanel1.setPreferredSize(new java.awt.Dimension(835, 532));

        pSoja.setBackground(new java.awt.Color(142, 172, 198));
        pSoja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pSoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSojaMouseClicked(evt);
            }
        });

        lbSoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soybean (4) (3).png"))); // NOI18N
        lbSoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSojaMouseClicked(evt);
            }
        });

        lbSojaN.setForeground(new java.awt.Color(0, 0, 0));
        lbSojaN.setText("SOJA");
        lbSojaN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSojaNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pSojaLayout = new javax.swing.GroupLayout(pSoja);
        pSoja.setLayout(pSojaLayout);
        pSojaLayout.setHorizontalGroup(
            pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSojaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSoja, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(pSojaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbSojaN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSojaLayout.setVerticalGroup(
            pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSojaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSojaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSoja, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSojaN)
                .addContainerGap())
        );

        pArroz.setBackground(new java.awt.Color(142, 172, 198));
        pArroz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pArroz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pArrozMouseClicked(evt);
            }
        });

        lbArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rice (1).png"))); // NOI18N
        lbArroz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbArrozMouseClicked(evt);
            }
        });

        lbArrozN.setForeground(new java.awt.Color(0, 0, 0));
        lbArrozN.setText("ARROZ");
        lbArrozN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbArrozNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pArrozLayout = new javax.swing.GroupLayout(pArroz);
        pArroz.setLayout(pArrozLayout);
        pArrozLayout.setHorizontalGroup(
            pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pArrozLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(lbArroz)
                .addGap(23, 23, 23))
            .addGroup(pArrozLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbArrozN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pArrozLayout.setVerticalGroup(
            pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArrozLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pArrozLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbArrozN)
                .addContainerGap())
        );

        pTrigo.setBackground(new java.awt.Color(142, 172, 198));
        pTrigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pTrigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pTrigoMouseClicked(evt);
            }
        });

        lbTrigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wheat-sack (5).png"))); // NOI18N
        lbTrigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTrigoMouseClicked(evt);
            }
        });

        lbTrigoN.setForeground(new java.awt.Color(0, 0, 0));
        lbTrigoN.setText("TRIGO");
        lbTrigoN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTrigoNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pTrigoLayout = new javax.swing.GroupLayout(pTrigo);
        pTrigo.setLayout(pTrigoLayout);
        pTrigoLayout.setHorizontalGroup(
            pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTrigoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbTrigoN))
                    .addComponent(lbTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        pTrigoLayout.setVerticalGroup(
            pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrigoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTrigoN)
                .addContainerGap())
        );

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(835, 50));
        navbar.setMinimumSize(new java.awt.Dimension(835, 50));
        navbar.setName(""); // NOI18N

        menuEst1.setBackground(new java.awt.Color(153, 153, 153));
        menuEst1.setForeground(new java.awt.Color(0, 0, 0));
        menuEst1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuEst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Caixa.png"))); // NOI18N
        menuEst1.setText("Estoque");
        menuEst1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEst1.setMaximumSize(new java.awt.Dimension(110, 50));
        menuEst1.setMinimumSize(new java.awt.Dimension(110, 50));
        menuEst1.setName(""); // NOI18N
        menuEst1.setPreferredSize(new java.awt.Dimension(110, 50));
        menuEst1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEst1MouseClicked(evt);
            }
        });

        quadroInfoSessao.setBackground(new java.awt.Color(0, 255, 255));
        quadroInfoSessao.setPreferredSize(new java.awt.Dimension(200, 50));

        lblUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioLogado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout quadroInfoSessaoLayout = new javax.swing.GroupLayout(quadroInfoSessao);
        quadroInfoSessao.setLayout(quadroInfoSessaoLayout);
        quadroInfoSessaoLayout.setHorizontalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroInfoSessaoLayout.createSequentialGroup()
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        quadroInfoSessaoLayout.setVerticalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVoltar.setBackground(new java.awt.Color(255, 255, 51));
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setMaximumSize(new java.awt.Dimension(39, 32767));
        btnVoltar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        lblVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVoltar.setForeground(new java.awt.Color(0, 0, 0));
        lblVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar.setText(">");
        lblVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVoltar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout btnVoltarLayout = new javax.swing.GroupLayout(btnVoltar);
        btnVoltar.setLayout(btnVoltarLayout);
        btnVoltarLayout.setHorizontalGroup(
            btnVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnVoltarLayout.setVerticalGroup(
            btnVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVoltarLayout.createSequentialGroup()
                .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuUsu1.setForeground(new java.awt.Color(0, 0, 0));
        menuUsu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Funcionarios.png"))); // NOI18N
        menuUsu1.setText("Funcionarios");
        menuUsu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(menuUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quadroInfoSessao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menuEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menuUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(pArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(pTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(pSoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pSoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(851, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mItemVerFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVerFuncionariosActionPerformed
        if(System.getProperty("adm").equals("true")){
            dispose();
            TelaCadFunc gerenciarFunc = new TelaCadFunc();
            gerenciarFunc.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem acesso a está aba!", "Não Autorizado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mItemVerFuncionariosActionPerformed

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void mItemVerEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVerEstoqueActionPerformed
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_mItemVerEstoqueActionPerformed

    private void mItemHistoricoSafrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemHistoricoSafrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemHistoricoSafrasActionPerformed

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked

    }//GEN-LAST:event_menuLogoutMouseClicked

    private void menuEst1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEst1MouseClicked
        dispose();
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_menuEst1MouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();

        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void menuUsu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsu1MouseClicked
        if(System.getProperty("adm").equals("true")){
            dispose();
            TelaCadFunc gerenciarFunc = new TelaCadFunc();
            gerenciarFunc.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem acesso a está aba!", "Não Autorizado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuUsu1MouseClicked

    private void lbArrozMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbArrozMouseClicked
         
    }//GEN-LAST:event_lbArrozMouseClicked

    private void lbArrozNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbArrozNMouseClicked
        
    }//GEN-LAST:event_lbArrozNMouseClicked

    private void pArrozMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pArrozMouseClicked
       
    }//GEN-LAST:event_pArrozMouseClicked

    private void lbTrigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTrigoMouseClicked
        
    }//GEN-LAST:event_lbTrigoMouseClicked

    private void lbTrigoNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTrigoNMouseClicked
        
    }//GEN-LAST:event_lbTrigoNMouseClicked

    private void pTrigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pTrigoMouseClicked
        
    }//GEN-LAST:event_pTrigoMouseClicked

    private void lbSojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSojaMouseClicked
       
    }//GEN-LAST:event_lbSojaMouseClicked

    private void lbSojaNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSojaNMouseClicked
        
    }//GEN-LAST:event_lbSojaNMouseClicked

    private void pSojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSojaMouseClicked
        
    }//GEN-LAST:event_pSojaMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario validarPermanencia = new Usuario();
        
        if(!validarPermanencia.validarPermanencia()){
            this.dispose();
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Safra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lbArroz;
    private javax.swing.JLabel lbArrozN;
    private javax.swing.JLabel lbSoja;
    private javax.swing.JLabel lbSojaN;
    private javax.swing.JLabel lbTrigo;
    private javax.swing.JLabel lbTrigoN;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JMenuItem mItemHistoricoSafras;
    private javax.swing.JMenuItem mItemVerEstoque;
    private javax.swing.JMenuItem mItemVerFuncionarios;
    private javax.swing.JLabel menuEst1;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuSafras;
    private javax.swing.JLabel menuUsu1;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel pArroz;
    private javax.swing.JPanel pSoja;
    private javax.swing.JPanel pTrigo;
    private javax.swing.JPanel quadroInfoSessao;
    // End of variables declaration//GEN-END:variables
}
