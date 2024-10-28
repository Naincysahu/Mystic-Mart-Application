package eMart.gui;

import eMart.dao.OrdersDAO;
import eMart.dao.ProductsDAO;
import eMart.pojo.ProductPojo;
//import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BillingJFrame extends javax.swing.JFrame {
    ArrayList<ProductPojo> purchasedProdList=new ArrayList<>();
    DefaultTableModel tm;
    double grandTotal=0.0;
    public BillingJFrame() {
        initComponents();
        setLocationRelativeTo(this);
        txtProductId.requestFocus();  //gun ke click hote hi isme ID aa jaye product ki
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblProductId = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbView = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        btnGenerateBill = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(140, 0, 47));

        pnlTitle.setBackground(new java.awt.Color(204, 0, 51));
        pnlTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pnlTitle.setForeground(new java.awt.Color(255, 255, 255));

        btnLogout.setBackground(new java.awt.Color(204, 0, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 0, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProductId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProductId.setForeground(new java.awt.Color(255, 255, 255));
        lblProductId.setText("Product Id");

        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });
        txtProductId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductIdKeyTyped(evt);
            }
        });

        tbView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Product Company", "Product Price", "Our Price", "Quantity", "Tax", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbView);

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(35, 35, 35))
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnBack)
                    .addComponent(lblProductId)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total");

        btnGenerateBill.setBackground(new java.awt.Color(204, 0, 51));
        btnGenerateBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateBill.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateBill.setText("Generate Bill");
        btnGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Billing Options");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                            .addComponent(btnGenerateBill)
                            .addGap(263, 263, 263)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(btnGenerateBill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginJFrame login=new LoginJFrame();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ReceptionistJFrame rp=new ReceptionistJFrame();
        rp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillActionPerformed
        // TODO add your handling code here:
        try{
            String orderId=OrdersDAO.getNextOrderId ();
            //adding data in orders table and reducing quantites of those products from products table -->both are dependent to each other 
            if(OrdersDAO.addOrder(purchasedProdList, orderId)==true && ProductsDAO.reducePurchasedProductQuantiyFromStock(purchasedProdList)==true ) {
                JOptionPane.showMessageDialog(null,"Order of Rs."+grandTotal+"/ created successfully");
                //1. option
                ViewManagerOrdersJFrame vo=new ViewManagerOrdersJFrame();
                vo.setVisible(true);
                dispose();
                //2. option
                /*
                  clearText(); from JTable
                  granTotal=0.0;
                */
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"DB Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerateBillActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
        //calls when strike enter key at textBox
        //Gun has 2 tasks--->>generating prodId in textBox and simultaneously work(pretend) like pressing enter(receptionist not have to manually press enter key)
        //Receptionist have to press enter key only when he/she will manually wirte productID in texfield
        if(!validateInput()){
            JOptionPane.showMessageDialog(null, "Pleases enter Product Id");
            return;
        }
        getProductDetails();
    }//GEN-LAST:event_txtProductIdActionPerformed

    
    private void txtProductIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductIdKeyPressed
        // TODO add your handling code here:
        /*if(!validateInput()){
            JOptionPane.showMessageDialog(null, "Pleases enter Product Id");
            return;
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){     
            System.out.println("Scaaned data :"+evt.getKeyCode());
            
            //getProductDetails();
        }*/
    }//GEN-LAST:event_txtProductIdKeyPressed

    private void txtProductIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductIdKeyTyped
        // TODO add your handling code here:
        /*if("".equals(txtProductId.getText()))
            getProductDetails();*/
    }//GEN-LAST:event_txtProductIdKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateBill;
    private javax.swing.JButton btnLogout;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable tbView;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput() {
        return !(txtProductId.getText().trim().isEmpty());
    }

    private void getProductDetails() {
        try{
        String prodId=txtProductId.getText();
        ProductPojo pp=ProductsDAO.getPurchasedProductDetails(prodId);
        //if in case productId is wrong(changed by someone) then we'll not get any data of that productId from Products table 
        if(pp.getProdId()==null)  //in this case we will get null(bydefault String value is null) in prodId from DB
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid product Id","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //searching prodId in purchasedProdList arrayList
        int index=getProdIndex(prodId);
        if(index == -1){  //means prodId is a new product so add in purchasedProdList
            tm=(DefaultTableModel)tbView.getModel();
            Object []row=new Object[8];
            row[0]=pp.getProdId();
            row[1]=pp.getProdName();
            row[2]=pp.getProdCompany();
            row[3]=pp.getProdPrice();
            row[4]=pp.getOurPrice();
            int quan=1;
            pp.setQuantity(quan);
            row[5]=quan;
            System.out.print(pp.getTax()); 
            row[6]=pp.getOurPrice()*pp.getTax()/100;
            double amt=quan*pp.getOurPrice();
            double amtWithTax=amt+(amt * pp.getTax()/100);   //total
            pp.setTotal(amtWithTax); 
            row[7]=pp.getTotal();
            tm.addRow(row);
            purchasedProdList.add(pp);
            grandTotal=grandTotal+pp.getTotal();
        }
        else //prodId product is a part of purchasedProdList
        {
            ProductPojo prd=purchasedProdList.get(index);  //index of prodId in purchasedProdList
            //updating table
            int oldq=(int)tm.getValueAt(index, 5);  
            tm.setValueAt( oldq+1, index, 5);  //newq
            
            double amt=pp.getOurPrice();  //taking from purchasedProdList bcz we are calculating amount of 1 item
            double amtWithTax=amt+(amt * prd.getTax()/100);  //Totalamount of 1 item
            double oldtotal=(double)tm.getValueAt(index, 7);
            tm.setValueAt(oldtotal+amtWithTax, index, 7);
            
            grandTotal+=amtWithTax;
            
            //updating arrayList
            prd.setQuantity(oldq+1); //updating pojo
            prd.setTotal(oldtotal+amtWithTax);  //updating pojo
            purchasedProdList.set(index,prd);  //updating arrayList
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "DB Error","ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
//    String prodId=txtProductId.getText();
    private int getProdIndex(String prodId){   //check whether product(txtProductId) present in purchasedProdList(Products arraylis), if present return index else return -1;
        int index=-1;  //prodId not present in purchasedProdList so we will add that product in purchasedProdList
        for(int i=0;i<purchasedProdList.size();i++){
             ProductPojo p=purchasedProdList.get(i);
             System.out.print(p.getProdId());
             if(p.getProdId().equals(prodId)){  //check whether prodId is a part of arrayList or not  //for first product purchasedProdList.p.getProdId()=null
                 index=i;  //index of prodId that is present in purchasedProdList
             break;
            }
        }
        return index;
    }
}
