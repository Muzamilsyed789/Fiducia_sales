package com_Tyss_Fiducia_GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String readDataFromExcelFile(String sheetname,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		String value = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}
	/**
	 * 
	 * @param sheetname
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public HashMap<String,String> readMultipleData(String sheetname,int cellIndex) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();
		HashMap<String,String>map=new HashMap<String,String>();
		for(int i=0;i<=rowcount;i++) {
			String key=sheet.getRow(i).getCell(cellIndex).getStringCellValue();
			String value=sheet.getRow(i).getCell(cellIndex+1).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}
	/**
	 * 
	 * @param sheetname
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		public int getTotalRowCount(String sheetname) throws EncryptedDocumentException, IOException{
			FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
			Workbook workbook=WorkbookFactory.create(fis);
			Sheet sheet=workbook.getSheet(sheetname);
			int rowcount=sheet.getLastRowNum();
			return rowcount;
	}
	
	
	/**
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeTheDataInToExcel(String sheetName,int rowIndex,int cellIndex,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		sheet.createRow(rowIndex).createCell(cellIndex).setCellValue(data);
		FileOutputStream fou=new FileOutputStream(IPathConstant.ExcelPath);
		workbook.write(fou);
		workbook.close();
	}

}
