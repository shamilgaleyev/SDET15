package class12;

public class Task1 {
    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */
        String userName = "Vasia";
        String pass = "Petia";
        String passConf = "Petia";
        boolean isEmpty = userName.isEmpty();
        System.out.println(isEmpty);

        boolean isEmpty1 = pass.isEmpty();
        System.out.println(isEmpty1);

        if(pass.length() < 8){
            System.out.println("Too short");
        }

        boolean contain = pass.contains("Vasia");
        System.out.println(contain);

        boolean areEqual = pass.equals(passConf);
        System.out.println(areEqual);


    }
}
