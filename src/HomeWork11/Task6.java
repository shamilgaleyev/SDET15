package HomeWork11;

public class Task6 {
    public static void main(String[] args) {
        /*Create 2D array of countries: north america countries, south america countries,
         europe countries, asian countries, african countries.
         Then print all values from that array using 2 different loops
          and calculate how many total countries been stored
         */
        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Peru", "Argentina"},
                {"Italy", "Poland", "Spain"},
                {"India", "Pakistan", "China"},
                {"Egypt", "Morocco", "Algeria"}};
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                sum++;
            }
            System.out.println();
        }
        System.out.println(sum + " countries in the 2d Array");

        System.out.println("_____________________________");

        sum = 0;

        for (String[] x : countries) {
            for (String y : x) {
                System.out.print(y + " ");
                sum++;
            }
            System.out.println();
        }
        System.out.println(sum);

    }
}





