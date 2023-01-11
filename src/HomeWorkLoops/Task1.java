package HomeWorkLoops;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”
[2:42 PM]
Print numbers from 1 to 100 in 1 line with space

Print numbers from 100 to 1

Print even numbers from 20 to 1 (2 ways)

Print odd numbers between 20 and 50 (2 ways)
         */
        boolean workDay = true;
        int day = 1;
        while (workDay){
            if (day < 6){
                System.out.println("I need a day off");
            } else if (day == 6){
                workDay = false;
                System.out.println("I do not need a day off any more");
            }
            day ++;
        }
    }
}
