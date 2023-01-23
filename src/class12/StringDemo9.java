package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str = "vhvhv 4353435356 $%%^^^&";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;

            }
        }
        counter = 0;
        System.out.println(counter);
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                counter++;

            }
        }
        System.out.println(counter);

        counter = 0;
        System.out.println(counter);
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                counter++;

            }
        }
        System.out.println(counter);
    }
}
