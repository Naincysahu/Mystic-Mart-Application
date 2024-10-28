package eMart.gui;

import java.util.Random;
import javax.swing.JOptionPane;

public class SplashScreenJFrame extends javax.swing.JFrame {
    public SplashScreenJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        pgbrLoad.setStringPainted(true);
        SplashThread sp=new SplashThread();
        sp.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgbrLoad = new javax.swing.JProgressBar();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pgbrLoad, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pgbrLoad, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreenJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImg;
    private javax.swing.JProgressBar pgbrLoad;
    // End of variables declaration//GEN-END:variables
    class SplashThread extends Thread{
        public void run(){
            int count=1;
            Random rand=new Random();
            while(pgbrLoad.getValue()<pgbrLoad.getMaximum()){
                try{
                    pgbrLoad.setValue(count);
                    Thread.sleep(1200);
                    count+=rand.nextInt(100);
                }
                catch(InterruptedException ex){
                    JOptionPane.showMessageDialog(null,"Thread interrupted");
                    ex.printStackTrace();
                }
            }
            dispose();
            LoginJFrame login=new LoginJFrame();
            login.setVisible(true);
        }
    }

}
