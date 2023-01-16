package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {

//        boolean summer = true;
//        int temp = 75;
//
//        while (summer){
//            if (temp <= 100){
//                System.out.println("I love summer " + temp);
//            }else {
//                System.out.println("Its very hot " + temp);
//                break;
//            }
//            temp += 5;
//        }

        int temp = 75;

        while (temp <= 105){
            if (temp <= 100){
                System.out.println("I love summer " + temp);
            }else{
                System.out.println("Its very hot " + temp);
            }
            temp += 5;
        }
    }
}
