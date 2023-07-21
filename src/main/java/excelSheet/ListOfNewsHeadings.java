package excelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mainProject.featuredNews.FeaturedNewsPage;

public class ListOfNewsHeadings extends FeaturedNewsPage{
	public ListOfNewsHeadings() throws Exception {
		super();
	}

	public void Headinglist() throws IOException, Exception {
	    String userDir = System.getProperty("user.dir");
  	    String filePath = userDir + "\\NewsText\\NewsHeadLinesList.xlsx";
  	    File src = new File(filePath);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("FeaturedNewsHeadings");			
		int size = NewsHeadings.size();		    
		int rownum =0;
		for(int i=0;i<size;i++) {
			Row row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(NewsHeadings.get(i));
		}
	    FileOutputStream out = new FileOutputStream(src);
	    wb.write(out);
	}

}
