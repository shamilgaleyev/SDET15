package class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {

       String path = "Files/Book1.xlsx";
       FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
       Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");
        int noOfRow = sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRow);
        //List<Map<String,String>> excelData = new ArrayList<>();
        //LinkedHashMap rowMap = new LinkedHashMap<>();

//        for (int i = 0; i < noOfRow; i++) {
//          Row row =  sheet2.getRow(i);
//            System.out.println(row.getCell(0)+" "+row.getCell(1));
//        }
        for (int i = 0; i < noOfRow; i++) {
            Row row=sheet2.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }


    }
}
