/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salary;


import java.awt.print.PrinterException;
import javax.swing.JFrame;
import javax.swing.table.TableModel;






/**
 *
 * @author RAJITHA
 */
public class Supplierreportprint1 extends javax.swing.JFrame {

    /**
     * Creates new form Supplierreportprint1
     */
    public Supplierreportprint1() {
        initComponents();
    }

    
    
       String ltotal;
    String lmonth;
    String ldis ;
    String lsub;
    int lyear;
    
   Supplierreportprint1(String tot,TableModel tableModel,int year, String month ) throws PrinterException {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.ltotal = tot;
        this.lyear = year;
        this.lmonth = month;
        
        txtprint.setText(txtprint.getText()+"************************************************************************\n");
        txtprint.setText(txtprint.getText()+"************************ Nimalsiri Book Shop ***************************\n");
        txtprint.setText(txtprint.getText()+"************************ Monthly Supplier PurchasReport *****************\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"supplierid"           +"supplier name"+"     "+"contactnumber"+"        "+"Total"+"\n");
        
        
       
        
       for(int i=0;i<tableModel.getRowCount();i++){
            
            String cusId = (String) tableModel.getValueAt(i, 0);
            String cusName = (String) tableModel.getValueAt(i, 1);
            String ContactNo = (String) tableModel.getValueAt(i, 2);
            String total = (String) tableModel.getValueAt(i, 3);
            
               
        txtprint.setText(txtprint.getText()+cusId+"                " +cusName+"               "+ContactNo+"             "+total+"\n");
            
            
            
        }
        
        
        
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
        
        txtprint.setText(txtprint.getText()+"Total  : Rs."+ tot +"\n");
         txtprint.setText(txtprint.getText()+"Date "+year+" "+month+ " Month \n");
         txtprint.setText(txtprint.getText()+"***************************************************************************\n");
         txtprint.setText(txtprint.getText()+"***************************************************************************\n");
         txtprint.setText(txtprint.getText()+"...................................Thank you............................!!!!\n");
         

         
         
         
         txtprint.print();
        
        
        
        
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
        txtprint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtprint.setColumns(20);
        txtprint.setRows(5);
        jScrollPane1.setViewportView(txtprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Supplierreportprint1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplierreportprint1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplierreportprint1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplierreportprint1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplierreportprint1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtprint;
    // End of variables declaration//GEN-END:variables
}
