package ourCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelService {
	private File file;
	private Workbook workbook;
	private int recentAthlete;

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

	public void updateManResults(Man man)
	{
		
		Sheet sheet = workbook.getSheet("Men");
		FileOutputStream fos = null;
		try {
			//FileInputStream fis = new FileInputStream("test.xlsx");
			fos = new FileOutputStream("test.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (int i = 1; i < sheet.getLastRowNum()+1; i++) {
			Row row = sheet.getRow(i);
			
			System.out.println(i + "id: " + man.ID);
			
			if(row.getCell(0).getNumericCellValue() == man.ID) {

				row.getCell(3).setCellValue(man.getOnehundredM());
				row.getCell(4).setCellValue(man.getLongJump());
				row.getCell(5).setCellValue(man.getShotPut());
				row.getCell(6).setCellValue(man.getHighJump());
				row.getCell(7).setCellValue(man.getFourhundredM());
				
				row.getCell(8).setCellValue(man.getOnehundredtenMHurdles());
				row.getCell(9).setCellValue(man.getDiscusThrow());
				row.getCell(10).setCellValue(man.getPoleVault());
				row.getCell(11).setCellValue(man.getJavelinThrow());
				row.getCell(12).setCellValue(man.getOnethousandfivehundredM());
				
				try {
					workbook.write(fos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		try {
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateWomanResults(Woman woman)
	{
		
		Sheet sheet = workbook.getSheet("Women");
		FileOutputStream fos = null;
		try {
			//FileInputStream fis = new FileInputStream("test.xlsx");
			fos = new FileOutputStream("test.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (int i = 1; i < sheet.getLastRowNum()+1; i++) {
			Row row = sheet.getRow(i);
			
			System.out.println(i + "id: " + woman.ID);
			
			if(row.getCell(0).getNumericCellValue() == woman.ID) {
				row.getCell(3).setCellValue(woman.getOnehundredMHurdles());
				row.getCell(4).setCellValue(woman.getHighJump());
				row.getCell(5).setCellValue(woman.getShotPut());
				row.getCell(6).setCellValue(woman.getTwohundredM());
				row.getCell(7).setCellValue(woman.getLongJump());
				
				row.getCell(8).setCellValue(woman.getJavelinThrow());
				row.getCell(9).setCellValue(woman.getEighthundredM());

				try {
					workbook.write(fos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	public void getIndividualWomanResults(int athleteID) {
		// TODO:
		 
		Sheet sheet = workbook.getSheet("Individual Women Result");
		
		Row row = sheet.createRow(sheet.getLastRowNum()+1);
		
		Cell idCell = row.createCell(0);
		idCell.setCellValue(athleteID);
		
		this.save();
		
	}
	public void getIndividualManResults(int athleteID) {
		// TODO:
	
		Sheet sheet = workbook.getSheet("Individual Men Result");
		
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
		
		row.createCell(3).setCellValue(0);
		row.createCell(4).setCellValue(0);
		row.createCell(5).setCellValue(0);
		row.createCell(6).setCellValue(0);
		row.createCell(7).setCellValue(0);
		row.createCell(8).setCellValue(0);
		row.createCell(9).setCellValue(0);
		
		//recentAthlete = woman;

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
		
		row.createCell(3).setCellValue(0);
		row.createCell(4).setCellValue(0);
		row.createCell(5).setCellValue(0);
		row.createCell(6).setCellValue(0);
		row.createCell(7).setCellValue(0);
		row.createCell(8).setCellValue(0);
		row.createCell(9).setCellValue(0);
		row.createCell(10).setCellValue(0);
		row.createCell(11).setCellValue(0);
		row.createCell(12).setCellValue(0);
		
		//recentAthlete = man;
		
		this.save();
	}
	
	public int getRecentAthleteID()
	{
		Sheet sheet = workbook.getSheet("Men");
		Sheet sheet2 = workbook.getSheet("Women");
		
		int temp1 = 0;
		int temp2 = 0;
	
		int i = sheet.getLastRowNum();
		int j = sheet2.getLastRowNum();
		
		Row row = sheet.getRow(i);
		if(row.getCell(0).getCellType() != CellType.STRING)
			temp1 = (int) row.getCell(0).getNumericCellValue();
		
		row = sheet2.getRow(j);
		if(row.getCell(0).getCellType() != CellType.STRING)
			temp2 = (int) row.getCell(0).getNumericCellValue();
		
		
		if(temp1 > temp2)
			return temp1;
		
		return temp2;
	}
	
	public Athlete getRecentAthlete()
	{
		Athlete temp = new Athlete();
		
		Sheet manSheet = workbook.getSheet("Men");
		Sheet womanSheet = workbook.getSheet("Women");
		
		int manID = 0;
		int womanID = 0;
		
		int i = manSheet.getLastRowNum();
		int j = womanSheet.getLastRowNum();
		
		Row row = manSheet.getRow(i);
		if(row.getCell(0).getCellType() != CellType.STRING)
			manID = (int) row.getCell(0).getNumericCellValue();
		
		row = womanSheet.getRow(j);
		if(row.getCell(0).getCellType() != CellType.STRING)
			womanID = (int) row.getCell(0).getNumericCellValue();
		
//		if(manID == 1)
//		{
//			row = manSheet.getRow(i);
//			return new Man(row.getCell(1).getStringCellValue(), 
//					row.getCell(2).getStringCellValue(), 
//					(int) row.getCell(0).getNumericCellValue());
//		}
//		
//		if(womanID == 1)
//		{
//			row = womanSheet.getRow(j);
//			return new Woman(row.getCell(1).getStringCellValue(), 
//					row.getCell(2).getStringCellValue(), 
//					(int) row.getCell(0).getNumericCellValue());
//		}
		
		
		if(manID > womanID)
		{
			row = manSheet.getRow(i);
			temp = new Man(row.getCell(1).getStringCellValue(), 
					row.getCell(2).getStringCellValue(), 
					(int) row.getCell(0).getNumericCellValue());
		}
		else 
		{
			row = womanSheet.getRow(j);
			temp = new Woman(row.getCell(1).getStringCellValue(), 
					row.getCell(2).getStringCellValue(), 
					(int) row.getCell(0).getNumericCellValue());
			
		}
		
		return temp;
	}
	
	public Athlete getAthlete(int athleteId) throws Exception {	
		Sheet manSheet = workbook.getSheet("Men");
		Sheet womenSheet = workbook.getSheet("Women");
		

		for (Row row : womenSheet) {
			if (row.getRowNum() == 0)
				continue;
			
			if (String.valueOf((int) row.getCell(0).getNumericCellValue()).equals(String.valueOf(athleteId))) {
				Woman woman = new Woman(row.getCell(1).getStringCellValue(), row.getCell(2).getStringCellValue(), athleteId);
				
				System.out.println("found a woman" + woman.ID);
				
				if (row.getCell(3) != null)
					woman.onehundredMHurdles = (int) row.getCell(3).getNumericCellValue();
				
				if (row.getCell(4) != null)
					woman.highJump = (int) row.getCell(4).getNumericCellValue();
				
				if (row.getCell(5) != null)
					woman.shotPut = (int) row.getCell(5).getNumericCellValue();
				
				if (row.getCell(6) != null)
					woman.twohundredM = (int) row.getCell(6).getNumericCellValue();
				
				if (row.getCell(7) != null)
					woman.longJump = (int) row.getCell(7).getNumericCellValue();
				
				if (row.getCell(8) != null)
					woman.javelinThrow = (int) row.getCell(8).getNumericCellValue();
				
				if (row.getCell(9) != null)
					woman.eighthundredM = (int) row.getCell(9).getNumericCellValue();
				
				return woman;
			}
		}
		
		for (Row row : manSheet) {
			if (row.getRowNum() == 0)
				continue;
			
			if (String.valueOf((int) row.getCell(0).getNumericCellValue()).equals(String.valueOf(athleteId))) {
				Man man = new Man(row.getCell(1).getStringCellValue(), row.getCell(2).getStringCellValue(), athleteId);
				
				System.out.println("found a man" + man.ID);
				
				if (row.getCell(3) != null)
					man.onehundredM = (int) row.getCell(3).getNumericCellValue();
				
				if (row.getCell(4) != null)
					man.longJump = (int) row.getCell(4).getNumericCellValue();
				
				if (row.getCell(5) != null)
					man.shotPut = (int) row.getCell(5).getNumericCellValue();
				
				if (row.getCell(6) != null)
					man.highJump = (int) row.getCell(6).getNumericCellValue();
				
				if (row.getCell(7) != null)
					man.fourhundredM = (int) row.getCell(7).getNumericCellValue();
				
				if (row.getCell(8) != null)
					man.onehundredtenMHurdles = (int) row.getCell(8).getNumericCellValue();
				
				if (row.getCell(9) != null)
					man.discusThrow = (int) row.getCell(9).getNumericCellValue();
				
				if (row.getCell(10) != null)
					man.poleVault = (int) row.getCell(10).getNumericCellValue();
				
				if (row.getCell(11) != null)
					man.javelinThrow = (int) row.getCell(11).getNumericCellValue();
				
				if (row.getCell(12) != null)
					man.onethousandfivehundredM = (int) row.getCell(12).getNumericCellValue();
				
				return man;
			}
		}
		
		throw new Exception("No athlete found with this ID:" + athleteId);
	}

	public String getGender(int athleteId) {
		Sheet manSheet = workbook.getSheet("Men");
		Sheet womenSheet = workbook.getSheet("Women");

		for (Row row : womenSheet) {
			if (row.getRowNum() == 0)
				continue;
			
			if (String.valueOf((int) row.getCell(0).getNumericCellValue()).equals(String.valueOf(athleteId))) {
				return "women";
			}
		}
		
		for (Row row : manSheet) {
			if (row.getRowNum() == 0)
				continue;
			
			if (String.valueOf((int) row.getCell(0).getNumericCellValue()).equals(String.valueOf(athleteId))) {
				return "man";
			}
		}
		
		return "";
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
//		Sheet womenRSheet = this.workbook.getSheet("Women Result");
//		Row womenRFirstRow = (womenRSheet.getRow(0) != null) ? womenRSheet.getRow(0) : womenRSheet.createRow(0);
//		Cell womenRIDCell = (womenRFirstRow.getCell(0) != null) ? womenRFirstRow.getCell(0) : womenRFirstRow.createCell(0);
//		Cell womenRFirstNameCell = (womenRFirstRow.getCell(1) != null) ? womenRFirstRow.getCell(1) : womenRFirstRow.createCell(1);
//		Cell womenRLastNameCell = (womenRFirstRow.getCell(2) != null) ? womenRFirstRow.getCell(2) : womenRFirstRow.createCell(2);
//		Cell womenResultCell = (womenRFirstRow.getCell(3) != null) ? womenRFirstRow.getCell(3) : womenRFirstRow.createCell(3);
//		
//		if (womenRIDCell.getStringCellValue() != "ID")
//			womenRIDCell.setCellValue("ID");
//		
//		if (womenRFirstNameCell.getStringCellValue() != "Firstname")
//			womenRFirstNameCell.setCellValue("Firstname");
//		
//		if (womenRLastNameCell.getStringCellValue() != "Lastname")
//			womenRLastNameCell.setCellValue("Lastname");
//		
//		if (womenResultCell.getStringCellValue() != "Result")
//			womenResultCell.setCellValue("Result");
//		
//		// Men result row
//		Sheet menRSheet = this.workbook.getSheet("Men Result");
//		Row menRFirstRow = (menRSheet.getRow(0) != null) ? menRSheet.getRow(0) : menRSheet.createRow(0);
//		Cell menRIDCell = (menRFirstRow.getCell(0) != null) ? menRFirstRow.getCell(0) : menRFirstRow.createCell(0);
//		Cell menRFirstNameCell = (menRFirstRow.getCell(1) != null) ? menRFirstRow.getCell(1) : menRFirstRow.createCell(1);
//		Cell menRLastNameCell = (menRFirstRow.getCell(2) != null) ? menRFirstRow.getCell(2) : menRFirstRow.createCell(2);
//		Cell menResultCell = (menRFirstRow.getCell(3) != null) ? menRFirstRow.getCell(3) : menRFirstRow.createCell(3);
//		
//		if (menRIDCell.getStringCellValue() != "ID")
//			womenRIDCell.setCellValue("ID");
//		
//		if (menRFirstNameCell.getStringCellValue() != "Firstname")
//			menRFirstNameCell.setCellValue("Firstname");
//		
//		if (menRLastNameCell.getStringCellValue() != "Lastname")
//			menRLastNameCell.setCellValue("Lastname");
//		
//		if (menResultCell.getStringCellValue() != "Result")
//			menResultCell.setCellValue("Result");
		
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