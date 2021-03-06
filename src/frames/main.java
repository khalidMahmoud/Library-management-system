/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import classes.SharedClass;
import java.awt.ComponentOrientation;

/**
 *
 * @author khalid
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    SharedClass shared = new SharedClass();

    public main() {
        initComponents();
        MenuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        setLocationRelativeTo(null);
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
        main_members = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        main_books = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        main_search = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        main_borrowBook = new javax.swing.JLabel();
        main_returnBook = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        main_logOut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menu_members = new javax.swing.JMenu();
        menu_books = new javax.swing.JMenu();
        menu_addBook = new javax.swing.JMenuItem();
        menu_searchBook = new javax.swing.JMenuItem();
        menu_operations = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 631));
        setPreferredSize(new java.awt.Dimension(1000, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "قائمه سريعه", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.blue)); // NOI18N

        main_members.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users.png"))); // NOI18N
        main_members.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_membersMouseClicked(evt);
            }
        });

        main_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books.png"))); // NOI18N
        main_books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_booksMouseClicked(evt);
            }
        });

        main_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        main_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_searchMouseClicked(evt);
            }
        });

        main_borrowBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrow.png"))); // NOI18N
        main_borrowBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_borrowBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_borrowBookMouseClicked(evt);
            }
        });

        main_returnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        main_returnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_returnBookMouseClicked(evt);
            }
        });

        main_logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout-icon.png"))); // NOI18N
        main_logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_logOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(main_books, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(main_search, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(main_returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(main_borrowBook))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(main_members)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(main_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(main_members, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_books, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(main_borrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(860, 0, 140, 630);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lib.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 630);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(709, 180, 140, 80);

        menu_members.setText("الأعضاء");
        menu_members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_membersMouseClicked(evt);
            }
        });
        menu_members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_membersActionPerformed(evt);
            }
        });
        MenuBar.add(menu_members);

        menu_books.setText("الكتب");

        menu_addBook.setText("اضافه كتاب");
        menu_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_addBookActionPerformed(evt);
            }
        });
        menu_books.add(menu_addBook);

        menu_searchBook.setText("بحث عن كتاب");
        menu_searchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_searchBookMouseClicked(evt);
            }
        });
        menu_books.add(menu_searchBook);

        MenuBar.add(menu_books);

        menu_operations.setText("العمليات");

        jMenuItem3.setText("معرفه الإحصائيات");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_operations.add(jMenuItem3);

        jMenuItem4.setText("تسجيل الخروج");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_operations.add(jMenuItem4);

        MenuBar.add(menu_operations);

        jMenu4.setText("عني");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        MenuBar.add(jMenu4);

        jMenu5.setText("مساعده");
        MenuBar.add(jMenu5);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_addBookActionPerformed
        // TODO add your handling code here:
        if (getEnabledMenu_addBook()) {
            new book().setVisible(true);
        }
    }//GEN-LAST:event_menu_addBookActionPerformed
    member m = new member();
    private void main_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_membersMouseClicked
        // TODO add your handling code here:
        if (getEnabledMain_member() == true) {
            new member().setVisible(true);
        }

    }//GEN-LAST:event_main_membersMouseClicked

    private void main_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_booksMouseClicked
        // TODO add your handling code here:
        if (getEnabledMain_book() == true) {
            new book().setVisible(true);
        }
    }//GEN-LAST:event_main_booksMouseClicked

    private void main_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_searchMouseClicked
        // TODO
        new searchBook().setVisible(true);
    }//GEN-LAST:event_main_searchMouseClicked

    private void main_borrowBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_borrowBookMouseClicked
        // TODO add your handling code here:
        if (getEnabledMain_borrowBook()) {
            new borrow().setVisible(true);
        }
    }//GEN-LAST:event_main_borrowBookMouseClicked

    private void main_returnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_returnBookMouseClicked
        // TODO add your handling code here:
        if (getEnabledMain_returnBook()) {
            new returnBook().setVisible(true);
        }
    }//GEN-LAST:event_main_returnBookMouseClicked

    private void main_logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_logOutMouseClicked
        // TODO add your handling code here:
        dispose();
        new login(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_main_logOutMouseClicked

    private void menu_membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_membersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_membersActionPerformed

    private void menu_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_membersMouseClicked
        // TODO add your handling code here:
        if (getEnabledMenu_member()) {
            new member().setVisible(true);
        }
    }//GEN-LAST:event_menu_membersMouseClicked

    private void menu_searchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_searchBookMouseClicked
        // TODO add your handling code here:
        new searchBook().setVisible(true);
    }//GEN-LAST:event_menu_searchBookMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        dispose();
        new login(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here
        shared.getStatistics();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        new aboutMe(new javax.swing.JFrame(), true).setVisible(true);
        
    }//GEN-LAST:event_jMenu4MouseClicked

    public boolean getEnabledMenu_member() {
        return menu_members.isEnabled();
    }

    public boolean getEnabledMenu_addBook() {
        return menu_addBook.isEnabled();
    }

    public boolean getEnabledMain_returnBook() {
        return main_returnBook.isEnabled();
    }

    public boolean getEnabledMain_member() {
        return main_members.isEnabled();
    }

    public boolean getEnabledMain_book() {
        return main_books.isEnabled();
    }

    public boolean getEnabledMain_search() {
        return main_search.isEnabled();
    }

    public boolean getEnabledMain_borrowBook() {
        return main_borrowBook.isEnabled();
    }

    public void setEnabledMain_returnBook(boolean enable) {
        main_returnBook.setEnabled(enable);
    }

    public void setEnabledMain_books(boolean enable) {
        main_books.setEnabled(enable);
    }

    public void setEnabledMain_borrow(boolean enable) {
        main_borrowBook.setEnabled(enable);
    }

    public void setEnabledMain_return(boolean enable) {
        main_returnBook.setEnabled(enable);
    }

    public void setEnabledMenu_member(boolean enable) {
        menu_members.setEnabled(enable);
    }

    public void setEnabledMenu_addBook(boolean enable) {
        menu_addBook.setEnabled(enable);
    }

    public void setEnabledMain_member(boolean enable) {
        main_members.setVisible(enable);
    }

    public void setEnabledMenu_operations(boolean enable) {
        menu_operations.setEnabled(enable);
    }

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel main_books;
    private javax.swing.JLabel main_borrowBook;
    private javax.swing.JLabel main_logOut;
    private javax.swing.JLabel main_members;
    private javax.swing.JLabel main_returnBook;
    private javax.swing.JLabel main_search;
    private javax.swing.JMenuItem menu_addBook;
    private javax.swing.JMenu menu_books;
    private javax.swing.JMenu menu_members;
    private javax.swing.JMenu menu_operations;
    private javax.swing.JMenuItem menu_searchBook;
    // End of variables declaration//GEN-END:variables
}
