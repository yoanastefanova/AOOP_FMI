package cards;

public enum SuitOfCard {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");


    private final String suit;

    SuitOfCard(String name) {
        suit = name == null ? "Clubs" : name;
    }

    public String getSuit() {
        return suit;
    }
}
