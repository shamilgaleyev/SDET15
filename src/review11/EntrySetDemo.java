package review11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetDemo {
    public static void main(String[] args) {

       Map<String,Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);
        Set<Map.Entry<String,Double>> fruit = fruitMap.entrySet();
        //var fruit = fruitMap.entrySet();
        for(Map.Entry<String,Double> x: fruit){
            String key = x.getKey();
            if((key.contains("a") || key.contains("e")) && x.getValue()> 8.0){
                System.out.println(key + " "+ x.getValue());
            }
        }



    }
}
