package ourCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelService {
	private File file;
	private Workbook workbook;
	
	public ExcelService(String filePath) {
		this.file = new File(filePath);
		
		this.checkExistence();
		
		this.checkAccess();
		
		try {
			this.workbook = WorkbookFactory.create(this.file);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addWomanResults(int athleteID, int eventID, double result) {
		// TODO:
	}

	public void addManResults(int athleteID, int eventID, double result) {
		// TODO:
	}

	public void getIndividualWomanResults(int athleteID) {
		// TODO:
	}

	public void getIndividualManResults(int athleteID) {
		// TODO:
	}

	public void addWomanAthlete(Athlete woman) {
		// TODO:
	}

	public void addManAthlete(Athlete man) {
		Sheet sheet = workbook.getSheetAt(1);
		
		Row row = sheet.createRow(0);
		
		Cell firstNameCell = row.createCell(0);
		Cell lastNameCell = row.createCell(1);
		
		firstNameCell.setCellValue(man.firstName);
		lastNameCell.setCellValue(man.lastName);
		
		this.save();
	}
	
	private void save() {
		try {
			String path = this.file.getAbsolutePath();
			
			this.file.delete();
			
		    FileOutputStream out = new FileOutputStream(path);
		    
		    workbook.write(out);
		    workbook.close();
		    out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void checkExistence() {
		if (!this.file.exists()) {
			// TODO: Create file with correct sheets
		}
	}
	
	private void checkAccess() {
		if (!this.file.canRead()) {
			// throw new Exception("File is not readable");
		}
		
		if (!this.file.canWrite()) {
			// throw new Exception("File is not writable");
		}
	}
}
