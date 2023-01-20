package HomeWork11;

public class Task2 {
    public static void main(String[] args) {
        /*Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */
        String[][] cars = {{"Ford", "Chevy", "Jeep", "Tesla"},
                           {"Mercedes", "BMW", "Audi", "Volkswagen"},
                           {"Hyundai", "Kia"},
                           {"Ferrari", "Lamborghini", "Maserati"}};
        for (int i = 0; i < cars.length; i ++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
                System.out.println("_____________________________");
        for (String[] x : cars){
            for (String y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
            }
        }





