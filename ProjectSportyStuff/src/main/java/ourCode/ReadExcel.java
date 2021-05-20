package ourCode;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends Athlete {
	
	public int counter;

    public ArrayList<String> extractAthletes(String filePath) {
        ArrayList<String> athletes = null;
        ArrayList<Athlete> athletes1 = null;
        counter = 0;
        
        
        try {
            File deHe = new File(filePath);
            FileInputStream ex = new FileInputStream(deHe);
            XSSFWorkbook workbook = new XSSFWorkbook(ex);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            
            athletes = new ArrayList<String>();
            athletes1 = new ArrayList<Athlete>();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                Woman temp = new Woman(firstName, lastName, ID);
                
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    
                    switch (cell.getCellType()) {
                    // Maybe put in separate method?
                        case NUMERIC:
                            athletes.add(cell.getNumericCellValue() + "");
                            counter++;
                            break;
                        case STRING:
                            athletes.add(cell.getStringCellValue());
                            counter++;
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
                } //
            }
            ex.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return athletes;
    }
}