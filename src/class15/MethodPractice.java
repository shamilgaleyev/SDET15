package class15;

public class MethodPractice {
    // creat a method which returns true or false
     boolean evenOrNot(int n){
         boolean flag;
        if (n % 2 == 0) {
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    boolean isEven(int num){
         if (num % 2 == 0){
             return true;
         } else {
             return false;
         }
    }


}
