/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author joao
 */
public class Serialize {
    public Serialize() {
    }
    
    
    public static void save(Object obj) throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream(obj.toString());
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        fileOut.close();
        System.out.println("Objeto gravado!");
    }
    
    private void load() {
        // https://crunchify.com/how-to-serialize-deserialize-list-of-objects-in-java-java-serialization-example/
    }
    
        /*Fornecedor f1 = new Fornecedor("1", "Aurora", "Aurora", "Rua Olavo Bilac", "Cidade Alta", "Bento Gonçalves", "RS", "95700-000", "(54) 3455-200", "sac@vinicolaaurora.com.br", "Link do nosso site: http://www.vinicolaaurora.com.br/br");
            Fornecedor f2 = new Fornecedor("2", "Aurora2", "Aurora2", "Rua Olavo Bilac", "Cidade Alta", "Bento Gonçalves", "RS", "95700-000", "(54) 3455-200", "sac@vinicolaaurora.com.br", "Link do nosso site: http://www.vinicolaaurora.com.br/br");

            try {
                FileOutputStream arq = new FileOutputStream("fornecedores.arq");
                ObjectOutputStream obj= new ObjectOutputStream(arq);
                obj.writeObject(f1);
                obj.flush();

                System.out.println("Gravação realizada com sucesso!");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
            }
            */

        /*try {
            FileInputStream arq = new FileInputStream("fornecedores.arq");
            ObjectInputStream obj = new ObjectInputStream(arq);
            Fornecedor f1 = (Fornecedor) obj.readObject();
            System.out.println(f1.getCodigo());
            System.out.println(f1.getRazaoSocial());
            System.out.println(f1.getNome());
            System.out.println(f1.getLogradouro());
            System.out.println(f1.getBairro());
            System.out.println(f1.getCidade());
            System.out.println(f1.getEstado());
            System.out.println(f1.getCep());
            System.out.println(f1.getTel());
            System.out.println(f1.getEmail());
            System.out.println(f1.getAnotacoes());
        } catch(Exception ex) {
            System.out.println("Ocorreu um erro!");
        }*/
}
