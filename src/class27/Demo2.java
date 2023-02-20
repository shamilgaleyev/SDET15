package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name = "Nima";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};

        System.out.println(findString(name,names));
    }

    public static boolean findString(String name, String[] names){
        for (String x: names){

            if (x.equals(name)){
                return true;
            }
        }
        return false;
    }
}
