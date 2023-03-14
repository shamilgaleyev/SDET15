package review10;

import java.util.HashSet;
import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
       Set<String> qaJobs = new HashSet<>();
       qaJobs.add("Automation Engineer");
       qaJobs.add("Manual Tester");
       qaJobs.add("SDET");
       qaJobs.add("QA Analist");
       qaJobs.add("Api Tester");
       qaJobs.add("Database Tester");

        System.out.println(qaJobs);

       qaJobs.remove("Manual Tester");
        System.out.println(qaJobs);
        qaJobs.add("Api Tester");
        System.out.println("If duplicate was added " + qaJobs);

        Set<String> lset = new LinkedHashSet<>(qaJobs);
        System.out.println("LinkedHashSet = " +lset);

        Set<String> tSet = new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet = " + tSet);




    }
}
