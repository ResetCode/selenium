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
		for(int i = 0; i < 37; i ++) {
			
			Row row = sheet.getRow(i);
			for(Cell cell : row) {
				cell.setCellType(CellType.STRING);
			}
//			String name = row.getCell(0).getStringCellValue();
//			String firstName = row.getCell(1).getStringCellValue();
//			String lastName = row.getCell(2).getStringCellValue();
//			String email = row.getCell(3).getStringCellValue();
//			String birthDay = row.getCell(4).getStringCellValue();
//			String address = row.getCell(5).getStringCellValue(); 
//			String city = row.getCell(6).getStringCellValue();
//			String state = row.getCell(7).getStringCellValue();
//			String zip_code = row.getCell(8).getStringCellValue(); //F
//			String phone = row.getCell(9).getStringCellValue();
//			String address2 = row.getCell(11).getStringCellValue();
			String name = row.getCell(0).getStringCellValue();
			String firstName = row.getCell(1).getStringCellValue();
			String lastName = row.getCell(2).getStringCellValue();
			String address = row.getCell(3).getStringCellValue(); 
			String city = row.getCell(4).getStringCellValue();
			String state = row.getCell(5).getStringCellValue();
			String zip_code = row.getCell(6).getStringCellValue(); //F
			String birthDay = row.getCell(7).getStringCellValue();
			String phone = row.getCell(8).getStringCellValue();
			String email = row.getCell(9).getStringCellValue();
			String address2 = row.getCell(11).getStringCellValue();
			
			String[] births = birthDay.split("/");
			AuData data = new AuData();
			data.setEmail(email);
			data.setName(name);
			data.setFirstName(firstName);
			data.setLastName(lastName);
			System.err.println(birthDay);
			data.setBirthMonth(births[0].substring(0,1).equals("0") ? births[0].substring(1) : births[0]);
			data.setBirthDay(births[1].substring(0,1).equals("0") ? births[1].substring(1) : births[1]);
			data.setBirthYear(births[2].startsWith("19") == true ? births[2] : ("19" + births[2]));
			data.setPhone(phone);
			data.setState(state);
			data.setAddress2(address2);
			
			String[] citys = city.split(" ");
			StringBuffer sb = new StringBuffer();
			for(int j = 0 ; j < citys.length; j++) {
				String c = citys[j];
				sb.append(c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase());
				if(j != (citys.length - 1)) {
					sb.append(" ");
				}
			}
			data.setCity(sb.toString());
			data.setAddress(address.split(" ")[0] + " " + address.split(" ")[1]);
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
