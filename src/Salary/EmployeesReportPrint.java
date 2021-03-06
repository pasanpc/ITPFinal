/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salary;

import java.awt.print.PrinterException;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author Dilshan
 */
public class EmployeesReportPrint extends javax.swing.JFrame {

    /**
     * Creates new form EmployeesReportPrint
     */
    public EmployeesReportPrint() {
        initComponents();
        
    }  
    
    int lyear;
    String def = "acc";
    
    EmployeesReportPrint(TableModel tableModel,int year) throws PrinterException {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        this.lyear = year;
        
        
        printArea.setText(printArea.getText()+"****************************************************************************************************************************\n");
        printArea.setText(printArea.getText()+"*************************************************** Nimalsiri Book Shop ****************************************************\n");
        printArea.setText(printArea.getText()+"************************************ "+year+" Annual Appointments And Resignation Report ***********************************\n");
        printArea.setText(printArea.getText()+"\n\n");
        printArea.setText(printArea.getText()+"ID"+"      "+"Name"+"\t"+"\tPhone Number"+"     "+"Appointment Date"+"         "+"Resigned Date"+"            "+"Position"+"\n\n");
        
        for(int i=0;i<tableModel.getRowCount();i++){
            
          
            String resEmpId = (String) tableModel.getValueAt(i, 0);
            String resEmpName = (String) tableModel.getValueAt(i, 1);
            String resEmpPhone = (String) tableModel.getValueAt(i, 2);
            String resAppDate = (String) tableModel.getValueAt(i, 3);
            String resDate = (String) tableModel.getValueAt(i, 4);
            String resEmpPosition = (String) tableModel.getValueAt(i, 5);
            
            
              printArea.setText(printArea.getText()+resEmpId+"      "+resEmpName+"\t"+resEmpPhone+"\t     "+resAppDate+"                    "+resDate+"\t      "+resEmpPosition+"\n");
          
        }
        
        
        printArea.setText(printArea.getText()+"\n");
        printArea.setText(printArea.getText()+"\n\n");
        
         printArea.setText(printArea.getText()+"****************************************************************************************************************************\n");
         printArea.setText(printArea.getText()+"****************************************************************************************************************************\n");
         printArea.setText(printArea.getText()+"........................................................... Thank you !!!...................................................\n");
         
         printArea.print();
        
        
        
        
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
        printArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        printArea.setColumns(20);
        printArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        printArea.setRows(5);
        jScrollPane1.setViewportView(printArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EmployeesReportPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesReportPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesReportPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesReportPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesReportPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea printArea;
    // End of variables declaration//GEN-END:variables
}
