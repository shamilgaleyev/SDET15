package class24;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}
class IPhone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("IPhone picture");
    }

    @Override
    void unlockPhone() {
        System.out.println("IPhone is not unlocked");
    }

    @Override
    void sendText() {
        System.out.println("Iphone sends texts");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Samsung makes good pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("samsung is unlocked");
    }

    @Override
    void sendText() {
        System.out.println("samsung sends texts");
    }
}