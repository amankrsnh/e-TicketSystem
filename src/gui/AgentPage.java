/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aman.gui;

import com.aman.pojo.User;
import javax.swing.JOptionPane;

/**
 *
 * @author vivek
 */
public class AgentPage extends javax.swing.JFrame {

    /**
     * Creates new form AgentPage
     */
    User user;
    public AgentPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        advertlabel1.setText("Bookings Made Easier");
    }
    public AgentPage(User user) {
        this();
        this.user=user;
        WelcomeLabel1.setText("Hello "+user.getUsername());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        advertlabel1 = new javax.swing.JLabel();
        WelcomeLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        EventsMenu = new javax.swing.JMenu();
        ViewEventsMenu = new javax.swing.JMenuItem();
        AddEventsMenu = new javax.swing.JMenuItem();
        bookings = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        advertlabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        advertlabel1.setForeground(new java.awt.Color(204, 204, 204));
        advertlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        advertlabel1.setText("Bookings Made Easier");

        WelcomeLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        WelcomeLabel1.setForeground(new java.awt.Color(0, 153, 0));
        WelcomeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel1.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aman/images/soccer-field-top-view-empty-football-stadium-vector-20649350.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(advertlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(WelcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(WelcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(advertlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setOpaque(false);

        homeMenu.setBackground(new java.awt.Color(0, 0, 0));
        homeMenu.setText("Home");
        homeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(homeMenu);

        EventsMenu.setBackground(new java.awt.Color(0, 0, 0));
        EventsMenu.setText("Events");

        ViewEventsMenu.setText("View Events");
        ViewEventsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEventsMenuActionPerformed(evt);
            }
        });
        EventsMenu.add(ViewEventsMenu);

        AddEventsMenu.setText("Add Events");
        AddEventsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEventsMenuActionPerformed(evt);
            }
        });
        EventsMenu.add(AddEventsMenu);

        jMenuBar1.add(EventsMenu);

        bookings.setText("Bookings");
        bookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingsMouseClicked(evt);
            }
        });
        jMenuBar1.add(bookings);

        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(Logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuActionPerformed
        // TODO add your handling code here:
        new AgentPage(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMenuActionPerformed

    private void ViewEventsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEventsMenuActionPerformed
        // TODO add your handling code here:
        new ViewEvents(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewEventsMenuActionPerformed

    private void AddEventsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEventsMenuActionPerformed
        new AddEvents(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddEventsMenuActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        int ans;
        ans = JOptionPane.showConfirmDialog(this,"Do you want to logout!","Logout",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(ans==JOptionPane.OK_OPTION)
        {
            new Login().setVisible(true);
            this.dispose();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void bookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsMouseClicked
        // TODO add your handling code here:
        new seeBookings(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookingsMouseClicked

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
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddEventsMenu;
    private javax.swing.JMenu EventsMenu;
    private javax.swing.JMenu Logout;
    private javax.swing.JMenuItem ViewEventsMenu;
    private javax.swing.JLabel WelcomeLabel1;
    private javax.swing.JLabel advertlabel1;
    private javax.swing.JMenu bookings;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}