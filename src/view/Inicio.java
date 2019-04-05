/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controllers.FileController;
import java.io.File;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author cesavemr
 */
public class Inicio extends javax.swing.JFrame {       
    TableColumnModel columnModel;
    TableModel model;
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();        
        FileChooser.setVisible(false);
        model = this.FileTable.getModel();
        DetailPanel.setVisible(false);
        
        setLocationRelativeTo(null);
        this.FileTable.getColumnModel().getColumn(1).setMaxWidth(0);
        this.FileTable.getColumnModel().getColumn(1).setMinWidth(0);
        this.FileTable.getColumnModel().getColumn(1).setWidth(0);
        this.FileTable.getColumnModel().getColumn(1).setPreferredWidth(0);        
        this.setSize(750, 520);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonProcess = new javax.swing.JButton();
        routeFile = new javax.swing.JTextField();
        buttonSearchFile = new javax.swing.JButton();
        DetailPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FileTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        SearchPanel = new javax.swing.JPanel();
        FileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonProcess.setText("Process");
        ButtonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProcessActionPerformed(evt);
            }
        });

        routeFile.setName("routeFile"); // NOI18N
        routeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeFileActionPerformed(evt);
            }
        });

        buttonSearchFile.setText("...");
        buttonSearchFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchFileActionPerformed(evt);
            }
        });

        DetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
        DetailPanel.setToolTipText("");

        FileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "File Name", "Detail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        FileTable.setColumnSelectionAllowed(true);
        FileTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FileTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FileTable);

        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane2.setViewportView(Description);

        javax.swing.GroupLayout DetailPanelLayout = new javax.swing.GroupLayout(DetailPanel);
        DetailPanel.setLayout(DetailPanelLayout);
        DetailPanelLayout.setHorizontalGroup(
            DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        DetailPanelLayout.setVerticalGroup(
            DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SearchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        FileChooser.setCurrentDirectory(null);
        FileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(routeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearchFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonProcess)
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearchFile)
                    .addComponent(ButtonProcess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProcessActionPerformed
        SearchPanel.setVisible(false);        
        DetailPanel.setVisible(true);
        FileController controller = new FileController();
        File[] listFiles = controller.readFile(routeFile.getText());

        for (int i = 0; i < listFiles.length; i++) {
            File file = listFiles[i];
            String result = controller.processFile(file);
            model.setValueAt(file.getName(), i, 0);
            model.setValueAt(result, i, 1);
        }   
    }//GEN-LAST:event_ButtonProcessActionPerformed

    private void routeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeFileActionPerformed

    private void buttonSearchFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchFileActionPerformed
        SearchPanel.setVisible(true);
        FileChooser.setVisible(true);
        DetailPanel.setVisible(false);
    }//GEN-LAST:event_buttonSearchFileActionPerformed

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
        if (evt.getActionCommand() == "ApproveSelection") {
            File f = FileChooser.getSelectedFile();
            FileChooser.setVisible(false);
            routeFile.setText(f.getAbsolutePath());
            SearchPanel.setVisible(false);
            DetailPanel.setVisible(true);
            DetailPanel.setLocation(5, 5);            
        }
    }//GEN-LAST:event_FileChooserActionPerformed

    private void FileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FileTableMouseClicked
        Description.setText(FileTable.getValueAt(FileTable.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_FileTableMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonProcess;
    private javax.swing.JTextArea Description;
    private javax.swing.JPanel DetailPanel;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JTable FileTable;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton buttonSearchFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField routeFile;
    // End of variables declaration//GEN-END:variables
}