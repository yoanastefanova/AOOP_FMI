package f71854.test1.model;

public enum Faces {

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

    Faces(String face){
       this.face = face == null? "Ace" : face;
   }

    public String getFace() {
        return face;
    }


    @Override
    public String toString(){
        return String.format("Face: %s", face);
    }
}
