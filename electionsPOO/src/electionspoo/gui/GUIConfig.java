/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electionspoo.gui;

import electionspoo.beans.election.ElectionBean;
import electionspoo.beans.candidate.CandidateList;
import electionspoo.beans.election.ElectionManager;
import electionspoo.beans.elector.ElectorList;
import electionspoo.utils.MainUtils;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Tiago
 */
public class GUIConfig extends javax.swing.JFrame {

    //deve ser apagado na fase final do projeto (tem de ser declarado no 

    private void updateGUILists() {
        MainUtils.listaGUIElector.removeAllElements();
        MainUtils.listaGUICandidate.removeAllElements();
        for (int i = 0; i < ElectorList.getList().size(); i++) {
            MainUtils.listaGUIElector.addElement(ElectorList.getGUIListLine(ElectionManager.getElection().getElectorList().get(i)));
        }
        for (int i = 0; i < CandidateList.getList().size(); i++) {
            MainUtils.listaGUICandidate.addElement(CandidateList.getGUIListLine(ElectionManager.getElection().getCandidateList().get(i)));
        }

    }

    /**
     * Creates new form GUIConfig
     */
    public GUIConfig() throws Exception {
        initComponents();
        GUIConfigJListElector.setModel(MainUtils.listaGUIElector);
        GUIConfigJListCandidate.setModel(MainUtils.listaGUICandidate);
        if(ElectionManager.getElection()!=null){
            GUIConfigTxtBoxElectionName.setText(ElectionManager.getElection().getName());
        GUIConfigTxtBoxElectionStartDate.setText(ElectionManager.getElection().getStartDate());
        GUIConfigTxtBoxElectionEndDate.setText(ElectionManager.getElection().getEndDate());
        }
        
        
        updateGUILists();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseElectorFile = new javax.swing.JDialog();
        GUIConfigBtnSave = new javax.swing.JButton();
        GUIConfigBtnOpen = new javax.swing.JButton();
        GUIConfigBtnNew = new javax.swing.JButton();
        GUIConfigBtnClose = new javax.swing.JButton();
        GUIConfigPanelElection = new javax.swing.JPanel();
        GUIConfigTxtBoxElectionName = new javax.swing.JTextField();
        GUIConfigTxtBoxElectionStartDate = new javax.swing.JTextField();
        GUIConfigTxtBoxElectionEndDate = new javax.swing.JTextField();
        GUIConfigBtnStartElection = new javax.swing.JButton();
        GUIConfigPanelPhoto = new javax.swing.JPanel();
        GUIConfigPanelCandidates = new javax.swing.JPanel();
        GUIConfigBtnOpenCandidateFile = new javax.swing.JButton();
        GUIConfigBtnOpenCandidateMenu = new javax.swing.JButton();
        GUIConfigPanelCandidateList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        GUIConfigJListCandidate = new javax.swing.JList<>();
        GUIConfigPanelElectors = new javax.swing.JPanel();
        GUIConfigBtnOpenElectorFile = new javax.swing.JButton();
        GUIConfigBtnOpenjElectorMenu = new javax.swing.JButton();
        GUIConfigPanelElectorList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GUIConfigJListElector = new javax.swing.JList<>();

        javax.swing.GroupLayout chooseElectorFileLayout = new javax.swing.GroupLayout(chooseElectorFile.getContentPane());
        chooseElectorFile.getContentPane().setLayout(chooseElectorFileLayout);
        chooseElectorFileLayout.setHorizontalGroup(
            chooseElectorFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        chooseElectorFileLayout.setVerticalGroup(
            chooseElectorFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        GUIConfigBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/save_file.png"))); // NOI18N
        GUIConfigBtnSave.setText("Guardar");
        GUIConfigBtnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnSave.setVerifyInputWhenFocusTarget(false);
        GUIConfigBtnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnSaveActionPerformed(evt);
            }
        });

        GUIConfigBtnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/open_file.png"))); // NOI18N
        GUIConfigBtnOpen.setText("Abrir");
        GUIConfigBtnOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnOpen.setVerifyInputWhenFocusTarget(false);
        GUIConfigBtnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnOpenActionPerformed(evt);
            }
        });

        GUIConfigBtnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/newElection.png"))); // NOI18N
        GUIConfigBtnNew.setText("Nova Eleição");
        GUIConfigBtnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnNew.setVerifyInputWhenFocusTarget(false);
        GUIConfigBtnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnNewActionPerformed(evt);
            }
        });

        GUIConfigBtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/exit.png"))); // NOI18N
        GUIConfigBtnClose.setText("Sair");
        GUIConfigBtnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnClose.setVerifyInputWhenFocusTarget(false);
        GUIConfigBtnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnCloseActionPerformed(evt);
            }
        });

        GUIConfigPanelElection.setBorder(javax.swing.BorderFactory.createTitledBorder("Eleição"));

        GUIConfigTxtBoxElectionName.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        GUIConfigTxtBoxElectionName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                GUIConfigTxtBoxElectionNameInputMethodTextChanged(evt);
            }
        });
        GUIConfigTxtBoxElectionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigTxtBoxElectionNameActionPerformed(evt);
            }
        });

        GUIConfigTxtBoxElectionStartDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Ínicio"));
        GUIConfigTxtBoxElectionStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigTxtBoxElectionStartDateActionPerformed(evt);
            }
        });

        GUIConfigTxtBoxElectionEndDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Fim"));
        GUIConfigTxtBoxElectionEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigTxtBoxElectionEndDateActionPerformed(evt);
            }
        });

        GUIConfigBtnStartElection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/start_election.png"))); // NOI18N
        GUIConfigBtnStartElection.setText("Iniciar Eleição");
        GUIConfigBtnStartElection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnStartElection.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnStartElection.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnStartElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnStartElectionActionPerformed(evt);
            }
        });

        GUIConfigPanelPhoto.setBorder(javax.swing.BorderFactory.createTitledBorder("Fotografia"));

        javax.swing.GroupLayout GUIConfigPanelPhotoLayout = new javax.swing.GroupLayout(GUIConfigPanelPhoto);
        GUIConfigPanelPhoto.setLayout(GUIConfigPanelPhotoLayout);
        GUIConfigPanelPhotoLayout.setHorizontalGroup(
            GUIConfigPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        GUIConfigPanelPhotoLayout.setVerticalGroup(
            GUIConfigPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GUIConfigPanelElectionLayout = new javax.swing.GroupLayout(GUIConfigPanelElection);
        GUIConfigPanelElection.setLayout(GUIConfigPanelElectionLayout);
        GUIConfigPanelElectionLayout.setHorizontalGroup(
            GUIConfigPanelElectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIConfigPanelElectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUIConfigPanelElectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIConfigTxtBoxElectionName)
                    .addGroup(GUIConfigPanelElectionLayout.createSequentialGroup()
                        .addGroup(GUIConfigPanelElectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GUIConfigTxtBoxElectionStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GUIConfigTxtBoxElectionEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(GUIConfigPanelElectionLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(GUIConfigBtnStartElection, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(GUIConfigPanelPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GUIConfigPanelElectionLayout.setVerticalGroup(
            GUIConfigPanelElectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIConfigPanelElectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GUIConfigTxtBoxElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(GUIConfigPanelElectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GUIConfigPanelElectionLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(GUIConfigPanelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GUIConfigPanelElectionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(GUIConfigTxtBoxElectionStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(GUIConfigTxtBoxElectionEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(GUIConfigBtnStartElection)))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        GUIConfigPanelCandidates.setBorder(javax.swing.BorderFactory.createTitledBorder("Candidatos"));

        GUIConfigBtnOpenCandidateFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/open_file.png"))); // NOI18N
        GUIConfigBtnOpenCandidateFile.setText("Abrir");
        GUIConfigBtnOpenCandidateFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnOpenCandidateFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnOpenCandidateFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnOpenCandidateFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnOpenCandidateFileActionPerformed(evt);
            }
        });

        GUIConfigBtnOpenCandidateMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/menu_candidates.png"))); // NOI18N
        GUIConfigBtnOpenCandidateMenu.setText("Candidatos");
        GUIConfigBtnOpenCandidateMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnOpenCandidateMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnOpenCandidateMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnOpenCandidateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnOpenCandidateMenuActionPerformed(evt);
            }
        });

        GUIConfigPanelCandidateList.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Candidatos"));

        jScrollPane2.setViewportView(GUIConfigJListCandidate);

        javax.swing.GroupLayout GUIConfigPanelCandidateListLayout = new javax.swing.GroupLayout(GUIConfigPanelCandidateList);
        GUIConfigPanelCandidateList.setLayout(GUIConfigPanelCandidateListLayout);
        GUIConfigPanelCandidateListLayout.setHorizontalGroup(
            GUIConfigPanelCandidateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        GUIConfigPanelCandidateListLayout.setVerticalGroup(
            GUIConfigPanelCandidateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout GUIConfigPanelCandidatesLayout = new javax.swing.GroupLayout(GUIConfigPanelCandidates);
        GUIConfigPanelCandidates.setLayout(GUIConfigPanelCandidatesLayout);
        GUIConfigPanelCandidatesLayout.setHorizontalGroup(
            GUIConfigPanelCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIConfigPanelCandidatesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUIConfigPanelCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIConfigPanelCandidateList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GUIConfigPanelCandidatesLayout.createSequentialGroup()
                        .addComponent(GUIConfigBtnOpenCandidateFile, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GUIConfigBtnOpenCandidateMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GUIConfigPanelCandidatesLayout.setVerticalGroup(
            GUIConfigPanelCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIConfigPanelCandidatesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUIConfigPanelCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUIConfigBtnOpenCandidateMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIConfigBtnOpenCandidateFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GUIConfigPanelCandidateList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GUIConfigPanelElectors.setBorder(javax.swing.BorderFactory.createTitledBorder("Eleitores"));

        GUIConfigBtnOpenElectorFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/open_file.png"))); // NOI18N
        GUIConfigBtnOpenElectorFile.setText("Abrir");
        GUIConfigBtnOpenElectorFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnOpenElectorFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnOpenElectorFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnOpenElectorFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnOpenElectorFileActionPerformed(evt);
            }
        });

        GUIConfigBtnOpenjElectorMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/menu_electos.png"))); // NOI18N
        GUIConfigBtnOpenjElectorMenu.setText("Eleitores");
        GUIConfigBtnOpenjElectorMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUIConfigBtnOpenjElectorMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GUIConfigBtnOpenjElectorMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GUIConfigBtnOpenjElectorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIConfigBtnOpenjElectorMenuActionPerformed(evt);
            }
        });

        GUIConfigPanelElectorList.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Eleitores"));

        jScrollPane1.setViewportView(GUIConfigJListElector);

        javax.swing.GroupLayout GUIConfigPanelElectorListLayout = new javax.swing.GroupLayout(GUIConfigPanelElectorList);
        GUIConfigPanelElectorList.setLayout(GUIConfigPanelElectorListLayout);
        GUIConfigPanelElectorListLayout.setHorizontalGroup(
            GUIConfigPanelElectorListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        GUIConfigPanelElectorListLayout.setVerticalGroup(
            GUIConfigPanelElectorListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout GUIConfigPanelElectorsLayout = new javax.swing.GroupLayout(GUIConfigPanelElectors);
        GUIConfigPanelElectors.setLayout(GUIConfigPanelElectorsLayout);
        GUIConfigPanelElectorsLayout.setHorizontalGroup(
            GUIConfigPanelElectorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIConfigPanelElectorsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUIConfigPanelElectorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIConfigPanelElectorList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GUIConfigPanelElectorsLayout.createSequentialGroup()
                        .addComponent(GUIConfigBtnOpenElectorFile, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GUIConfigBtnOpenjElectorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GUIConfigPanelElectorsLayout.setVerticalGroup(
            GUIConfigPanelElectorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIConfigPanelElectorsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GUIConfigPanelElectorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUIConfigBtnOpenjElectorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIConfigBtnOpenElectorFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GUIConfigPanelElectorList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(GUIConfigPanelElection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(GUIConfigPanelCandidates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GUIConfigPanelElectors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GUIConfigBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUIConfigBtnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUIConfigBtnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GUIConfigBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUIConfigBtnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIConfigBtnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIConfigBtnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIConfigBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIConfigPanelElection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIConfigPanelElectors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIConfigPanelCandidates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUIConfigBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_GUIConfigBtnCloseActionPerformed

    private void GUIConfigTxtBoxElectionStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigTxtBoxElectionStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUIConfigTxtBoxElectionStartDateActionPerformed

    private void GUIConfigTxtBoxElectionEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigTxtBoxElectionEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUIConfigTxtBoxElectionEndDateActionPerformed

    private void GUIConfigBtnOpenCandidateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnOpenCandidateMenuActionPerformed
        // TODO add your handling code here:
        try {
            GUICandidate dialog = new GUICandidate(this, true);
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_GUIConfigBtnOpenCandidateMenuActionPerformed

    private void GUIConfigBtnOpenjElectorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnOpenjElectorMenuActionPerformed
        // TODO add your handling code here:
        try {
            GUIElector dialog = new GUIElector(this, true);
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_GUIConfigBtnOpenjElectorMenuActionPerformed

    private void GUIConfigBtnOpenCandidateFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnOpenCandidateFileActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            CandidateList candidateList = new CandidateList();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showOpenDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                candidateList.load(selectedFile);
                updateGUILists();
            }
        } catch (IOException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GUICandidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GUIConfigBtnOpenCandidateFileActionPerformed

    private void GUIConfigBtnOpenElectorFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnOpenElectorFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        CandidateList candidateList = new CandidateList();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int result = fileChooser.showOpenDialog(fileChooser);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                candidateList.load(fileChooser.getSelectedFile().getAbsolutePath());
                updateGUILists();
            } catch (Exception ex) {
                Logger.getLogger(GUIConfig.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_GUIConfigBtnOpenElectorFileActionPerformed

    private void GUIConfigBtnStartElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnStartElectionActionPerformed
        // TODO add your handling code here:
        
        ElectionManager electionManager = new ElectionManager();
        
        ElectionManager.updateBeanLists();
        
        ElectionManager.getElection().setName(GUIConfigTxtBoxElectionName.getText());
        ElectionManager.getElection().setStartDate(LocalDate.parse(GUIConfigTxtBoxElectionStartDate.getText(), MainUtils.formatter));
        ElectionManager.getElection().setEndDate(LocalDate.parse(GUIConfigTxtBoxElectionEndDate.getText(), MainUtils.formatter));
        ElectionManager.getElection().setStarted(true);
        
        try {
            electionManager.save(MainUtils.electionFilePath);
        } catch (Exception ex) {
            Logger.getLogger(GUIConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        dispose();
        
    }//GEN-LAST:event_GUIConfigBtnStartElectionActionPerformed

    private void GUIConfigBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnSaveActionPerformed
        // TODO add your handling code here:
        
       String nome = GUIConfigTxtBoxElectionName.getText();
       String dtInicio = GUIConfigTxtBoxElectionStartDate.getText();
       String dtFim = GUIConfigTxtBoxElectionEndDate.getText();
        
        ElectionManager.updateBeanLists();
        ElectionManager.getElection().setName(nome);
        ElectionManager.getElection().setStartDate(LocalDate.parse(dtInicio, MainUtils.formatter));
        ElectionManager.getElection().setEndDate(LocalDate.parse(dtFim, MainUtils.formatter));
        
        try {
            JFileChooser fileChooser = new JFileChooser();
            ElectionManager electionManager = new ElectionManager();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showOpenDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                electionManager.save(selectedFile);
            }
        } catch (IOException | ClassNotFoundException | ParseException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GUICandidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GUIConfigBtnSaveActionPerformed

    private void GUIConfigBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnNewActionPerformed
        // TODO add your handling code here:
        ElectionManager.newElection();
     
        
    }//GEN-LAST:event_GUIConfigBtnNewActionPerformed

    private void GUIConfigBtnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigBtnOpenActionPerformed
        // TODO add your handling code here:
         try {
            JFileChooser fileChooser = new JFileChooser();
            ElectionManager electionManager = new ElectionManager();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showOpenDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                electionManager.load(selectedFile);
                updateGUILists();
                GUIConfigTxtBoxElectionName.setText(ElectionManager.getElection().getName());
                GUIConfigTxtBoxElectionStartDate.setText(ElectionManager.getElection().getStartDate());
                GUIConfigTxtBoxElectionEndDate.setText(ElectionManager.getElection().getEndDate());
            }
        } catch (IOException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GUICandidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GUIConfigBtnOpenActionPerformed

    private void GUIConfigTxtBoxElectionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIConfigTxtBoxElectionNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_GUIConfigTxtBoxElectionNameActionPerformed

    private void GUIConfigTxtBoxElectionNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_GUIConfigTxtBoxElectionNameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_GUIConfigTxtBoxElectionNameInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(GUIConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUIConfig().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GUIConfig.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GUIConfigBtnClose;
    private javax.swing.JButton GUIConfigBtnNew;
    private javax.swing.JButton GUIConfigBtnOpen;
    private javax.swing.JButton GUIConfigBtnOpenCandidateFile;
    private javax.swing.JButton GUIConfigBtnOpenCandidateMenu;
    private javax.swing.JButton GUIConfigBtnOpenElectorFile;
    private javax.swing.JButton GUIConfigBtnOpenjElectorMenu;
    private javax.swing.JButton GUIConfigBtnSave;
    private javax.swing.JButton GUIConfigBtnStartElection;
    private javax.swing.JList<String> GUIConfigJListCandidate;
    private javax.swing.JList<String> GUIConfigJListElector;
    private javax.swing.JPanel GUIConfigPanelCandidateList;
    private javax.swing.JPanel GUIConfigPanelCandidates;
    private javax.swing.JPanel GUIConfigPanelElection;
    private javax.swing.JPanel GUIConfigPanelElectorList;
    private javax.swing.JPanel GUIConfigPanelElectors;
    private javax.swing.JPanel GUIConfigPanelPhoto;
    private javax.swing.JTextField GUIConfigTxtBoxElectionEndDate;
    private javax.swing.JTextField GUIConfigTxtBoxElectionName;
    private javax.swing.JTextField GUIConfigTxtBoxElectionStartDate;
    private javax.swing.JDialog chooseElectorFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
