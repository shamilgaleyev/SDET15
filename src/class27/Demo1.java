package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name = "Zafar";
        String name2 = "Aiperi";
        String name3 = "Sarah";

        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        displayname(names);
    }


    public static void displayname(String[] names) {
        for (String x : names) {
            System.out.print(x + " ");
        }

    }

}
