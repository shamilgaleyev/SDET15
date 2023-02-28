package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> makeup = new HashMap<>();
        makeup.put("Lipstick",50.00);
        makeup.put("foundation",40.00);
        makeup.put("mascara",70.00);
        makeup.put("eyeliner",12.2);
        makeup.put("Blush-on",12.2);

        Set<String> allKeys = makeup.keySet();
        System.out.println(allKeys);

//        for (String s: allKeys) {
//
//            System.out.println(s);
//        }
        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);
    }
}
