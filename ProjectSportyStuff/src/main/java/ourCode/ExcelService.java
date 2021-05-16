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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelService {
	private File file;
	private Workbook workbook;

	public ExcelService(String filePath) throws FileNotFoundException, IOException {
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

		this.checkDefaultSheets();
		this.checkDefaultRows();
	}
	

	public void addWomanResults(int athleteID, int eventID, int result) {
		Sheet sheet = workbook.getSheet("Women Result");
		
		Row row = sheet.createRow(sheet.getLastRowNum()+1);
		
		Cell idCell = row.createCell(0);
		Cell eventCell = row.createCell(1);
		Cell resultCell = row.createCell(2);

		idCell.setCellValue(athleteID);
		eventCell.setCellValue(eventID);
		resultCell.setCellValue(result);

		this.save();
	}

	public void addManResults(int athleteID, int eventID, int result) {
		Sheet sheet = workbook.getSheet("Men Result");
		
		Row row = sheet.createRow(sheet.getLastRowNum()+1);
		
		Cell idCell = row.createCell(0);
		Cell eventCell = row.createCell(1);
		Cell resultCell = row.createCell(2);

		idCell.setCellValue(athleteID);
		eventCell.setCellValue(eventID);
		resultCell.setCellValue(result);
		
		this.save();
	}

	/*
	public void getIndividualWomanResults(int athleteID) {
		Sheet sheet = workbook.getSheet("Individual Woman Result");
		
		Row row = sheet.createRow(sheet.getLastRowNum()+1);
		
		Cell idCell = row.createCell(0);

		idCell.setCellValue(athleteID);
		
		this.save();
		
	}

	public void getIndividualManResults(int athleteID) {
		Sheet sheet = workbook.getSheet("Individual Man Result");
		
		Row row = sheet.createRow(sheet.getLastRowNum()+1);
		
		Cell idCell = row.createCell(0);

		idCell.setCellValue(athleteID);
		
		this.save();
		
	}
	 */
	public void addWomanAthlete(Athlete woman) {
		Sheet sheet = workbook.getSheet("Women");
		
		Row row = sheet.createRow(sheet.getLastRowNum()+1);
		
		Cell idCell = row.createCell(0);
		Cell firstNameCell = row.createCell(1);
		Cell lastNameCell = row.createCell(2);

		idCell.setCellValue(woman.ID);
		firstNameCell.setCellValue(woman.firstName);
		lastNameCell.setCellValue(woman.lastName);

		this.save();
	}

	public void addManAthlete(Athlete man) {
		Sheet sheet = workbook.getSheet("Men");

		Row row = sheet.createRow(sheet.getLastRowNum()+1);

		Cell idCell = row.createCell(0);
		Cell firstNameCell = row.createCell(1);
		Cell lastNameCell = row.createCell(2);

		idCell.setCellValue(man.ID);
		firstNameCell.setCellValue(man.firstName);
		lastNameCell.setCellValue(man.lastName);

		this.save();
	}

	/**
	 * Checks if default sheets are present in excel file.
	 */
	private void checkDefaultSheets() {
		if (this.workbook.getSheet("Women") == null) {
			this.workbook.createSheet("Women");
		}

		if (this.workbook.getSheet("Men") == null) {
			this.workbook.createSheet("Men");
		}
		
		this.save();
	}
	
	/**
	 * Checks if default rows are present in excel file.
	 */
	private void checkDefaultRows() {
		
		// Women default rows
		Sheet womenSheet = this.workbook.getSheet("Women");
		Row womenFirstRow = (womenSheet.getRow(0) != null) ? womenSheet.getRow(0) : womenSheet.createRow(0);
		Cell womenIDCell = (womenFirstRow.getCell(0) != null) ? womenFirstRow.getCell(0) : womenFirstRow.createCell(0);
		Cell womenFirstNameCell = (womenFirstRow.getCell(1) != null) ? womenFirstRow.getCell(1) : womenFirstRow.createCell(1);
		Cell womenLastNameCell = (womenFirstRow.getCell(2) != null) ? womenFirstRow.getCell(2) : womenFirstRow.createCell(2);
		Cell women100mHurdlesCell = (womenFirstRow.getCell(3) != null) ? womenFirstRow.getCell(3) : womenFirstRow.createCell(3);
		Cell womenHighJumpCell = (womenFirstRow.getCell(4) != null) ? womenFirstRow.getCell(4) : womenFirstRow.createCell(4);
		Cell womenShotPutCell = (womenFirstRow.getCell(5) != null) ? womenFirstRow.getCell(5) : womenFirstRow.createCell(5);
		Cell women200mCell = (womenFirstRow.getCell(6) != null) ? womenFirstRow.getCell(6) : womenFirstRow.createCell(6);
		Cell womenLongJumpCell = (womenFirstRow.getCell(7) != null) ? womenFirstRow.getCell(7) : womenFirstRow.createCell(7);
		Cell womenJavelinThrowCell = (womenFirstRow.getCell(8) != null) ? womenFirstRow.getCell(8) : womenFirstRow.createCell(8);
		Cell women800mCell = (womenFirstRow.getCell(9) != null) ? womenFirstRow.getCell(9) : womenFirstRow.createCell(9);
		
		if (womenIDCell.getStringCellValue() != "ID")
			womenIDCell.setCellValue("ID");
		
		if (womenFirstNameCell.getStringCellValue() != "Firstname")
			womenFirstNameCell.setCellValue("Firstname");
		
		if (womenLastNameCell.getStringCellValue() != "Lastname")
			womenLastNameCell.setCellValue("Lastname");
		
		if (women100mHurdlesCell.getStringCellValue() != "100m hurdles")
			women100mHurdlesCell.setCellValue("100m hurdles");
		
		if (womenHighJumpCell.getStringCellValue() != "High jump")
			womenHighJumpCell.setCellValue("High jump");
		
		if (womenShotPutCell.getStringCellValue() != "Shot put")
			womenShotPutCell.setCellValue("Shot put");
		
		if (women200mCell.getStringCellValue() != "200m")
			women200mCell.setCellValue("200m");
		
		if (womenLongJumpCell.getStringCellValue() != "Long jump")
			womenLongJumpCell.setCellValue("Long jump");
		
		if (womenJavelinThrowCell.getStringCellValue() != "Javelin throw")
			womenJavelinThrowCell.setCellValue("Javelin throw");
		
		if (women800mCell.getStringCellValue() != "800m")
			women800mCell.setCellValue("800m");
		
		// Men default rows
		Sheet menSheet = this.workbook.getSheet("Men");
		Row menFirstRow = (menSheet.getRow(0) != null) ? menSheet.getRow(0) : menSheet.createRow(0);
		Cell menIDCell = (menFirstRow.getCell(0) != null) ? menFirstRow.getCell(0) : menFirstRow.createCell(0);
		Cell menFirstNameCell = (menFirstRow.getCell(1) != null) ? menFirstRow.getCell(1) : menFirstRow.createCell(1);
		Cell menLastNameCell = (menFirstRow.getCell(2) != null) ? menFirstRow.getCell(2) : menFirstRow.createCell(2);
		Cell men100mCell = (menFirstRow.getCell(3) != null) ? menFirstRow.getCell(3) : menFirstRow.createCell(3);
		Cell menLongJumpCell = (menFirstRow.getCell(4) != null) ? menFirstRow.getCell(4) : menFirstRow.createCell(4);
		Cell menShotPutCell = (menFirstRow.getCell(5) != null) ? menFirstRow.getCell(5) : menFirstRow.createCell(5);
		Cell menHighJumpCell = (menFirstRow.getCell(6) != null) ? menFirstRow.getCell(6) : menFirstRow.createCell(6);
		Cell men400mCell = (menFirstRow.getCell(7) != null) ? menFirstRow.getCell(7) : menFirstRow.createCell(7);
		Cell men110mHurdlesCell = (menFirstRow.getCell(8) != null) ? menFirstRow.getCell(8) : menFirstRow.createCell(8);
		Cell menDiscusThrowCell = (menFirstRow.getCell(9) != null) ? menFirstRow.getCell(9) : menFirstRow.createCell(9);
		Cell menPoleVaultCell = (menFirstRow.getCell(10) != null) ? menFirstRow.getCell(10) : menFirstRow.createCell(10);
		Cell menJavelinThrowCell = (menFirstRow.getCell(11) != null) ? menFirstRow.getCell(11) : menFirstRow.createCell(11);
		Cell men1500mCell = (menFirstRow.getCell(12) != null) ? menFirstRow.getCell(12) : menFirstRow.createCell(12);
		
		if (menIDCell.getStringCellValue() != "ID")
			menIDCell.setCellValue("ID");
		
		if (menFirstNameCell.getStringCellValue() != "Firstname")
			menFirstNameCell.setCellValue("Firstname");
		
		if (menLastNameCell.getStringCellValue() != "Lastname")
			menLastNameCell.setCellValue("Lastname");
		
		if (men100mCell.getStringCellValue() != "100m")
			men100mCell.setCellValue("100m");
		
		if (menLongJumpCell.getStringCellValue() != "Long jump")
			menLongJumpCell.setCellValue("Long jump");
		
		if (menShotPutCell.getStringCellValue() != "Shot put")
			menShotPutCell.setCellValue("Shot put");
		
		if (menHighJumpCell.getStringCellValue() != "High jump")
			menHighJumpCell.setCellValue("High jump");
		
		if (men400mCell.getStringCellValue() != "400m")
			men400mCell.setCellValue("400m");
		
		if (men110mHurdlesCell.getStringCellValue() != "110m hurdles")
			men110mHurdlesCell.setCellValue("110m hurdles");
		
		if (menDiscusThrowCell.getStringCellValue() != "Discus throw")
			menDiscusThrowCell.setCellValue("Discus throw");
		
		if (menPoleVaultCell.getStringCellValue() != "Pole vault")
			menPoleVaultCell.setCellValue("Pole vault");
		
		if (menJavelinThrowCell.getStringCellValue() != "Javelin throw")
			menJavelinThrowCell.setCellValue("Javelin throw");
		
		if (men1500mCell.getStringCellValue() != "1500m")
			men1500mCell.setCellValue("1500m");
		
		// Women result row
		Sheet womenRSheet = this.workbook.getSheet("Women Result");
		Row womenRFirstRow = (womenRSheet.getRow(0) != null) ? womenRSheet.getRow(0) : womenRSheet.createRow(0);
		Cell womenRIDCell = (womenRFirstRow.getCell(0) != null) ? womenRFirstRow.getCell(0) : womenRFirstRow.createCell(0);
		Cell womenRFirstNameCell = (womenRFirstRow.getCell(1) != null) ? womenRFirstRow.getCell(1) : womenRFirstRow.createCell(1);
		Cell womenRLastNameCell = (womenRFirstRow.getCell(2) != null) ? womenRFirstRow.getCell(2) : womenRFirstRow.createCell(2);
		Cell womenResultCell = (womenRFirstRow.getCell(3) != null) ? womenRFirstRow.getCell(3) : womenRFirstRow.createCell(3);
		
		if (womenRIDCell.getStringCellValue() != "ID")
			womenRIDCell.setCellValue("ID");
		
		if (womenRFirstNameCell.getStringCellValue() != "Firstname")
			womenRFirstNameCell.setCellValue("Firstname");
		
		if (womenRLastNameCell.getStringCellValue() != "Lastname")
			womenRLastNameCell.setCellValue("Lastname");
		
		if (womenResultCell.getStringCellValue() != "Result")
			womenResultCell.setCellValue("Result");
		
		// Men result row
		Sheet menRSheet = this.workbook.getSheet("Men Result");
		Row menRFirstRow = (menRSheet.getRow(0) != null) ? menRSheet.getRow(0) : menRSheet.createRow(0);
		Cell menRIDCell = (menRFirstRow.getCell(0) != null) ? menRFirstRow.getCell(0) : menRFirstRow.createCell(0);
		Cell menRFirstNameCell = (menRFirstRow.getCell(1) != null) ? menRFirstRow.getCell(1) : menRFirstRow.createCell(1);
		Cell menRLastNameCell = (menRFirstRow.getCell(2) != null) ? menRFirstRow.getCell(2) : menRFirstRow.createCell(2);
		Cell menResultCell = (menRFirstRow.getCell(3) != null) ? menRFirstRow.getCell(3) : menRFirstRow.createCell(3);
		
		if (menRIDCell.getStringCellValue() != "ID")
			womenRIDCell.setCellValue("ID");
		
		if (menRFirstNameCell.getStringCellValue() != "Firstname")
			menRFirstNameCell.setCellValue("Firstname");
		
		if (menRLastNameCell.getStringCellValue() != "Lastname")
			menRLastNameCell.setCellValue("Lastname");
		
		if (menResultCell.getStringCellValue() != "Result")
			menResultCell.setCellValue("Result");
		
		this.save();
	}

	
	
	private void checkExistence() throws IOException {
		if (!this.file.exists()) {
			XSSFWorkbook create = new XSSFWorkbook();

			FileOutputStream out;

			try {
				out = new FileOutputStream(this.file);
				create.write(out);
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			create.close();
		} 
	}

	private void checkAccess() throws FileNotFoundException {
		if (!this.file.canRead()) {
			// throw new Exception("File is not readable");
		}

		if (!this.file.canWrite()) {
			// throw new Exception("File is not writable");
		}
	}
	
	private void save() {
		try {
			String path = this.file.getAbsolutePath();

			this.file.delete();

			FileOutputStream out = new FileOutputStream(path);

			workbook.write(out);

			out.close();
			
			this.file = new File(this.file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
