package class10;

public class D2Arrays {
    public static void main(String[] args) {
        String[] cabin0 = {"Adam", "Zafar", "Sam"};
        String[] cabin1 = {"Naby", "Saud", "Anees"};
        String[] cabin2 = {"Safi", "Abeera", "Zahra"};
        String[][] thomsonTrain = new String [3][3];

        thomsonTrain[0] = cabin0;
        thomsonTrain[1] = cabin1;
        thomsonTrain[2] = cabin2;
        System.out.println(thomsonTrain[1][2]);
    }

}
