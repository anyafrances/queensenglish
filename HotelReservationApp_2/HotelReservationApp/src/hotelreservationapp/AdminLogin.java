/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservationapp;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author anya.f.collins
 */
public class AdminLogin extends javax.swing.JFrame {

    public AdminLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        adminTitle = new javax.swing.JLabel();
        adminUsername = new javax.swing.JTextField();
        adminPass = new javax.swing.JPasswordField();
        adminButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(10, 10, 60, 30);

        adminTitle.setFont(new java.awt.Font("Graphik Semibold", 0, 14)); // NOI18N
        adminTitle.setText("To download previous bookings,");
        jPanel1.add(adminTitle);
        adminTitle.setBounds(80, 20, 240, 40);

        adminUsername.setForeground(new java.awt.Color(102, 102, 102));
        adminUsername.setText("Username");
        adminUsername.setToolTipText("");
        adminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(adminUsername);
        adminUsername.setBounds(120, 90, 162, 30);

        adminPass.setText("Passcode");
        jPanel1.add(adminPass);
        adminPass.setBounds(120, 140, 162, 30);

        adminButton.setBackground(new java.awt.Color(51, 51, 51));
        adminButton.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 255, 255));
        adminButton.setText("Enter");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        jPanel1.add(adminButton);
        adminButton.setBounds(159, 230, 70, 30);

        jLabel2.setFont(new java.awt.Font("Graphik Semibold", 0, 14)); // NOI18N
        jLabel2.setText("please input your Staff ID and Passcode.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 40, 310, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\anya.f.collins\\Documents\\College Level 4\\Programming\\1.jpg")); // NOI18N
        jLabel1.setText("please input your Staff ID and Passcode.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 390, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // Hard code variables for login.
        String staffName;
        String staffPass;
        staffName = adminUsername.getText();
        staffPass = adminPass.getText();
        // Check if match.
        if (staffName.equals("KimN") && (staffPass.equals("123"))) {
            JOptionPane.showConfirmDialog(null,
                    "The saved bookings should download soon.",
                    "  Access Granted",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            try {
                //Opens receipts folder stored on desktop,
                Desktop.getDesktop().open(new File("C://Users//anya.f.collins//Desktop//Receipts"));
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(null, "Error processing download. Please try again.");
            }
            //Denies access.
        } else {
            JOptionPane.showConfirmDialog(null,
                    "Incorrect Credentials. Please try again",
                    "  Access Denied",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            //Delete incorrect credentials
            adminUsername.setText(null);
            adminPass.setText(null);
        }

    }//GEN-LAST:event_adminButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //dispose of admin login
        AdminLogin.this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void adminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JPasswordField adminPass;
    private javax.swing.JLabel adminTitle;
    private javax.swing.JTextField adminUsername;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
