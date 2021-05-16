package ourCode;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
    	public ArrayList<String> extractAthletes(int columnIndex) {
            ArrayList<String> athletes = null;
        try {
        	  File deHe = new File("Excel path here");
              FileInputStream ex = new FileInputStream(deHe);
              XSSFWorkbook workbook = new XSSFWorkbook(ex);
              XSSFSheet sheet = workbook.getSheetAt(0);
              Iterator<Row> rowIterator = sheet.iterator();
              athletes = new ArrayList<String>();

              while (rowIterator.hasNext()) {
                  Row row = rowIterator.next();
                  Iterator<Cell> cellIterator = row.cellIterator();
                  while (cellIterator.hasNext()) {
                      Cell cell = cellIterator.next();

                      if (row.getRowNum() > 1) { 
                          if (cell.getColumnIndex() == columnIndex) {
                              switch (cell.getCellType()) {
                             //     case NUMERIC:
                             //      athletes.add(cell.getNumericCellValue() + "");
                             //         break;
                                  case STRING:
                                      athletes.add(cell.getStringCellValue());
                                      break;
							case BLANK:
								break;
							case BOOLEAN:
								break;
							case ERROR:
								break;
							case FORMULA:
								break;
							case _NONE:
								break;
							default:
								break;
                              }
                          }
                      }
                  }
              }
              ex.close();
              System.out.println(athletes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return athletes;
    }
}