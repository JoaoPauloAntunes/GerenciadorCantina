/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapestados;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joao
 */
public class HashMapEstados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<String, String>();
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("DF", "Distrito Federal");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");
        
        //System.out.println(estados.get("RJ")); // obtém valor informando chave
        System.out.println(estados.get("RJ1")); // chave inválida: retorna null
    }
    
}
