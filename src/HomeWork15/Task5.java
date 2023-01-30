package HomeWork15;

public class Task5 {
    // Write a method to return whether given number is prime or not?

 //   void primeOrNot(int n) {
//
//        if (n > 1) {
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    System.out.println("Not prime");
//                    break;
//                }
//                }else {
//                    System.out.println("Prime");
//
//            }
//
//        } else {
//            System.out.println("Not prime");
//        }
//
//    }
    boolean primeOrNot(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    boolean isPrime(int number){

        boolean flag=true;
        if (number>1){
            for (int i = 2; i < number; i++) {
                if (number%i==0) {
                    flag = false;
                    break;
                }
            }

        }else {
            flag = false;
        }
        return flag;

    }
     */


    public static void main(String[] args) {
        Task5 prime = new Task5();
        System.out.println(prime.primeOrNot(113));

    }

}


