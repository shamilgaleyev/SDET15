package HomeWork1;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\gulmi\\OneDrive\\Documents\\file.xlsx";
        FileInputStream fileInputStream =new FileInputStream(path);
        XSSFWorkbook sx =  new XSSFWorkbook(fileInputStream);

        Sheet sheet  = sx.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        System.out.println(row.getCell(0));

    }
}
