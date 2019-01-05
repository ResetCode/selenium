package com.selenum.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Lists;
import com.selenum.model.AuData;

public class AUTemplatePoiHandler {

	public static List<AuData> read(String filePath) throws Exception {
		
		List<AuData> list = Lists.newArrayList();
		
		File file = new File(filePath);
		InputStream is = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(is);
		Sheet sheet = workbook.getSheetAt(0);
		for(int i = 0; i < sheet.getLastRowNum(); i ++) {
			
			Row row = sheet.getRow(i);
			for(Cell cell : row) {
				cell.setCellType(CellType.STRING);
			}
			String name = row.getCell(0).getStringCellValue();
			String firstName = row.getCell(1).getStringCellValue();
			String lastName = row.getCell(2).getStringCellValue();
			String email = row.getCell(3).getStringCellValue();
			String address = row.getCell(5).getStringCellValue(); 
			String city = row.getCell(6).getStringCellValue();
			String state = row.getCell(7).getStringCellValue();
			String zip_code = row.getCell(8).getStringCellValue(); //F
			String phone = row.getCell(9).getStringCellValue();
			
			AuData data = new AuData();
			data.setEmail(email);
			data.setName(name);
			data.setFirstName(firstName);
			data.setLastName(lastName);
			data.setPhone(phone);
			data.setState(state);
			data.setCity(city);
			data.setAddress(address);
			data.setZipCode(zip_code);
			data.setCreateTime(new Date());
			data.setUseStatus("0");
			list.add(data);
		}
		workbook.close();
		is.close();
		return list;
		
	}
}
