/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package electionspoo.gui;

import electionspoo.beans.candidate.CandidateBean;
import electionspoo.beans.candidate.CandidateList;
import electionspoo.utils.MainUtils;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class GUICandidate extends javax.swing.JDialog {

    private int GUIListSelectedIndex = 0;

    //lista todos os electors guardados no ficheiro
    private void updateGUIList() {
        int tempSelectedIndex = GUIListSelectedIndex;
        MainUtils.listaGUICandidate.removeAllElements();
        for (int i = 0; i < CandidateList.getList().size(); i++) {
            if(!CandidateList.getList().get(i).getName().equals(MainUtils.blankCandidateName))
                MainUtils.listaGUICandidate.addElement(CandidateList.getGUIListLine(CandidateList.getList().get(i)));
        }
        GUICandList.setSelectedIndex(tempSelectedIndex);
    }

    /**
     * Creates new form GUIElector
     *
     * @param parent
     * @param modal
     * @param candidatesList
     */
    public GUICandidate(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        GUICandList.setModel(MainUtils.listaGUICandidate);  
        updateGUIList();
        GUICandList.setSelectedIndex(GUIListSelectedIndex);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogFileChooser = new javax.swing.JDialog();
        GUICandBtnSave = new javax.swing.JButton();
        GUICandBtnOpen = new javax.swing.JButton();
        GUICandBtnNew = new javax.swing.JButton();
        GUICandBtnSearch = new javax.swing.JButton();
        GUICandBtnClose = new javax.swing.JButton();
        GUICandPanelCandList = new javax.swing.JScrollPane();
        GUICandList = new javax.swing.JList<>();
        GUICandPanelBottomNav = new javax.swing.JPanel();
        GUIElectorBtnFirst = new javax.swing.JButton();
        GUIElectorBtnPrev = new javax.swing.JButton();
        GUIElectorBtnNext = new javax.swing.JButton();
        GUIElectorBtnLast = new javax.swing.JButton();
        GUICandPanelElector = new javax.swing.JPanel();
        GUICandTxtBoxName = new javax.swing.JTextField();
        GUICandTxtBoxInitials = new javax.swing.JTextField();
        GUICandBtnNewCand = new javax.swing.JButton();
        GUICandBtnDeleteCand = new javax.swing.JButton();
        GUICandPanelImage = new javax.swing.JPanel();
        GUICandLabel2Image = new javax.swing.JLabel();
        GUICandBtnUp = new javax.swing.JButton();
        GUICandBtnDown = new javax.swing.JButton();
        GUICandTxtBoxSearch = new javax.swing.JTextField();

        javax.swing.GroupLayout DialogFileChooserLayout = new javax.swing.GroupLayout(DialogFileChooser.getContentPane());
        DialogFileChooser.getContentPane().setLayout(DialogFileChooserLayout);
        DialogFileChooserLayout.setHorizontalGroup(
            DialogFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DialogFileChooserLayout.setVerticalGroup(
            DialogFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        GUICandBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/save_file.png"))); // NOI18N
        GUICandBtnSave.setText("Guardar");
        GUICandBtnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUICandBtnSave.setVerifyInputWhenFocusTarget(false);
        GUICandBtnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUICandBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnSaveActionPerformed(evt);
            }
        });

        GUICandBtnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/open_file.png"))); // NOI18N
        GUICandBtnOpen.setText("Abrir");
        GUICandBtnOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUICandBtnOpen.setVerifyInputWhenFocusTarget(false);
        GUICandBtnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUICandBtnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnOpenActionPerformed(evt);
            }
        });

        GUICandBtnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/newElection.png"))); // NOI18N
        GUICandBtnNew.setText("Novo");
        GUICandBtnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUICandBtnNew.setVerifyInputWhenFocusTarget(false);
        GUICandBtnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUICandBtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnNewActionPerformed(evt);
            }
        });

        GUICandBtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_find.png"))); // NOI18N
        GUICandBtnSearch.setText("Pesquisar");
        GUICandBtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUICandBtnSearch.setVerifyInputWhenFocusTarget(false);
        GUICandBtnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUICandBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnSearchActionPerformed(evt);
            }
        });

        GUICandBtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/exit.png"))); // NOI18N
        GUICandBtnClose.setText("Sair");
        GUICandBtnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUICandBtnClose.setVerifyInputWhenFocusTarget(false);
        GUICandBtnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUICandBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnCloseActionPerformed(evt);
            }
        });

        GUICandPanelCandList.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Candidatos"));

        GUICandList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                GUICandListValueChanged(evt);
            }
        });
        GUICandPanelCandList.setViewportView(GUICandList);

        GUICandPanelBottomNav.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        GUIElectorBtnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_first.png"))); // NOI18N
        GUIElectorBtnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIElectorBtnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorBtnFirstActionPerformed(evt);
            }
        });

        GUIElectorBtnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_prev.png"))); // NOI18N
        GUIElectorBtnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIElectorBtnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorBtnPrevActionPerformed(evt);
            }
        });

        GUIElectorBtnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_last.png"))); // NOI18N
        GUIElectorBtnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIElectorBtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorBtnNextActionPerformed(evt);
            }
        });

        GUIElectorBtnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_next.png"))); // NOI18N
        GUIElectorBtnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIElectorBtnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIElectorBtnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GUICandPanelBottomNavLayout = new javax.swing.GroupLayout(GUICandPanelBottomNav);
        GUICandPanelBottomNav.setLayout(GUICandPanelBottomNavLayout);
        GUICandPanelBottomNavLayout.setHorizontalGroup(
            GUICandPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUICandPanelBottomNavLayout.createSequentialGroup()
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
        GUICandPanelBottomNavLayout.setVerticalGroup(
            GUICandPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUICandPanelBottomNavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUICandPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIElectorBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GUIElectorBtnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GUICandPanelBottomNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GUIElectorBtnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GUIElectorBtnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        GUICandPanelElector.setBorder(javax.swing.BorderFactory.createTitledBorder("Candidato"));

        GUICandTxtBoxName.setText("Partido A");
        GUICandTxtBoxName.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        GUICandTxtBoxName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GUICandTxtBoxNameKeyReleased(evt);
            }
        });

        GUICandTxtBoxInitials.setText("PRA");
        GUICandTxtBoxInitials.setBorder(javax.swing.BorderFactory.createTitledBorder("Sigla"));
        GUICandTxtBoxInitials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandTxtBoxInitialsActionPerformed(evt);
            }
        });
        GUICandTxtBoxInitials.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GUICandTxtBoxInitialsKeyReleased(evt);
            }
        });

        GUICandBtnNewCand.setText("Novo");
        GUICandBtnNewCand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnNewCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnNewCandActionPerformed(evt);
            }
        });

        GUICandBtnDeleteCand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_delete.png"))); // NOI18N
        GUICandBtnDeleteCand.setText("Eliminar");
        GUICandBtnDeleteCand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnDeleteCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnDeleteCandActionPerformed(evt);
            }
        });

        GUICandPanelImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Fotografia"));

        GUICandLabel2Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GUICandLabel2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/about.png"))); // NOI18N

        javax.swing.GroupLayout GUICandPanelImageLayout = new javax.swing.GroupLayout(GUICandPanelImage);
        GUICandPanelImage.setLayout(GUICandPanelImageLayout);
        GUICandPanelImageLayout.setHorizontalGroup(
            GUICandPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUICandLabel2Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GUICandPanelImageLayout.setVerticalGroup(
            GUICandPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUICandLabel2Image, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        GUICandBtnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_up.png"))); // NOI18N
        GUICandBtnUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUICandBtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnUpActionPerformed(evt);
            }
        });

        GUICandBtnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_down.png"))); // NOI18N
        GUICandBtnDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUICandBtnDown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUICandBtnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandBtnDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GUICandPanelElectorLayout = new javax.swing.GroupLayout(GUICandPanelElector);
        GUICandPanelElector.setLayout(GUICandPanelElectorLayout);
        GUICandPanelElectorLayout.setHorizontalGroup(
            GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUICandPanelElectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUICandTxtBoxName)
                    .addGroup(GUICandPanelElectorLayout.createSequentialGroup()
                        .addGroup(GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GUICandBtnNewCand, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(GUICandTxtBoxInitials, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GUICandPanelElectorLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(GUICandBtnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GUICandBtnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GUICandPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GUICandBtnDeleteCand, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GUICandPanelElectorLayout.setVerticalGroup(
            GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUICandPanelElectorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(GUICandTxtBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GUICandPanelElectorLayout.createSequentialGroup()
                        .addComponent(GUICandTxtBoxInitials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(GUICandBtnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GUICandBtnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GUICandPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(GUICandPanelElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUICandBtnDeleteCand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUICandBtnNewCand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        GUICandTxtBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUICandTxtBoxSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GUICandBtnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUICandBtnOpen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUICandBtnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUICandBtnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUICandTxtBoxSearch)
                        .addGap(12, 12, 12)
                        .addComponent(GUICandBtnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GUICandPanelCandList)
                            .addComponent(GUICandPanelBottomNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GUICandPanelElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUICandBtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUICandBtnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUICandBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUICandBtnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUICandBtnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUICandTxtBoxSearch))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GUICandPanelCandList, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(GUICandPanelBottomNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GUICandPanelElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUICandBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_GUICandBtnCloseActionPerformed

    private void GUICandBtnNewCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnNewCandActionPerformed
        // TODO add your handling code here:
        //CandidateBean candidateBean = new CandidateBean(GUICandTxtBoxName.getText(), GUICandTxtBoxInitials.getText());
        CandidateList.getList().add(new CandidateBean());
        updateGUIList();
        GUICandList.setSelectedIndex(CandidateList.getList().size() - 1);
    }//GEN-LAST:event_GUICandBtnNewCandActionPerformed

    private void GUICandTxtBoxInitialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandTxtBoxInitialsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUICandTxtBoxInitialsActionPerformed

    private void GUICandBtnDeleteCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnDeleteCandActionPerformed
        // TODO add your handling code here:

        int deleteUserConfirmation = JOptionPane.showConfirmDialog(DialogFileChooser, "Tem a certeza que pretende eliminar este registo?", "Eliminar eleitor", JOptionPane.YES_NO_OPTION);

        try {
            CandidateList.deleteCandidateFromList(CandidateList.getList(), GUIListSelectedIndex);
            updateGUIList();
            GUICandList.setSelectedIndex(0);
        } catch (IOException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GUICandBtnDeleteCandActionPerformed

    private void GUICandListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_GUICandListValueChanged
        // TODO add your handling code here:
        int selections[] = GUICandList.getSelectedIndices();
        GUIListSelectedIndex = GUICandList.getSelectedIndex();
        for (int i = 0, n = selections.length; i < n; i++) {
            GUICandTxtBoxName.setText(CandidateList.getList().get(selections[i]).getName());
            GUICandTxtBoxInitials.setText(CandidateList.getList().get(selections[i]).getInitials());
        }
    }//GEN-LAST:event_GUICandListValueChanged

    private void GUIElectorBtnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorBtnLastActionPerformed
        // TODO add your handling code here:
        if (GUIListSelectedIndex < CandidateList.getList().size() - 1) {
            GUIListSelectedIndex++;
            GUICandList.setSelectedIndex(GUIListSelectedIndex);
        }

    }//GEN-LAST:event_GUIElectorBtnLastActionPerformed

    private void GUIElectorBtnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorBtnFirstActionPerformed
        // TODO add your handling code here:
        GUICandList.setSelectedIndex(0);
    }//GEN-LAST:event_GUIElectorBtnFirstActionPerformed

    private void GUIElectorBtnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorBtnPrevActionPerformed
        // TODO add your handling code here:
        if (GUIListSelectedIndex > 0) {
            GUIListSelectedIndex--;
            GUICandList.setSelectedIndex(GUIListSelectedIndex);
        }
    }//GEN-LAST:event_GUIElectorBtnPrevActionPerformed

    private void GUIElectorBtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIElectorBtnNextActionPerformed
        // TODO add your handling code here:
        GUICandList.setSelectedIndex(CandidateList.getList().size() - 1);
    }//GEN-LAST:event_GUIElectorBtnNextActionPerformed

    private void GUICandBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnSaveActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fileChooser = new JFileChooser();
            CandidateList candidateList = new CandidateList();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showOpenDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                candidateList.save(selectedFile);
            }
        } catch (IOException | ClassNotFoundException | ParseException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GUICandidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GUICandBtnSaveActionPerformed

    private void GUICandBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnNewActionPerformed
        // TODO add your handling code here:
        CandidateList.getList().clear();
        updateGUIList();
    }//GEN-LAST:event_GUICandBtnNewActionPerformed

    private void GUICandBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnSearchActionPerformed

        String textToSearch = GUICandTxtBoxSearch.getText();

        int index;

        index = CandidateList.searchCandidateByName(CandidateList.getList(), textToSearch);
        if (!(MainUtils.isNullOrEmpty(String.valueOf(index)))) {
            GUICandList.setSelectedIndex(index);
        } else {
            index = CandidateList.searchCandidateByInitials(CandidateList.getList(), textToSearch);
            if (!(MainUtils.isNullOrEmpty(String.valueOf(index)))) {
                GUICandList.setSelectedIndex(index);
            } else {
                System.out.println("Não há registos a encontrar para a string: " + textToSearch);
            }
        }

    }//GEN-LAST:event_GUICandBtnSearchActionPerformed

    private void GUICandBtnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnOpenActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fileChooser = new JFileChooser();
            CandidateList candidateList = new CandidateList();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showOpenDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                candidateList.load(selectedFile);
                updateGUIList();
            }
        } catch (IOException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GUICandidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GUICandBtnOpenActionPerformed

    private void GUICandTxtBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandTxtBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUICandTxtBoxSearchActionPerformed

    private void GUICandBtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnUpActionPerformed
        // TODO add your handling code here:
        if (GUIListSelectedIndex > 0) {
            GUIListSelectedIndex--;
            GUICandList.setSelectedIndex(GUIListSelectedIndex);
        }
    }//GEN-LAST:event_GUICandBtnUpActionPerformed

    private void GUICandBtnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUICandBtnDownActionPerformed
        // TODO add your handling code here:
        if (GUIListSelectedIndex < CandidateList.getList().size() - 1) {
            GUIListSelectedIndex++;
            GUICandList.setSelectedIndex(GUIListSelectedIndex);
        }
    }//GEN-LAST:event_GUICandBtnDownActionPerformed

    private void GUICandTxtBoxNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GUICandTxtBoxNameKeyReleased
        // TODO add your handling code here:
        if(GUICandTxtBoxName.getText() != CandidateList.getList().get(GUIListSelectedIndex).getName()){
            CandidateList.getList().get(GUIListSelectedIndex).setName(GUICandTxtBoxName.getText());
            updateGUIList();
        }
    }//GEN-LAST:event_GUICandTxtBoxNameKeyReleased

    private void GUICandTxtBoxInitialsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GUICandTxtBoxInitialsKeyReleased
        // TODO add your handling code here:
        if(GUICandTxtBoxInitials.getText() != CandidateList.getList().get(GUIListSelectedIndex).getInitials()){
            CandidateList.getList().get(GUIListSelectedIndex).setInitials(GUICandTxtBoxInitials.getText());
            updateGUIList();
        }
    }//GEN-LAST:event_GUICandTxtBoxInitialsKeyReleased

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
            java.util.logging.Logger.getLogger(GUICandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUICandidate dialog = new GUICandidate(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GUICandidate.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogFileChooser;
    private javax.swing.JButton GUICandBtnClose;
    private javax.swing.JButton GUICandBtnDeleteCand;
    private javax.swing.JButton GUICandBtnDown;
    private javax.swing.JButton GUICandBtnNew;
    private javax.swing.JButton GUICandBtnNewCand;
    private javax.swing.JButton GUICandBtnOpen;
    private javax.swing.JButton GUICandBtnSave;
    private javax.swing.JButton GUICandBtnSearch;
    private javax.swing.JButton GUICandBtnUp;
    private javax.swing.JLabel GUICandLabel2Image;
    private javax.swing.JList<String> GUICandList;
    private javax.swing.JPanel GUICandPanelBottomNav;
    private javax.swing.JScrollPane GUICandPanelCandList;
    private javax.swing.JPanel GUICandPanelElector;
    private javax.swing.JPanel GUICandPanelImage;
    private javax.swing.JTextField GUICandTxtBoxInitials;
    private javax.swing.JTextField GUICandTxtBoxName;
    private javax.swing.JTextField GUICandTxtBoxSearch;
    private javax.swing.JButton GUIElectorBtnFirst;
    private javax.swing.JButton GUIElectorBtnLast;
    private javax.swing.JButton GUIElectorBtnNext;
    private javax.swing.JButton GUIElectorBtnPrev;
    // End of variables declaration//GEN-END:variables
}
