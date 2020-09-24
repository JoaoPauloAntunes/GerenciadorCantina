package menu.analise_sist_elab_vinho_e_derivados.elaboracao.fermentacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arquivo {
    public static Scanner entrada = null;
    public static File arq = new File ("Cadastro fermentacao.txt");
    public List<String[]> rows = new ArrayList<>();
    
    public static void leitura (JTable jTable1)
    {
        if(arq.exists())
        {
            try 
            {
                entrada = new Scanner(arq);
                while (entrada.hasNext())
                {
                    DefaultTableModel dtmDados = (DefaultTableModel)TelaListagemFermentacao.jTable1.getModel();
                    Object[] dados= entrada.nextLine().split("&&");
                    dtmDados.addRow(dados);
                    
                    
                }
            } 
            catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao carregar dados salvos: " + ex.getLocalizedMessage());                
                System.exit(1);
            }
            finally
            {
                if(entrada!=null)
                    entrada.close();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sem cadastro");
        }
    }
    
    
    public static void salvar (JTable jTable1)
    {
        Formatter saida = null;
        try
        {
            saida = new Formatter (arq);
            
            for (int i =0; i < jTable1.getRowCount() ;i++)
            {
                for(int j =0; j< jTable1.getColumnCount(); j++)
                {
                    
                    saida.format((String)jTable1.getValueAt(i, j)+ "&&");  
                }    
                saida.format("\n");
            }  
        }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados da agenda: " + ex.getLocalizedMessage());
        }
        finally
        {
            if(saida!=null)
                    saida.close();
        }
        
    }                  
    
    public void auxLeitura (JTable jTable1)
    {
        
        if(arq.exists())
        {
            try 
            {
                entrada = new Scanner(arq);
                while (entrada.hasNext())
                {
                    String[] dados= entrada.nextLine().split("&&");
                    rows.add(dados);

                }
            } 
            catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao carregar dados salvos: " + ex.getLocalizedMessage());                
                System.exit(1);
            }
            finally
            {
                if(entrada!=null)
                    entrada.close();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sem cadastro");
        }
    }
}
