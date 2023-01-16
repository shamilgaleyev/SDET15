package HomeWork9;

public class Task6 {
    public static void main(String[] args) {
//   Create an array of countries. While retrieving all values
//   from an array print capital for each country choose any five countries.
        String[] country = {"USA", "Canada", "Mexico", "Cuba", "Kazakhstan"};
        for (int i = 0; i < country.length; i++) {
            if (country[i].equalsIgnoreCase("USA")) {
                System.out.println(country[i] + " - Washington DC");
            }
            if (country[i].equalsIgnoreCase("Canada")) {
                System.out.println(country[i] + " - Toronto");
            }
            if (country[i].equalsIgnoreCase("Mexico")) {
                System.out.println(country[i] + " - Mexico City");
            }
            if (country[i].equalsIgnoreCase("Cuba")) {
                System.out.println(country[i] + " - Gavana");
            }
            if (country[i].equalsIgnoreCase("Kazakhstan")) {
                System.out.println(country[i] + " - Astana");
            }
        }

    }
}