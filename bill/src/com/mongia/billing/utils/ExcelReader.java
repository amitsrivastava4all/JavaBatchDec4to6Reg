package com.mongia.billing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import com.mongia.billing.dto.ProductDTO;

public class ExcelReader {
	
	private ExcelReader(){}
	public static ArrayList<ProductDTO> readExcel(File path) throws IOException{
		ArrayList<ProductDTO> products = new ArrayList<>();
		FileInputStream fs = new FileInputStream(path);
		// xlsx
		//XSSFWorkbook
		// xls 
		HSSFWorkbook workBook = new HSSFWorkbook(fs);
		HSSFSheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rows = sheet.rowIterator();
		boolean isFirstRow = true;
		while(rows.hasNext()){
			ProductDTO productDTO = new ProductDTO();
			Row currentRow = rows.next(); //give current and move to next
			if(isFirstRow){
				isFirstRow=false;
				continue;
			}
			int count = 1;
			Iterator<Cell> cells = currentRow.cellIterator();
			while(cells.hasNext()){
				String cellValue = "";
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==CellType.STRING){
					cellValue = currentCell.getStringCellValue();
				}
				else
				if(currentCell.getCellType()==CellType.NUMERIC){	
					cellValue =String.
							valueOf(currentCell.getNumericCellValue());
				}
				if(count==1){
					productDTO.setId((int)Double.parseDouble(cellValue));
				}
				else
				if(count==2){	
					productDTO.setName(cellValue);
				}
				else
					if(count==3){	
						productDTO.setPrice((int)Double.parseDouble(cellValue));
					}
					else
						if(count==4){	
							productDTO.setQuantity((int)Double.parseDouble(cellValue));
						}
				
			count++;
			}  // cell loop end
			products.add(productDTO);
		} // row loop ends
		return products;
	}

}
