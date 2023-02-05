package review6;

import java.util.Locale;

public class StrBuilderExample {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Hello");
       sb.reverse();
        System.out.println(sb);
        String str = sb.toString();
        str.toUpperCase();
        System.out.println(str);

    }
}
