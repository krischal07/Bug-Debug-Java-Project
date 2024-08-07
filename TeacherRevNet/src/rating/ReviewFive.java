/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rating;

import admin.AddUser;
import dao.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import login.Login;
import main.QAPanel;
import main.StudentDashboard;

/**
 *
 * @author kr
 */
public class ReviewFive extends javax.swing.JFrame {

    /**
     * Creates new form ReviewOne
     */
    private int userRating = 0;

    public ReviewFive() {
        initComponents();
        ratingLabel.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        starPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        qaLabel = new javax.swing.JLabel();
        settingLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dashboardLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(209, 232, 254));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jRadioButton1.setText("Hide your identity?");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        submitBtn.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        submitBtn.setText("SUBMIT");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel4.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        starPanel.setBackground(new java.awt.Color(209, 232, 254));
        starPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        starPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                starPanelMouseClicked(evt);
            }
        });
        starPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N
        jLabel5.setText("CLICK HERE FOR RATING THE TEACHER");
        starPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 700, 40));

        jPanel4.add(starPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 730, 80));

        ratingLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N
        ratingLabel.setText("You Rated:");
        jPanel4.add(ratingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 470, 40));

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N
        jLabel7.setText("Bimal Pakhrin");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 360, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 830, 340));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Rating");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 940, 800));

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kist 1.png"))); // NOI18N
        jLabel10.setText("Logo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        logoutLabel.setBackground(new java.awt.Color(0, 0, 0));
        logoutLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/log-out.png"))); // NOI18N
        logoutLabel.setText("  Logout");
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });
        jPanel1.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 180, 40));

        jPanel2.setBackground(new java.awt.Color(194, 194, 194));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-user.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 70));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 25)); // NOI18N
        jLabel1.setText("Student");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 270));

        qaLabel.setBackground(new java.awt.Color(0, 0, 0));
        qaLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        qaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/qa.png"))); // NOI18N
        qaLabel.setText("  Q&A");
        qaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qaLabelMouseClicked(evt);
            }
        });
        jPanel1.add(qaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 180, -1));

        settingLabel.setBackground(new java.awt.Color(0, 0, 0));
        settingLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        settingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rating.png"))); // NOI18N
        settingLabel.setText("  Ratings");
        jPanel1.add(settingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 180, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 230, 50));

        dashboardLabel.setBackground(new java.awt.Color(0, 0, 0));
        dashboardLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        dashboardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N
        dashboardLabel.setText("  Dashboard");
        dashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLabelMouseClicked(evt);
            }
        });
        jPanel1.add(dashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:

//        JOptionPane.showMessageDialog(this, "Rating submitted: " + userRating + " stars");
//        ratingLabel.setText("You Rated:" + userRating + " stars");
//        ratingLabel.setVisible(true);

//        JOptionPane.showMessageDialog(this, "Redirecting to Dashboard.....");

     try {
                Connection con = DatabaseConnection.getConnection();
                String sql = "INSERT INTO ratings (teachername, star) VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, "Bimal Pakhrin");
                ps.setInt(2, userRating);
//                ps.setString(3, mobileNumber);
//                ps.setString(4, address);
//                ps.setString(5, email);
//                ps.setString(6, username);
//                ps.setString(7, password);
//                ps.setString(8, facualty);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Rating successfully added");
                new AddUser().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        new StudentDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void starPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_starPanelMouseClicked
        // TODO add your handling code here:
//        new Star().setVisible(true);
        Star starRating = new Star();
        starRating.setVisible(true);
        starRating.setRatingSubmitListener(new Star.RatingSubmitListener() {
            @Override
            public void onRatingSubmitted(int rating) {
                userRating = rating;
                ratingLabel.setText("You Rated: " + userRating + " stars");
                ratingLabel.setVisible(true);
            }
        });
    }//GEN-LAST:event_starPanelMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void qaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qaLabelMouseClicked
        // TODO add your handling code here:
        new QAPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_qaLabelMouseClicked

    private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
        // TODO add your handling code here:
        new StudentDashboard().setVisible(true);
    }//GEN-LAST:event_dashboardLabelMouseClicked

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
            java.util.logging.Logger.getLogger(ReviewFive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReviewFive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReviewFive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReviewFive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReviewFive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel qaLabel;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JLabel settingLabel;
    private javax.swing.JPanel starPanel;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
