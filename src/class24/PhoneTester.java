package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone [] arr = {new IPhone(), new Samsung() };
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            phone.displayPictures();
            phone.unlockPhone();
            phone.sendText();
        }
    }
}
