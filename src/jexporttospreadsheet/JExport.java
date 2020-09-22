/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jexporttospreadsheet;

import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Formatter;
import java.util.List;

/**
 *
 * @author joao
 */
public class JExport {
    public JExport() {
    }
    
    public void export(String fileName, String[] columnsName, List<String[]> content) throws FileNotFoundException {
        String contentThead = "";
        String contentTbody = "";
        String contentTr = "";
        Formatter file = null;
        
        file = new Formatter(fileName + ".xlsx");

        for(String col : columnsName) {
            contentThead += "\t\t\t\t<th style='background:#083923; color: #fff; text-align: center'>" + col + "</th>\n";
        }
        writeInFile(file, "<div>\n\t<table class='table table-hover'>\n\t\t<thead>\n\t\t\t<tr height='height: 30px;'>\n" + contentThead + "\t\t\t</tr>\n\t\t</thead>\n");

        for(String[] row : content) {
            contentTr = "";

            for(String col : row) {
                contentTr += "\t\t\t\t<td style='border-bottom: 2px solid #878484; vertical-align: middle;'>" + col + "</td>\n";
            }
            contentTbody += "\t\t\t<tr>\n" + contentTr + "\t\t\t</tr>\n";
        }
        writeInFile(file, "\t\t<tbody>\n" + contentTbody + "\t\t</tbody>\n\t</table>\n");
        writeInFile(file, "</div>\n<div style='page-break-before: always;'></div>");
        file.close();
    }
    
    public void writeInFile(Formatter file, String text) {
        file.format(text);
    }
}
