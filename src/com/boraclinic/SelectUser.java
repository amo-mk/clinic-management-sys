package com.boraclinic;
/**
 * @author amos kiprotich
 */
import javax.swing.JFrame;

public class SelectUser extends javax.swing.JFrame {
     public SelectUser() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSelectComboBox = new javax.swing.JComboBox<>();
        jConfirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select User");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("We Value Our Patients");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BORA CLINIC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(194, 194, 194))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 274, 425);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Select User");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 130, 120, 20);

        jSelectComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jSelectComboBox.setForeground(new java.awt.Color(51, 51, 51));
        jSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reception", "Doctor", "Pharmacy", "Billing Officer", "Administrator" }));
        jSelectComboBox.setBorder(null);
        jSelectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(jSelectComboBox);
        jSelectComboBox.setBounds(370, 190, 230, 30);

        jConfirmButton.setBackground(new java.awt.Color(0, 102, 204));
        jConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmButton.setText("CONFIRM");
        jConfirmButton.setBorder(null);
        jConfirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jConfirmButton);
        jConfirmButton.setBounds(460, 260, 70, 30);

        setSize(new java.awt.Dimension(701, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSelectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSelectComboBoxActionPerformed
    private void jConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmButtonActionPerformed
       
        if(jSelectComboBox.getSelectedItem().equals("Reception")){
            this.setVisible(false);
            LogIn user = new LogIn();  
            user.setVisible(true);
            LogIn.jUserLabel.setText("Receptionist Staff Log In");           
        }else if(jSelectComboBox.getSelectedItem().equals("Doctor")){
            this.setVisible(false);
            LogIn user = new LogIn();  
            user.setVisible(true);
            LogIn.jUserLabel.setText("Doctor Staff Log In");           
        }else if(jSelectComboBox.getSelectedItem().equals("Pharmacy")){
            this.setVisible(false);
            LogIn user = new LogIn();  
            user.setVisible(true);
            LogIn.jUserLabel.setText("Chemist's Staff Log In");           
        }else if(jSelectComboBox.getSelectedItem().equals("Administrator")){
            this.setVisible(false);
            LogIn user = new LogIn();  
            user.setVisible(true);
            LogIn.jUserLabel.setText("Administrators Staff Log In");           
        }else if(jSelectComboBox.getSelectedItem().equals("Billing Officer")){
            this.setVisible(false);
            LogIn user = new LogIn();  
            user.setVisible(true);
            LogIn.jUserLabel.setText("Billing officer's Staff Log In");           
        }
    }//GEN-LAST:event_jConfirmButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jConfirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox<String> jSelectComboBox;
    // End of variables declaration//GEN-END:variables
}
