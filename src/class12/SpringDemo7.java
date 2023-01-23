package class12;

import java.util.Locale;

public class SpringDemo7 {
    public static void main(String[] args) {
        String str = "I love java";
        boolean statsrWith = str.startsWith("I");
        System.out.println(statsrWith);
        System.out.println(str.endsWith("java"));

        System.out.println(str.toLowerCase().startsWith("i"));
        System.out.println("______________");


        System.out.println(str.contains("java"));

    }
}
