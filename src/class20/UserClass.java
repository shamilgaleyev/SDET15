package class20;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name
     and mobile number. Create a subclass  userInfo that will have user address variable
     and it also being initialized through constructor call. Print users name,
     mobile number and address in userDetails method. Test your code.
     */

    String name;
    long mobNumber;

    UserClass(String name,long mobNumber){
        this.name = name;
        this.mobNumber = mobNumber;
    }
 }
class UserInfo extends UserClass{
     String adrress;
    UserInfo(String name, long mobNumber,String adrress ) {
        super(name, mobNumber);
        this.adrress = adrress;
    }
    void userDetails() {
            System.out.println(name + " " + adrress + " " + mobNumber);
        }


    public static void main(String[] args) {
        UserInfo info = new UserInfo("Smith", 90455555555l, "123 Street st");
        info.userDetails();

        info.hashCode();

    }
}

