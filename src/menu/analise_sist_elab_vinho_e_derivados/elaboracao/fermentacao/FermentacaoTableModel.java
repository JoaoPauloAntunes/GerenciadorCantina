package menu.analise_sist_elab_vinho_e_derivados.elaboracao.fermentacao;
/**
 *
 * @author Vitor
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FermentacaoTableModel extends AbstractTableModel {
    protected List<String> fermentacao = new ArrayList<>();
    protected final String[] columns = {"Código", "Descricao", "Data de enchimento", "Numero tanque de fermentacao", "Volume", "Origem"};
    
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public int getRowCount() {
        return fermentacao.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            return null;
    }
    
}
