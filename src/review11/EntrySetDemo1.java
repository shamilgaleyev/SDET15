package review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo1 {
    public static void main(String[] args) {
        Map<String,Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);

        fruitMap.forEach((x,y)-> System.out.println(x+" "+y));
        var fruit = fruitMap.entrySet();
        fruit.removeIf(x->(x.getKey().contains("a") || x.getKey().contains("e")) && x.getValue()>8);
        System.out.println(fruitMap);


    }
}
