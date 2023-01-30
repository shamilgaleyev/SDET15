package HomeWork15;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.
    String palindronOrNot(String word){
        String newWord = "";
        for (int i = word.length() - 1; i >= 0 ; i --) {

            newWord += word.charAt(i);
       }
        if (newWord.equals(word)){
            return "palindrome";
        } else {
            return "not palindrome";
        }
    }

    String palindromeOrNot1(String word1){

        StringBuilder newWord1 = new StringBuilder(word1);
        newWord1.reverse();
        String reverseStr = newWord1.toString();

        if (reverseStr.equals(word1)){
            return "palindrome";
        }else{
            return "not palindrom";
        }

    }
    void palindromeOrNot2(String word2){

        StringBuilder newWord2 = new StringBuilder(word2);
        newWord2.reverse();
        String reverseStr = newWord2.toString();

        if (reverseStr.equals(word2)){
            System.out.println("palindrome");
        }else{
            System.out.println(" not palindrome");
        }

    }

    public static void main(String[] args) {
        Task3 palindrome = new Task3();
        System.out.println(palindrome.palindronOrNot("madam"));

        System.out.println(palindrome.palindromeOrNot1("anna"));

        palindrome.palindromeOrNot2("kayak");
    }
}
