package com.selenum.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.google.common.collect.Lists;
import com.selenum.model.UsData;

public class USTemplatePoiHandler {

	public static List<UsData> read(String filePath) throws Exception {
		
		List<UsData> list = Lists.newArrayList();
		
		File file = new File(filePath);
		InputStream is = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(is);
		Sheet sheet = workbook.getSheetAt(0);
		for(int i = 1; i < sheet.getLastRowNum(); i ++) {
			
			Row row = sheet.getRow(i);
			for(Cell cell : row) {
				cell.setCellType(CellType.STRING);
			}
			String email = row.getCell(12).getStringCellValue();
			String firstName = row.getCell(0).getStringCellValue();
			String lastName = row.getCell(1).getStringCellValue();
			String primary_phone = String.valueOf(row.getCell(6).getStringCellValue()); //G
			String street_address = row.getCell(2).getStringCellValue(); //C
			String city = row.getCell(3).getStringCellValue(); //D
			String zip_code = String.valueOf(row.getCell(5).getStringCellValue()); //F
			String state_code = row.getCell(4).getStringCellValue(); //E
			
//			String sex = row.getCell(1).getStringCellValue();
			String birth_year = row.getCell(10).getStringCellValue(); //K
			String birth_month = row.getCell(9).getStringCellValue(); //J
			String birth_day = row.getCell(8).getStringCellValue(); //I
			UsData data = new UsData();
			data.setEmail(email);
			data.setFirstName(firstName);
			data.setLastName(lastName);
			data.setPrimaryPhone(primary_phone);
			data.setStreetAddress(street_address);
			data.setCity(city);
			data.setZipCode(zip_code);
//			data.setSex(1);
//			data.setState(state);
			data.setBirthYear(birth_year);
			data.setBirthMonth(birth_month);
			data.setBirthDay(birth_day);
			data.setCreateTime(new Date());
			data.setStateCode(state_code.trim());
			data.setUseStatus("0");
			list.add(data);
		}
		workbook.close();
		is.close();
		return list;
		
	}
}
