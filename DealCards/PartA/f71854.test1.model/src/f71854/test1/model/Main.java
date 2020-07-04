package f71854.test1.model;

public class Main {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        Card c1 = new Card(Faces.ACE, Suits.SPADES);
        deck.dealSeven();

        for (int i = 0; i < 11; i++) {
            System.out.println(deck.getHand()[i]);
        }



    }
}
