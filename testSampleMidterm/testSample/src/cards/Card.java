package cards;

public class Card {

    private FaceOfCard face;
    private SuitOfCard suit;


    public Card(FaceOfCard face, SuitOfCard suit) {
        setFace(face);
        setSuit(suit);
    }

    public FaceOfCard getFace() {
        return face;
    }

    public SuitOfCard getSuit() {
        return suit;
    }

    public void setFace(FaceOfCard name) {
        face = name == null ? FaceOfCard.ACE : name;
    }

    public void setSuit(SuitOfCard name) {
        suit = name == null ? SuitOfCard.CLUBS : name;
    }

    @Override
    public String toString(){
        return String.format("%s of %s", face.getFace(), suit.getSuit());
    }



}
