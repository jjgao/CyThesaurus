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

import csplugins.id.mapping.IDMapperClientManager;
import csplugins.id.mapping.util.DataSourceWrapper;

import cytoscape.Cytoscape;
import cytoscape.CyNetwork;
import cytoscape.data.CyAttributes;
import cytoscape.task.Task;
import cytoscape.task.TaskMonitor;
import cytoscape.task.ui.JTaskConfig;
import cytoscape.task.util.TaskManager;

import javax.swing.AbstractListModel;
import javax.swing.ListCellRenderer;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.JOptionPane;

import java.awt.Component;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

/**
 *
 * @author gjj
 */
public class CyThesaurusDialog extends javax.swing.JDialog {

    /** Creates new form CyThesaurusDialog */
    public CyThesaurusDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        postInit();
    }

    public void postInit() {
        updateOKButtonEnable();

        sourceAttributeSelectionTable.setIDTypeSelectionChangedListener(
                new CheckComboBoxSelectionChangedListener() {
            public void selectionChanged(int idx) {
                setSupportedTgtTypesInTable();
            }
        });
        setSupportedSrcTypesInTable();
        
       // sourceAttributeSelectionTable.addRow();

        setSupportedTgtTypesInTable();
        targetAttributeSelectionTable.addRow();

        setSelectedNetworkInSrcTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel sourcePanel = new javax.swing.JPanel();
        javax.swing.JScrollPane sourceScrollPane = new javax.swing.JScrollPane();
        javax.swing.JPanel addRemoveSourcePanel = new javax.swing.JPanel();
        javax.swing.JPanel destinationPanel = new javax.swing.JPanel();
        javax.swing.JScrollPane destinationScrollPane = new javax.swing.JScrollPane();
        javax.swing.JPanel addRemoveDestinationPanel = new javax.swing.JPanel();
        javax.swing.JPanel typeSourceConfPanel = new javax.swing.JPanel();
        javax.swing.JButton srcConfBtn = new javax.swing.JButton();
        javax.swing.JPanel OKPanel = new javax.swing.JPanel();
        OKBtn = new javax.swing.JButton();
        javax.swing.JButton cancelBtn = new javax.swing.JButton();
        javax.swing.JPanel selectNetworkPanel = new javax.swing.JPanel();
        javax.swing.JScrollPane unselectedNetworkScrollPane = new javax.swing.JScrollPane();
        unselectedNetworkData = new SortedNetworkListModel();
        unselectedNetworkList = new javax.swing.JList(unselectedNetworkData);
        javax.swing.JPanel lrButtonPanel = new javax.swing.JPanel();
        rightButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        javax.swing.JScrollPane selectedNetworkScrollPane = new javax.swing.JScrollPane();
        selectedNetworkData = new SortedNetworkListModel();
        selectedNetworkList = new javax.swing.JList(selectedNetworkData);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CyThesaurus plugin");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        sourcePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Select source attribute/IDType(s)"));
        sourcePanel.setMinimumSize(new java.awt.Dimension(500, 120));
        sourcePanel.setPreferredSize(new java.awt.Dimension(500, 140));
        sourcePanel.setLayout(new java.awt.GridBagLayout());

        sourceScrollPane.setMinimumSize(new java.awt.Dimension(300, 100));

        sourceAttributeSelectionTable = new SourceAttributeSelectionTable();
        sourceScrollPane.setViewportView(sourceAttributeSelectionTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        sourcePanel.add(sourceScrollPane, gridBagConstraints);

        addRemoveSourcePanel.setLayout(new javax.swing.BoxLayout(addRemoveSourcePanel, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        sourcePanel.add(addRemoveSourcePanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(sourcePanel, gridBagConstraints);

        destinationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Select destination attribute/IDType(s)"));
        destinationPanel.setMinimumSize(new java.awt.Dimension(500, 130));
        destinationPanel.setPreferredSize(new java.awt.Dimension(500, 140));
        destinationPanel.setLayout(new java.awt.GridBagLayout());

        destinationScrollPane.setMinimumSize(new java.awt.Dimension(300, 100));
        destinationScrollPane.setPreferredSize(new java.awt.Dimension(300, 100));

        targetAttributeSelectionTable = new csplugins.id.mapping.ui.TargetAttributeSelectionTable();
        destinationScrollPane.setViewportView(targetAttributeSelectionTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        destinationPanel.add(destinationScrollPane, gridBagConstraints);

        addRemoveDestinationPanel.setLayout(new javax.swing.BoxLayout(addRemoveDestinationPanel, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        destinationPanel.add(addRemoveDestinationPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(destinationPanel, gridBagConstraints);

        srcConfBtn.setText("ID Mapping Resources Configuration");
        srcConfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcConfBtnActionPerformed(evt);
            }
        });
        typeSourceConfPanel.add(srcConfBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(typeSourceConfPanel, gridBagConstraints);

        OKBtn.setText("   OK   ");
        OKBtn.setEnabled(false);
        OKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBtnActionPerformed(evt);
            }
        });
        OKPanel.add(OKBtn);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        OKPanel.add(cancelBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(OKPanel, gridBagConstraints);

        selectNetworkPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Please select networks"));
        selectNetworkPanel.setMinimumSize(new java.awt.Dimension(490, 100));
        selectNetworkPanel.setPreferredSize(new java.awt.Dimension(800, 120));
        selectNetworkPanel.setLayout(new java.awt.GridBagLayout());

        unselectedNetworkScrollPane.setPreferredSize(new java.awt.Dimension(200, 100));

        unselectedNetworkList.setBorder(javax.swing.BorderFactory.createTitledBorder("Availabe networks"));
        for (Iterator<CyNetwork> it = Cytoscape.getNetworkSet().iterator(); it.hasNext(); ) {
            CyNetwork network = it.next();
            if (network != Cytoscape.getCurrentNetwork())
            unselectedNetworkData.add(network);
        }

        unselectedNetworkList.setCellRenderer(new ListCellRenderer() {
            private DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
            public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
                JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                renderer.setText(((CyNetwork)value).getTitle());
                return renderer;
            }
        });

        unselectedNetworkList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                int index = unselectedNetworkList.getMinSelectionIndex();
                if (index>-1) {
                    selectedNetworkList.getSelectionModel().clearSelection();
                    rightButton.setEnabled(true);
                } else {
                    rightButton.setEnabled(false);
                }
            }
        });
        unselectedNetworkScrollPane.setViewportView(unselectedNetworkList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        selectNetworkPanel.add(unselectedNetworkScrollPane, gridBagConstraints);

        lrButtonPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 2));

        rightButton.setText(">");
        rightButton.setEnabled(false);
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int [] indices = unselectedNetworkList.getSelectedIndices();
                if (indices == null || indices.length == 0) {
                    return;
                }

                for (int i= indices.length-1; i>=0; i--) {
                    CyNetwork removed = unselectedNetworkData.removeElement(indices[i]);
                    selectedNetworkData.add(removed);
                }

                if (unselectedNetworkData.getSize()==0) {
                    unselectedNetworkList.clearSelection();
                    rightButton.setEnabled(false);
                } else {
                    int minindex = unselectedNetworkList.getMinSelectionIndex();
                    if (minindex>= unselectedNetworkData.getSize()) {
                        minindex = 0;
                    }
                    unselectedNetworkList.setSelectedIndex(minindex);
                }

                selectedNetworkList.repaint();
                unselectedNetworkList.repaint();

                updateOKButtonEnable();

                setSelectedNetworkInSrcTable();
            }
        });
        lrButtonPanel.add(rightButton);

        leftButton.setText("<");
        leftButton.setEnabled(false);
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int [] indices = selectedNetworkList.getSelectedIndices();
                if (indices == null || indices.length == 0) {
                    return;
                }

                for (int i= indices.length-1; i>=0; i--) {
                    CyNetwork removed = selectedNetworkData.removeElement(indices[i]);
                    unselectedNetworkData.add(removed);
                }

                if (selectedNetworkData.getSize()==0) {
                    selectedNetworkList.clearSelection();
                    leftButton.setEnabled(false);
                } else {
                    int minindex = selectedNetworkList.getMinSelectionIndex();
                    if (minindex>= selectedNetworkData.getSize()) {
                        minindex = 0;
                    }
                    selectedNetworkList.setSelectedIndex(minindex);
                }

                selectedNetworkList.repaint();
                unselectedNetworkList.repaint();
                updateOKButtonEnable();

                setSelectedNetworkInSrcTable();
            }
        });
        lrButtonPanel.add(leftButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        selectNetworkPanel.add(lrButtonPanel, gridBagConstraints);

        selectedNetworkScrollPane.setPreferredSize(new java.awt.Dimension(200, 100));

        selectedNetworkList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        selectedNetworkList.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Networks"));
        CyNetwork currNet = Cytoscape.getCurrentNetwork();
        if (currNet!=Cytoscape.getNullNetwork()) {
            selectedNetworkData.add(currNet);
        }
        selectedNetworkList.setCellRenderer(new ListCellRenderer() {
            private DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
            public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
                JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                renderer.setText(((CyNetwork)value).getTitle());
                return renderer;
            }
        });
        selectedNetworkList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                int index = selectedNetworkList.getMinSelectionIndex();
                if (index>-1) {
                    unselectedNetworkList.getSelectionModel().clearSelection();
                    leftButton.setEnabled(true);
                } else {
                    leftButton.setEnabled(false);
                }
            }
        });
        selectedNetworkScrollPane.setViewportView(selectedNetworkList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        selectNetworkPanel.add(selectedNetworkScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(selectNetworkPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void srcConfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcConfBtnActionPerformed
        IDMappingSourceConfigDialog srcConfDialog = new IDMappingSourceConfigDialog(this, true);
        srcConfDialog.setLocationRelativeTo(this);
        srcConfDialog.setVisible(true);

        if (srcConfDialog.isModified()) {
            final JTaskConfig jTaskConfig = new JTaskConfig();
            jTaskConfig.setOwner(Cytoscape.getDesktop());
            jTaskConfig.displayCloseButton(false);
            jTaskConfig.displayCancelButton(false);
            jTaskConfig.displayStatus(true);
            jTaskConfig.setAutoDispose(true);
            jTaskConfig.setMillisToPopup(100); // always pop the task

            // Execute Task in New Thread; pop open JTask Dialog Box.
            TaskManager.executeTask(new ApplySourceChangeTask(), jTaskConfig);
        }
    }//GEN-LAST:event_srcConfBtnActionPerformed

    private void OKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBtnActionPerformed
        if (!verifyUserInput()) return;

        Set<CyNetwork> networks = new HashSet(selectedNetworkData.getNetworks());
        Map<String,Set<DataSourceWrapper>> mapSrcAttrIDTypes = sourceAttributeSelectionTable.getSourceAttrType();
        Map<String, DataSourceWrapper> mapTgtAttrNameIDType = targetAttributeSelectionTable.getMapAttrNameIDType();
        Map<String,Byte> mapTgtAttrNameAttrType = targetAttributeSelectionTable.getMapAttrNameAttrType();

//        // define target attributes
//        defineTgtAttributes(mapTgtAttrNameAttrType);

        // execute task
        AttributeBasedIDMappingTask task
                = new AttributeBasedIDMappingTask(networks, mapSrcAttrIDTypes, mapTgtAttrNameIDType, mapTgtAttrNameAttrType);
        // Configure JTask Dialog Pop-Up Box
        final JTaskConfig jTaskConfig = new JTaskConfig();
        jTaskConfig.setOwner(Cytoscape.getDesktop());
        jTaskConfig.displayCloseButton(true);
        jTaskConfig.displayCancelButton(false);
        jTaskConfig.displayStatus(true);
        jTaskConfig.setAutoDispose(false);
        jTaskConfig.setMillisToPopup(0); // always pop the task

        // Execute Task in New Thread; pop open JTask Dialog Box.
        TaskManager.executeTask(task, jTaskConfig);
        boolean succ = task.success();

        if (succ) {
            this.setVisible(false);
            this.dispose();
            cancelled = false;
        } else {
            //Delete the new attributes
            CyAttributes nodeAttributes = Cytoscape.getNodeAttributes();
            for (String attrName : mapTgtAttrNameAttrType.keySet()) {
                nodeAttributes.deleteAttribute(attrName);
            }
        }
    }//GEN-LAST:event_OKBtnActionPerformed

    private boolean verifyUserInput() {
        if (selectedNetworkData.getNetworks().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select at least one network.");
            return false;
        }

        if (IDMapperClientManager.countClients()==0) {
            JOptionPane.showMessageDialog(this, "No source ID type available. Please configure the sources of ID mapping first.");
            return false;
        }

//        if (types[1].isEmpty()) {
//            JOptionPane.showMessageDialog(this, "No target ID type available. Please configure the sources of ID mapping first.");
//            return false;
//        }

        Map<String,Set<DataSourceWrapper>> mapSrcAttrIDTypes = sourceAttributeSelectionTable.getSourceAttrType();
        for (Set<DataSourceWrapper> dss : mapSrcAttrIDTypes.values()) {
            if (dss==null || dss.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select at least one ID type for each source attribute.");
                return false;
            }
        }

        CyAttributes nodeAttributes = Cytoscape.getNodeAttributes();
        List<String> existAttrNames = Arrays.asList(nodeAttributes.getAttributeNames());
        List<String> attrNames = targetAttributeSelectionTable.getTgtAttrNames();
        if (!Collections.disjoint(attrNames, existAttrNames)) { // overlap between new and existing attribute
            JOptionPane.showMessageDialog(this, "Target attributes must have new names.");
            return false;
        }
        if (attrNames.contains("ID")) {
            JOptionPane.showMessageDialog(this, "\"ID\" is researved and cannot be used for the new attribute name.");
            return false;
        }
        if (attrNames.contains("")) {
            JOptionPane.showMessageDialog(this, "The new attribute name cannot be empty.");
            return false;
        }

        Set<String> attrNamesNR = new HashSet(attrNames);
        if (attrNamesNR.size()!=attrNames.size()) { //same name
            JOptionPane.showMessageDialog(this, "Target attributes must have different names.");
            return false;
        }

//        List<String> idTypes = targetAttributeSelectionTable.getTgtIDTypes();
//        Set<String> idTypesNR = new HashSet(idTypes);
//        // TODO: problem when id type and attribute have the same name
//        if (idTypesNR.size()!=idTypes.size()) {
//            JOptionPane.showMessageDialog(this, "At most one target attribute is allowed for each ID type.");
//            return false;
//        }

        return true;
    }
    
    private void updateOKButtonEnable() {
        if (selectedNetworkData.getSize()==0) {
            OKBtn.setEnabled(false);
            OKBtn.setToolTipText("None of the networks was selected!");
        }

        OKBtn.setEnabled(true);
        OKBtn.setToolTipText(null);

        OKBtn.repaint();
    }

    private void setSupportedSrcTypesInTable() {
        sourceAttributeSelectionTable.setSupportedIDType();
    }

    private void setSupportedTgtTypesInTable() {
        Set<DataSourceWrapper> sourceDss = sourceAttributeSelectionTable.getSelectedIDTypes();
        targetAttributeSelectionTable.setSupportedIDType(sourceDss);
    }

    private void setSelectedNetworkInSrcTable() {
        Collection networks = selectedNetworkData.getNetworks();
        sourceAttributeSelectionTable.setSelectedNetworks(networks);
    }

//    private Set<DataSource>[] getSupportedType() {
//        Set<DataSource>[] ret = new Set[2];
//        ret[0] = new HashSet();
//        ret[1] = ret[0];
//
//        IDMapperStack stack = IDMapperClientManager.selectedIDMapperStack();
//        try {
//            ret[0] = stack.getCapabilities().getSupportedSrcDataSources();
//            ret[1] = stack.getCapabilities().getSupportedTgtDataSources();
//        } catch (IDMapperException ex) {
//            ex.printStackTrace();
//        }
//
//        return ret;
//    }
//
//    private void defineTgtAttributes(Map<String,Byte> attrNameType) {
//        CyAttributes nodeAttributes = Cytoscape.getNodeAttributes();
//        MultiHashMapDefinition mmapDef = nodeAttributes.getMultiHashMapDefinition();
//
//        for (Map.Entry<String,Byte> entry : attrNameType.entrySet()) {
//            String attrname = entry.getKey();
//            byte attrtype = entry.getValue();
//
//            byte[] keyTypes;
//            if (attrtype==CyAttributes.TYPE_STRING) {
//                    keyTypes = null;
//            } else if (attrtype==CyAttributes.TYPE_SIMPLE_LIST ) {
//                    keyTypes = new byte[] { MultiHashMapDefinition.TYPE_INTEGER };
//            } else {
//                    keyTypes = null;
//            }
//
//            mmapDef.defineAttribute(attrname,
//                                    MultiHashMapDefinition.TYPE_STRING,
//                                    keyTypes);
//        }
//    }

    public Map<String,Set<DataSourceWrapper>> getMapSrcAttrIDTypes() {
        Map<String,Set<DataSourceWrapper>> mapSrcAttrIDTypes = sourceAttributeSelectionTable.getSourceAttrType();
        return mapSrcAttrIDTypes;
    }

    public void setMapSrcAttrIDTypes(Map<String,Set<DataSourceWrapper>> mapSrcAttrIDTypes) {
        sourceAttributeSelectionTable.setSourceAttrType(mapSrcAttrIDTypes);
        this.setSupportedTgtTypesInTable();
    }

    public boolean isCancelled() {
        return cancelled;
    }

    private SourceAttributeSelectionTable sourceAttributeSelectionTable;
    private TargetAttributeSelectionTable targetAttributeSelectionTable;
    private boolean cancelled = true;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKBtn;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JList selectedNetworkList;
    private SortedNetworkListModel selectedNetworkData;
    private javax.swing.JList unselectedNetworkList;
    private SortedNetworkListModel unselectedNetworkData;
    // End of variables declaration//GEN-END:variables

    private class SortedNetworkListModel extends AbstractListModel {
        // Using a SortedMap from String to network
        TreeMap<String,CyNetwork> model;

        public SortedNetworkListModel() {
            model= new TreeMap<String,CyNetwork>();
        }

        //@Override
        public int getSize() {
            return model.size();
        }

        //@Override
        public CyNetwork getElementAt(int index) {
            return (CyNetwork) model.values().toArray()[index];
        }

        public void add(CyNetwork network) {
            String title = network.getTitle();
            model.put(title.toUpperCase(),network);
            fireContentsChanged(this, 0, getSize());
        }

        public CyNetwork removeElement(int index) {
            CyNetwork removed = model.remove(getElementAt(index).getTitle().toUpperCase());
            if (removed!=null) {
                fireContentsChanged(this, 0, getSize());
            }
            return removed;
        }

        public Collection<CyNetwork> getNetworks() {
            return model.values();
        }
    }


    private class ApplySourceChangeTask implements Task {
        private TaskMonitor taskMonitor;

        public ApplySourceChangeTask() {
        }

        /**
         * Executes Task.
         */
        //@Override
        public void run() {
                try {
                        taskMonitor.setStatus("Applying...");
                        setSupportedSrcTypesInTable();
                        setSupportedTgtTypesInTable();
                        setSelectedNetworkInSrcTable();
                        taskMonitor.setPercentCompleted(100);
                } catch (Exception e) {
                        taskMonitor.setPercentCompleted(100);
                        taskMonitor.setStatus("Failed.\n");
                        e.printStackTrace();
                }
        }

        /**
         * Halts the Task: Not Currently Implemented.
         */
        //@Override
        public void halt() {

        }

        /**
         * Sets the Task Monitor.
         *
         * @param taskMonitor
         *            TaskMonitor Object.
         */
        //@Override
        public void setTaskMonitor(TaskMonitor taskMonitor) throws IllegalThreadStateException {
                this.taskMonitor = taskMonitor;
        }

        /**
         * Gets the Task Title.
         *
         * @return Task Title.
         */
        //@Override
        public String getTitle() {
                return "Apply changes";
        }
    }
}


