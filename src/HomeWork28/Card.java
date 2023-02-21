package HomeWork28;

import java.util.LinkedList;

public class Card {
    /*
     Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    double interestRate;
    String cardType;
    Card(double interestRate, String cardType){
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    void display(){
        System.out.println(cardType + " has interest rate " + interestRate);
    }

    public static void main(String[] args) {
        Card c1 = new Card(15,"Visa");
        Card c2 = new Card(16,"Mastercard");
        Card c3 = new Card(17,"Discover");
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(c1);
        cards.add(c2);
        cards.add(c3);
        for(Card x: cards){
            x.display();
        }
    }

}
