/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package electionspoo.gui;

import electionspoo.beans.candidate.CandidateBean;
import electionspoo.beans.candidate.CandidateList;
import electionspoo.beans.election.ElectionManager;
import electionspoo.beans.elector.ElectorList;
import electionspoo.utils.MainUtils;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Tiago
 */
public class GUIResults extends javax.swing.JDialog {

    
    private void updateGUILists() {
        MainUtils.listaGUIElector.removeAllElements();
        MainUtils.listaGUICandidate.removeAllElements();
        MainUtils.listaGUIResults.removeAllElements();
        
        for (int i = 0; i < ElectorList.getList().size(); i++) {
            MainUtils.listaGUIElector.addElement(ElectorList.getGUIListLine(ElectionManager.getElection().getElectorList().get(i)));
        }
        for (int i = 0; i < CandidateList.getList().size(); i++) {
            MainUtils.listaGUICandidate.addElement(CandidateList.getGUIListLine(ElectionManager.getElection().getCandidateList().get(i)));
        }
        for (int i = 0; i < CandidateList.getList().size(); i++) {
            MainUtils.listaGUIResults.addElement(CandidateList.getResultsGUILine(ElectionManager.getElection().getCandidateList().get(i)));
        }
        
    }
    /**
     * Creates new form GUIResults
     */
    public GUIResults(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        GUIResultsEleitorList.setModel(MainUtils.listaGUIElector);
        GUIResultsCandidatesList.setModel(MainUtils.listaGUICandidate);
        GUIResultsList.setModel(MainUtils.listaGUIResults);
        
        GUIResultsNomeEleicao.setText(ElectionManager.getElection().getName());
        GUIResultsEleicaoDataInicio.setText(ElectionManager.getElection().getStartDate());
        GUIResultsEleicaoDataFim.setText(ElectionManager.getElection().getStartDate());
        
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Votantes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        GUIResultsList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        GUIUtilizadorEleitorSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        GUIResultsEleitorList = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        GUIResultsCandidatesList = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        GUIResultsNomeEleicao = new javax.swing.JTextField();
        GUIResultsEleicaoDataInicio = new javax.swing.JTextField();
        GUIResultsEleicaoDataFim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/open_file.png"))); // NOI18N
        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/exit.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ABRIR GRÁFICO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        Votantes.addTab("Gráfico", jPanel1);

        GUIResultsList.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUIResultsList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUIResultsList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        Votantes.addTab("Resultados", jPanel2);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electionspoo/multimedia/nav_find.png"))); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GUIUtilizadorEleitorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIUtilizadorEleitorSearchActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Eleitoral"));
        jScrollPane1.setViewportView(GUIResultsEleitorList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(GUIUtilizadorEleitorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(GUIUtilizadorEleitorSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        Votantes.addTab("Votantes", jPanel3);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Candidatos"));
        jScrollPane2.setViewportView(GUIResultsCandidatesList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        Votantes.addTab("Candidatos", jPanel4);

        GUIResultsNomeEleicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        GUIResultsNomeEleicao.setEnabled(false);

        GUIResultsEleicaoDataInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Início"));
        GUIResultsEleicaoDataInicio.setEnabled(false);

        GUIResultsEleicaoDataFim.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Fim"));
        GUIResultsEleicaoDataFim.setEnabled(false);

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Fotografia"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GUIResultsNomeEleicao)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GUIResultsEleicaoDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(GUIResultsEleicaoDataFim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GUIResultsNomeEleicao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(GUIResultsEleicaoDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GUIResultsEleicaoDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        Votantes.addTab("Eleição", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Votantes)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Votantes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUIUtilizadorEleitorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIUtilizadorEleitorSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUIUtilizadorEleitorSearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String textToSearch = GUIUtilizadorEleitorSearch.getText();

        int index;

        index = ElectorList.searchElectorByName(textToSearch);
        if (!(MainUtils.isNullOrEmpty(String.valueOf(index)))) {
            GUIResultsEleitorList.setSelectedIndex(index);
        } else {
            index = ElectorList.searchElectorByCC(textToSearch);
            if (!(MainUtils.isNullOrEmpty(String.valueOf(index)))) {
                GUIResultsEleitorList.setSelectedIndex(index);
            } else {
                System.out.println("Não há registos a encontrar para a string: " + textToSearch);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            JFileChooser fileChooser = new JFileChooser();
            ElectionManager electionManager = new ElectionManager();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showOpenDialog(fileChooser);
            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                electionManager.load(selectedFile);
                GUIResultsNomeEleicao.setText(ElectionManager.getElection().getName());
                GUIResultsEleicaoDataInicio.setText(ElectionManager.getElection().getStartDate());
                GUIResultsEleicaoDataFim.setText(ElectionManager.getElection().getEndDate());
                updateGUILists();
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(GUIElector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GUICandidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          try {
              dispose();
            GUIResultsStatistics dialog = new GUIResultsStatistics(ElectionManager.getElection());
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(GUIResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIResults dialog = new GUIResults(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> GUIResultsCandidatesList;
    private javax.swing.JTextField GUIResultsEleicaoDataFim;
    private javax.swing.JTextField GUIResultsEleicaoDataInicio;
    private javax.swing.JList<String> GUIResultsEleitorList;
    private javax.swing.JList<String> GUIResultsList;
    private javax.swing.JTextField GUIResultsNomeEleicao;
    private javax.swing.JTextField GUIUtilizadorEleitorSearch;
    private javax.swing.JTabbedPane Votantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
