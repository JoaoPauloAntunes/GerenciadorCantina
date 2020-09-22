/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jexporttospreadsheet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Random;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author joao
 */
public class JExport {
    public JExport() {
    }
    
    public void export(String fileName, String[] columnsName, List<String[]> rows) throws WriteException, IOException {
        WritableWorkbook spreadSheet = Workbook.createWorkbook(new File(fileName + ".xls"));
        
        // Adicionando o nome da aba
        WritableSheet tab = spreadSheet.createSheet(fileName, 0);

        // Cor de fundo das celular
        Colour bckcolor = Colour.GREEN;
        WritableCellFormat cellFormat = new WritableCellFormat();
        cellFormat.setBackground(bckcolor);

        // Cor e tipo de fonte
        WritableFont font = new WritableFont(WritableFont.ARIAL);
        font.setColour(Colour.WHITE);
        cellFormat.setFont(font);

        // Write the Header to the excel file
        for (int i = 0; i < columnsName.length; i++) {
            Label label = new Label(i, 0, columnsName[i]);
            tab.addCell(label);
            
            WritableCell cell = tab.getWritableCell(i, 0);
            cell.setCellFormat(cellFormat);
        }
        
        for(int i = 0; i < rows.size(); i++) {
            String[] row = rows.get(i);
                    
            for(int j = 0; j < row.length; j++) {
                Label label = new Label(j, i + 1, row[j]);
                tab.addCell(label);
            }
        }

        //for (int linha = 1; linha < 10; linha++) {
            /*jxl.write.Number number = new jxl.write.Number(0, linha, numeroAleatorio.nextInt(2000));
            tab.addCell(number);*/

            /*Label label = new Label(1, linha, "José da Silva");
            tab.addCell(label);*/

            /*Date data = new Date();
            DateFormat customDateFormat = new DateFormat("dd MMM yyyy hh:mm:ss");
            
            WritableCellFormat dateFormat = new WritableCellFormat(customDateFormat);
            DateTime dateCell = new DateTime(4, linha, data, dateFormat);
            tab.addCell(dateCell);*/
        //}

        spreadSheet.write();
        spreadSheet.close();
        
        /*String contentThead = "";
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
*/
    }
}
