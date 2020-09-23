/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author joao
 */
public class FormSanitize {
    public static String sanitizeCep(String cep) {
        return cep.replaceAll("\\D", "");
    }
}
