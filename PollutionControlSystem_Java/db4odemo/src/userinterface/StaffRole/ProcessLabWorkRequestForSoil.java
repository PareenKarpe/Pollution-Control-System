/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SoilTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author cc130tx
 */
public class ProcessLabWorkRequestForSoil extends javax.swing.JPanel {

    /**
     * Creates new form ProcessLabWorkRequestForSoil
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization staffOrganisation;
    private Enterprise enterprise;
    private Network network;
    private SoilTestWorkRequest labSoilWorkRequest;

    ProcessLabWorkRequestForSoil(JPanel userProcessContainer, UserAccount account, Organization staffOrganisation, Enterprise enterprise, Network network, SoilTestWorkRequest labSoilWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.staffOrganisation = staffOrganisation;
        this.enterprise=enterprise;
        this.network=network;
        this.labSoilWorkRequest = labSoilWorkRequest;
        
        quantityLabel.setText(labSoilWorkRequest.getQuantity());
        enterpriseValueLabel.setText(labSoilWorkRequest.getSenderEnterprise());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        allabel = new javax.swing.JLabel();
        pvcLabel = new javax.swing.JLabel();
        hycrbLabel = new javax.swing.JLabel();
        ddtLabel = new javax.swing.JLabel();
        pcbsLabel = new javax.swing.JLabel();
        alSpinner = new javax.swing.JSpinner();
        hycrbSpinner = new javax.swing.JSpinner();
        pvcSpinner = new javax.swing.JSpinner();
        ddtSpinner = new javax.swing.JSpinner();
        pcbsSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseValueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("           Tested Sample Content");

        allabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        allabel.setText("Aluminium");

        pvcLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        pvcLabel.setText("PVC");

        hycrbLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        hycrbLabel.setText("Hydrocarbons");

        ddtLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ddtLabel.setText("DDT");

        pcbsLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        pcbsLabel.setText("PCBS");

        alSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alSpinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(10.0d)));

        hycrbSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hycrbSpinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(10.0d)));

        pvcSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pvcSpinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(10.0d)));

        ddtSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ddtSpinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(10.0d)));

        pcbsSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pcbsSpinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(10.0d)));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel7.setText("Sample Quantity");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantityLabel.setText("<Value>");

        submitButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise");

        enterpriseValueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterpriseValueLabel.setText("<Value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pvcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(allabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ddtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(hycrbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(pcbsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(169, 169, 169))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hycrbSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pvcSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(alSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enterpriseValueLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ddtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcbsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(enterpriseValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pvcSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pvcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hycrbSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hycrbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pcbsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(pcbsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        labSoilWorkRequest.setPvc(Double.parseDouble(pvcSpinner.getValue().toString()));
        labSoilWorkRequest.setAluminium(Double.parseDouble(alSpinner.getValue().toString()));
        labSoilWorkRequest.setHydrocarbons(Double.parseDouble(hycrbSpinner.getValue().toString()));
        labSoilWorkRequest.setDdt(Double.parseDouble(ddtSpinner.getValue().toString()));
        labSoilWorkRequest.setPcbs(Double.parseDouble(pcbsSpinner.getValue().toString()));
        
        labSoilWorkRequest.setStatus("Complete");
        
        JOptionPane.showMessageDialog(null, "Results are submitted", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        submitButton.setEnabled(false);
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabScientistWorkAreaJPanel dwjp = (LabScientistWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner alSpinner;
    private javax.swing.JLabel allabel;
    private javax.swing.JLabel ddtLabel;
    private javax.swing.JSpinner ddtSpinner;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseValueLabel;
    private javax.swing.JLabel hycrbLabel;
    private javax.swing.JSpinner hycrbSpinner;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel pcbsLabel;
    private javax.swing.JSpinner pcbsSpinner;
    private javax.swing.JLabel pvcLabel;
    private javax.swing.JSpinner pvcSpinner;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
