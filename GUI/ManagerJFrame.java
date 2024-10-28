package eMart.gui;

import eMart.pojo.UserProfile;

public class ManagerJFrame extends javax.swing.JFrame {
    public ManagerJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        //Welcome user by its name
        lblWelcomelUserName.setText(UserProfile.getUserName());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        pnlManagerPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lblManagerPanel = new javax.swing.JLabel();
        pnlSelectOption = new javax.swing.JPanel();
        btnManageEmp = new javax.swing.JButton();
        btnManageRecp = new javax.swing.JButton();
        btnViewOrders = new javax.swing.JButton();
        btnManageStocks = new javax.swing.JButton();
        pnlWelcome = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblWelcomelUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblImage.setBackground(new java.awt.Color(0, 0, 0));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eMart/image/Manager.jpg"))); // NOI18N

        pnlManagerPanel.setBackground(new java.awt.Color(204, 0, 51));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblManagerPanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblManagerPanel.setForeground(new java.awt.Color(255, 255, 255));
        lblManagerPanel.setText("Manager Panel");

        javax.swing.GroupLayout pnlManagerPanelLayout = new javax.swing.GroupLayout(pnlManagerPanel);
        pnlManagerPanel.setLayout(pnlManagerPanelLayout);
        pnlManagerPanelLayout.setHorizontalGroup(
            pnlManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManagerPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblManagerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(25, 25, 25))
        );
        pnlManagerPanelLayout.setVerticalGroup(
            pnlManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManagerPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(lblManagerPanel))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlSelectOption.setBackground(new java.awt.Color(204, 0, 51));
        pnlSelectOption.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlSelectOption.setForeground(new java.awt.Color(255, 255, 255));

        btnManageEmp.setBackground(new java.awt.Color(153, 0, 51));
        btnManageEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmp.setText("Manage Employees");
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });

        btnManageRecp.setBackground(new java.awt.Color(153, 0, 51));
        btnManageRecp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageRecp.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRecp.setText("Manage Receptionist");
        btnManageRecp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRecpActionPerformed(evt);
            }
        });

        btnViewOrders.setBackground(new java.awt.Color(153, 0, 51));
        btnViewOrders.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrders.setText("View Orders");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        btnManageStocks.setBackground(new java.awt.Color(153, 0, 51));
        btnManageStocks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageStocks.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStocks.setText("Manage Stocks");
        btnManageStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStocksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSelectOptionLayout = new javax.swing.GroupLayout(pnlSelectOption);
        pnlSelectOption.setLayout(pnlSelectOptionLayout);
        pnlSelectOptionLayout.setHorizontalGroup(
            pnlSelectOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlSelectOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(btnManageStocks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlSelectOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageRecp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlSelectOptionLayout.setVerticalGroup(
            pnlSelectOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlSelectOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageRecp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlSelectOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pnlWelcome.setBackground(new java.awt.Color(105, 0, 0));

        lblWelcome.setBackground(new java.awt.Color(102, 0, 0));
        lblWelcome.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Welcome");

        lblWelcomelUserName.setBackground(new java.awt.Color(102, 0, 0));
        lblWelcomelUserName.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        lblWelcomelUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcomelUserName.setText("Manager...");

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWelcomelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(lblWelcomelUserName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSelectOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlManagerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlManagerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSelectOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
        // TODO add your handling code here:
        ManageEmployeesJFrame mgEmp=new ManageEmployeesJFrame();
        mgEmp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnManageRecpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRecpActionPerformed
        // TODO add your handling code here:
        ManageReceptionistJFrame mgRecp=new ManageReceptionistJFrame();
        mgRecp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnManageRecpActionPerformed

    private void btnManageStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStocksActionPerformed
        // TODO add your handling code here:
        ManageStocksJFrame mgStk=new ManageStocksJFrame();
        mgStk.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnManageStocksActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        ViewManagerOrdersJFrame vwOrd=new ViewManagerOrdersJFrame();
        vwOrd.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginJFrame login=new LoginJFrame();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageRecp;
    private javax.swing.JButton btnManageStocks;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblManagerPanel;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWelcomelUserName;
    private javax.swing.JPanel pnlManagerPanel;
    private javax.swing.JPanel pnlSelectOption;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}
