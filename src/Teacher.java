

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kanis
 */
public class Teacher extends javax.swing.JFrame {
    
    
  Connection con = null;
    Statement stmt = null;
    ResultSet rs = null; //Import to Result Set


    /**
     * Creates new form Teacher
     */
    public Teacher() {
        initComponents();
        
            con = databaseConnection.connection();
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
        jLabel1 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        Tcontact = new javax.swing.JTextField();
        id7 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        Tname = new javax.swing.JTextField();
        Taddress = new javax.swing.JTextField();
        Tage = new javax.swing.JTextField();
        Tbirthday = new javax.swing.JTextField();
        Tgender = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        newTeacher = new javax.swing.JButton();
        imageIcon = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        mainManuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("TEACHER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        contact.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        contact.setForeground(new java.awt.Color(0, 0, 0));
        contact.setText("CONTACT NO.");
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        id1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 0, 0));
        id1.setText("ID");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        id2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id2.setForeground(new java.awt.Color(0, 0, 0));
        id2.setText("NAME");
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        id3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id3.setForeground(new java.awt.Color(0, 0, 0));
        id3.setText("ADDRESS");
        jPanel1.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        id4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id4.setForeground(new java.awt.Color(0, 0, 0));
        id4.setText("AGE");
        jPanel1.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        id5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id5.setForeground(new java.awt.Color(0, 0, 0));
        id5.setText("BIRTDAY");
        jPanel1.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        id6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id6.setForeground(new java.awt.Color(0, 0, 0));
        id6.setText("GENDER");
        jPanel1.add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        Tcontact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcontactActionPerformed(evt);
            }
        });
        jPanel1.add(Tcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 330, -1));

        id7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id7.setForeground(new java.awt.Color(0, 0, 0));
        id7.setText("CONTACT NO.");
        jPanel1.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        id8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        id8.setForeground(new java.awt.Color(0, 0, 0));
        id8.setText("CONTACT NO.");
        jPanel1.add(id8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        Tid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidActionPerformed(evt);
            }
        });
        jPanel1.add(Tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 200, -1));

        Tname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnameActionPerformed(evt);
            }
        });
        jPanel1.add(Tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 330, -1));

        Taddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Taddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaddressActionPerformed(evt);
            }
        });
        jPanel1.add(Taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 330, -1));

        Tage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TageActionPerformed(evt);
            }
        });
        jPanel1.add(Tage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 330, -1));

        Tbirthday.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tbirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbirthdayActionPerformed(evt);
            }
        });
        jPanel1.add(Tbirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 330, -1));

        Tgender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Gender", "Male", "Female" }));
        jPanel1.add(Tgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        newTeacher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newTeacher.setText("NEW");
        newTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeacherActionPerformed(evt);
            }
        });
        jPanel1.add(newTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, -1, -1));

        imageIcon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(imageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 190, 190));

        select.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        select.setText("SELECT IMAGE");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, -1, -1));

        mainManuBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainManuBtn.setText("MAIN MENU");
        mainManuBtn.setActionCommand("jButton21");
        mainManuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainManuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mainManuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcontactActionPerformed

    private void TidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TidActionPerformed

    private void TnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnameActionPerformed

    private void TaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaddressActionPerformed

    private void TageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TageActionPerformed

    private void TbirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TbirthdayActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        imageIcon.setIcon(new ImageIcon(file.toString()));
        filename = file.getAbsolutePath();
        
        try
        {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte [] buf = new byte [1024];
            
            for(int readnum; (readnum = fis.read(buf)) != -1;)
            {
                bos.write(buf, 0, readnum);
            }
            photo = bos.toByteArray();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_selectActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
            try
        {
            stmt = con.createStatement();
            
            
            int sId = Integer.parseInt(Tid.getText());
            String sName = Tname.getText();
            String sAddress = Taddress.getText();
            int sAge = Integer.parseInt(Tage.getText());
            long Birthday = Date.parse(Tbirthday.getText());
            java.sql.Date sBirthday = new java.sql.Date(Birthday);
            String sGender = (String) Tgender.getSelectedItem();
            int sContact = Integer.parseInt(Tcontact.getText());
            
            String query = "INSERT INTO teacher (id, name, address, age, birthday, gender, contact, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, sId);
            preparedStmt.setString(2, sName);
            preparedStmt.setString(3, sAddress);
            preparedStmt.setInt(4, sAge);
            preparedStmt.setDate(5, sBirthday);
            preparedStmt.setString(6, sGender);
            preparedStmt.setInt(7, sContact);
            preparedStmt.setBytes(8, photo);
            
            preparedStmt.execute();
            JOptionPane.showMessageDialog(null, "ADDED");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            Reset();
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        try
        {
            
            
            stmt = con.createStatement();
            
            int sId = Integer.parseInt(Tid.getText());
            String sName = Tname.getText();
            String sAddress = Taddress.getText();
            int sAge = Integer.parseInt(Tage.getText());
            long Birthday = Date.parse(Tbirthday.getText());
            java.sql.Date sBirthday = new java.sql.Date(Birthday);
            String sGender = (String) Tgender.getSelectedItem();
            int sContact = Integer.parseInt(Tcontact.getText());
            
          String query = "UPDATE teacher SET name = ?, address = ?, age = ?, birthday = ?, gender = ?, contact = ?, image = ? WHERE id = ?";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            preparedStmt.setString(1, sName);
            preparedStmt.setString(2, sAddress);
            preparedStmt.setInt(3, sAge);
            preparedStmt.setDate(4, sBirthday);
            preparedStmt.setString(5, sGender);
            preparedStmt.setInt(6, sContact);
            preparedStmt.setBytes(7, photo);
            preparedStmt.setInt(8, sId);
            
            preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Details Updated Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        Reset();
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
        try{
            
             stmt = con.createStatement();
            
            int sId = Integer.parseInt(Tid.getText());
            
            String query = "SELECT * FROM teacher";
            
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                if(sId == rs.getInt("id")){
                    Tname.setText(rs.getString("name"));
                    Taddress.setText(rs.getString("address"));
                    Tage.setText(String.format("%s", rs.getInt("age")));
                    Tbirthday.setText(String.format("%tD", rs.getDate("birthday")));
                    Tgender.setSelectedItem(rs.getString("gender"));
                    Tcontact.setText(String.format(0 +  "%s", rs.getInt("contact")));
                    
                     //Image Search
                    BufferedImage image = ImageIO.read(rs.getBinaryStream("image"));
                    imageIcon.setIcon(new ImageIcon(image));
                }
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void Reset() {   //Create Reset Function
    Tid.setText("");
    Tname.setText("");
    Taddress.setText("");
    Tage.setText("");
    Tbirthday.setText("");
    Tgender.setSelectedItem(null); // Reset to default or initial value
    Tcontact.setText("");
    
     // Reset the image-related component (assuming imageIcon is a JLabel)
    imageIcon.setIcon(null);
    
    // Select the first item in the JComboBox after reset
    
    if (Tgender.getItemCount() > 0) {
        Tgender.setSelectedItem(Tgender.getItemAt(0));
    }
}
    
    private void newTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTeacherActionPerformed
        // TODO add your handling code here:
        
        Reset();
    }//GEN-LAST:event_newTeacherActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
          
        try{
            
            stmt = con.createStatement();
            
            int sId = Integer.parseInt(Tid.getText());
            
            String query = "DELETE FROM teacher WHERE id ='"+sId+"' ";
            
            stmt.execute(query);
            
            Reset();
            JOptionPane.showMessageDialog(null, "DELETED DETAILS");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        Reset();
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Taddress;
    private javax.swing.JTextField Tage;
    private javax.swing.JTextField Tbirthday;
    private javax.swing.JTextField Tcontact;
    private javax.swing.JComboBox<String> Tgender;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tname;
    private javax.swing.JLabel contact;
    private javax.swing.JButton delete;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel id7;
    private javax.swing.JLabel id8;
    private javax.swing.JLabel imageIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainManuBtn;
    private javax.swing.JButton newTeacher;
    private javax.swing.JButton search;
    private javax.swing.JButton select;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

        byte [] photo = null;
        String filename = null;
  

}
