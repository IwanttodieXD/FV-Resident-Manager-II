
import java.awt.Color;
import java.awt.Insets;
import java.awt.Toolkit;
import java.sql.* ;
import java.util.ArrayList;
import static java.util.Locale.filter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author val castro
 */
public class ferbyuSubdDB_Pri extends javax.swing.JFrame {

    /**
     * Creates new form ferbyuSubdManager
     */
    public ferbyuSubdDB_Pri() {
        initComponents();
        fillJtableWithOwnersData();
    }
        //function to fill jtable with resident data using the arraylist bro
        public void fillJtableWithOwnersData()
        {
            DB_Primary owner = new DB_Primary(); 
            ArrayList<DB_Primary> ownersList = owner.ownersList();
            
            //the jtable columns
            String[] colNames = {"ID","Name","Surname","Address"};
            
            //the jtable row
            //ownerslistsize = size of the arraylist
            //4 number of collumns
            Object[][] rows = new Object[ownersList.size()][4];
            
            //add data from the list to the rows
            for (int i = 0; i < ownersList.size(); i++)
            {
                rows[i][0] = ownersList.get(i).getID();
                rows[i][1] = ownersList.get(i).getName();
                rows[i][2] = ownersList.get(i).getSurname();
                rows[i][3] = ownersList.get(i).getAddress();
            }
            
            DefaultTableModel model = new DefaultTableModel(rows, colNames);
            jTable_DB.setModel(model);
            
            jTable_DB.setRowHeight(30);
            jTable_DB.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_DB.getColumnModel().getColumn(3).setPreferredWidth(600);
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
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_DB = new javax.swing.JTable();
        jButton_NEW = new javax.swing.JButton();
        jButton_DELETE = new javax.swing.JButton();
        jButton_EDIT = new javax.swing.JButton();
        jButton_ManagerLock = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField_Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("RESIDENT DATABASE");

        jTable_DB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_DB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable_DB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_DB.setColumnSelectionAllowed(true);
        jTable_DB.getTableHeader().setReorderingAllowed(false);
        jTable_DB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_DB);
        jTable_DB.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton_NEW.setBackground(new java.awt.Color(0, 51, 204));
        jButton_NEW.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButton_NEW.setText("NEW");
        jButton_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NEWActionPerformed(evt);
            }
        });

        jButton_DELETE.setBackground(new java.awt.Color(204, 0, 0));
        jButton_DELETE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_DELETE.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE.setText("DELETE");
        jButton_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETEActionPerformed(evt);
            }
        });

        jButton_EDIT.setBackground(new java.awt.Color(153, 0, 153));
        jButton_EDIT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_EDIT.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EDIT.setText("EDIT");
        jButton_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EDITActionPerformed(evt);
            }
        });

        jButton_ManagerLock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_ManagerLock.setText("LOCK");
        jButton_ManagerLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManagerLockActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusLost(evt);
            }
        });
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SEARCH:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ManagerLock))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Search)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_ManagerLock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1352, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NEWActionPerformed
        // TODO add your handling code here:
        add_residentsW mainform = new add_residentsW();
        mainform.setVisible(true);
        mainform.pack();
    }//GEN-LAST:event_jButton_NEWActionPerformed

    private void jButton_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EDITActionPerformed
        // TODO add your handling code here:
        edit_residentsW jf2 = new edit_residentsW();
        jf2.show();
    }//GEN-LAST:event_jButton_EDITActionPerformed

    private void jButton_ManagerLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManagerLockActionPerformed
        // TODO add your handling code here:
        ManagerLocked_Window jf2 = new ManagerLocked_Window();
        jf2.show();
        
        this.dispose();
      
    }//GEN-LAST:event_jButton_ManagerLockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fillJtableWithOwnersData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETEActionPerformed
        // TODO add your handling code here:
        delete_residentsW jf2 = new delete_residentsW();
        jf2.show();
    }//GEN-LAST:event_jButton_DELETEActionPerformed

    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel obj = (DefaultTableModel) jTable_DB.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable_DB.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField_Search.getText()));
        
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    private void jTextField_SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusLost
        // TODO add your handling code here:
        if(jTextField_Search.getText().equals("") ||
           jTextField_Search.getText().equals("Search"))
          {
           jTextField_Search.setText("Search");
           jTextField_Search.setForeground(new Color(153,153,153));
          }
    }//GEN-LAST:event_jTextField_SearchFocusLost

    private void jTextField_SearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusGained
        // TODO add your handling code here:
           if(jTextField_Search.getText().equals("Search"))
           {
            jTextField_Search.setText("");
            jTextField_Search.setForeground(Color.black);
           }
    }//GEN-LAST:event_jTextField_SearchFocusGained

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jTable_DBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DBMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = jTable_DB.getSelectedRow();
        
    }//GEN-LAST:event_jTable_DBMouseClicked

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
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ferbyuSubdDB_Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ferbyuSubdDB_Pri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_DELETE;
    private javax.swing.JButton jButton_EDIT;
    private javax.swing.JButton jButton_ManagerLock;
    private javax.swing.JButton jButton_NEW;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_DB;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
