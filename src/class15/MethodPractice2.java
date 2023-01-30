package class15;

public class MethodPractice2 {

    String reversStr(String word) {
        String newStr = "";
        for (int i = word.length() - 1; i >= 0; i--) {

            newStr += word.charAt(i);
        }
        return newStr;
    }
    String reverseStr1(String word){
        return new StringBuilder(word).reverse().toString();
    }

//    String reverseStr2(String word){
//        StringBuilder sb = new StringBuilder(word);
//        String newSt = reverse(sb).toString();
//        return newSt;
//    }
}

