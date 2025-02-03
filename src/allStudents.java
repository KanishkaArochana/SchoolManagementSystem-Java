
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kanis
 */
public class allStudents extends javax.swing.JFrame {
    
      //Database Connection
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null; //Import to Result Set

    /**
     * Creates new form allStudents
     */
    public allStudents() {
        initComponents();
        con = databaseConnection.connection();
        showRecord();
    }
    
    public void showRecord(){
        
        try{
            
             stmt = con.createStatement();
            
            if(grade.getSelectedItem().equals("All"))
            {
                String query = "SELECT * FROM student";
                ResultSet re = stmt.executeQuery(query);
                view.setModel(DbUtils.resultSetToTableModel(re));
            }
            
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        grade = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        view = new javax.swing.JTable();
        editBtn = new javax.swing.JButton();
        mainManuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("STUDENTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        grade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1A", "1B", "1C" }));
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });
        jPanel1.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        view.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(view);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 950, -1));

        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editBtn.setText("EDIT / ADD");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 140, 50));

        mainManuBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainManuBtn.setText("MAIN MENU");
        mainManuBtn.setActionCommand("jButton21");
        mainManuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainManuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mainManuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 680, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:
       
       try{
           
         stmt = con.createStatement();
            
            if(grade.getSelectedItem().equals("All"))
            {
                String query = "SELECT * FROM student";
                ResultSet re = stmt.executeQuery(query);
                view.setModel(DbUtils.resultSetToTableModel(re));
            }
            if(grade.getSelectedItem().equals("1A"))
            {
                String query = "SELECT * FROM student WHERE grade = '1A'";
                ResultSet re = stmt.executeQuery(query);
                view.setModel(DbUtils.resultSetToTableModel(re));
            }
            
            if(grade.getSelectedItem().equals("1B"))
            {
                String query = "SELECT * FROM student WHERE grade = '1B'";
                ResultSet re = stmt.executeQuery(query);
                view.setModel(DbUtils.resultSetToTableModel(re));
            }
            
            if(grade.getSelectedItem().equals("1C"))
            {
                String query = "SELECT * FROM student WHERE grade = '1C'";
                ResultSet re = stmt.executeQuery(query);
                view.setModel(DbUtils.resultSetToTableModel(re));
            }
    }
        
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_gradeActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
               setVisible(false);
               student view = new student();
               view.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void mainManuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainManuBtnActionPerformed
        // TODO add your handling code here:
               setVisible(false);
               Home view = new Home();
               view.setVisible(true);
    }//GEN-LAST:event_mainManuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(allStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainManuBtn;
    private javax.swing.JTable view;
    // End of variables declaration//GEN-END:variables
}
