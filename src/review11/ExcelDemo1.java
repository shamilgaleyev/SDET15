package review11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo1 {
    public static void main(String[] args) {
        String path = "Files2/Book2.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");

           int noOfRows = sheet1.getPhysicalNumberOfRows();
           //var exelData = new ArrayList<Map<String,String>>();
           List<Map<String,String>> exelData = new ArrayList();
           Row row0 = sheet1.getRow(0);
            for (int i = 1; i < noOfRows; i++) {
                LinkedHashMap<String,String> rowMap = new LinkedHashMap<>();

                Row row = sheet1.getRow(i);
                int noOfCells = row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                    String key = row0.getCell(j).toString();
                    String value = row.getCell(j).toString();
                    rowMap.put(key,value);
                }
                exelData.add(rowMap);
            }
            System.out.println(exelData);

        } catch (Exception e) {
            System.out.println("Please theck the path of the file");

        }
    }
}
