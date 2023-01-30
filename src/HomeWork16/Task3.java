package HomeWork16;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and return a new String
    that consist only of vowels. Method should be available inside the class only where
    it was declared and executed by calling it is name.
     */

    private String vowels(String str){
        String strNew = str.replaceAll("[^aeiou]","");
        return strNew;

    }

    public static void main(String[] args) {
        Task3 vowels = new Task3();
        System.out.println(vowels.vowels("Create a method that will accept a String as a parameter"));
    }
}
