package f71854.test1.model;

public class Card {

    private Faces face;
    private Suits suit;

    public Card() {
        setFace(null);
        setSuit(null);
    }

    public Card(Faces face, Suits suit) {
        setFace(face);
        setSuit(suit);
    }

    public Faces getFace() {
        return face;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setFace(Faces face) {
        this.face = face == null ? Faces.ACE : face;
    }

    public void setSuit(Suits suit) {
        this.suit = suit == null ? Suits.CLUBS : suit;
    }

    @Override
    public String toString(){
        return String.format("%s of %s \n", face.getFace(), suit.getSuit());
    }
}
