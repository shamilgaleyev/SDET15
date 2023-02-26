package class29;

import java.util.TreeSet;

public class TaskSet1 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Portugal");
        System.out.println(countries);
        for(String x: countries){
            System.out.println(x);
        }
    }
}
