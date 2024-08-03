/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import dao.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import login.Login;

/**
 *
 * @author kr
 */
public class ViewUser extends javax.swing.JFrame {
    private String username = "";

    /**
     * Creates new form ViewUser
     */
    public ViewUser() {
        initComponents();
        setLocationRelativeTo(null);
    }

      public ViewUser(String tempUsername) {
        initComponents();
        username = tempUsername;
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        settingLabel1 = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 32)); // NOI18N
        jLabel3.setText("              Note: Click on row to delete user");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 850, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Role", "Mobile Number", "Email", "User Name", "Password", "Address", "Facualty"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 830, 430));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("View User");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 270, -1));

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
        jPanel1.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 180, 40));

        jPanel2.setBackground(new java.awt.Color(194, 194, 194));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-user.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 70));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 25)); // NOI18N
        jLabel1.setText("Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 270));

        qaLabel.setBackground(new java.awt.Color(0, 0, 0));
        qaLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        qaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/adduser32.png"))); // NOI18N
        qaLabel.setText("  Add User");
        qaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qaLabelMouseClicked(evt);
            }
        });
        jPanel1.add(qaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 170, 60));

        settingLabel.setBackground(new java.awt.Color(0, 0, 0));
        settingLabel.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        settingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updateuser32.png"))); // NOI18N
        settingLabel.setText("  Update User");
        settingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingLabelMouseClicked(evt);
            }
        });
        jPanel1.add(settingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 180, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        settingLabel1.setBackground(new java.awt.Color(0, 0, 0));
        settingLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        settingLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/viewuser.png"))); // NOI18N
        settingLabel1.setText("  View User");
        settingLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingLabel1MouseClicked(evt);
            }
        });
        jPanel6.add(settingLabel1);
        settingLabel1.setBounds(10, 0, 180, 40);

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        String userNameTable = model.getValueAt(index, 6).toString();
        if(username.equals(userNameTable)){
            JOptionPane.showMessageDialog(null, "Cannot delete your own account");
        }else{
            int a = JOptionPane.showConfirmDialog(null, "Do you want to delete this user","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                try{
//                    Connection con = ConnectionProvider.getConn();
                     Connection con = DatabaseConnection.getConnection();
                    PreparedStatement ps = con.prepareStatement("Delete from appuser where appuser_pk=?");
                    ps.setString(1, id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "User Successfully Deleted");
                    setVisible(false);
                    new ViewUser(username).setVisible(true);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{
//            Connection con = ConnectionProvider.getConn();
             Connection con = DatabaseConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from appuser");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("appuser_pk"), rs.getString("name"), rs.getString("userRole"), rs.getString("mobileNumber"), rs.getString("email"), rs.getString("username"), rs.getString("password"), rs.getString("address"), rs.getString("facualty")});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void qaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qaLabelMouseClicked
        // TODO add your handling code here:
        new AddUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_qaLabelMouseClicked

    private void settingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLabelMouseClicked
        // TODO add your handling code here:
                new UpdateUser().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_settingLabelMouseClicked

    private void settingLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLabel1MouseClicked
        // TODO add your handling code here:
        new ViewUser().setVisible(true);
    }//GEN-LAST:event_settingLabel1MouseClicked

    private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
        // TODO add your handling code here:
        new AdminDashboard().setVisible(true);
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
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUser().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel qaLabel;
    private javax.swing.JLabel settingLabel;
    private javax.swing.JLabel settingLabel1;
    // End of variables declaration//GEN-END:variables
}
