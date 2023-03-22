/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import Connection.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author piyush-garg
 */
public class studentattandanceUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public static int session;
    public studentattandanceUI(int rollno) {
        initComponents();
        this.session = rollno;
        systemdate.setText(java.time.LocalDate.now().toString());
        studentrollno.setText(Integer.toString(session));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attandancemark = new javax.swing.JLabel();
        attandacedate = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        studentrollno = new java.awt.TextField();
        systemdate = new java.awt.Label();
        saveattandace = new java.awt.Button();
        emailid = new javax.swing.JLabel();
        studentemail = new java.awt.TextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System - Attandace Dashboard");

        attandancemark.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        attandancemark.setText("Mark Your Attandance ");

        attandacedate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        attandacedate.setText("Attandance Date : ");

        rollno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rollno.setText("Enter Roll No. : ");

        studentrollno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentrollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentrollnoActionPerformed(evt);
            }
        });

        systemdate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        systemdate.setText("systemdate");

        saveattandace.setActionCommand("save");
        saveattandace.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        saveattandace.setLabel("Save");
        saveattandace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveattandaceActionPerformed(evt);
            }
        });

        emailid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailid.setText("Enter Email ID : ");

        studentemail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentemailActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollno)
                            .addComponent(attandacedate)
                            .addComponent(emailid))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systemdate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentemail, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(attandancemark))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(saveattandace, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attandancemark)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(attandacedate)
                    .addComponent(systemdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentrollno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveattandace, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    
    
    private void studentrollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentrollnoActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_studentrollnoActionPerformed

    private void saveattandaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveattandaceActionPerformed
        // TODO add your handling code here:
        String date = systemdate.getText();
        if(studentemail.getText().length() == 0){
           JOptionPane.showMessageDialog(null, "Please Enter Required Details to proceed.");
           setVisible(true);
        } 
        String email = studentemail.getText();
        
        Conn conn;
        try{          
            String query = "INSERT INTO ATTANDANCE VALUES('"+session+"','"+email+"','"+date+"')";
            conn = new Conn();
            int response = conn.s.executeUpdate(query);
            System.out.println(response);
            JOptionPane.showMessageDialog(this, "Attandace Marked Successfully!!!!");
            setVisible(false);
            studentDashboardUI studentdashboard = new studentDashboardUI(session);
            studentdashboard.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveattandaceActionPerformed

    private void studentemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentemailActionPerformed
        // TODO add your handling code here:
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(studentemail.getText());
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(this,"Please Enter a Valid Email ID.");
            setVisible(true);
        }
        else if(studentemail.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please Enter Required Details to proceed.");
           setVisible(true);
        }        
    }//GEN-LAST:event_studentemailActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        studentDashboardUI dashboard = new studentDashboardUI(session);
        dashboard.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(studentattandanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentattandanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentattandanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentattandanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentattandanceUI(session).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attandacedate;
    private javax.swing.JLabel attandancemark;
    private javax.swing.JButton back;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel rollno;
    private java.awt.Button saveattandace;
    private java.awt.TextField studentemail;
    private java.awt.TextField studentrollno;
    private java.awt.Label systemdate;
    // End of variables declaration//GEN-END:variables
}
