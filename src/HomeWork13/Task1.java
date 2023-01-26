package HomeWork13;

public class Task1 {
    public static void main(String[] args) {
      //Create a String that will hold a sentence. Write a program to get
        // a new String without any spaces.

        String sen = "Never look back";
        for (int i = 0; i < sen.length(); i++) {
            if (sen.charAt(i) != ' '){
                System.out.print(sen.charAt(i));
            }
        }
        System.out.println();

        String newStr = sen.replaceAll(" ","");
        System.out.println(newStr);
    }
}
