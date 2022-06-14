/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electionspoo.gui;

import electionspoo.beans.candidate.CandidateList;
import electionspoo.beans.election.ElectionManager;
import electionspoo.beans.elector.ElectorList;
import electionspoo.utils.MainUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 0102388
 */
public class GUIMainMenu extends javax.swing.JFrame {
    
   
    /**
     * Creates new form Menu
     */
    public GUIMainMenu() throws Exception {
        initComponents();
        ElectorList electorList = new ElectorList();
        CandidateList candidateList = new CandidateList();  
        ElectionManager electionManager = new ElectionManager();
        
        electorList.load(MainUtils.electorFilePath);
        candidateList.load(MainUtils.candidateFilePath);
        electionManager.load(MainUtils.electionFilePath);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenu = new javax.swing.JPanel();
        MainMenuBtnConfi = new javax.swing.JButton();
        MainMenuBtnVotar = new javax.swing.JButton();
        MainMenuBtnResults = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        MenuBarEleicoes = new javax.swing.JMenu();
        MenuBarEleicoesConfig = new javax.swing.JMenuItem();
        MenuBarEleicoesVotar = new javax.swing.JMenuItem();
        MenuBarEleicoesResults = new javax.swing.JMenuItem();
        MenuBarEleicoesSepara = new javax.swing.JPopupMenu.Separator();
        MenuBarEleicoesSair = new javax.swing.JMenuItem();
        MenuBarApp = new javax.swing.JMenu();
        MenuBarAppAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainMenu.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        MainMenuBtnConfi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/config.png"))); // NOI18N
        MainMenuBtnConfi.setText("Configurar Eleição");
        MainMenuBtnConfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnConfiActionPerformed(evt);
            }
        });
        MainMenu.add(MainMenuBtnConfi);

        MainMenuBtnVotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/vote.png"))); // NOI18N
        MainMenuBtnVotar.setText("Votar");
        MainMenuBtnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnVotarActionPerformed(evt);
            }
        });
        MainMenu.add(MainMenuBtnVotar);

        MainMenuBtnResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/results.png"))); // NOI18N
        MainMenuBtnResults.setText("Resultados");
        MainMenuBtnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnResultsActionPerformed(evt);
            }
        });
        MainMenu.add(MainMenuBtnResults);

        MenuBarEleicoes.setText("Eleições");

        MenuBarEleicoesConfig.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuBarEleicoesConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/config_24.png"))); // NOI18N
        MenuBarEleicoesConfig.setText("Configurar");
        MenuBarEleicoesConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBarEleicoesConfigActionPerformed(evt);
            }
        });
        MenuBarEleicoes.add(MenuBarEleicoesConfig);

        MenuBarEleicoesVotar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuBarEleicoesVotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/vote_24.png"))); // NOI18N
        MenuBarEleicoesVotar.setText("Votar");
        MenuBarEleicoesVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBarEleicoesVotarActionPerformed(evt);
            }
        });
        MenuBarEleicoes.add(MenuBarEleicoesVotar);

        MenuBarEleicoesResults.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuBarEleicoesResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/results_24.png"))); // NOI18N
        MenuBarEleicoesResults.setText("Resultados");
        MenuBarEleicoesResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBarEleicoesResultsActionPerformed(evt);
            }
        });
        MenuBarEleicoes.add(MenuBarEleicoesResults);
        MenuBarEleicoes.add(MenuBarEleicoesSepara);

        MenuBarEleicoesSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuBarEleicoesSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/exit_24.png"))); // NOI18N
        MenuBarEleicoesSair.setText("Sair");
        MenuBarEleicoesSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBarEleicoesSairActionPerformed(evt);
            }
        });
        MenuBarEleicoes.add(MenuBarEleicoesSair);

        MenuBar.add(MenuBarEleicoes);

        MenuBarApp.setText("Aplicação");

        MenuBarAppAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/about_24.png"))); // NOI18N
        MenuBarAppAcerca.setText("Acerca de");
        MenuBarAppAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBarAppAcercaActionPerformed(evt);
            }
        });
        MenuBarApp.add(MenuBarAppAcerca);

        MenuBar.add(MenuBarApp);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuBarEleicoesVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBarEleicoesVotarActionPerformed
        // TODO add your handling code here:
        try {
            GUIVote dialog = new GUIVote(this, true);
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_MenuBarEleicoesVotarActionPerformed

    private void MenuBarAppAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBarAppAcercaActionPerformed
        // TODO add your handling code here:
        try {
            GUIAbout dialog = new GUIAbout(this, true);
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_MenuBarAppAcercaActionPerformed

    private void MenuBarEleicoesSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBarEleicoesSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MenuBarEleicoesSairActionPerformed

    private void MainMenuBtnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnVotarActionPerformed
        // TODO add your handling code here:
        try {
            GUIVote dialog = new GUIVote(this, true);
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_MainMenuBtnVotarActionPerformed

    private void MenuBarEleicoesResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBarEleicoesResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBarEleicoesResultsActionPerformed

    private void MainMenuBtnConfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnConfiActionPerformed
        try {
            // TODO add your handling code here:
            GUIConfig dialog = new GUIConfig();
            dialog.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(GUIMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MainMenuBtnConfiActionPerformed

    private void MenuBarEleicoesConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBarEleicoesConfigActionPerformed
        // TODO add your handling code here:

        try {
            GUIConfig dialog = new GUIConfig();
            dialog.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(GUIMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_MenuBarEleicoesConfigActionPerformed

    private void MainMenuBtnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnResultsActionPerformed
        // TODO add your handling code here:
        GUIResults dialog = new GUIResults(this, true);
        dialog.setVisible(true);
      
    }//GEN-LAST:event_MainMenuBtnResultsActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUIMainMenu().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GUIMainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton MainMenuBtnConfi;
    private javax.swing.JButton MainMenuBtnResults;
    private javax.swing.JButton MainMenuBtnVotar;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuBarApp;
    private javax.swing.JMenuItem MenuBarAppAcerca;
    private javax.swing.JMenu MenuBarEleicoes;
    private javax.swing.JMenuItem MenuBarEleicoesConfig;
    private javax.swing.JMenuItem MenuBarEleicoesResults;
    private javax.swing.JMenuItem MenuBarEleicoesSair;
    private javax.swing.JPopupMenu.Separator MenuBarEleicoesSepara;
    private javax.swing.JMenuItem MenuBarEleicoesVotar;
    // End of variables declaration//GEN-END:variables
}
