package HomeWork28;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.

         */
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("Chevy");
        cars.add("Lincoln");

        System.out.println(cars);
        for(String x: cars){
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < cars.size() ; i++) {
            System.out.print(cars.get(i)+ " ");
        }
    }
}
