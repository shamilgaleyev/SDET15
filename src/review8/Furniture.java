package review8;

public class Furniture {
   public void assemble(){
       System.out.println("Furniture needs to be assembled");
   }
   public void comfort(){
       System.out.println("Furniture needs to be comfortable");
   }
}
class Chair extends Furniture{
    @Override
    public void comfort() {
        System.out.println("Not every chair is comfortable");

    }
    protected void loveSeat(){
        System.out.println("The best chair");
    }
}
class Table extends Furniture{
    @Override
    public void comfort() {
        System.out.println("Table cannot be comfortable");
    }
    protected void buildTable(){
        System.out.println("We can easily build a table");
    }

    protected void buildTable(String material){
        System.out.println("We build a table from " + material);
    }
}