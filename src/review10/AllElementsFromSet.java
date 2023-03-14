package review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {
    public static void main(String[] args) {


        Set<String> qaJobs = new LinkedHashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analist");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");

        for(String x: qaJobs){
            System.out.print(x + " ");
        }
        System.out.println();
        Iterator<String> it = qaJobs.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s+ " ");
        }



    }

}
