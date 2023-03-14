package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String path = "Files/test1.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.setProperty("Name1","John");
        properties.setProperty("Name2","Matt");
        properties.setProperty("Name3","Chris");
        properties.store(fileOutputStream,"A new names has been added");




    }
}
