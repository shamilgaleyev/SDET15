package class20;

public class SportTest {
    public static void main(String[] args) {
       Cricket cricket = new Cricket("Cricket","Pakistan","green Helmet");
       cricket.display();

     Soccer soc =  new Soccer("Soccer","Argentina", "Olivers",12);
     soc.display();
     soc.displayTeam();
    }
}
