package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "Java is love";
        char characters = str.charAt(9);
        System.out.println( characters);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){
                count++;
            }

        }
        System.out.println(count);
    }
}
