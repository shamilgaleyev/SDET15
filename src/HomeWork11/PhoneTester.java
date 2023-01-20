package HomeWork11;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Iphone";
        phone1.color = "White";
        phone1.speed = "Fast";
        phone1.quality = "great";

        Phone phone2 = new Phone();
        phone2.brand = "samsung";
        phone2.color = "Black";
        phone2.speed = "Fast";
        phone2.quality = "great";

        Phone phone3 = new Phone();
        phone3.brand = "Pixel";
        phone3.color = "White";
        phone3.speed = "I don't now";
        phone3.quality = "I don't now";

        phone2.call();
    }
}
