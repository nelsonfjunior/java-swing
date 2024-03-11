/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package revisaoprova;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class RevisaoProva extends javax.swing.JFrame {

    public RevisaoProva() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSistema = new javax.swing.ButtonGroup();
        grupoProcessador = new javax.swing.ButtonGroup();
        menuPopUp = new javax.swing.JPopupMenu();
        cadastrar = new javax.swing.JMenuItem();
        limpar = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenuItem();
        panelPrincipal = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cidadeCombo = new javax.swing.JComboBox<>();
        versaoLabel = new javax.swing.JLabel();
        versaoCombo = new javax.swing.JComboBox<>();
        memoriaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        memoriaList = new javax.swing.JList<>();
        cadastrarBotao = new javax.swing.JButton();
        relatorioLabel = new javax.swing.JLabel();
        sistemaPanel = new javax.swing.JPanel();
        windowsRadio = new javax.swing.JRadioButton();
        linuxRadio = new javax.swing.JRadioButton();
        processadorPanel = new javax.swing.JPanel();
        intelRadio = new javax.swing.JRadioButton();
        amdRadio = new javax.swing.JRadioButton();
        hdPanel = new javax.swing.JPanel();
        check2 = new javax.swing.JCheckBox();
        check1 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        relatorioTable = new javax.swing.JTable();

        cadastrar.setText("Cadastrar");
        menuPopUp.add(cadastrar);

        limpar.setText("Limpar");
        menuPopUp.add(limpar);

        editar.setText("Editar");
        menuPopUp.add(editar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Computadores");

        nomeLabel.setText("Nome");

        cidadeLabel.setText("Cidade");

        cidadeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aracruz", "Colatina", "Serra", "Vitória" }));
        cidadeCombo.setSelectedIndex(1);
        cidadeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeComboActionPerformed(evt);
            }
        });

        versaoLabel.setText("Versão");

        versaoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versaoComboActionPerformed(evt);
            }
        });

        memoriaLabel.setText("Memória");

        memoriaList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Menos que 1GB", "1 GB", "2 GB", "3 GB", "4 GB", "Mais que 4GB" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(memoriaList);

        cadastrarBotao.setText("Cadastrar");
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });

        relatorioLabel.setText("Relatório");

        sistemaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sist. Operacional"));

        grupoSistema.add(windowsRadio);
        windowsRadio.setText("Windows");
        windowsRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowsRadioActionPerformed(evt);
            }
        });

        grupoSistema.add(linuxRadio);
        linuxRadio.setText("Linux");
        linuxRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linuxRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sistemaPanelLayout = new javax.swing.GroupLayout(sistemaPanel);
        sistemaPanel.setLayout(sistemaPanelLayout);
        sistemaPanelLayout.setHorizontalGroup(
            sistemaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sistemaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(windowsRadio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linuxRadio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        sistemaPanelLayout.setVerticalGroup(
            sistemaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemaPanelLayout.createSequentialGroup()
                .addComponent(windowsRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linuxRadio)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        processadorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Processador"));
        processadorPanel.setToolTipText("");

        grupoProcessador.add(intelRadio);
        intelRadio.setSelected(true);
        intelRadio.setText("Intel");

        grupoProcessador.add(amdRadio);
        amdRadio.setText("AMD");
        amdRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amdRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout processadorPanelLayout = new javax.swing.GroupLayout(processadorPanel);
        processadorPanel.setLayout(processadorPanelLayout);
        processadorPanelLayout.setHorizontalGroup(
            processadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processadorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(intelRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(processadorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(amdRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        processadorPanelLayout.setVerticalGroup(
            processadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processadorPanelLayout.createSequentialGroup()
                .addComponent(intelRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amdRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hdPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("HD"));

        check2.setSelected(true);
        check2.setText("500 GB");

        check1.setText("320 GB");

        check3.setText("1 TB");

        javax.swing.GroupLayout hdPanelLayout = new javax.swing.GroupLayout(hdPanel);
        hdPanel.setLayout(hdPanelLayout);
        hdPanelLayout.setHorizontalGroup(
            hdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hdPanelLayout.createSequentialGroup()
                .addGroup(hdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        hdPanelLayout.setVerticalGroup(
            hdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(check1)
                .addGap(7, 7, 7)
                .addComponent(check2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        relatorioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cidade", "SO", "Versão", "Processador", "HD", "Memória"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(relatorioTable);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(sistemaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(versaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(versaoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                                .addComponent(relatorioLabel)
                                                .addGap(94, 94, 94))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                                .addComponent(processadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(hdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadastrarBotao)
                                    .addComponent(memoriaLabel)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(cidadeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(sistemaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(processadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(versaoLabel)
                            .addComponent(memoriaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(cadastrarBotao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(versaoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(relatorioLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amdRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amdRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amdRadioActionPerformed

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        String nome = nomeText.getText();
        String cidade = (String) cidadeCombo.getSelectedItem();
        String sistema;
        if(windowsRadio.isSelected()){
            sistema = "Windows";
        }else if (linuxRadio.isSelected()){
            sistema = "Linux";
        }else{
            sistema = "Indefinido";
        }
        
        String versao = (String) versaoCombo.getSelectedItem();
        String memoria = (String) memoriaList.getSelectedValue();
        String processador;
        if(intelRadio.isSelected()){
            processador = "Intel";
        }else if(amdRadio.isSelected()){
            processador = "AMD";
        }else{
            processador = "Indefinido";
        }
        
        String hd;
        if(check1.isSelected()){
            hd = "320 GB";
        }else if(check2.isSelected()){
            hd = "500 GB";
        }else if(check3.isSelected()){
            hd = "1 TB";
        }else{
            hd = "Indefinido";
        }
        
        Pessoa p = new Pessoa(nome, cidade, sistema, versao, memoria, processador, hd);
        
        DefaultTableModel tabela = (DefaultTableModel) relatorioTable.getModel();
        tabela.addRow(p.obterDados());
        
        nomeText.setText("");
        
        
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void cidadeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeComboActionPerformed

    private void versaoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versaoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_versaoComboActionPerformed

    private void windowsRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowsRadioActionPerformed
        versaoCombo.setModel(new DefaultComboBoxModel<>(new String[]{"Win8", "Win7", "XP", "2003 Server", "2008 Server"}));
    }//GEN-LAST:event_windowsRadioActionPerformed

    private void linuxRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linuxRadioActionPerformed
        versaoCombo.setModel(new DefaultComboBoxModel<>(new String[]{"Ubuntu", "Fedora", "Red Hat", "Suse", "Debian"}));
    }//GEN-LAST:event_linuxRadioActionPerformed

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
            java.util.logging.Logger.getLogger(RevisaoProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RevisaoProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RevisaoProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RevisaoProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevisaoProva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amdRadio;
    private javax.swing.JMenuItem cadastrar;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JComboBox<String> cidadeCombo;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JMenuItem editar;
    private javax.swing.ButtonGroup grupoProcessador;
    private javax.swing.ButtonGroup grupoSistema;
    private javax.swing.JPanel hdPanel;
    private javax.swing.JRadioButton intelRadio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem limpar;
    private javax.swing.JRadioButton linuxRadio;
    private javax.swing.JLabel memoriaLabel;
    private javax.swing.JList<String> memoriaList;
    private javax.swing.JPopupMenu menuPopUp;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel processadorPanel;
    private javax.swing.JLabel relatorioLabel;
    private javax.swing.JTable relatorioTable;
    private javax.swing.JPanel sistemaPanel;
    private javax.swing.JComboBox<String> versaoCombo;
    private javax.swing.JLabel versaoLabel;
    private javax.swing.JRadioButton windowsRadio;
    // End of variables declaration//GEN-END:variables
}
