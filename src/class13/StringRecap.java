package class13;

public class StringRecap {
    public static void main(String[] args) {
        String str = "Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'a'){
               count ++;
           }

        }
        System.out.println(count);
    }
}
