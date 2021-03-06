/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eceproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Chen
 */
public class Configurations extends javax.swing.JFrame {

    public int sysno = 0;
    
    /**
     * Creates new form Configurations
     */
    public Configurations() {
        initComponents();
        Dimension dim = (Toolkit.getDefaultToolkit()).getScreenSize();
        setSize(dim);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setUndecorated(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CEUnbypassed = new javax.swing.JButton();
        CEBypassed = new javax.swing.JButton();
        VDUnbypassed = new javax.swing.JButton();
        EF = new javax.swing.JButton();
        FB = new javax.swing.JButton();
        CB = new javax.swing.JButton();
        VDBypassed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CF1 = new javax.swing.JButton();
        CF2 = new javax.swing.JButton();

        setTitle("Cascade Systems Simulator");

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        CEUnbypassed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        CEUnbypassed.setText("Emitter Bias Unbypassed");
        CEUnbypassed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEUnbypassedActionPerformed(evt);
            }
        });
        jPanel1.add(CEUnbypassed);
        CEUnbypassed.setBounds(170, 140, 240, 50);

        CEBypassed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        CEBypassed.setText("Emitter Bias Bypassed");
        CEBypassed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEBypassedActionPerformed(evt);
            }
        });
        jPanel1.add(CEBypassed);
        CEBypassed.setBounds(170, 240, 240, 50);

        VDUnbypassed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        VDUnbypassed.setText("Voltage Divider Unbypassed");
        VDUnbypassed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VDUnbypassedActionPerformed(evt);
            }
        });
        jPanel1.add(VDUnbypassed);
        VDUnbypassed.setBounds(530, 140, 230, 50);

        EF.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        EF.setText("Emitter Follower");
        jPanel1.add(EF);
        EF.setBounds(170, 340, 240, 50);

        FB.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        FB.setText("Fixed Bias");
        FB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBActionPerformed(evt);
            }
        });
        jPanel1.add(FB);
        FB.setBounds(860, 140, 240, 50);

        CB.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        CB.setText("Common Base");
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });
        jPanel1.add(CB);
        CB.setBounds(860, 240, 240, 50);

        VDBypassed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        VDBypassed.setText("Voltage Divider Bypassed");
        VDBypassed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VDBypassedActionPerformed(evt);
            }
        });
        jPanel1.add(VDBypassed);
        VDBypassed.setBounds(860, 340, 240, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 540, 300, 40);

        CF1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        CF1.setText("DC Collector Feedback");
        CF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF1ActionPerformed(evt);
            }
        });
        jPanel1.add(CF1);
        CF1.setBounds(530, 340, 230, 50);

        CF2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        CF2.setText("Collector Feedback");
        CF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF2ActionPerformed(evt);
            }
        });
        jPanel1.add(CF2);
        CF2.setBounds(530, 240, 230, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VDUnbypassedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VDUnbypassedActionPerformed
        No_ro_Voltage_Divider_Unbypassed VDUnbypassedGUI = new No_ro_Voltage_Divider_Unbypassed();
        JFrame frame = new JFrame();
        frame.dispose();
        VDUnbypassedGUI.setSize(1020, 683);
        VDUnbypassedGUI.setDefaultCloseOperation(VDUnbypassedGUI.HIDE_ON_CLOSE);
        VDUnbypassedGUI.setLocationRelativeTo(frame);
        VDUnbypassedGUI.setVisible(true);
    }//GEN-LAST:event_VDUnbypassedActionPerformed

    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        No_ro_CommonBase CommonBaseGUI = new No_ro_CommonBase();
        JFrame frame = new JFrame();
        frame.dispose();

        CommonBaseGUI.setSize(1233, 600);
        CommonBaseGUI.setDefaultCloseOperation(CommonBaseGUI.HIDE_ON_CLOSE);
        CommonBaseGUI.setLocationRelativeTo(frame);
        CommonBaseGUI.setVisible(true);

    }//GEN-LAST:event_CBActionPerformed

    private void VDBypassedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VDBypassedActionPerformed
        System.out.println("This is system "+sysno);
        
        Ro_Voltage_Divider VDBypassedGUI = new Ro_Voltage_Divider();
        JFrame frame = new JFrame();
        frame.dispose();
//        VDBypassedGUI.sysno = sysno;
        System.out.println("VDBypassedGUI "+VDBypassedGUI.sysno);
        VDBypassedGUI.setSize(1171, 720);
        VDBypassedGUI.setDefaultCloseOperation(VDBypassedGUI.HIDE_ON_CLOSE);
        VDBypassedGUI.setLocationRelativeTo(frame);
        VDBypassedGUI.setVisible(true);

    }//GEN-LAST:event_VDBypassedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF1ActionPerformed
        Ro_Collector_DC_Feedback CollectorDCFeedbackGUI = new Ro_Collector_DC_Feedback();
        JFrame frame = new JFrame();
        frame.dispose();
        CollectorDCFeedbackGUI.setSize(1170, 700);
        CollectorDCFeedbackGUI.setDefaultCloseOperation(CollectorDCFeedbackGUI.HIDE_ON_CLOSE);
        CollectorDCFeedbackGUI.setLocationRelativeTo(frame);
        CollectorDCFeedbackGUI.setVisible(true);
    }//GEN-LAST:event_CF1ActionPerformed

    private void FBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBActionPerformed
        No_Ro_CE_Fixed_Bias FixedBiasGUI = new No_Ro_CE_Fixed_Bias();
        JFrame frame = new JFrame();
        frame.dispose();
        FixedBiasGUI.setSize(1075, 670);
        FixedBiasGUI.setDefaultCloseOperation(FixedBiasGUI.HIDE_ON_CLOSE);
        FixedBiasGUI.setLocationRelativeTo(frame);
        FixedBiasGUI.setVisible(true);

    }//GEN-LAST:event_FBActionPerformed

    private void CF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF2ActionPerformed
        No_ro_Collector_Feedback CollectorFeedbackGUI = new No_ro_Collector_Feedback();
        JFrame frame = new JFrame();
        frame.dispose();
        CollectorFeedbackGUI.setSize(1075, 700);
        CollectorFeedbackGUI.setDefaultCloseOperation(CollectorFeedbackGUI.HIDE_ON_CLOSE);
        CollectorFeedbackGUI.setLocationRelativeTo(frame);
        CollectorFeedbackGUI.setVisible(true);
    }//GEN-LAST:event_CF2ActionPerformed

    private void CEUnbypassedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEUnbypassedActionPerformed
        No_ro_CE_Emitter_Bias EmitterBiasUnypbassed = new No_ro_CE_Emitter_Bias();
        JFrame frame = new JFrame();
        frame.dispose();
        EmitterBiasUnypbassed.setSize(1200, 750);
        EmitterBiasUnypbassed.setDefaultCloseOperation(EmitterBiasUnypbassed.HIDE_ON_CLOSE);
        EmitterBiasUnypbassed.setLocationRelativeTo(frame);
        EmitterBiasUnypbassed.setVisible(true);
    }//GEN-LAST:event_CEUnbypassedActionPerformed

    private void CEBypassedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEBypassedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEBypassedActionPerformed

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
            java.util.logging.Logger.getLogger(Configurations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configurations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configurations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configurations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configurations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CB;
    private javax.swing.JButton CEBypassed;
    private javax.swing.JButton CEUnbypassed;
    private javax.swing.JButton CF1;
    private javax.swing.JButton CF2;
    private javax.swing.JButton EF;
    private javax.swing.JButton FB;
    private javax.swing.JButton VDBypassed;
    private javax.swing.JButton VDUnbypassed;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
