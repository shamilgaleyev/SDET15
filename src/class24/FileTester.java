package class24;

public class FileTester {
    public static void main(String[] args) {
        File [] arr = {new JavaFile(),new WordFile(),new PdfFile()};
        for(File x: arr){
            x.open();
            x.edit();
            x.close();
        }
    }
}
