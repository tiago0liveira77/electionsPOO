/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package electionspoo.gui;

import electionspoo.beans.ElectorBean;
import electionspoo.bo.ElectorBO;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;

/**
 *
 * @author Tiago
 */
public class GUIElector extends javax.swing.JDialog {

    /**
     * Creates new form GUIElector
     */
    public GUIElector(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GUIElectorBtnSave = new javax.swing.JButton();
        GUIElectorBtnOpen = new javax.swing.JButton();
        GUIElectorBtnNew = new javax.swing.JButton();
        GUIElectorBtnSort = new javax.swing.JButton();
        GUIElectorBtnSearch = new javax.swing.JButton();
        GUIElectorBtnClose = new javax.swing.JButton();
        GUIElectorPanelElectorList = new javax.swing.JScrollPane();
        GUIElectorList = new javax.swing.JList<>();
        GUIElectorPanelBottomNav = new javax.swing.JPanel();
        GUIElectorBtnFirst = new javax.swing.JButton();
        GUIElectorBtnPrev = new javax.swing.JButton();
        GUIElectorBtnNext = new javax.swing.JButton();
        GUIElectorBtnLast = new javax.swing.JButton();
        GUIElectorPanelElector = new javax.swing.JPanel();
        GUIElectorTxtBoxName = new javax.swing.JTextField();
        GUIElectorTxtBoxCC = new javax.swing.JTextField();
        GUIElectorGender = new javax.swing.JComboBox<>();
        GUIElectorBtnNewElector = new javax.swing.JButton();
        GUIElectorBtnDeleteElector = new javax.swing.JButton();
        GUIElectorBtnRandomElector = new javax.swing.JButton();
        GUIElectorPanelImage = new javax.swing.JPanel();
        GUIElectorLabel2Image = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GUIElectorTxtBoxBirth = new javax.swing.JTextField();
        GUIElectorTxtBoxPw = new javax.swing.JTextField();
        GUIElectorTxtBoxPw2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        GUIElectorBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/save_file.png"))); // NOI18N
        GUIElectorBtnSave.setText("Guardar");
        GUIElectorBtnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIElectorBtnSave.setVerifyInputWhenFocusTarget(false);
        GUIElectorBtnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        GUIElectorBtnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/open_file.png"))); // NOI18N
        GUIElectorBtnOpen.setText("Abrir");
        GUIElectorBtnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIElectorBtnOpen.setVerifyInputWhenFocusTarget(false);
        GUIElectorBtnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        GUIElectorBtnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/newElection.png"))); // NOI18N
        GUIElectorBtnNew.setText("Novo");
        GUIElectorBtnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIElectorBtnNew.setVerifyInputWhenFocusTarget(false);
        GUIElectorBtnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        GUIElectorBtnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/sort.png"))); // NOI18N
        GUIElectorBtnSort.setText("Ordenar");
        GUIElectorBtnSort.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIElectorBtnSort.setVerifyInputWhenFocusTarget(false);
        GUIElectorBtnSort.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        GUIElectorBtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_find.png"))); // NOI18N
        GUIElectorBtnSearch.setText("Pesquisar");
        GUIElectorBtnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIElectorBtnSearch.setVerifyInputWhenFocusTarget(false);
        GUIElectorBtnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        GUIElectorBtnClose.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tiago\\Documents\\GitHub\\electionsPOO\\electionsPOO\\src\\electionspoo\\multimedia\\exit.png")); // NOI18N
        GUIElectorBtnClose.setText("Sair");
        GUIElectorBtnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIElectorBtnClose.setVerifyInputWhenFocusTarget(false);
        GUIElectorBtnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIElectorBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorBtnCloseActionPerformed(evt);
            }
        });

        GUIElectorPanelElectorList.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Eleitores"));

        GUIElectorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        GUIElectorPanelElectorList.setViewportView(GUIElectorList);

        GUIElectorPanelBottomNav.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        GUIElectorBtnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_first.png"))); // NOI18N

        GUIElectorBtnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_prev.png"))); // NOI18N

        GUIElectorBtnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_last.png"))); // NOI18N

        GUIElectorBtnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_next.png"))); // NOI18N

        javax.swing.GroupLayout GUIElectorPanelBottomNavLayout = new javax.swing.GroupLayout(GUIElectorPanelBottomNav);
        GUIElectorPanelBottomNav.setLayout(GUIElectorPanelBottomNavLayout);
        GUIElectorPanelBottomNavLayout.setHorizontalGroup(
            GUIElectorPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIElectorPanelBottomNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GUIElectorBtnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GUIElectorBtnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(GUIElectorBtnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GUIElectorBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        GUIElectorPanelBottomNavLayout.setVerticalGroup(
            GUIElectorPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIElectorPanelBottomNavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUIElectorPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIElectorBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GUIElectorBtnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GUIElectorPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GUIElectorBtnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GUIElectorBtnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        GUIElectorPanelElector.setBorder(javax.swing.BorderFactory.createTitledBorder("Eleitor"));

        GUIElectorTxtBoxName.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        GUIElectorTxtBoxCC.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartão de Cidadão"));
        GUIElectorTxtBoxCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorTxtBoxCCActionPerformed(evt);
            }
        });

        GUIElectorGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", " " }));

        GUIElectorBtnNewElector.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tiago\\Documents\\GitHub\\electionsPOO\\electionsPOO\\src\\electionspoo\\multimedia\\nav_add.png")); // NOI18N
        GUIElectorBtnNewElector.setText("Novo");
        GUIElectorBtnNewElector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorBtnNewElectorActionPerformed(evt);
            }
        });

        GUIElectorBtnDeleteElector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_delete.png"))); // NOI18N
        GUIElectorBtnDeleteElector.setText("Eliminar");

        GUIElectorBtnRandomElector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_update.png"))); // NOI18N
        GUIElectorBtnRandomElector.setText("Gerar Aleatório");

        GUIElectorPanelImage.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        GUIElectorLabel2Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GUIElectorLabel2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/about.png"))); // NOI18N

        javax.swing.GroupLayout GUIElectorPanelImageLayout = new javax.swing.GroupLayout(GUIElectorPanelImage);
        GUIElectorPanelImage.setLayout(GUIElectorPanelImageLayout);
        GUIElectorPanelImageLayout.setHorizontalGroup(
            GUIElectorPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUIElectorLabel2Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GUIElectorPanelImageLayout.setVerticalGroup(
            GUIElectorPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUIElectorLabel2Image, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        jLabel8.setText("Idade..");

        GUIElectorTxtBoxBirth.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));

        GUIElectorTxtBoxPw.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        GUIElectorTxtBoxPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorTxtBoxPwActionPerformed(evt);
            }
        });

        GUIElectorTxtBoxPw2.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirmar Password"));

        javax.swing.GroupLayout GUIElectorPanelElectorLayout = new javax.swing.GroupLayout(GUIElectorPanelElector);
        GUIElectorPanelElector.setLayout(GUIElectorPanelElectorLayout);
        GUIElectorPanelElectorLayout.setHorizontalGroup(
            GUIElectorPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIElectorPanelElectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUIElectorPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIElectorTxtBoxName)
                    .addGroup(GUIElectorPanelElectorLayout.createSequentialGroup()
                        .addGroup(GUIElectorPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GUIElectorBtnNewElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GUIElectorTxtBoxCC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GUIElectorGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GUIElectorTxtBoxBirth, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GUIElectorTxtBoxPw, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GUIElectorTxtBoxPw2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GUIElectorBtnRandomElector, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(GUIElectorPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GUIElectorPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(GUIElectorBtnDeleteElector, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GUIElectorPanelElectorLayout.setVerticalGroup(
            GUIElectorPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIElectorPanelElectorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(GUIElectorTxtBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(GUIElectorPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GUIElectorPanelElectorLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GUIElectorPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GUIElectorPanelElectorLayout.createSequentialGroup()
                        .addComponent(GUIElectorTxtBoxCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(GUIElectorGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GUIElectorTxtBoxBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(GUIElectorTxtBoxPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(GUIElectorTxtBoxPw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GUIElectorBtnRandomElector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GUIElectorPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUIElectorBtnDeleteElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIElectorBtnNewElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GUIElectorBtnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUIElectorBtnOpen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUIElectorBtnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUIElectorBtnSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUIElectorBtnSearch)
                        .addGap(18, 359, Short.MAX_VALUE)
                        .addComponent(GUIElectorBtnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GUIElectorPanelElectorList)
                            .addComponent(GUIElectorPanelBottomNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GUIElectorPanelElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUIElectorBtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIElectorBtnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIElectorBtnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIElectorBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIElectorBtnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIElectorBtnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GUIElectorPanelElectorList, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GUIElectorPanelBottomNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GUIElectorPanelElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUIElectorBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorBtnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_GUIElectorBtnCloseActionPerformed

    private void GUIElectorTxtBoxCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorTxtBoxCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUIElectorTxtBoxCCActionPerformed

    private void GUIElectorBtnNewElectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorBtnNewElectorActionPerformed
        
         try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
           
            ElectorBO.saveElectorOnFile(new ElectorBean(GUIElectorTxtBoxName.getText(), GUIElectorTxtBoxCC.getText(), GUIElectorGender.toString().charAt(0), sdf.parse(GUIElectorTxtBoxBirth.getText()), GUIElectorTxtBoxPw.getText(), GUIElectorLabel2Image.getIcon()));

            
        } catch (ParseException | IOException  ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GUIElectorBtnNewElectorActionPerformed

    private void GUIElectorTxtBoxPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorTxtBoxPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUIElectorTxtBoxPwActionPerformed

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
            java.util.logging.Logger.getLogger(GUIElector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIElector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIElector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIElector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIElector dialog = new GUIElector(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void saveElector() throws FileNotFoundException, IOException, ClassNotFoundException{
        try {
            SimpleDateFormat formatter1=new SimpleDateFormat("dd/mm/yyyy");
            String nome = GUIElectorTxtBoxName.getText();
            String CC = GUIElectorTxtBoxCC.getText();
            String gender = GUIElectorGender.getItemAt(0);
            Date birth = formatter1.parse(GUIElectorTxtBoxBirth.getText());
            String pw = GUIElectorTxtBoxPw.getText();
            String pw2 = GUIElectorTxtBoxPw2.getText();
            Icon photo = GUIElectorLabel2Image.getIcon();
           
            ElectorBean elector = new ElectorBean(nome, CC, 'M', birth, pw, photo);
            
            
            ElectorBO.saveElectorOnFile(elector);
            ElectorBO.getElectorFromFile();
            
        } catch (ParseException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GUIElectorBtnClose;
    private javax.swing.JButton GUIElectorBtnDeleteElector;
    private javax.swing.JButton GUIElectorBtnFirst;
    private javax.swing.JButton GUIElectorBtnLast;
    private javax.swing.JButton GUIElectorBtnNew;
    private javax.swing.JButton GUIElectorBtnNewElector;
    private javax.swing.JButton GUIElectorBtnNext;
    private javax.swing.JButton GUIElectorBtnOpen;
    private javax.swing.JButton GUIElectorBtnPrev;
    private javax.swing.JButton GUIElectorBtnRandomElector;
    private javax.swing.JButton GUIElectorBtnSave;
    private javax.swing.JButton GUIElectorBtnSearch;
    private javax.swing.JButton GUIElectorBtnSort;
    private javax.swing.JComboBox<String> GUIElectorGender;
    private javax.swing.JLabel GUIElectorLabel2Image;
    private javax.swing.JList<String> GUIElectorList;
    private javax.swing.JPanel GUIElectorPanelBottomNav;
    private javax.swing.JPanel GUIElectorPanelElector;
    private javax.swing.JScrollPane GUIElectorPanelElectorList;
    private javax.swing.JPanel GUIElectorPanelImage;
    private javax.swing.JTextField GUIElectorTxtBoxBirth;
    private javax.swing.JTextField GUIElectorTxtBoxCC;
    private javax.swing.JTextField GUIElectorTxtBoxName;
    private javax.swing.JTextField GUIElectorTxtBoxPw;
    private javax.swing.JTextField GUIElectorTxtBoxPw2;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
