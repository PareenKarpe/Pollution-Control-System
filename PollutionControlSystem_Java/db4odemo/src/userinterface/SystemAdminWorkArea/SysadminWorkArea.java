/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.NetworkAdminWorkArea.ViewReportJPanel;
import userinterface.SupervisorRole.SupervisorWorkAreaJPanel;

/**
 *
 * @author paree
 */
public class SysadminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SysadminWorkArea
     */
   JPanel userProcessContainer;
    EcoSystem system;
    UserAccount useraccount;
    Organization organization;
    Enterprise enterprise;
    Network network;
            
    public SysadminWorkArea(JPanel userProcessContainer, EcoSystem ecosystem,Network network, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = ecosystem;
        this.network = network;
        this.enterprise=enterprise;
        this.useraccount=account;
         populateTable();  
         jLabel2.setText(account.getUsername().toString());
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        OpenButton = new javax.swing.JToggleButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        workRequestJTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Sender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                workRequestJTableMousePressed(evt);
            }
        });
        workRequestJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                workRequestJTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        OpenButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        OpenButton.setText("Open");
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("UserAccount");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(837, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(684, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void populateTable()
    {
          DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : useraccount.getWorkQueue().getWorkRequestList()){
            System.out.print("Systemans"+request.getMessage());
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getReceiver();
            
            row[2] = request.getStatus();
            String result = "View";
          //  row[3] = result == null ? "Waiting" : result;
             row[3] = request.getSender();
            
            model.addRow(row);
    }
    }

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(null, "Select all click", "Icomplete", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void workRequestJTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMousePressed
        // TODO add your handling code here:
        //        int selectedRow = workRequestJTable.getSelectedRow();
        //        if(selectedRow < 0)
        //        {
            //            return;
            //        }
        //        UserAccount sender = (UserAccount)workRequestJTable.getValueAt(selectedRow, 3);
        //        String user = sender.getUsername();
        //        //   System.out.print(sender);
        //        if (user.contains("mun"))
        //        {
            //            ForwardJButton2.setEnabled(true);
            //        }
        //        else
        //        {
            //            ForwardJButton2.setEnabled(false);
            //        }
        //
        //        String status = workRequestJTable.getValueAt(selectedRow,2).toString();
        //        if(status.contains("Complete"))
        //        {
            //            ViewJButton1.setEnabled(true);
            //        }
        //        else
        //        ViewJButton1.setEnabled(false);
    }//GEN-LAST:event_workRequestJTableMousePressed

    private void workRequestJTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workRequestJTableKeyPressed
        // TODO add your handling code here:
        //   JOptionPane.showMessageDialog(null, "Select all", "Icomplete", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_workRequestJTableKeyPressed

    private void OpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){

            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        //System.out.print("req"+request);
//JPanel userProcessContainer,UserAccount userAccount, Network network, EcoSystem system,WorkRequest request
        ViewReportJPanel viewReportJPanel=new ViewReportJPanel(userProcessContainer,useraccount,network, system,request);
        userProcessContainer.add("viewReportJPanel",viewReportJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
        // waterRequest.setStatus("Processing");

    }//GEN-LAST:event_OpenButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel dwjp = (SystemAdminWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton OpenButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}