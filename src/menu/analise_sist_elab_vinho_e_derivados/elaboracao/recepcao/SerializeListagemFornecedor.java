/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    
<<<<<<< HEAD
    public static List<Fornecedor> load() throws Exception {
        FileInputStream fileIn;
        fileIn = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        return (List<Fornecedor>) in.readObject();
=======
    public static List<Fornecedor> load() {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
    
            in.close();
            fileIn.close();
            return (List<Fornecedor>) in.readObject();
        } catch(Exception ex) {
            System.out.println("erro ao carregar arquivo");
        }
        
        return null;
>>>>>>> e9785eebce11c46cd622c03d9a14f15a266d11e3
    }
}
