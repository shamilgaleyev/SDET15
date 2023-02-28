package class30;

import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name.
         (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
         */
        HashMap<Integer,String> companies = new HashMap<>();
        companies.put(1,"google");
        companies.put(2,"syntax");
        companies.put(3,"Samsung");
        companies.put(4,"IBM");
        companies.put(5,"Samsung");
        companies.put(6,"McDomalds");
        companies.put(7,"Samsung");
        System.out.println(companies.size());
        companies.replace(4,"Shell");
        companies.remove(7);
        System.out.println(companies);

    }
}
