/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jExcel;

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
import jxl.Cell;
import jxl.CellView;
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
public class JExcel {
    public JExcel() {
    }
    
    public void export(String fileName, String[] columnsName, List<String[]> rows) throws WriteException, IOException {
        WritableWorkbook sheet = Workbook.createWorkbook(new File(fileName + ".xls"));
        
        WritableSheet tab = sheet.createSheet(fileName, 0);
        
        Colour bckcolor = Colour.GREEN;
        
        WritableFont font = new WritableFont(WritableFont.ARIAL);
        font.setColour(Colour.WHITE);
        
        WritableCellFormat cellFormat = new WritableCellFormat();
        cellFormat.setBackground(bckcolor);
        cellFormat.setFont(font);

        for (int i = 0; i < columnsName.length; i++) {
            Label labelHeader = new Label(i, 0, columnsName[i]);
            tab.addCell(labelHeader);
            
            WritableCell cellHeader = tab.getWritableCell(i, 0);
            cellHeader.setCellFormat(cellFormat);
        }
        
        for(int i = 0; i < rows.size(); i++) {
            String[] row = rows.get(i);
                    
            for(int j = 0; j < row.length; j++) {
                Label labelContent = new Label(j, i + 1, row[j]);
                tab.addCell(labelContent);
            }
        }
        
        sheetAutoFitColumns(tab);
        sheet.write();
        sheet.close();
    }
    
    private void sheetAutoFitColumns(WritableSheet tab) {
        for (int i = 0; i < tab.getColumns(); i++) {
            Cell[] cells = tab.getColumn(i);
            int longestStrLen = -1;

            if (cells.length == 0) {
                continue;   
            }

            /* Find the widest cell in the column. */
            for (Cell cell : cells) {
                if (cell.getContents().length() > longestStrLen) {
                    String str = cell.getContents();
                    if (str == null || str.isEmpty()) {
                        continue;
                    }
                    
                    longestStrLen = str.trim().length();
                }
            }

            /* If not found, skip the column. */
            if (longestStrLen == -1)  {
                continue;
            }

            /* If wider than the max width, crop width */
            if (longestStrLen > 255) {
                longestStrLen = 255;
            }

            CellView cv = tab.getColumnView(i);
            cv.setSize(longestStrLen * 256 + 100); /* Every character is 256 units wide, so scale it. */
            tab.setColumnView(i, cv);
        }
    }
}
