package questions;

import dao.QADatabase;
import javax.swing.JOptionPane;
import main.StudentDashboard;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kr
 */
public class QAfour extends javax.swing.JFrame {

    /**
     * Creates new form QAone
     */
     private String teacherName;

    public QAfour(String teacherName) {
        this.teacherName = teacherName;
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        qaLabel = new javax.swing.JLabel();
        settingLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 180, 40));

        jPanel2.setBackground(new java.awt.Color(194, 194, 194));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-user.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 70));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 25)); // NOI18N
        jLabel1.setText("Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 270));

        dashboardLabel.setBackground(new java.awt.Color(0, 0, 0));
        dashboardLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        dashboardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N
        dashboardLabel.setText("  Dashboard");
        dashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLabelMouseClicked(evt);
            }
        });
        jPanel1.add(dashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 180, -1));

        qaLabel.setBackground(new java.awt.Color(0, 0, 0));
        qaLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        qaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/qa.png"))); // NOI18N
        qaLabel.setText("  Q&A");
        jPanel1.add(qaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 180, -1));

        settingLabel.setBackground(new java.awt.Color(0, 0, 0));
        settingLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        settingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings.png"))); // NOI18N
        settingLabel.setText("  Settings");
        jPanel1.add(settingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 800));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(209, 232, 254));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel3.setText("Has the teacher contributed to your personal growth or interest in the subject?");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 760, 40));

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N
        jLabel5.setText("Personal Development:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 490, 40));

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 740, 100));

        nextBtn.setBackground(new java.awt.Color(209, 232, 254));
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/next.png"))); // NOI18N
        nextBtn.setBorder(null);
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtnMouseClicked(evt);
            }
        });
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel4.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 50, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 830, 340));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Q&A");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 940, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
        // TODO add your handling code here:
        new StudentDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardLabelMouseClicked

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        
         
//           String textFieldContent = jTextField1.getText().trim();
//
//    // Check if the text field is empty
//    if (textFieldContent.isEmpty()) {
//        // Show a message dialog if the text field is empty
//        JOptionPane.showMessageDialog(this, "The text field should not be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
//    } else {
//        // If not empty, proceed to the next window
//         new QAfive(teacherName).setVisible(true);
//         this.dispose();
//    }
    
    String textFieldContent = jTextField1.getText().trim();
        if (textFieldContent.isEmpty()) {
            JOptionPane.showMessageDialog(this, "This field should not be empty!!");
        } else {
            // Save the question and answer to the database
            String question = jLabel3.getText();
            QADatabase.insertQA(teacherName, question, textFieldContent);

            // Move to the next question panel
            new QAfive(teacherName).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void nextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nextBtnMouseClicked

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
            java.util.logging.Logger.getLogger(QAone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QAone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QAone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QAone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QAfour("Trcher1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel qaLabel;
    private javax.swing.JLabel settingLabel;
    // End of variables declaration//GEN-END:variables
}
