/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.analise_sist_elab_vinho_e_derivados.elaboracao.fermentacao;

import jExcel.JExcel;
import java.awt.Dimension;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jxl.write.WriteException;
import menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao.Fornecedor;
import menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao.TelaListagemFornecedor;


public class TelaListagemFermentacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaListagemFermentacao
     */
    public TelaListagemFermentacao() {
        initComponents();
        Arquivo.leitura(jTable1);
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
        jtPesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonVisualizar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listagem de Cadastros de Fermentação");
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

        btPesquisa.setBackground(java.awt.Color.blue);
        btPesquisa.setText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        btNovo.setBackground(java.awt.Color.blue);
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.red);
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btRemove.setBackground(java.awt.Color.green);
        btRemove.setText("Remover");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Data de enchimento", "Nº Tanque de Fermentação", "Volume", "Origem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonVisualizar.setBackground(java.awt.Color.orange);
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

        jButton1.setBackground(new java.awt.Color(0, 100, 0));
        jButton1.setText("Exportar tabela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRemove)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisa)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(jButton3)
                    .addComponent(btRemove)
                    .addComponent(jButtonVisualizar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        setBounds(0, 0, 709, 563);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        visualizaLinha();   
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        TelaCadastroFermentacao telaCadastroFermentacao = new TelaCadastroFermentacao();
        telaCadastroFermentacao.setVisible(true);
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Arquivo.salvar(jTable1);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        editaLinha();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        // botao remover
        removeLinha();
        
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
       // botao pesquisar
       pesquisaLinha();
       
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //botao limpar
        jtPesquisa.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // exportar tabela
        Arquivo.salvar(jTable1);
        exportaTabela();
               
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jtPesquisa;
    // End of variables declaration//GEN-END:variables


    private void visualizaLinha()
    {
        
        int indexSelectedRow;
        indexSelectedRow = jTable1.getSelectedRow();
        VisualizaCadastroFermentacao.aux = indexSelectedRow;
        if (indexSelectedRow != -1) {
        VisualizaCadastroFermentacao vcf1 = new VisualizaCadastroFermentacao();
        vcf1.setVisible(true);
        
        VisualizaCadastroFermentacao.jtCodigo.setEnabled(false);
        VisualizaCadastroFermentacao.jtDescricao.setEnabled(false);
        VisualizaCadastroFermentacao.jtData.setEnabled(false);
        VisualizaCadastroFermentacao.jtVolume.setEnabled(false);
        VisualizaCadastroFermentacao.jtNumeroTanque.setEnabled(false);
        VisualizaCadastroFermentacao.jtOrigem.setEnabled(false);
        VisualizaCadastroFermentacao.btSalvar.setVisible(false);
        VisualizaCadastroFermentacao.btCancelar.setVisible(false);
        
       
        
        VisualizaCadastroFermentacao.jtCodigo.setText(jTable1.getValueAt(indexSelectedRow, 0).toString());
        VisualizaCadastroFermentacao.jtDescricao.setText(jTable1.getValueAt(indexSelectedRow, 1).toString());
        VisualizaCadastroFermentacao.jtData.setText(jTable1.getValueAt(indexSelectedRow, 2).toString());
        VisualizaCadastroFermentacao.jtNumeroTanque.setText(jTable1.getValueAt(indexSelectedRow, 3).toString());
        VisualizaCadastroFermentacao.jtVolume.setText(jTable1.getValueAt(indexSelectedRow, 4).toString());
        VisualizaCadastroFermentacao.jtOrigem.setText(jTable1.getValueAt(indexSelectedRow, 5).toString());
        }
        
        
        
    }
    private void editaLinha()
    {
        int indexSelectedRow;
        indexSelectedRow = jTable1.getSelectedRow();
        VisualizaCadastroFermentacao.aux = indexSelectedRow;
        
        if (indexSelectedRow != -1) {
        VisualizaCadastroFermentacao vcf1 = new VisualizaCadastroFermentacao();
        vcf1.setVisible(true);
        
        VisualizaCadastroFermentacao.jtCodigo.setEnabled(true);
        VisualizaCadastroFermentacao.jtDescricao.setEnabled(true);
        VisualizaCadastroFermentacao.jtData.setEnabled(true);
        VisualizaCadastroFermentacao.jtVolume.setEnabled(true);
        VisualizaCadastroFermentacao.jtNumeroTanque.setEnabled(true);
        VisualizaCadastroFermentacao.jtOrigem.setEnabled(true);
        VisualizaCadastroFermentacao.jButton1.setVisible(false);
        VisualizaCadastroFermentacao.btSalvar.setVisible(true);
        VisualizaCadastroFermentacao.btCancelar.setVisible(true);
        
       
        
        VisualizaCadastroFermentacao.jtCodigo.setText(jTable1.getValueAt(indexSelectedRow, 0).toString());
        VisualizaCadastroFermentacao.jtDescricao.setText(jTable1.getValueAt(indexSelectedRow, 1).toString());
        VisualizaCadastroFermentacao.jtData.setText(jTable1.getValueAt(indexSelectedRow, 2).toString());
        VisualizaCadastroFermentacao.jtNumeroTanque.setText(jTable1.getValueAt(indexSelectedRow, 3).toString());
        VisualizaCadastroFermentacao.jtVolume.setText(jTable1.getValueAt(indexSelectedRow, 4).toString());
        VisualizaCadastroFermentacao.jtOrigem.setText(jTable1.getValueAt(indexSelectedRow, 5).toString());
        }
    }
    private void removeLinha()
    {
        int indexSelectedRow;
        indexSelectedRow = jTable1.getSelectedRow();
        
        if (indexSelectedRow != -1) {
            DefaultTableModel dtmDados = (DefaultTableModel)jTable1.getModel();
            dtmDados.removeRow(indexSelectedRow);
        }
    }
    private void pesquisaLinha()
    {
        for (int i =0; i<jTable1.getRowCount();i++)
        {
            
            String codigo = (String)jTable1.getValueAt(i, 0);
            String pesquisa = jtPesquisa.getText();

            if(pesquisa.equals(codigo))
            {
                int indexRow;
                indexRow = i;

                VisualizaCadastroFermentacao vcf1 = new VisualizaCadastroFermentacao();
                vcf1.setVisible(true);

                VisualizaCadastroFermentacao.jtCodigo.setEnabled(false);
                VisualizaCadastroFermentacao.jtDescricao.setEnabled(false);
                VisualizaCadastroFermentacao.jtData.setEnabled(false);
                VisualizaCadastroFermentacao.jtVolume.setEnabled(false);
                VisualizaCadastroFermentacao.jtNumeroTanque.setEnabled(false);
                VisualizaCadastroFermentacao.jtOrigem.setEnabled(false);
                VisualizaCadastroFermentacao.btSalvar.setVisible(false);
                VisualizaCadastroFermentacao.btCancelar.setVisible(false);

                VisualizaCadastroFermentacao.jtCodigo.setText(jTable1.getValueAt(indexRow, 0).toString());
                VisualizaCadastroFermentacao.jtDescricao.setText(jTable1.getValueAt(indexRow, 1).toString());
                VisualizaCadastroFermentacao.jtData.setText(jTable1.getValueAt(indexRow, 2).toString());
                VisualizaCadastroFermentacao.jtNumeroTanque.setText(jTable1.getValueAt(indexRow, 3).toString());
                VisualizaCadastroFermentacao.jtVolume.setText(jTable1.getValueAt(indexRow, 4).toString());
                VisualizaCadastroFermentacao.jtOrigem.setText(jTable1.getValueAt(indexRow, 5).toString());
                
            }
        }
        

        
        
        
    }
    private void exportaTabela()
    {
        Arquivo arq = new Arquivo();
        arq.auxLeitura(jTable1);
        FermentacaoTableModel tableModel = new FermentacaoTableModel();

        JExcel jExcel = new JExcel();
        String[] columnsName = tableModel.columns;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        try {
            jExcel.export(dtf.format(now) + "_tabela_fermentacao", columnsName, arq.rows);
        } catch (WriteException ex) {
            Logger.getLogger(TelaListagemFermentacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaListagemFermentacao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
