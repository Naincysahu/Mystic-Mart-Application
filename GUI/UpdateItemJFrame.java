package eMart.gui;

import eMart.dao.ProductsDAO;
import eMart.pojo.ProductPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateItemJFrame extends javax.swing.JFrame {
    DefaultTableModel tm;
    public UpdateItemJFrame() {
        initComponents();
        viewStock();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnlAddItem = new javax.swing.JPanel();
        lblProdId = new javax.swing.JLabel();
        lblProdCompany = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblProdName = new javax.swing.JLabel();
        lblProdPrice = new javax.swing.JLabel();
        lblOurPrice = new javax.swing.JLabel();
        txtProdId = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtProdPrice = new javax.swing.JTextField();
        txtOurPrice = new javax.swing.JTextField();
        cmbTax = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        txtProdCompany = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbViewItems = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(255, 0, 0));

        pnlTitle.setBackground(new java.awt.Color(140, 0, 74));
        pnlTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Update Item Panel");

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(32, 32, 32)
                .addComponent(btnLogout)
                .addGap(35, 35, 35))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack)
                    .addComponent(btnLogout))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnlAddItem.setBackground(new java.awt.Color(140, 0, 74));
        pnlAddItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        lblProdId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProdId.setForeground(new java.awt.Color(255, 255, 255));
        lblProdId.setText("Product Id");

        lblProdCompany.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProdCompany.setForeground(new java.awt.Color(255, 255, 255));
        lblProdCompany.setText("Product Company");

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quanity");

        lblTax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTax.setForeground(new java.awt.Color(255, 255, 255));
        lblTax.setText("Tax");

        lblProdName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProdName.setForeground(new java.awt.Color(255, 255, 255));
        lblProdName.setText("Product Name");

        lblProdPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProdPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblProdPrice.setText("Product Price");

        lblOurPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOurPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblOurPrice.setText("Our Price");

        txtProdId.setEditable(false);

        txtOurPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOurPriceActionPerformed(evt);
            }
        });

        cmbTax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "18%", "28%" }));

        javax.swing.GroupLayout pnlAddItemLayout = new javax.swing.GroupLayout(pnlAddItem);
        pnlAddItem.setLayout(pnlAddItemLayout);
        pnlAddItemLayout.setHorizontalGroup(
            pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddItemLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddItemLayout.createSequentialGroup()
                        .addComponent(lblProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddItemLayout.createSequentialGroup()
                        .addComponent(lblProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddItemLayout.createSequentialGroup()
                        .addComponent(lblOurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdCompany)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTax, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnlAddItemLayout.setVerticalGroup(
            pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddItemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdCompany)
                    .addComponent(txtProdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdName)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddItemLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdPrice)
                            .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantity)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddItemLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTax)
                            .addComponent(cmbTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOurPrice)
                    .addComponent(txtOurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        btnUpdate.setBackground(new java.awt.Color(255, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tbViewItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Product Price", "Our Price", "Product Company", "Tax", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbViewItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbViewItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbViewItems);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(btnUpdate)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginJFrame login=new LoginJFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageStocksJFrame ms=new ManageStocksJFrame();
        ms.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtOurPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOurPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOurPriceActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(!validateInput()){
            JOptionPane.showMessageDialog(null, "Please fill all the details");
            return;
        }
        try{
        ProductPojo p=new ProductPojo();
        p.setProdId(txtProdId.getText());
        p.setProdName(txtProdName.getText());
        p.setProdCompany(txtProdCompany.getText());
        p.setProdPrice(Double.parseDouble(txtProdPrice.getText()));
        p.setOurPrice(Double.parseDouble(txtOurPrice.getText()));
        p.setQuantity(Integer.parseInt(txtQuantity.getText()));
        int n=cmbTax.getSelectedItem().toString().trim().length();
        p.setTax(Integer.parseInt(cmbTax.getSelectedItem().toString().substring(0,n-1)));
        boolean result=ProductsDAO .updateItem(p);
        if(result==true){
            JOptionPane.showMessageDialog(null, "Item updated successfully");
            clearText();
            tm.setRowCount(0);
            viewStock();
            return;
        }
        JOptionPane.showMessageDialog(null, "Item not updated");
        return;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "DB Error");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tbViewItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbViewItemsMouseClicked
        // TODO add your handling code here:
        int row=tbViewItems.getSelectedRow();
        txtProdId.setText(tm.getValueAt(row,0).toString());
        txtProdName.setText(tm.getValueAt(row,1).toString());
        txtProdPrice.setText(tm.getValueAt(row,2).toString());
        txtOurPrice.setText(tm.getValueAt(row,3).toString());
        txtProdCompany.setText(tm.getValueAt(row,4).toString());       
        cmbTax.setSelectedItem(tm.getValueAt(row, 5).toString());
        txtQuantity.setText(tm.getValueAt(row,6).toString());
    }//GEN-LAST:event_tbViewItemsMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbTax;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOurPrice;
    private javax.swing.JLabel lblProdCompany;
    private javax.swing.JLabel lblProdId;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblProdPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlAddItem;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable tbViewItems;
    private javax.swing.JTextField txtOurPrice;
    private javax.swing.JTextField txtProdCompany;
    private javax.swing.JTextField txtProdId;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void viewStock() {
        try{
            ArrayList<ProductPojo> itemList=eMart.dao.ProductsDAO.viewAllItems();
            if(itemList.isEmpty()){
                JOptionPane.showMessageDialog(null, "No item present in stock");
            }
            btnUpdate.setEnabled(true);
            tm=(DefaultTableModel)tbViewItems.getModel();
            Object rows[]=new Object[7];
            for(ProductPojo item:itemList){
                rows[0]=item.getProdId();
                rows[1]=item.getProdName();
                rows[4]=item.getProdCompany();
                rows[2]=item.getProdPrice();
                rows[3]=item.getOurPrice();
                rows[6]=item.getQuantity();
                rows[5]=item.getTax()+"%";
                tm.addRow(rows);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "DB ERROR!","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    private boolean validateInput() {
        if(txtProdName.getText().trim().isEmpty() || txtProdCompany.getText().trim().isEmpty() || txtProdPrice.getText().trim().isEmpty() || txtOurPrice.getText().trim().isEmpty() || txtQuantity.getText().trim().isEmpty())
            return false;
        return true;
    }      

    private void clearText() {
        txtProdId.setText("");
        txtProdName.setText("");
        txtProdCompany.setText("");
        txtProdPrice.setText("");
        txtOurPrice.setText("");
        txtQuantity.setText("");
        cmbTax.setSelectedIndex(0);
    }
}
