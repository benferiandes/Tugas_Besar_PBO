package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XxDRxX
 */
public class FormData extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form FormData
     */
    public FormData() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 230, 160, 30);

        jLabel2.setText("No.Pendataran      :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 240, 110, 20);

        jLabel3.setText("Nama Mahasiswa   :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 270, 110, 30);

        jLabel4.setText("No.ID Mahasiswa   :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 310, 110, 30);

        jLabel5.setText("Tanggal Lahir         :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 350, 100, 30);

        jLabel6.setText("Agama                   :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 390, 94, 30);

        jLabel7.setText("No.Telp                  :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 230, 110, 30);

        jLabel8.setText("Tahun Tamat          :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 270, 110, 30);

        jLabel9.setText("Asal Sekolah           :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 310, 110, 30);

        jLabel10.setText("Nama Orang Tua    :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 350, 110, 30);

        jLabel11.setText("No.ID Orang Tua    :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 390, 120, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 270, 160, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 310, 160, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 350, 160, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(130, 390, 160, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(440, 230, 170, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(440, 270, 170, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(440, 310, 170, 30);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(440, 350, 170, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(440, 390, 170, 30);

        jLabel12.setText("Pekerjaan Orang Tua     :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(640, 230, 150, 30);

        jLabel13.setText("No.Telp Orang Tua         :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(640, 270, 150, 30);

        jLabel14.setText("Pendidikan Orang Tua    :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(640, 314, 150, 20);

        jLabel15.setText("Gaji Orang Tua               :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(640, 350, 150, 30);

        jLabel16.setText("Alamat                            :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(640, 390, 150, 30);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(790, 230, 180, 30);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(790, 270, 180, 30);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(790, 310, 180, 30);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(790, 350, 180, 30);
        getContentPane().add(jTextField15);
        jTextField15.setBounds(790, 390, 180, 30);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(890, 450, 57, 23);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 450, 61, 23);

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(700, 450, 73, 23);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 450, 51, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\DATA\\ITERA\\itera\\java\\tubes\\UILOGIN22.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.DeleteData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "insert into mahasiswa"
                        +"(nm_mhs, noid_mhs, agama, "
                        +"notelp_mhs, thn_tmt, asl_sklh, nm_ortu, noid_ortu, "
                        +"job_ot, notlp_ot, ijz_ot, gj_ot, tmp_lhr)"
                        +"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            pst=con.prepareStatement(sql);
            pst.setString(2, jTextField2.getText());
            pst.setString(3, jTextField3.getText());
            pst.setString(5, jTextField5.getText());
            pst.setString(6, jTextField6.getText());
            pst.setString(7, jTextField7.getText());
            pst.setString(8, jTextField8.getText());
            pst.setString(9, jTextField9.getText());
            pst.setString(10, jTextField10.getText());
            pst.setString(11, jTextField11.getText());
            pst.setString(12, jTextField12.getText());
            pst.setString(13, jTextField13.getText());
            pst.setString(14, jTextField14.getText());
            pst.setString(15, jTextField15.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    public void DeleteData() {
        
        }

    private static class con {

        public con() {
        }
    }
