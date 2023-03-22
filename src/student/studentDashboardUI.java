package student;

public class studentDashboardUI extends javax.swing.JFrame {

    public static int rollno;
    public studentDashboardUI(int rollno) {
        this.rollno = rollno;
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new java.awt.Label();
        Feepayment = new java.awt.Button();
        markattandace = new java.awt.Button();
        logout = new javax.swing.JButton();
        bankaccount1 = new java.awt.Button();
        myprofile = new java.awt.Button();
        viewresult = new java.awt.Button();
        updateprofile = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System - Student Dashboard");

        Dashboard.setAlignment(java.awt.Label.CENTER);
        Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dashboard.setFont(new java.awt.Font("HCLTech Roobert Heavy", 1, 36)); // NOI18N
        Dashboard.setText("WELCOME TO YOUR DASHBOARD");

        Feepayment.setActionCommand("Fee & payment");
        Feepayment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Feepayment.setLabel("Fee & Payment");
        Feepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeepaymentActionPerformed(evt);
            }
        });

        markattandace.setActionCommand("Bank Account Details");
        markattandace.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        markattandace.setLabel("Mark Attandance");
        markattandace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markattandaceActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        bankaccount1.setActionCommand("Bank Account Details");
        bankaccount1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bankaccount1.setLabel("Bank Account Details");
        bankaccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankaccount1ActionPerformed(evt);
            }
        });

        myprofile.setActionCommand("myprofile");
        myprofile.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        myprofile.setLabel("My Profile");
        myprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileActionPerformed(evt);
            }
        });

        viewresult.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        viewresult.setLabel("View Result");
        viewresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewresultActionPerformed(evt);
            }
        });

        updateprofile.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        updateprofile.setLabel("Update Profile");
        updateprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateprofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(Feepayment, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bankaccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(markattandace, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewresult, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Feepayment, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(myprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankaccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markattandace, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(updateprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        Dashboard.getAccessibleContext().setAccessibleName("Dashboard");
        updateprofile.getAccessibleContext().setAccessibleName("updateprofile");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void markattandaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markattandaceActionPerformed
        // TODO add your handling code here:
        studentattandanceUI attandace = new studentattandanceUI(rollno);
        attandace.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_markattandaceActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        StudentloginUI loginui = new StudentloginUI();
        loginui.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void bankaccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankaccount1ActionPerformed
        // TODO add your handling code here:
        studentBankAccountDetailsUI bankdetails = new studentBankAccountDetailsUI(rollno);
        bankdetails.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bankaccount1ActionPerformed

    private void FeepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeepaymentActionPerformed
        // TODO add your handling code here:
        studentfeeDetailsUI studentfee = new studentfeeDetailsUI(rollno);
        studentfee.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_FeepaymentActionPerformed

    private void myprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileActionPerformed
        // TODO add your handling code here:
        studentProfileUI profile = new studentProfileUI(rollno);
        profile.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_myprofileActionPerformed

    private void viewresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewresultActionPerformed
        // TODO add your handling code here:
        studentresultUI result = new studentresultUI(rollno);
        result.setVisible(true);
        setVisible(false);
            
    }//GEN-LAST:event_viewresultActionPerformed

    private void updateprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateprofileActionPerformed
        // TODO add your handling code here:
        studentupdateprofileUI profileupdate = new studentupdateprofileUI(rollno);
        profileupdate.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_updateprofileActionPerformed

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
            java.util.logging.Logger.getLogger(studentDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDashboardUI(rollno).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Dashboard;
    private java.awt.Button Feepayment;
    private java.awt.Button bankaccount1;
    private javax.swing.JButton logout;
    private java.awt.Button markattandace;
    private java.awt.Button myprofile;
    private java.awt.Button updateprofile;
    private java.awt.Button viewresult;
    // End of variables declaration//GEN-END:variables
}
