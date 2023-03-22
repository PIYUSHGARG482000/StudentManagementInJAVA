
package student;

import javax.swing.JOptionPane;
import student.*;
import Connection.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author piyush-garg
 */
public class studentupdateprofileUI extends javax.swing.JFrame {

    /**
     * Creates new form studentRegistrationUI
     */
    public static int rollno;
    public studentupdateprofileUI(int rollno) {
        this.rollno = rollno;
        initComponents();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public boolean isString(String str){
        boolean isValid = false;
      for(char c : str.toCharArray()){
          int ascii = (int)c;
          if(ascii >= 65 && ascii <= 90 || ascii >=97 && ascii <= 122 || ascii == 32){
              isValid = true;
          }else{
             return false;
          }
      }
      return isValid;
    }
    public boolean isStandard(String str){
        boolean isValid = false;
      for(char c : str.toCharArray()){
          int ascii = (int)c;
          if(ascii >= 65 && ascii <= 90 || ascii >=97 && ascii <= 122 || ascii == 32 || ascii >= 48 && ascii <=57){
              isValid = true;
          }else{
             return false;
          }
      }
      return isValid;
    }
    public boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        StudentName = new java.awt.Label();
        studentname = new java.awt.TextField();
        Standard = new java.awt.Label();
        standard = new java.awt.TextField();
        fatherName = new java.awt.Label();
        fathersname = new java.awt.TextField();
        motherName = new java.awt.TextField();
        MotherName = new java.awt.Label();
        dob = new java.awt.Label();
        MobileNo = new java.awt.Label();
        parentsmobileno = new java.awt.TextField();
        State = new java.awt.Label();
        state = new java.awt.TextField();
        Pincode = new java.awt.Label();
        pincode = new java.awt.TextField();
        studentemailid = new java.awt.TextField();
        studentsEmailId = new java.awt.Label();
        Gender = new java.awt.Label();
        gendermale = new javax.swing.JRadioButton();
        genderfemale = new javax.swing.JRadioButton();
        Country = new java.awt.Label();
        country = new java.awt.TextField();
        updatestudent = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        label1.setText("UPDATE STUDENT DETAILS");

        StudentName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        StudentName.setText("Student's Name : ");

        studentname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentnameActionPerformed(evt);
            }
        });

        Standard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Standard.setText("Standard : ");

        standard.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardActionPerformed(evt);
            }
        });

        fatherName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fatherName.setText("Father's Name : ");

        fathersname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fathersname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathersnameActionPerformed(evt);
            }
        });

        motherName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        motherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherNameActionPerformed(evt);
            }
        });

        MotherName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MotherName.setText("Mother's Name : ");

        dob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dob.setText("Date of Birth : ");

        MobileNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MobileNo.setText("Parent's Mobile No. : ");

        parentsmobileno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        parentsmobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentsmobilenoActionPerformed(evt);
            }
        });

        State.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        State.setText("State : ");

        state.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        Pincode.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pincode.setText("Pincode : ");

        pincode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincodeActionPerformed(evt);
            }
        });

        studentemailid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentemailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentemailidActionPerformed(evt);
            }
        });

        studentsEmailId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        studentsEmailId.setText("Student's Email ID : ");

        Gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Gender.setText("Gender : ");

        gendermale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gendermale.setText("Male");
        gendermale.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gendermale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendermaleActionPerformed(evt);
            }
        });

        genderfemale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        genderfemale.setText("Female");
        genderfemale.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        genderfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderfemaleActionPerformed(evt);
            }
        });

        Country.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Country.setText("Country : ");

        country.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        updatestudent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updatestudent.setText("Update");
        updatestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestudentActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        dateChooser.setDateFormatString("yyyy-MM-dd");
        dateChooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Standard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(standard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fathersname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(motherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(parentsmobileno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(state, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentemailid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(gendermale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genderfemale)
                                .addGap(102, 102, 102)))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(updatestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(standard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Standard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fathersname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(motherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(parentsmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pincode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pincode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentsEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gendermale)
                            .addComponent(genderfemale))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(349, 349, 349))
        );

        MotherName.getAccessibleContext().setAccessibleName("Mother's Name");
        MobileNo.getAccessibleContext().setAccessibleName("Country : ");

        setSize(new java.awt.Dimension(822, 856));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void parentsmobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentsmobilenoActionPerformed
        // TODO add your handling code here:
         String mobileNo = parentsmobileno.getText();
         if(mobileNo.equals("")|| !isNumeric(mobileNo)){
            JOptionPane.showMessageDialog(this, "please enter valid mobile no.");
            setVisible(true);
        }
         
    }//GEN-LAST:event_parentsmobilenoActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
        String state = State.getText();
        if(state.equals("")|| !isString(state)){
            JOptionPane.showMessageDialog(this, "please enter valid state name");
            
        }

        
    }//GEN-LAST:event_stateActionPerformed

    private void pincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincodeActionPerformed
        // TODO add your handling code here:
        String pinCode = pincode.getText();
        if(pinCode.equals("") || !isNumeric(pinCode)){
            JOptionPane.showMessageDialog(null, "please enter valid pin code.");
        }
    }//GEN-LAST:event_pincodeActionPerformed

    private void studentemailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentemailidActionPerformed
        // TODO add your handling code here:
        String Email = studentsEmailId.getText();
        if(Email.equals("")){
            JOptionPane.showMessageDialog(null, "Email can't be empty");
            
        }
    }//GEN-LAST:event_studentemailidActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
          String country = Country.getText();
          if(country.equals("")|| !isString(country)){
            JOptionPane.showMessageDialog(this, "please enter valid country name.");
         
        }
    }//GEN-LAST:event_countryActionPerformed

    private void updatestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestudentActionPerformed
        // TODO add your handling code here:
        String Name = studentname.getText();
        String fatherName = fathersname.getText();
        String mothersName = motherName.getText();
        long mobileNo = Long.parseLong(parentsmobileno.getText());
        String state = State.getText();
        int pinCode = Integer.parseInt(pincode.getText());
        String Email = studentsEmailId.getText();
        String country = Country.getText();
        String Standard = standard.getText();
        SimpleDateFormat simpledate = new SimpleDateFormat("yyyy-MM-dd");          
        String dateofbirth = simpledate.format(dateChooser.getDate());
        char gender = ' ';
        if(gendermale.isSelected()) gender = 'M';
        else if(genderfemale.isSelected()) gender = 'F';
        Conn conn;
        try{
//            String query = "update students set NAME='"+Name+"', STANDARD='"+Standard+"', [`FATHER'S_NAME=`]'"+fatherName+"', [`MOTHER'S_NAME=`'"+mothersName+"', DOB='"+dateofbirth+"', COUNTRY='"+country+"',STATE='"+state+"', PINCODE='"+pinCode+"', STUDENT_EMAIL='"+Email+"',GENDER='"+gender+"', PARENTS_NUMBER='"+mobileNo+"' WHERE ROLLNO='"+rollno+"';";
            String father = "FATHER\'S_NAME";
            String mother = "MOTHER\'S_NAME";
            System.out.println(father + " " + mother);
            String query = "UPDATE STUDENTS SET NAME='"+Name+"', STANDARD='"+Standard+"', '"+father+"'='"+fatherName+"', '"+mother+"'="+mothersName+"', DOB='"+dateofbirth+"', COUNTRY='"+country+"', STATE='"+state+"', PINCODE='"+pinCode+"', STUDENTS_EMAIL='"+Email+"', GENDER='"+gender+"', PARENTS_NUMBER='"+mobileNo+"' WHERE ROLLNO='"+rollno+"'";
            conn = new Conn();
            int response = conn.s.executeUpdate(query);
            if(response > 0){
                JOptionPane.showMessageDialog(this, "Record updated successfully..");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }   
        
    }//GEN-LAST:event_updatestudentActionPerformed

    private void motherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherNameActionPerformed
        // TODO add your handling code here:
          String motherName = MotherName.getText();
          if(motherName.equals("") || !isString(motherName)){
            JOptionPane.showMessageDialog(this, "please Enter Valid Mother Name!!!");
        }
    }//GEN-LAST:event_motherNameActionPerformed

    private void gendermaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendermaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendermaleActionPerformed

    private void genderfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderfemaleActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        studentDashboardUI dashboard = new studentDashboardUI(rollno);
        dashboard.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void studentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentnameActionPerformed
        // TODO add your handling code here:
        String Name = StudentName.getText();
        if(Name.equals("")){
            JOptionPane.showMessageDialog(null, "please enter valid student name.");
        }
