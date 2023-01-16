package HomeWork9;

public class Task4 {
    public static void main(String[] args) {
//   Create an array that can store names of cars and store 6 elements into it.
//   Print all values from the array.
     String[] cars = new String[6];
     cars[0] = "Toyota";
     cars[1] = "Honda";
     cars[2] = "BMW";
     cars[3] = "Volvo";
     cars[4] = "Tesla";
     cars[5] = "Audi";
        for(int i = 0; i < cars.length; i ++){
            System.out.println(cars[i]);
        }
    }
}
