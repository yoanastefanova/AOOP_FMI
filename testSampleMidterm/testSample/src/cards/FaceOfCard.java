package cards;

import javax.swing.*;

public enum FaceOfCard {

    ACE("Ace"),
    DEUCE("Deuce"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");


    private final String face;

    FaceOfCard(String name) {
        face = name == null ? "Ace" : name;
    }

    public String getFace() {
        return face;
    }


}
