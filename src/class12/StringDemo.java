package class12;

public class StringDemo {
    public static void main(String[] args) {
        String strObj = new String("Java");
        String strObj2 = "java";
        System.out.println(strObj2.length());
        String str = "Banana  ";
        int len = str.length();
        System.out.println(len);
        String name = "Rafik";
        if (name.length() > 10){
            System.out.println("can't be more than 10 letter");
        }

    }
}
