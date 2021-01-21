package com.boraclinic;

import javax.swing.JOptionPane;
import java.sql.*;
public class LogIn extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public LogIn() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jUserLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUsernameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon("H:\\Bora Clinic\\user_icon.PNG")); // NOI18N
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BORA CLINIC");

        jUserLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        jUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 322, 426);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(120, 120, 120));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 60, 140, 70);

        jUsernameTextField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jUsernameTextField.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jUsernameTextField);
        jUsernameTextField.setBounds(390, 180, 210, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("User  Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 160, 70, 17);

        jPasswordField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(390, 250, 210, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 230, 70, 17);

        jCheckBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jCheckBox.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox.setText("Show Password");
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox);
        jCheckBox.setBounds(390, 290, 140, 20);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 330, 80, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign In");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 330, 80, 30);

        setSize(new java.awt.Dimension(691, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       SelectUser user = new SelectUser();
       user.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String username = jUsernameTextField.getText();
       String password = jPasswordField.getText();
       String usertype = (String) SelectUser.jSelectComboBox.getSelectedItem();
       
       switch(usertype){
           case "Reception":
               if(username == "" && password == ""){
                   JOptionPane.showMessageDialog(rootPane,"Username and password cannot be blank");
               }else{
                    try{
                        String query = "Select * from StaffTable Where UserName = '"+username+"' and UserPassword = '"+password+"' and JobDescription ='"+usertype+"'";
                        con = Connections.getConnection();
                        ps = con.prepareStatement(query);
                        rs = ps.executeQuery();
                        
                        int count = 0;
                        while(rs.next()){
                            count = count + 1;
                        }
                        if(count == 1){
                          this.setVisible(false);
                          Reception user = new Reception();  
                          user.setVisible(true);
                          Reception.jUserLabel.setText(username);  
                        }
                        else if( count > 1){
                            JOptionPane.showMessageDialog(rootPane, "Access Denied! Duplicate user exist");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Wrong Username and Password");
                        }
                        
                    }catch(Exception e){
                         e.printStackTrace();
                    }
               }
               break;
           case "Doctor":
               if(username == "" && password == ""){
                   JOptionPane.showMessageDialog(rootPane,"Username and password cannot be blank");
               }else{
                    try{
                        String query = "Select * from StaffTable Where UserName = '"+username+"' and UserPassword = '"+password+"' and JobDescription ='"+usertype+"'";
                        con = Connections.getConnection();
                        ps = con.prepareStatement(query);
                        rs = ps.executeQuery();
                        
                        int count = 0;
                        while(rs.next()){
                            count = count + 1;
                        }
                        if(count == 1){
                          this.setVisible(false);
                          Doctor user = new Doctor();  
                          user.setVisible(true);
                          Doctor.jUserLabel.setText(username);  
                        }
                        else if( count > 1){
                            JOptionPane.showMessageDialog(rootPane, "Access Denied! Duplicate user exist");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Wrong Username and Password");
                        }
                        
                    }catch(Exception e){
                         e.printStackTrace();
                    }
               }
               break;
           case "Pharmacy":
               if(username == "" && password == ""){
                   JOptionPane.showMessageDialog(rootPane,"Username and password cannot be blank");
               }else{
                    try{
                        String query = "Select * from StaffTable Where UserName = '"+username+"' and UserPassword = '"+password+"' and JobDescription ='"+usertype+"'";
                        con = Connections.getConnection();
                        ps = con.prepareStatement(query);
                        rs = ps.executeQuery();
                        
                        int count = 0;
                        while(rs.next()){
                            count = count + 1;
                        }
                        if(count == 1){
                          this.setVisible(false);
                          Chemist user = new Chemist();  
                          user.setVisible(true);
                          Chemist.jUserLabel.setText(username);   
                        }
                        else if( count > 1){
                            JOptionPane.showMessageDialog(rootPane, "Access Denied! Duplicate user exist");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Wrong Username and Password");
                        }
                        
                    }catch(Exception e){
                         e.printStackTrace();
                    }
               }
               break;
           case "Administrator":
               if(username == "" && password == ""){
                   JOptionPane.showMessageDialog(rootPane,"Username and password cannot be blank");
               }else{
                    try{
                        String query = "Select * from StaffTable Where UserName = '"+username+"' and UserPassword = '"+password+"' and JobDescription ='"+usertype+"'";
                        con = Connections.getConnection();
                        ps = con.prepareStatement(query);
                        rs = ps.executeQuery();
                        
                        int count = 0;
                        while(rs.next()){
                            count = count + 1;
                        }
                        if(count == 1){
                          this.setVisible(false);
                          Administrator user = new Administrator();  
                          user.setVisible(true);
                          Administrator.jUserLabel.setText(username);   
                        }
                        else if( count > 1){
                            JOptionPane.showMessageDialog(rootPane, "Access Denied! Duplicate user exist");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Wrong Username and Password");
                        }
                        
                    }catch(Exception e){
                         e.printStackTrace();
                    }
               }
               break;
           case "Billing Officer":
               if(username == "" && password == ""){
                   JOptionPane.showMessageDialog(rootPane,"Username and password cannot be blank");
               }else{
                    try{
                        con = Connections.getConnection();
                        ps = con.prepareStatement("select * from StaffTable where UserName=? and UserPassword=?");
                        ps.setString(1, username);
                        ps.setString(2, password);
                        rs = ps.executeQuery();
                        this.setVisible(false);
                        BillingOfficer user = new BillingOfficer();  
                        user.setVisible(true);
                        BillingOfficer.jUserLabel.setText(username);
                    }catch(Exception e){
                         e.printStackTrace();
                    }
               }
               break;
           default:
               JOptionPane.showMessageDialog(this,"Wrong user name and password");
               break;
       }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed
        if(jCheckBox.isSelected()){
            jPasswordField.setEchoChar((char)0);
        }else{
            jPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    public static javax.swing.JLabel jUserLabel;
    private javax.swing.JTextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
