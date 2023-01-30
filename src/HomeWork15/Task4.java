package HomeWork15;

public class Task4 {
    /*
    Create a method that will say Hello in different language based on the country
     that will passed when method is executed
     */
    String hello(String country) {
        if (country.equals("USA")){
            return "Hello";
        } else if (country.equals("Mexico")) {
            return "Hola";
        } else if (country.equals("France")) {
            return "Salut";
        } else if (country.equals("Italy")) {
            return "Ciao";
        } else {
            return "I dont know";
        }
    }

    String hello1(String country1){
        switch (country1){
            case "USA":
                return "Hello";
            case "Kazakhstan":
                return  "Salem";
            case "Italy":
                return "Ciao";
            default:
                return "Country is not supported";
        }
    }

    public static void main(String[] args) {
        Task4 hello = new Task4();
        System.out.println(hello.hello("Mexico"));

        System.out.println(hello.hello1("Italy"));
    }
}

