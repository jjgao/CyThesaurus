/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
 */

package csplugins.id.mapping.ui;

import csplugins.id.mapping.IDMapperClient;
import csplugins.id.mapping.IDMapperClientImpl;

import cytoscape.util.CyFileFilter;
import cytoscape.util.FileUtil;
import cytoscape.util.URLUtil;

import org.bridgedb.IDMapperException;
import org.bridgedb.file.IDMapperText;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;

import java.net.URL;

import javax.swing.JOptionPane;

/**
 *
 * @author gjj
 */
public class FileIDMappingClientConfigDialog extends javax.swing.JDialog {

    // add a new client
    public FileIDMappingClientConfigDialog(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setPreviewTableData();
    }

//    // configure an existing client
//    public FileIDMappingClientConfigDialog(java.awt.Dialog parent,
//            boolean modal, IDMapperClient client) {
//        super(parent, modal);
//        initComponents();
//
//        this.client = client;
//        if (client!=null) {
//            IDMapperText idMapper = (IDMapperText)client.getIDMapper();
//            textFileTextField.setText(idMapper.getURL().toString());
//            textFileTextField.setEnabled(false);
//            sourcePanel.setVisible(false);
//            textFileButton.setVisible(false);
//            textFileTextField.setToolTipText("URL of existing IDMapping client cannot " +
//                    "be changed. Remove this client and add a new one if you want " +
//                    "to connect to a different URL.");
//
//            this.setTypeDelimiters(idMapper.getDataSourceDelimiters());
//            this.setIDDelimiters(idMapper.getIDDelimiters());
//            transitivityCheckBox.setSelected(idMapper.getTransitivity());
//
//            // show the advance option
//            optionCheckBox.setSelected(true);
//            advancedPanel.setVisible(optionCheckBox.isSelected());
//            this.pack();
//        }
//
//        setPreviewTableData();
//    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JPanel typePanel = new javax.swing.JPanel();
        typeComboBox = new javax.swing.JComboBox();
        delimitedTextPanel = new javax.swing.JPanel();
        textFilePanel = new javax.swing.JPanel();
        sourcePanel = new javax.swing.JPanel();
        javax.swing.JLabel typeLabel = new javax.swing.JLabel();
        localRadioButton = new javax.swing.JRadioButton();
        remoteRadioButton = new javax.swing.JRadioButton();
        javax.swing.JPanel selectPanel = new javax.swing.JPanel();
        textFileTextField = new javax.swing.JTextField();
        textFileButton = new javax.swing.JButton();
        javax.swing.JPanel opPanel = new javax.swing.JPanel();
        optionCheckBox = new javax.swing.JCheckBox();
        advancedPanel = new javax.swing.JPanel();
        transitivityCheckBox = new javax.swing.JCheckBox();
        delimiterPanel = new javax.swing.JPanel();
        delemiterTypePanel = new javax.swing.JPanel();
        tabTypeCheckBox = new javax.swing.JCheckBox();
        commaTypeCheckBox = new javax.swing.JCheckBox();
        semiTypeCheckBox = new javax.swing.JCheckBox();
        spaceTypeCheckBox = new javax.swing.JCheckBox();
        otherTypeCheckBox = new javax.swing.JCheckBox();
        otherTypeTextField = new javax.swing.JTextField();
        delemiterIDPanel = new javax.swing.JPanel();
        tabIDCheckBox = new javax.swing.JCheckBox();
        commaIDCheckBox = new javax.swing.JCheckBox();
        semiIDCheckBox = new javax.swing.JCheckBox();
        spaceIDCheckBox = new javax.swing.JCheckBox();
        otherIDCheckBox = new javax.swing.JCheckBox();
        otherIDTextField = new javax.swing.JTextField();
        javax.swing.JPanel previewPanel = new javax.swing.JPanel();
        javax.swing.JScrollPane previewScrollPane = new javax.swing.JScrollPane();
        previewTable = new javax.swing.JTable();
        javax.swing.JPanel okPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("File-based ID Mapping Resources Configuration");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        typePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("File Type"));
        typePanel.setLayout(new javax.swing.BoxLayout(typePanel, javax.swing.BoxLayout.LINE_AXIS));

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delimiter Text File" }));
        typePanel.add(typeComboBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(typePanel, gridBagConstraints);

        delimitedTextPanel.setLayout(new java.awt.GridBagLayout());

        textFilePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data source"));
        textFilePanel.setLayout(new java.awt.GridBagLayout());

        sourcePanel.setLayout(new javax.swing.BoxLayout(sourcePanel, javax.swing.BoxLayout.LINE_AXIS));

        typeLabel.setText("File type:   ");
        sourcePanel.add(typeLabel);

        buttonGroup1.add(localRadioButton);
        localRadioButton.setSelected(true);
        localRadioButton.setText("Local   ");
        localRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localRadioButtonActionPerformed(evt);
            }
        });
        sourcePanel.add(localRadioButton);

        buttonGroup1.add(remoteRadioButton);
        remoteRadioButton.setText("Remote/URL");
        remoteRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remoteRadioButtonActionPerformed(evt);
            }
        });
        sourcePanel.add(remoteRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        textFilePanel.add(sourcePanel, gridBagConstraints);

        selectPanel.setLayout(new javax.swing.BoxLayout(selectPanel, javax.swing.BoxLayout.LINE_AXIS));

        textFileTextField.setPreferredSize(new java.awt.Dimension(250, 20));
        selectPanel.add(textFileTextField);

        textFileButton.setText("Select file");
        textFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFileButtonActionPerformed(evt);
            }
        });
        selectPanel.add(textFileButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        textFilePanel.add(selectPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        delimitedTextPanel.add(textFilePanel, gridBagConstraints);

        opPanel.setLayout(new java.awt.GridBagLayout());

        optionCheckBox.setText("Show advanced option");
        optionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        opPanel.add(optionCheckBox, gridBagConstraints);

        advancedPanel.setLayout(new java.awt.GridBagLayout());
        advancedPanel.setVisible(false);

        transitivityCheckBox.setText("Support transitivity of ID mappings");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        advancedPanel.add(transitivityCheckBox, gridBagConstraints);

        delimiterPanel.setPreferredSize(new java.awt.Dimension(900, 100));
        delimiterPanel.setLayout(new java.awt.GridBagLayout());

        delemiterTypePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Delimiters between IDs of different types"));
        delemiterTypePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        tabTypeCheckBox.setSelected(true);
        tabTypeCheckBox.setText("Tab");
        tabTypeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTypeCheckBoxActionPerformed(evt);
            }
        });
        delemiterTypePanel.add(tabTypeCheckBox);

        commaTypeCheckBox.setText("Comma");
        commaTypeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaTypeCheckBoxActionPerformed(evt);
            }
        });
        delemiterTypePanel.add(commaTypeCheckBox);

        semiTypeCheckBox.setText("Semicolon");
        semiTypeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semiTypeCheckBoxActionPerformed(evt);
            }
        });
        delemiterTypePanel.add(semiTypeCheckBox);

        spaceTypeCheckBox.setText("Space");
        spaceTypeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceTypeCheckBoxActionPerformed(evt);
            }
        });
        delemiterTypePanel.add(spaceTypeCheckBox);

        otherTypeCheckBox.setText("Other");
        otherTypeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherTypeCheckBoxActionPerformed(evt);
            }
        });
        delemiterTypePanel.add(otherTypeCheckBox);

        otherTypeTextField.setEnabled(otherTypeCheckBox.isSelected());
        otherTypeTextField.setMinimumSize(new java.awt.Dimension(60, 20));
        otherTypeTextField.setPreferredSize(new java.awt.Dimension(60, 20));
        otherTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherTypeTextFieldActionPerformed(evt);
            }
        });
        delemiterTypePanel.add(otherTypeTextField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        delimiterPanel.add(delemiterTypePanel, gridBagConstraints);

        delemiterIDPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Delimiters between IDs of the same type"));
        delemiterIDPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        tabIDCheckBox.setText("Tab");
        tabIDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabIDCheckBoxActionPerformed(evt);
            }
        });
        delemiterIDPanel.add(tabIDCheckBox);

        commaIDCheckBox.setSelected(true);
        commaIDCheckBox.setText("Comma");
        commaIDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaIDCheckBoxActionPerformed(evt);
            }
        });
        delemiterIDPanel.add(commaIDCheckBox);

        semiIDCheckBox.setSelected(true);
        semiIDCheckBox.setText("Semicolon");
        semiIDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semiIDCheckBoxActionPerformed(evt);
            }
        });
        delemiterIDPanel.add(semiIDCheckBox);

        spaceIDCheckBox.setText("Space");
        spaceIDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceIDCheckBoxActionPerformed(evt);
            }
        });
        delemiterIDPanel.add(spaceIDCheckBox);

        otherIDCheckBox.setText("Other");
        otherIDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherIDCheckBoxActionPerformed(evt);
            }
        });
        delemiterIDPanel.add(otherIDCheckBox);

        otherIDTextField.setEnabled(otherIDCheckBox.isSelected());
        otherIDTextField.setMinimumSize(new java.awt.Dimension(60, 20));
        otherIDTextField.setPreferredSize(new java.awt.Dimension(60, 20));
        otherIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherIDTextFieldActionPerformed(evt);
            }
        });
        delemiterIDPanel.add(otherIDTextField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        delimiterPanel.add(delemiterIDPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        advancedPanel.add(delimiterPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        opPanel.add(advancedPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        delimitedTextPanel.add(opPanel, gridBagConstraints);

        previewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("File preview"));
        previewPanel.setMinimumSize(new java.awt.Dimension(400, 200));
        previewPanel.setPreferredSize(new java.awt.Dimension(600, 300));
        previewPanel.setLayout(new javax.swing.BoxLayout(previewPanel, javax.swing.BoxLayout.LINE_AXIS));

        previewTableModel = new javax.swing.table.DefaultTableModel();
        previewTable.setModel(previewTableModel);
        previewScrollPane.setViewportView(previewTable);

        previewPanel.add(previewScrollPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        delimitedTextPanel.add(previewPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(delimitedTextPanel, gridBagConstraints);

        okPanel.setLayout(new javax.swing.BoxLayout(okPanel, javax.swing.BoxLayout.LINE_AXIS));

        okButton.setText("   OK   ");
        okButton.setToolTipText("");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okPanel.add(okButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        okPanel.add(cancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(okPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void localRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localRadioButtonActionPerformed
        //textFileButton.setVisible(true);
        textFileButton.setText("Select file");
        textFileTextField.setText("");
        isLocal = true;
}//GEN-LAST:event_localRadioButtonActionPerformed

    private void remoteRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remoteRadioButtonActionPerformed
        //textFileButton.setVisible(false);
        textFileButton.setText("Retrieve");
        textFileTextField.setText("");
        isLocal = false;
}//GEN-LAST:event_remoteRadioButtonActionPerformed

    private void textFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFileButtonActionPerformed
        URL url;
        String strURL;
        try {
            if (isLocal) {
                File source = FileUtil.getFile("Select a ID mapping file", FileUtil.LOAD,
                        new CyFileFilter[] {  });
                if (source==null) {
                    return;
                }
                url = source.toURI().toURL();
                strURL = url.toString();
                textFileTextField.setText(strURL);
            } else {
                strURL =  textFileTextField.getText();
                if (strURL==null || strURL.length()==0) {
                    return;
                }
                url = new URL(strURL);
            }

            if (URLUtil.getURLConnection(url)==null) {
                JOptionPane.showMessageDialog(this, "Error: failed to connect to the file.");
                return;
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error: unable to open the file.");
            e.printStackTrace();
        }

        setPreviewTableData();
}//GEN-LAST:event_textFileButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
        this.dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (verifyInput()) {
            cancelled = false;
            setVisible(false);
            this.dispose();
        }
}//GEN-LAST:event_okButtonActionPerformed

    private void optionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCheckBoxActionPerformed
        advancedPanel.setVisible(optionCheckBox.isSelected());
        this.pack();
}//GEN-LAST:event_optionCheckBoxActionPerformed

    private void tabTypeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTypeCheckBoxActionPerformed
        if (tabTypeCheckBox.isSelected()) {
            tabIDCheckBox.setSelected(false);
        }
        this.setPreviewTableData();
    }//GEN-LAST:event_tabTypeCheckBoxActionPerformed

    private void commaTypeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaTypeCheckBoxActionPerformed
        if (commaTypeCheckBox.isSelected()) {
            commaIDCheckBox.setSelected(false);
        }
        this.setPreviewTableData();
    }//GEN-LAST:event_commaTypeCheckBoxActionPerformed

    private void semiTypeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semiTypeCheckBoxActionPerformed
        if (semiTypeCheckBox.isSelected()) {
            semiIDCheckBox.setSelected(false);
        }
        this.setPreviewTableData();
    }//GEN-LAST:event_semiTypeCheckBoxActionPerformed

    private void spaceTypeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceTypeCheckBoxActionPerformed
        if (spaceTypeCheckBox.isSelected()) {
            spaceIDCheckBox.setSelected(false);
        }
        this.setPreviewTableData();
    }//GEN-LAST:event_spaceTypeCheckBoxActionPerformed

    private void otherTypeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherTypeCheckBoxActionPerformed
        otherTypeTextField.setEnabled(otherTypeCheckBox.isSelected());
        this.setPreviewTableData();
    }//GEN-LAST:event_otherTypeCheckBoxActionPerformed

    private void otherTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherTypeTextFieldActionPerformed
        this.setPreviewTableData();
    }//GEN-LAST:event_otherTypeTextFieldActionPerformed

    private void tabIDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabIDCheckBoxActionPerformed
        if (tabIDCheckBox.isSelected()) {
            tabTypeCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_tabIDCheckBoxActionPerformed

    private void commaIDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaIDCheckBoxActionPerformed
        if (commaIDCheckBox.isSelected()) {
            commaTypeCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_commaIDCheckBoxActionPerformed

    private void semiIDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semiIDCheckBoxActionPerformed
        if (semiIDCheckBox.isSelected()) {
            semiTypeCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_semiIDCheckBoxActionPerformed

    private void spaceIDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceIDCheckBoxActionPerformed
        if (spaceIDCheckBox.isSelected()) {
            spaceTypeCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_spaceIDCheckBoxActionPerformed

    private void otherIDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherIDCheckBoxActionPerformed
        otherIDTextField.setEnabled(otherIDCheckBox.isSelected());
    }//GEN-LAST:event_otherIDCheckBoxActionPerformed

    private void otherIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherIDTextFieldActionPerformed
        
    }//GEN-LAST:event_otherIDTextFieldActionPerformed

    private boolean verifyInput() {
        String strURL = textFileTextField.getText();
        if (strURL==null || strURL.length()==0) {
            JOptionPane.showMessageDialog(this, "Error: Please specify the URL of the input file");
            return false;
        }
        
        try {
            URL url = new URL(strURL);
            if (URLUtil.getURLConnection(url)==null) {
                JOptionPane.showMessageDialog(this, "Error: failed to connect to the file.");
                return false;
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: unable to open the file.");
            ex.printStackTrace();
            return false;
        }

        char[] typeDelimiters = getTypeDelimiters();
        if(typeDelimiters==null || typeDelimiters.length==0) {
            JOptionPane.showMessageDialog(this, "Error: Please specify at least one type delimiter");
            return false;
        }

        return true;
    }

    private char[] getTypeDelimiters() {
        Set<Character> typeDelimiters = new HashSet();

        if (tabTypeCheckBox.isSelected()) {
            typeDelimiters.add('\t');
        }

        if (commaTypeCheckBox.isSelected()) {
            typeDelimiters.add(',');
        }

        if (semiTypeCheckBox.isSelected()) {
            typeDelimiters.add(';');
        }

        if (spaceTypeCheckBox.isSelected()) {
            typeDelimiters.add(' ');
        }

        if (otherTypeCheckBox.isSelected()) {
            String strOther = otherTypeTextField.getText();
            if (strOther!=null) {
                for (char c : strOther.toCharArray()) {
                    typeDelimiters.add(c);
                }
            }
        }

        int n = typeDelimiters.size();
        char[] ret = new char[n];
        int i = 0;
        for (char ch : typeDelimiters) {
            ret[i++] = ch;
        }

        return ret;
    }

    private void setTypeDelimiters(char[] delimiters) {    
        if (delimiters==null) {
            return;
        }

        Set<Character> typeDelimiters = new HashSet();
        for (char c : delimiters) {
            typeDelimiters.add(c);
        }

        tabTypeCheckBox.setSelected(typeDelimiters.remove('\t'));
        commaTypeCheckBox.setSelected(typeDelimiters.remove(','));
        semiTypeCheckBox.setSelected(typeDelimiters.remove(';'));
        spaceTypeCheckBox.setSelected(typeDelimiters.remove(' '));

        if (typeDelimiters.isEmpty()) {
            otherTypeCheckBox.setSelected(false);
            otherTypeTextField.setText(null);
        } else {
            otherTypeCheckBox.setSelected(true);
            StringBuilder sb = new StringBuilder();
            for (char c : typeDelimiters) {
                sb.append(c);
            }
            otherTypeTextField.setText(sb.toString());
            otherTypeTextField.setEnabled(true);
        }
    }

    private char[] getIDDelimiters() {
        Set<Character> idDelimiters = new HashSet();

        if (tabIDCheckBox.isSelected()) {
            idDelimiters.add('\t');
        }

        if (commaIDCheckBox.isSelected()) {
            idDelimiters.add(',');
        }

        if (semiIDCheckBox.isSelected()) {
            idDelimiters.add(';');
        }

        if (spaceIDCheckBox.isSelected()) {
            idDelimiters.add(' ');
        }

        if (otherIDCheckBox.isSelected()) {
            String strOther = otherIDTextField.getText();
            if (strOther!=null) {
                for (char c : strOther.toCharArray()) {
                    idDelimiters.add(c);
                }
            }
        }

        int n = idDelimiters.size();
        char[] ret = new char[n];
        int i = 0;
        for (char ch : idDelimiters) {
            ret[i++] = ch;
        }

        return ret;
    }

    private void setIDDelimiters(char[] delimiters) {
        if (delimiters==null) {
            return;
        }

        Set<Character> idDelimiters = new HashSet();
        for (char c : delimiters) {
            idDelimiters.add(c);
        }

        tabIDCheckBox.setSelected(idDelimiters.remove('\t'));
        commaIDCheckBox.setSelected(idDelimiters.remove(','));
        semiIDCheckBox.setSelected(idDelimiters.remove(';'));
        spaceIDCheckBox.setSelected(idDelimiters.remove(' '));

        if (idDelimiters.isEmpty()) {
            otherIDCheckBox.setSelected(false);
            otherIDTextField.setText(null);
        } else {
            otherIDCheckBox.setSelected(true);
            StringBuilder sb = new StringBuilder();
            for (char c : idDelimiters) {
                sb.append(c);
            }
            otherIDTextField.setText(sb.toString());
            otherIDTextField.setEnabled(true);
        }
    }

    private void setPreviewTableData() {
        try {
            URL url = new URL(textFileTextField.getText());
            String regExDel = getRegExDelimiter(getTypeDelimiters());
            if (url==null || regExDel==null) {
                previewTableModel.setDataVector((Vector)null, null);
                return;
            }

            InputStream inputStream = URLUtil.getInputStream(url);
            Reader fin = new InputStreamReader(inputStream);
            BufferedReader bufRd = new BufferedReader(fin);

            // add data sources
            String line = bufRd.readLine();
            if (line==null) {
                    previewTableModel.setDataVector((Vector)null, null);
                    return;
            }

            String[] types = line.split(regExDel);
            int nCol = types.length;

            String[][] data = new String[previewLimit][nCol];

            int lineCount = 0;
            while ((line=bufRd.readLine())!=null && lineCount<previewLimit) {
                String[] strs = line.split(regExDel);
                int n = Math.min(strs.length, types.length);
                for (int i=0; i<n; i++) {
                    data[lineCount][i] = strs[i];
                }
                lineCount++;
            }

            previewTableModel.setDataVector(data, types);
        } catch(IOException ex) {
            previewTableModel.setDataVector((Vector)null, null);
        }
    }

    private String getRegExDelimiter(char[] delimiters) {
        if (delimiters==null || delimiters.length==0) {
            return null;
        }

        StringBuilder sb = new StringBuilder("[");
        for (char c : delimiters) {
            sb.append("\\0");
            sb.append(Integer.toOctalString(c));
        }
        sb.append("]");

        return sb.toString();
    }

    public IDMapperClient getIDMappingClient()
            throws IDMapperException, ClassNotFoundException {
        String url = textFileTextField.getText();

        return new IDMapperClientImpl
                        .Builder(getConnectionString(), "org.bridgedb.file.IDMapperText")
                        .displayName(url)
                        .build();
    }

    private String getConnectionString() {
        char[] typeDelimiters = getTypeDelimiters();
        char[] idDelimiters = getIDDelimiters();

        //TODO: delimiters cannot be the same or contain each other for type and id

        String url = textFileTextField.getText();

        boolean transitivity = transitivityCheckBox.isSelected();

        StringBuilder connString = new StringBuilder("idmapper-text:");
        for (char del : typeDelimiters) {
            connString.append("dssep="+del+",");
        }

        for (char del : idDelimiters) {
            connString.append("idsep="+del+",");
        }

        connString.append("transitivity="+(transitivity?"true":"false"));

        connString.append("@"+url);
        
        return connString.toString();
    }

    public boolean isCancelled() {
        return cancelled;
    }
    
//    private static String string2octal(String str) {
//        StringBuilder ret = new StringBuilder();
//        for (char c : str.toCharArray()) {
//            ret.append("\\0");
//            ret.append(Integer.toString(c, 8));
//        }
//        return ret.toString();
//    }


    private boolean isLocal = true;
    private boolean cancelled = true;
    private int previewLimit = 100;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel advancedPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox commaIDCheckBox;
    private javax.swing.JCheckBox commaTypeCheckBox;
    private javax.swing.JPanel delemiterIDPanel;
    private javax.swing.JPanel delemiterTypePanel;
    private javax.swing.JPanel delimitedTextPanel;
    private javax.swing.JPanel delimiterPanel;
    private javax.swing.JRadioButton localRadioButton;
    private javax.swing.JButton okButton;
    private javax.swing.JCheckBox optionCheckBox;
    private javax.swing.JCheckBox otherIDCheckBox;
    private javax.swing.JTextField otherIDTextField;
    private javax.swing.JCheckBox otherTypeCheckBox;
    private javax.swing.JTextField otherTypeTextField;
    private javax.swing.JTable previewTable;
    private javax.swing.table.DefaultTableModel previewTableModel;
    private javax.swing.JRadioButton remoteRadioButton;
    private javax.swing.JCheckBox semiIDCheckBox;
    private javax.swing.JCheckBox semiTypeCheckBox;
    private javax.swing.JPanel sourcePanel;
    private javax.swing.JCheckBox spaceIDCheckBox;
    private javax.swing.JCheckBox spaceTypeCheckBox;
    private javax.swing.JCheckBox tabIDCheckBox;
    private javax.swing.JCheckBox tabTypeCheckBox;
    private javax.swing.JButton textFileButton;
    private javax.swing.JPanel textFilePanel;
    private javax.swing.JTextField textFileTextField;
    private javax.swing.JCheckBox transitivityCheckBox;
    private javax.swing.JComboBox typeComboBox;
    // End of variables declaration//GEN-END:variables

}
