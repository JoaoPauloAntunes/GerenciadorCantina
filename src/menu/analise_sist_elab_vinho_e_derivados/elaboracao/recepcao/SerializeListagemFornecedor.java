/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author joao
 */
public class SerializeListagemFornecedor {
    private static String fileName = "lista_fornecedores.bin";
    
    public SerializeListagemFornecedor() {
    }
    
    
    public static void save(List<Fornecedor> fornecedores) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(fornecedores);
            fileOut.close();
            System.out.println("Objeto gravado!");
        } catch(Exception ex) {
            System.out.println("erro ao salvar arquivo");
        }
    }
    
    public static List<Fornecedor> load() {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
    /*
            in.close();
            fileIn.close();*/
            return (List<Fornecedor>) in.readObject();
        } catch(Exception ex) {
            System.out.println("erro ao carregar arquivo");
        }
        
        return null;
    }
}
