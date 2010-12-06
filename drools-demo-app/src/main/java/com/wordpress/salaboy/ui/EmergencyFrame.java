/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmergencyFrame.java
 *
 * Created on Nov 24, 2010, 6:16:28 PM
 */

package com.wordpress.salaboy.ui;

import com.wordpress.salaboy.MyDroolsService;
import com.wordpress.salaboy.util.AlertsIconListRenderer;
import java.awt.Color;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import org.plugtree.training.model.Ambulance;
import org.plugtree.training.model.Hospital;
import org.plugtree.training.model.Patient;

/**
 *
 * @author esteban
 */
public class EmergencyFrame extends javax.swing.JInternalFrame {

    private UserUI parent;
    private Ambulance ambulance;
    public EmergencyMonitorPanel emergencyMonitorPanel;
        
    /** Creates new form EmergencyFrame */
    public EmergencyFrame(UserUI parent, long ambulanceId) {
        this.parent = parent;
        this.ambulance = MyDroolsService.getAmbulanceById(ambulanceId);
        
        initComponents();
        
        this.pnlMedicalEvaluation.setEnabled(false);
        
        this.lblDirection.setForeground(Color.red);
        String text = "Emergency";
        this.lblDirection.setText(text);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabPanel = new javax.swing.JTabbedPane();
        driverPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPosition = new javax.swing.JTextArea();
        pickUpPatientjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblDirection = new javax.swing.JLabel();
        pnlMedicalEvaluation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        cboSeverity = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAlerts = new javax.swing.JList(new Object[]{"vital signs"});

        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        driverPanel.setName("Driver"); // NOI18N

        jLabel4.setText("Emergency Location");

        txtPosition.setColumns(20);
        txtPosition.setRows(5);
        jScrollPane1.setViewportView(txtPosition);

        pickUpPatientjButton.setText("Pick Up Patient");
        pickUpPatientjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpPatientjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Current Position");

        lblDirection.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lblDirection.setForeground(new java.awt.Color(16, 160, 1));

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pickUpPatientjButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lblDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDirection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pickUpPatientjButton)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        mainTabPanel.addTab("Driver", driverPanel);

        pnlMedicalEvaluation.setEnabled(false);
        pnlMedicalEvaluation.setName("Medical Evaluation"); // NOI18N

        jLabel1.setText("Severity");

        jLabel2.setText("Comments");

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane2.setViewportView(txtComment);

        cboSeverity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMedicalEvaluationLayout = new javax.swing.GroupLayout(pnlMedicalEvaluation);
        pnlMedicalEvaluation.setLayout(pnlMedicalEvaluationLayout);
        pnlMedicalEvaluationLayout.setHorizontalGroup(
            pnlMedicalEvaluationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedicalEvaluationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMedicalEvaluationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(cboSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addContainerGap())
        );
        pnlMedicalEvaluationLayout.setVerticalGroup(
            pnlMedicalEvaluationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedicalEvaluationLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(cboSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        mainTabPanel.addTab("Doctor Evaluation", pnlMedicalEvaluation);

        jLabel3.setText("Alerts");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstAlerts);
        lstAlerts.setCellRenderer(new AlertsIconListRenderer());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(382, Short.MAX_VALUE))
            .addComponent(mainTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear)
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pickUpPatientjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickUpPatientjButtonActionPerformed

        //this.emergencyMonitorPanel = new EmergencyMonitorPanel(this);

}//GEN-LAST:event_pickUpPatientjButtonActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int severity = this.cboSeverity.getSelectedIndex();
        String comment = this.txtComment.getText();
        parent.medicalEvaluationCompleted(severity,comment);
        this.mainTabPanel.remove(this.pnlMedicalEvaluation);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        DefaultListModel emptyModel = new DefaultListModel();
        this.lstAlerts.setModel(emptyModel);
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cboSeverity;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDirection;
    private javax.swing.JList lstAlerts;
    private javax.swing.JTabbedPane mainTabPanel;
    private javax.swing.JButton pickUpPatientjButton;
    private javax.swing.JPanel pnlMedicalEvaluation;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextArea txtPosition;
    // End of variables declaration//GEN-END:variables

    public JTabbedPane getMainTabPanel() {
        return mainTabPanel;
    }

    void heartBeatReceived(double value) {
        if (this.emergencyMonitorPanel != null){
            this.emergencyMonitorPanel.updateMonitorGraph(value);
        }
    }

    void emergencyReached(Block emergency) {
        this.pnlMedicalEvaluation.setEnabled(true);
        this.mainTabPanel.setSelectedComponent(this.pnlMedicalEvaluation);
    }

    void hospitalSelected(Long id) {
        this.lblDirection.setForeground(Color.green);
        Hospital hospital = MyDroolsService.getHospitalById(id);
        int x = (int)hospital.getPositionX();
        int y = (int)hospital.getPositionY();
        
        String text = "Hospital at "+x+" - "+y;
        
        this.lblDirection.setText(text);
        
        this.emergencyMonitorPanel = new EmergencyMonitorPanel(this);
    }

    private String lastPositionText = "";
    void positionReceived(Block corner) {
        int x = (int)ambulance.getPositionX();
        int y = (int)ambulance.getPositionY();
        
        String text = x+" - "+y;
        if (!lastPositionText.equals(text)){
            this.txtPosition.insert(text+"\n", 0);
            lastPositionText = text;
        }
    }

    private List<String> alerts = new ArrayList<String>(); 
    void monitorAlertReceived(String message) {
        alerts.add(0,message);
        
        DefaultListModel model = new DefaultListModel();
        for (String alert : alerts) {
            model.add(0,alert);
        }
        this.lstAlerts.setModel(model);
        this.validate();
    }
    
    void hospitalReached(Block hospitalBlock){
        
        this.parent.getMainJTabbedPane().setSelectedIndex(4);
        this.parent.refreshPatientsTable();
        
    }
    
   
    
    
}
