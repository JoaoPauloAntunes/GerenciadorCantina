/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jExcel.JExcel;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
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
    
    public TelaListagemFornecedor() {
        initComponents();
        jTableFornecedores.setModel(tableModel);
        
        Fornecedor fornecedor = new Fornecedor("1", "Aurora", "Aurora", "Rua Olavo Bilac", "Cidade Alta", "Bento Gonçalves", "RS", "95700-000", "(54) 3455-200", "sac@vinicolaaurora.com.br", "Link do nosso site: http://www.vinicolaaurora.com.br/br");
        tableModel.addRow(fornecedor);
    }

    public void setPosicaoCentro() {
        Dimension d = this.getDesktopPane().getSize();
        System.out.println(d.width);
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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

        jLabel1.setText("Código");

        jButton1.setText("Pesquisar");

        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");

        jButton4.setText("Remover");

        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButton7.setText("Limpar");

        jTableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Aurora", "Aurora", "Rua Olavo Bilac", "Cidade Alta", "Bento Gonçalves", "RS", "95700-000 ", " (54) 3455-2000", "sac@vinicolaaurora.com.br", "Link do nosso site: http://www.vinicolaaurora.com.br/br"}
            },
            new String [] {
                "Código", "Razão Social / Propriedade", "Nome", "Logradouro", "Bairro", "Cidade", "Estado", "CEP", "Telefone", "E-mail", "Anotações"
            }
        ));
        jScrollPane1.setViewportView(jTableFornecedores);

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
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButtonVisualizar)
                    .addComponent(jButtonExportarTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
        );

        setBounds(0, 0, 921, 664);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        int indexSelectedRow;
        String codigo;
        
        indexSelectedRow = jTableFornecedores.getSelectedRow();
        
        if (indexSelectedRow != -1) {
            codigo = jTableFornecedores.getValueAt(indexSelectedRow, 0).toString();
            System.out.println(codigo);
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            telaCadastroFornecedor.setVisible(true);
        }        
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
        telaCadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonExportarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarTabelaActionPerformed
        JExcel jExcel = new JExcel();
        String[] columnsName = tableModel.columns;
        List<String[]> rows = new ArrayList<>();
        
        for(Fornecedor fornecedor : tableModel.fornecedores) {
            rows.add(fornecedor.getArray());
        }

        try {
            jExcel.export("2020-09-21_tabela_fornecedores", columnsName, rows);
        } catch (WriteException ex) {
            Logger.getLogger(TelaListagemFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaListagemFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonExportarTabelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonExportarTabela;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedores;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
