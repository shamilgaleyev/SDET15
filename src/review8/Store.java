package review8;

public class Store {
    public static void main(String[] args) {


        Furniture[] f = {new Chair(), new Table()};
        for (Furniture x : f) {
            x.comfort();
            x.assemble();
        }

        Table t = new Table();
        t.buildTable();
        t.buildTable("Wood");
    }
}