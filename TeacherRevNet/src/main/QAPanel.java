package main;

import main.StudentDashboard;
import questions.QAone;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kr
 */
public class QAPanel extends javax.swing.JFrame {

    /**
     * Creates new form QAPanel
     */
    public QAPanel() {
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
        jPanel4 = new javax.swing.JPanel();
        qaLabel = new javax.swing.JLabel();
        settingLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        teacher6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        teacher4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        teacher5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        teacher1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        teacher2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        teacher3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

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
        jPanel1.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 180, 40));

        jPanel2.setBackground(new java.awt.Color(194, 194, 194));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-user.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 70));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 25)); // NOI18N
        jLabel1.setText("Student");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 110, -1));

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        qaLabel.setBackground(new java.awt.Color(0, 0, 0));
        qaLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        qaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/qa.png"))); // NOI18N
        qaLabel.setText("  Q&A");
        jPanel4.add(qaLabel);
        qaLabel.setBounds(10, 10, 92, 32);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 230, 50));

        settingLabel.setBackground(new java.awt.Color(0, 0, 0));
        settingLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        settingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings.png"))); // NOI18N
        settingLabel.setText("  Settings");
        jPanel1.add(settingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 800));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Q&A");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        teacher6.setBackground(new java.awt.Color(209, 232, 254));
        teacher6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher6MouseClicked(evt);
            }
        });
        teacher6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher1.png"))); // NOI18N
        teacher6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 210));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel9.setText("Teacher 6");
        teacher6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, -1));

        jPanel3.add(teacher6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 220, 250));

        teacher4.setBackground(new java.awt.Color(209, 232, 254));
        teacher4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher4MouseClicked(evt);
            }
        });
        teacher4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher1.png"))); // NOI18N
        teacher4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 210));

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel12.setText("Teacher 4");
        teacher4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, -1));

        jPanel3.add(teacher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 220, 250));

        teacher5.setBackground(new java.awt.Color(209, 232, 254));
        teacher5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher5MouseClicked(evt);
            }
        });
        teacher5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher1.png"))); // NOI18N
        teacher5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 210));

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel14.setText("Teacher 5");
        teacher5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 30));

        jPanel3.add(teacher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 220, 250));

        teacher1.setBackground(new java.awt.Color(209, 232, 254));
        teacher1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher1MouseClicked(evt);
            }
        });
        teacher1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher1.png"))); // NOI18N
        teacher1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 210));

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel16.setText("Teacher 1");
        teacher1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, -1));

        jPanel3.add(teacher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 250));

        teacher2.setBackground(new java.awt.Color(209, 232, 254));
        teacher2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher2MouseClicked(evt);
            }
        });
        teacher2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher1.png"))); // NOI18N
        teacher2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 210));

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel18.setText("Teacher 2");
        teacher2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 30));

        jPanel3.add(teacher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 220, 250));

        teacher3.setBackground(new java.awt.Color(209, 232, 254));
        teacher3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher3MouseClicked(evt);
            }
        });
        teacher3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher1.png"))); // NOI18N
        teacher3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 210));

        jLabel20.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel20.setText("Teacher 3");
        teacher3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, -1));

        jPanel3.add(teacher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 220, 250));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 940, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
        // TODO add your handling code here:
        new StudentDashboard().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_dashboardLabelMouseClicked

    private void teacher4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher4MouseClicked
        // TODO add your handling code here:
        new QAone("Techer 4").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_teacher4MouseClicked

    private void teacher5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher5MouseClicked
        // TODO add your handling code here:
        new QAone("Teacher 5").setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_teacher5MouseClicked

    private void teacher1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher1MouseClicked
new QAone("Teacher 1").setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_teacher1MouseClicked

    private void teacher2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher2MouseClicked
        // TODO add your handling code here:
        new QAone("Teacher 2").setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_teacher2MouseClicked

    private void teacher6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher6MouseClicked
        // TODO add your handling code here:
        new QAone("Teacher 6").setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_teacher6MouseClicked

    private void teacher3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher3MouseClicked
        // TODO add your handling code here:
        new QAone("Teacher 3").setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_teacher3MouseClicked

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
            java.util.logging.Logger.getLogger(QAPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QAPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QAPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QAPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new QAPanel().setVisible(true);
//                new QAPanel().setLocationRelativeTo(null);
//                QAPanel QAPanel = new QAPanel();
                new QAPanel().setVisible(true);
//                QAPanel.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel qaLabel;
    private javax.swing.JLabel settingLabel;
    private javax.swing.JPanel teacher1;
    private javax.swing.JPanel teacher2;
    private javax.swing.JPanel teacher3;
    private javax.swing.JPanel teacher4;
    private javax.swing.JPanel teacher5;
    private javax.swing.JPanel teacher6;
    // End of variables declaration//GEN-END:variables
}
