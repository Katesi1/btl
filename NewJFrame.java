package ketnoi_sql;
import java.sql.*;
import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {
    private Connection con;
    Statement st;
    ResultSet rs;
    private boolean SELECTLAST = false;
    private boolean SELECTFIRST = false;
    private boolean isFirst = true;
    private boolean isLast = false;
    private int currentRow = 0;
    private int chucnang = 1;
    public NewJFrame() {
        initComponents();
        connectToDatabase();
        displayData();
    }
           
     private void connectToDatabase() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;"+"databaseName=Mon;user=sa;password=123456";
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void displayData() {
        try {
            String sql = "SELECT * FROM Sinhvien";
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
                ID.setText(rs.getString(1));
                NAME.setText(rs.getString(2));
                UNIT.setText(rs.getString(3));
        } catch (SQLException e) {
                System.out.println("Khong ket noi duoc do" + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NEXT = new javax.swing.JButton();
        PREVIOUS = new javax.swing.JButton();
        LAST = new javax.swing.JButton();
        RIRST = new javax.swing.JButton();
        INSERT = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        UNIT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        NEXT.setText("NEXT");
        NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTActionPerformed(evt);
            }
        });

        PREVIOUS.setText("PREVIOUS");
        PREVIOUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREVIOUSActionPerformed(evt);
            }
        });

        LAST.setText("LAST");
        LAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LASTActionPerformed(evt);
            }
        });

        RIRST.setText("FIRST");
        RIRST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIRSTActionPerformed(evt);
            }
        });

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });

        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("ID");
        jLabel1.setPreferredSize(new java.awt.Dimension(17, 17));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("NAME");

        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDMouseClicked(evt);
            }
        });
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        NAME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NAMEMouseClicked(evt);
            }
        });
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });

        UNIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UNITMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("UNIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NAME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(UNIT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(UNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        EDIT.setText("EDIT");

        CANCEL.setText("CANCEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(INSERT)
                        .addGap(18, 18, 18)
                        .addComponent(EDIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NEXT)
                        .addGap(18, 18, 18)
                        .addComponent(PREVIOUS)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UPDATE)
                        .addGap(18, 18, 18)
                        .addComponent(DELETE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LAST)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RIRST)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CANCEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NEXT)
                    .addComponent(PREVIOUS)
                    .addComponent(LAST)
                    .addComponent(RIRST)
                    .addComponent(RESET))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSERT)
                    .addComponent(UPDATE)
                    .addComponent(DELETE)
                    .addComponent(CANCEL)
                    .addComponent(EDIT))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed

    }//GEN-LAST:event_NAMEActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTActionPerformed
        try {
            if (rs.next()){
            ID.setText(rs.getString(1));
            NAME.setText(rs.getString(2));
            UNIT.setText(rs.getString(3));
            PREVIOUS.setEnabled(true);
            }
            else {
            JOptionPane.showMessageDialog(null, "Không còn bản ghi sau đó", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            NEXT.setEnabled(false);
           // PREVIOUS.setEnabled(true);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(  null, e.getMessage(), "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NEXTActionPerformed

    private void PREVIOUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREVIOUSActionPerformed
        try {
        if (rs.previous()) {
            ID.setText(rs.getString(1));
            NAME.setText(rs.getString(2));
            UNIT.setText(rs.getString(3));
            NEXT.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Không còn bản ghi trước đó", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            PREVIOUS.setEnabled(false);
            //NEXT.setEnabled(true);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(  null, e.getMessage(), "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PREVIOUSActionPerformed

    private void LASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LASTActionPerformed
       try{
           if(!SELECTLAST && rs.last()){
               currentRow = rs.getRow();
                ID.setText(rs.getString(1));
                NAME.setText(rs.getString(2));
                UNIT.setText(rs.getString(3));
                
                isLast = rs.isLast();
                isFirst = rs.isFirst();
                SELECTLAST = true;
                SELECTFIRST = false;
                PREVIOUS.setEnabled(true);
                NEXT.setEnabled(false);
           }
       }catch (Exception e) {
            JOptionPane.showMessageDialog(  null, e.getMessage(), "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LASTActionPerformed

    private void RIRSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIRSTActionPerformed
       try{
           if(!SELECTFIRST && rs.first()){
                currentRow = rs.getRow();
                ID.setText(rs.getString(1));
                NAME.setText(rs.getString(2));
                UNIT.setText(rs.getString(3));
                
                isFirst = rs.isFirst();
                isLast = rs.isLast();
                SELECTFIRST = true;
                SELECTLAST = false;
                PREVIOUS.setEnabled(false);
                NEXT.setEnabled(true);
           }
            /*rs.first();
            ID.setText(rs.getString(1));
            NAME.setText(rs.getString(2));
            UNIT.setText(rs.getString(3));*/
       }catch (Exception e) {
            JOptionPane.showMessageDialog(  null, e.getMessage(), "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RIRSTActionPerformed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        /*    String id = ID.getText();
            String Name = NAME.getText();
            String Unit = UNIT.getText();
        String sql = "INSERT INTO Sinhvien(ID,NAME,UNIT)"+"VALUES(?,?,?)";
        try{
            PreparedStatement insert = con.prepareStatement(sql);
            insert.setString(1, id);
            insert.setString(2,Name);
            insert.setString(3,Unit);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(null, "Insert thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            displayData();
        }catch(Exception e){
        e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Insert thất bại: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }*/
        ID.setText(null);
        NAME.setText(null);
        UNIT.setText(null);
        CANCEL.setEnabled(true);
        UPDATE.setEnabled(true);
        INSERT.setEnabled(false);
        EDIT.setEnabled(false);
        chucnang = 1;
    }//GEN-LAST:event_INSERTActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        ID.setText("");
        NAME.setText("");
        UNIT.setText("");
        PREVIOUS.setEnabled(true);
        NEXT.setEnabled(true);
    }//GEN-LAST:event_RESETActionPerformed

    private void IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseClicked
        ID.setText("");
    }//GEN-LAST:event_IDMouseClicked

    private void NAMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAMEMouseClicked
        NAME.setText("");
    }//GEN-LAST:event_NAMEMouseClicked

    private void UNITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UNITMouseClicked
        UNIT.setText("");
    }//GEN-LAST:event_UNITMouseClicked

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        try{
                String id = ID.getText();
                String name = NAME.getText();
                String unit = UNIT.getText();

                String sql = "UPDATE Sinhvien SET NAME=?, UNIT=? WHERE ID=?";
                PreparedStatement up = con.prepareStatement(sql);
                up.setString(1, name);
                up.setString(2, unit);
                up.setString(3, id);

                int rowsUpdated = up.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                displayData();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        try {
            String id = ID.getText();

            String sql = "DELETE FROM Sinhvien WHERE ID=?";
            PreparedStatement del = con.prepareStatement(sql);
            del.setString(1, id);

            int rowsDeleted = del.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Xoá thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                displayData();
            } else {
                JOptionPane.showMessageDialog(null, "Xoá thất bại - ID không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DELETEActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCEL;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EDIT;
    private javax.swing.JTextField ID;
    private javax.swing.JButton INSERT;
    private javax.swing.JButton LAST;
    private javax.swing.JTextField NAME;
    private javax.swing.JButton NEXT;
    private javax.swing.JButton PREVIOUS;
    private javax.swing.JButton RESET;
    private javax.swing.JButton RIRST;
    private javax.swing.JTextField UNIT;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
