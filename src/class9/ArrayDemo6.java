package class9;

public class ArrayDemo6 {
    public static void main(String[] args) {
      int [] numbers = {45, 44, 33, 20, 10};
      int sum = 0;
      for(int i = 0; i < numbers.length; i++) {
          if (i % 2 == 0) {
              sum = sum + numbers[i];
          }
      }
          System.out.println(sum);




    }
}
