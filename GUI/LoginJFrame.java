package eMart.gui;

import eMart.pojo.UserPojo;
import javax.swing.JOptionPane;
import java.sql.*;
import eMart.dao.UsersDAO;
import eMart.pojo.UserProfile;
import javax.swing.ImageIcon;

public class LoginJFrame extends javax.swing.JFrame {
    String userId,password,userType;
    
    public LoginJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon img=new ImageIcon("C:\\Users\\Win11 Pro\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\eMart\\image\\EMart shop.jpg");
        lblImage.setIcon(img);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlUserType = new javax.swing.JPanel();
        rbManager = new javax.swing.JRadioButton();
        rbReceptionist = new javax.swing.JRadioButton();
        pnlLoginDetails = new javax.swing.JPanel();
        lblUserId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        pssPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(102, 0, 102));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Login Panel");

        pnlUserType.setBackground(new java.awt.Color(153, 0, 51));
        pnlUserType.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, new java.awt.Color(0, 0, 0)), "User Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlUserType.setForeground(new java.awt.Color(255, 255, 255));

        rbManager.setBackground(new java.awt.Color(153, 0, 51));
        buttonGroup1.add(rbManager);
        rbManager.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbManager.setForeground(new java.awt.Color(255, 255, 255));
        rbManager.setText("Manager");
        rbManager.setBorder(null);

        rbReceptionist.setBackground(new java.awt.Color(153, 0, 51));
        buttonGroup1.add(rbReceptionist);
        rbReceptionist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbReceptionist.setForeground(new java.awt.Color(255, 255, 255));
        rbReceptionist.setText("Receptionist");
        rbReceptionist.setBorder(null);

        javax.swing.GroupLayout pnlUserTypeLayout = new javax.swing.GroupLayout(pnlUserType);
        pnlUserType.setLayout(pnlUserTypeLayout);
        pnlUserTypeLayout.setHorizontalGroup(
            pnlUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserTypeLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(rbManager, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(rbReceptionist)
                .addGap(112, 112, 112))
        );
        pnlUserTypeLayout.setVerticalGroup(
            pnlUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserTypeLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(pnlUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbManager)
                    .addComponent(rbReceptionist))
                .addGap(64, 64, 64))
        );

        pnlLoginDetails.setBackground(new java.awt.Color(204, 0, 51));
        pnlLoginDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlLoginDetails.setForeground(new java.awt.Color(255, 255, 255));
        pnlLoginDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblUserId.setBackground(new java.awt.Color(204, 0, 51));
        lblUserId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(255, 255, 255));
        lblUserId.setText("User ID");

        lblPassword.setBackground(new java.awt.Color(204, 0, 51));
        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        btnLogin.setBackground(new java.awt.Color(153, 0, 51));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(153, 0, 51));
        btnQuit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginDetailsLayout = new javax.swing.GroupLayout(pnlLoginDetails);
        pnlLoginDetails.setLayout(pnlLoginDetailsLayout);
        pnlLoginDetailsLayout.setHorizontalGroup(
            pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginDetailsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginDetailsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnLogin)
                        .addGap(42, 42, 42)
                        .addComponent(btnQuit))
                    .addGroup(pnlLoginDetailsLayout.createSequentialGroup()
                        .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserId)
                            .addComponent(pssPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoginDetailsLayout.setVerticalGroup(
            pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginDetailsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserId)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pssPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnQuit))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(239, 239, 239))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlLoginDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLoginDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(pnlUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if(!validateInputLoginDetails()){
            JOptionPane.showMessageDialog(null,"Please fill al the details","Incomplete data",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!validateInputUserType()){
            JOptionPane.showMessageDialog(null,"Please select user type","Incomplete data",JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserPojo up=new UserPojo();
        userId=txtUserId.getText();
        password=String.valueOf(pssPassword.getPassword()).trim();
        if(rbManager.isSelected()){
             userType=rbManager.getText();
        }
        else{
            userType=rbReceptionist.getText();
        }
        up.setUserId(userId);
        up.setPassword(password);
        up.setUserType(userType);
        try{
            boolean result=UsersDAO.validateUser(up);
            if(!result){
                JOptionPane.showMessageDialog(null,"Invalid UserId/Password/UserType","ERROR!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //It is now sure that Logined user is valid
            //Remaining two fileds of UserProfile[eMart.pojo package] class
            UserProfile.setUserId(userId);
            UserProfile.setUserType(userType);
            
            //Which frame should be open next ?
            if(userType.equalsIgnoreCase("Manager")){
                ManagerJFrame manager=new ManagerJFrame();
                manager.setVisible(true);
                dispose();
            }
            else{
                ReceptionistJFrame receptionist=new ReceptionistJFrame();
                receptionist.setVisible(true);
                this.dispose();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"DB ERROR!","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed
    
    public boolean validateInputLoginDetails(){
        if(txtUserId.getText().trim().isEmpty() || pssPassword.getPassword().length==0){
            return false;
        }
        return true;
    }
    public boolean validateInputUserType(){
        if(rbManager.isSelected() || rbReceptionist.isSelected()){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JPanel pnlLoginDetails;
    private javax.swing.JPanel pnlUserType;
    private javax.swing.JPasswordField pssPassword;
    private javax.swing.JRadioButton rbManager;
    private javax.swing.JRadioButton rbReceptionist;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
