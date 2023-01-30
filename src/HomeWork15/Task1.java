package HomeWork15;

public class Task1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    int larger(int n1,int n2){
        if (n1 > n2){
            return n1;
        }else {
            return n2;
        }
    }

    public static void main(String[] args) {
        Task1 largerNumber = new Task1();
        System.out.println(largerNumber.larger(9,5));
    }
}
