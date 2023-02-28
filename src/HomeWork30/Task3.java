package HomeWork30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a Map that will store Employee name and salary.
         Write a logic to retrieve an employee who gets the highest salary.
          Output should be in the below format
          John Smith=$100000
         */

        Map<String, Integer> e = new HashMap<>();
        e.put("Chris Smith",130000);
        e.put("Tom White",120000);
        e.put("Zack Fisherman",140000);

        System.out.println(e);

        Set<Map.Entry<String,Integer>> employee=e.entrySet();
        String emp="";
        int highestSalary=0;
        for(Map.Entry<String,Integer> entry:employee){
            if(entry.getValue()>highestSalary){
                highestSalary=entry.getValue();
                emp=entry.getKey();
            }
        }
        System.out.println(emp+" = $"+highestSalary);

    }
}
