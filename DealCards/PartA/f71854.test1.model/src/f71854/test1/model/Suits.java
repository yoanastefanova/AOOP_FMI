package f71854.test1.model;

public enum Suits {

    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String suit;

    Suits(String suit) {
        this.suit = suit == null? "Clubs" : suit;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return String.format("Suit: %s", suit);//getSuit()
    }
}
