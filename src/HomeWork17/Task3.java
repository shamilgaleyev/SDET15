package HomeWork17;

public class Task3 {
    /*
    Write a java class that have 4 constructors with 4 different access levels
     of constructors(private,public,default,protected) and create 4 objects of this class:
     1 - inside same class;
      2 - from outside the class;
       3 - from different class inside different package  and observe result.
     */
      int ages;
      String name;
      int heights;

      int marks;

     public Task3(String n,int age){
          name = n;
          ages = age;

     }

     private Task3(int height, String firstName){
         heights = height;
         name = firstName;

     }

     Task3(String n, int age, int height){
         name = n;
         ages = age;
         heights = height;
     }

     protected Task3(int age, String n, int mark){
         name = n;
         ages = age;
         marks = mark;
     }


    public static void main(String[] args) {
        Task3 height = new Task3(80,"John");
    }

}
