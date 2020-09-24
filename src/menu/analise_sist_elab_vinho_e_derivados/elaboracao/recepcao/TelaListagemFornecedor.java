/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jExcel.JExcel;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import jxl.write.WriteException;

/**
 *
 * @author joao
 */
public class TelaListagemFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaListagemFermentacao
     */
    FornecedorTableModel tableModel = new FornecedorTableModel();
    List<Fornecedor> fornecedores = new ArrayList<>();
    
    public TelaListagemFornecedor() {
        initComponents();
        
        initFornecedores();
        initJTableFornecedores();
        inativaBotoes();
   }
    
    private void initFornecedores() {
        fornecedores.add(new Fornecedor("1", "Aurora", "Auror", "13506-743", "Rua 9B", "1323", "São Paulo", "Rio Claro", "Vila Nova", "perto da Unesp", "(54)3455-00135", "sac@vinicolaaurora.com.br", "Link do nosso site: http://www.vinicolaaurora.com.br/br"));
        fornecedores.add(new Fornecedor("2", "Aurora2", "Auror", "13506-743", "Rua 9B", "1323", "São Paulo", "Rio Claro", "Vila Nova", "perto da Unesp", "(54)3452-00146", "sac@vinicolaaurora.com.br", "Link do nosso site: http://www.vinicolaaurora.com.br/br"));
        
        // fornecedores = SerializeListagemFornecedor.load();
    }
    
    private void inativaBotoes() {
        jButtonExportarTabela.setEnabled(false);
        jButtonVisualizar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonRemover.setEnabled(false);
    }
    
    private void ativaBotoes() {
        jButtonExportarTabela.setEnabled(true);
        jButtonVisualizar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonRemover.setEnabled(true);
    }
    
    private void initJTableFornecedores() {
        jTableFornecedores.setModel(tableModel);
        jTableFornecedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        jTableFornecedores.getSelectionModel().addListSelectionListener(
            new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jTableFornecedores.getSelectedRow() == -1) {
                        inativaBotoes();
                    } else {
                        ativaBotoes();
                    }
                }
            }
        );
        
        fornecedores.forEach(f -> {
            tableModel.addRow(f);
        });
    }

    public void setPosicaoCentro() {
        Dimension d = this.getDesktopPane().getSize();
        System.out.println(d.width);
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    private void configuraCamposCadastroFornecedor(TelaCadastroFornecedor tcf, int indexSelectedRow) {
        tcf.jTextFieldCodigo.setText(tableModel.getValueAt(indexSelectedRow, 0).toString());
        tcf.jTextFieldRazaoSocial.setText(tableModel.getValueAt(indexSelectedRow, 1).toString());
        tcf.jTextFieldNome.setText(tableModel.getValueAt(indexSelectedRow, 2).toString());
        tcf.jFormattedTextFieldCep.setText(tableModel.getValueAt(indexSelectedRow, 3).toString());
        tcf.jTextFieldLogradouro.setText(tableModel.getValueAt(indexSelectedRow, 4).toString());
        tcf.jFormattedTextFieldNumero.setText(tableModel.getValueAt(indexSelectedRow, 5).toString());
        tcf.jComboBoxEstado.setSelectedItem(tableModel.getValueAt(indexSelectedRow, 6).toString());
        tcf.jTextFieldCidade.setText(tableModel.getValueAt(indexSelectedRow, 7).toString());
        tcf.jTextFieldBairro.setText(tableModel.getValueAt(indexSelectedRow, 8).toString());
        tcf.jTextFieldComplemento.setText(tableModel.getValueAt(indexSelectedRow, 9).toString());
        tcf.jFormattedTextFieldTel.setText(tableModel.getValueAt(indexSelectedRow, 10).toString());
        tcf.jTextFieldEmail.setText(tableModel.getValueAt(indexSelectedRow, 11).toString());
        tcf.jTextAreaAnotacoes.setText(tableModel.getValueAt(indexSelectedRow, 12).toString());
    }
    
    private void inativaCamposCadastroFornecedor(TelaCadastroFornecedor tcf) {
        tcf.jTextFieldCodigo.setEnabled(false);
        tcf.jTextFieldRazaoSocial.setEnabled(false);
        tcf.jTextFieldNome.setEnabled(false);
        tcf.jFormattedTextFieldCep.setEnabled(false);
        tcf.jTextFieldLogradouro.setEnabled(false);
        tcf.jFormattedTextFieldNumero.setEnabled(false);
        tcf.jComboBoxEstado.setEnabled(false);
        tcf.jTextFieldCidade.setEnabled(false);
        tcf.jTextFieldBairro.setEnabled(false);
        tcf.jTextFieldComplemento.setEnabled(false);
        tcf.jFormattedTextFieldTel.setEnabled(false);
        tcf.jTextFieldEmail.setEnabled(false);
        tcf.jTextAreaAnotacoes.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedores = new javax.swing.JTable();
        jButtonExportarTabela = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listagem de Cadastros de Fornecedor");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Código");

        jButtonPesquisar.setBackground(java.awt.Color.blue);
        jButtonPesquisar.setText("Pesquisar");

        jButtonNovo.setBackground(java.awt.Color.green);
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(java.awt.Color.orange);
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonRemover.setBackground(java.awt.Color.red);
        jButtonRemover.setText("Remover");

        jButtonVisualizar.setBackground(java.awt.Color.blue);
        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButton7.setBackground(java.awt.Color.red);
        jButton7.setText("Limpar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Aurora", "Aurora", "Rua Olavo Bilac", "Cidade Alta", "Bento Gonçalves", "RS", "95700-000 ", " (54) 3455-2000", "sac@vinicolaaurora.com.br", "Link do nosso site: http://www.vinicolaaurora.com.br/br"}
            },
            new String [] {
                "Código", "Razão Social / Propriedade", "Nome", "Logradouro", "Bairro", "Cidade", "Estado", "CEP", "Telefone", "E-mail", "Anotações"
            }
        ));
        jScrollPane1.setViewportView(jTableFornecedores);

        jButtonExportarTabela.setBackground(new java.awt.Color(0, 100, 0));
        jButtonExportarTabela.setText("Exportar tabela");
        jButtonExportarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExportarTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNovo)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonVisualizar)
                    .addComponent(jButtonExportarTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
        );

        setBounds(0, 0, 921, 664);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        int indexSelectedRow = jTableFornecedores.getSelectedRow();
        
        if (indexSelectedRow != -1) {
            TelaCadastroFornecedor tcf = new TelaCadastroFornecedor();
            tcf.setVisible(true);
            configuraCamposCadastroFornecedor(tcf, indexSelectedRow);
            inativaCamposCadastroFornecedor(tcf);
        }     
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        TelaCadastroFornecedor tcf = new TelaCadastroFornecedor();
        tcf.setVisible(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonExportarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarTabelaActionPerformed
        JExcel jExcel = new JExcel();
        String[] columnsName = tableModel.columns;
        List<String[]> rows = new ArrayList<>();
        
        tableModel.fornecedores.forEach(fornecedor -> {
            rows.add(fornecedor.getArray());
        });
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        try {
            jExcel.export(dtf.format(now) + "_tabela_fornecedores", columnsName, rows);
        } catch (WriteException | IOException ex) {
            Logger.getLogger(TelaListagemFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonExportarTabelaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextFieldCodigo.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int indexSelectedRow = jTableFornecedores.getSelectedRow();
        
        if (indexSelectedRow != -1) {
            TelaCadastroFornecedor tcf = new TelaCadastroFornecedor();
            tcf.setVisible(true);
            configuraCamposCadastroFornecedor(tcf, indexSelectedRow);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        SerializeListagemFornecedor.save(fornecedores);
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExportarTabela;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedores;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}
