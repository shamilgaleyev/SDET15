package class7;

public class WhileRecap {
    public static void main(String[] args) {
        int number = 10;
        while (number <20){
            System.out.println(number <20);
            if (number < 15){
                System.out.println("still less than 15");
            }else {
                System.out.println("number is greater than 15");
            }
            System.out.println(number);
            number ++;
        }
    }
}
