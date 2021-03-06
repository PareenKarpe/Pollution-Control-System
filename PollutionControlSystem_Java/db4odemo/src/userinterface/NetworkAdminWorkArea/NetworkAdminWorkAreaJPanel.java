/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NetworkAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author cc130tx
 */
public class NetworkAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount account;
   // private Enterprise enterprise;

    public NetworkAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Network network, EcoSystem business) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.enterprise = enterprise;
        this.system = business;
        this.network = network;
        this.account = account;
        jLabel2.setText(account.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageEnterprise2 = new javax.swing.JButton();
        btnManageAdmin2 = new javax.swing.JButton();
        myWorkAreaButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageEnterprise2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnManageEnterprise2.setText("Manage Enterprise");
        btnManageEnterprise2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterprise2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprise2ActionPerformed(evt);
            }
        });
        add(btnManageEnterprise2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 60));

        btnManageAdmin2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnManageAdmin2.setText("Manage Enterprise Admin");
        btnManageAdmin2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdmin2ActionPerformed(evt);
            }
        });
        add(btnManageAdmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 270, 60));

        myWorkAreaButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        myWorkAreaButton2.setText("MyWork");
        myWorkAreaButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myWorkAreaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myWorkAreaButton2ActionPerformed(evt);
            }
        });
        add(myWorkAreaButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 60));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("UerAccount");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 40));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setText("<Value>");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEnterprise2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprise2ActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, system, network);
        userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterprise2ActionPerformed

    private void btnManageAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdmin2ActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, system,network);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdmin2ActionPerformed

    private void myWorkAreaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myWorkAreaButton2ActionPerformed
        // TODO add your handling code here:
        MyWorkAreaJPanel myWorkAreaJPanel=new MyWorkAreaJPanel(userProcessContainer,account,network, system);
        userProcessContainer.add("myWorkAreaJPanel",myWorkAreaJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_myWorkAreaButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin2;
    private javax.swing.JButton btnManageEnterprise2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton myWorkAreaButton2;
    // End of variables declaration//GEN-END:variables
}
