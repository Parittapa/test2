/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.myapp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author Acer
 */
public class regisadmin extends javax.swing.JFrame {

    DBCollection table;
    DB db;

    public regisadmin() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        Uname = new javax.swing.JTextField();
        uname1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cp1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pp1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pass3 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        pass1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 106, -1));

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 170, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 230, 40));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 580, 162, -1));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 222, 40));

        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });
        getContentPane().add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 480, 40));

        uname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname1ActionPerformed(evt);
            }
        });
        getContentPane().add(uname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 219, 40));

        jLabel5.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 106, -1));

        cp1.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        cp1.setText("Confirm Password");
        getContentPane().add(cp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 150, -1));

        jLabel7.setFont(new java.awt.Font("TH Sarabun New", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Register");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 106, -1));

        pp1.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        pp1.setText("Password");
        getContentPane().add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 106, -1));

        jLabel10.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel10.setText("First Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 106, -1));

        jButton3.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 100, 30));

        pass3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass3ActionPerformed(evt);
            }
        });
        getContentPane().add(pass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 228, 40));
        getContentPane().add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 477, 41));
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 477, 41));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\31444550_1787871331270327_1562983528667283456_n (1).jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BasicDBObject document = new BasicDBObject();
        MongoClient mongo;
        try {
            mongo = new MongoClient("localhost", 27017);
            db = mongo.getDB("mini");
            table = db.getCollection("users");

            //เช็คUsername ซ้ำ
            document.put("Username", Uname.getText());
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("Username", Uname.getText());
            int c = table.find(searchQuery).count();
            if (c > 0) {
                JOptionPane.showMessageDialog(this, "Username ซ้ำ");
                return;
            }

        } catch(UnknownHostException ex){
        
            Logger.getLogger(รวมม.class.getName()).log(Level.SEVERE, null, ex);
        }

        //เช็คว่าบล็อคว่างไหม
        if (fname.getText().isEmpty() && lname.getText().isEmpty() && Uname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "โปรดใส่ First Name , Last Name และ Username");

        } else if (fname.getText().isEmpty() || lname.getText().isEmpty() || Uname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "โปรดใส่ First Name , Last Name และ Username");

        } else if (pass1.getText().equals(pass2.getText())) {
            //ใส่ค่าลงฐานข้อมูล
            document.put("First Name", fname.getText());
            document.put("Last Name", lname.getText());
            document.put("Username", Uname.getText());
            document.put("Password", pass1.getText());
            document.put("Confirm Password", pass2.getText());
            document.put("Status", "Admin");
            table.insert(document);
            JOptionPane.showMessageDialog(this, "successfully");
            fname.setText(null);
            lname.setText(null);
            Uname.setText(null);
            pass1.setText(null);
            pass2.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "ใส่รหัสให้ตรงกัน");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnameActionPerformed

    private void uname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uname1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BasicDBObject document = new BasicDBObject();
        //เช็ค Status ว่าเป็น Admin ถึงจะเข้าระบบได้
        MongoClient mongo;
        try {
            mongo = new MongoClient("localhost", 27017);
            db = mongo.getDB("mini");
            table = db.getCollection("users");
            document.put("Username", uname1.getText());
            document.put("Password", pass3.getText());
            document.put("Status", "Admin");
            DBCursor cc = table.find();
            boolean x = false;
            while (cc.hasNext()) {
                String Row = cc.next().toString();
                JSONObject obj = new JSONObject(Row);
                if (obj.getString("Status").equals("Admin")) {
                    int c = table.find(document).count();
                    if (c > 0) {
                        JOptionPane.showMessageDialog(null, "เข้าสู่ระบบเรียบร้อย");
                        Home h = new Home();
                        h.show();
                        this.hide();
                        break;

                    }

                } else if (uname1.getText().isEmpty() && pass3.getText().isEmpty()) {
                    x=true;
                } else if (uname1.getText().isEmpty() || pass3.getText().isEmpty()) {
                    x=true;

                } else {
                    JOptionPane.showMessageDialog(this, "Register Please!!!");
                    break;

                }
            } if(x==true){
            JOptionPane.showMessageDialog(null, "โปรดใส่ Username และ Password");
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(รวมม.class.getName()).log(Level.SEVERE, null, ex);
            if (pass1.getPassword().length != 6) {
                JOptionPane.showMessageDialog(this, "กรุณากรอกรหัสผ่านให้ครบ 6 ตัว");
                pp1.requestFocus();
                return;
            } else if (pass2.getPassword().length != 6) {
                JOptionPane.showMessageDialog(this, "กรุณากรอกรหัสผ่านให้ครบ 6 ตัว");
                cp1.requestFocus();
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void pass3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        รวมม ร = new รวมม();
        ร.show();
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regisadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regisadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Uname;
    private javax.swing.JLabel cp1;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JPasswordField pass3;
    private javax.swing.JLabel pp1;
    private javax.swing.JTextField uname1;
    // End of variables declaration//GEN-END:variables
}