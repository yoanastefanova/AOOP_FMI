package cards;// Fig. 7.9: cards.Card.java
// cards.Card class represents a playing card.

public class Card 
{
   private String face; // face of card ("Ace", "Deuce", ...)
   private String suit; // suit of card ("Hearts", "Diamonds", ...)

   // two-argument constructor initializes card's face and suit
   public Card( String cardFace, String cardSuit )
   {
      face = cardFace; // initialize face of card
      suit = cardSuit; // initialize suit of card
   } // end two-argument cards.Card constructor

   //get методи за достъп до face и suit
   public String getFace() {
      return face;
   }

   public String getSuit() {
      return suit;
   }

   // return String representation of cards.Card
   public String toString() 
   { 
      return face + " of " + suit;
   } // end method toString
} // end class cards.Card