//        else if(!isString(Name)){
//            JOptionPane.showMessageDialog(null, "please enter valid student name.");
//        }
    }//GEN-LAST:event_studentnameActionPerformed

    private void fathersnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fathersnameActionPerformed
        // TODO add your handling code here:
         String fatherName = fathersname.getText();
         if(fatherName.equals("") || !isString(fatherName)){
            JOptionPane.showMessageDialog(this, "please enter valid father name.");
        }
    }//GEN-LAST:event_fathersnameActionPerformed

    private void standardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardActionPerformed
        // TODO add your handling code here:
        String Standard = standard.getText();
        if(Standard.equals("") || !isStandard(Standard)){
            JOptionPane.showMessageDialog(this, "please enter valid standard");
            setVisible(true);
        }
    }//GEN-LAST:event_standardActionPerformed

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
                if ("Wndows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentupdateprofileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentupdateprofileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentupdateprofileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentupdateprofileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentupdateprofileUI(rollno).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private java.awt.Label Country;
    private java.awt.Label Gender;
    private java.awt.Label MobileNo;
    private java.awt.Label MotherName;
    private java.awt.Label Pincode;
    private java.awt.Label Standard;
    private java.awt.Label State;
    private java.awt.Label StudentName;
    private java.awt.TextField country;
    private com.toedter.calendar.JDateChooser dateChooser;
    private java.awt.Label dob;
    private java.awt.Label fatherName;
    private java.awt.TextField fathersname;
    private javax.swing.JRadioButton genderfemale;
    private javax.swing.JRadioButton gendermale;
    private java.awt.Label label1;
    private java.awt.TextField motherName;
    private java.awt.TextField parentsmobileno;
    private java.awt.TextField pincode;
    private java.awt.TextField standard;
    private java.awt.TextField state;
    private java.awt.TextField studentemailid;
    private java.awt.TextField studentname;
    private java.awt.Label studentsEmailId;
    private javax.swing.JButton updatestudent;
    // End of variables declaration//GEN-END:variables
}