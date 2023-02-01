package HomeWork17;

public class Task1 {

        /*
         Write a java class that will have a constructor:
          one with parameters and second without any parameters.
          Create a separate Test class where you will execute both of the constructors 1 by 1.
         */

    public Task1(){
        System.out.println("I love Java");
    }
     int side1;
    int side2;

    public Task1(int a,int b){
        side1 = a;
        side2 = b;
        System.out.println("The area of the rectangle is " + side1*side2);
    }
}
