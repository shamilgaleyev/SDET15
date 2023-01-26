package HomeWork13;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String str = "abcd57575757$$$$$";

        System.out.println(str.replaceAll("[^A-Z]","").length());
//        int counter = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isAlphabetic(str.charAt(i))) {
//                counter++;
//
//            }
//        }
//        System.out.println(counter);
//        counter = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                counter++;
//
//            }
//        }
//        System.out.println(counter);
//        counter = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isLetterOrDigit(str.charAt(i))) {
//            }else {
//                counter++;
//
//            }
//        }
//        System.out.println(counter);

//        String str1="jnfjdnJNJFD87687&*(()";



    }
}
