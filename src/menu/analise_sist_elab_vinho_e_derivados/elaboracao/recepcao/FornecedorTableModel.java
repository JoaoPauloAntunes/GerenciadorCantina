/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author joao
 */
public class FornecedorTableModel extends AbstractTableModel {
    protected List<Fornecedor> fornecedores = new ArrayList<>();
    protected final String[] columns = {"Código", "Razão Social / Propriedade", "Nome", "Logradouro", "Bairro", "Cidade", "Estado", "CEP", "Telefone", "E-mail", "Anotações"};
    
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public int getRowCount() {
        return fornecedores.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = fornecedores.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return fornecedor.getCodigo();
            case 1:
                return fornecedor.getRazaoSocial();
            case 2:
                return fornecedor.getNome();
            case 3:
                return fornecedor.getLogradouro();
            case 4:
                return fornecedor.getBairro();
            case 5:
                return fornecedor.getCidade();
            case 6:
                return fornecedor.getEstado();
            case 7:
                return fornecedor.getCep();
            case 8:
                return fornecedor.getTel();
            case 9:
                return fornecedor.getEmail();
            case 10:
                return fornecedor.getAnotacoes();
            default:
                return null;
        }
    }
    
    public void addRow(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
        this.fireTableDataChanged();
    }
}
