package f71854.test1.model;

import java.util.Random;

public class DeckOfCards {

    private Card[] cards; // array of all the cards in the deck
    private int currentCard;
    private Card[] hand;// array of all the cards in one hand

    public DeckOfCards() {
        currentCard = 0;
        hand = new Card[7]; // array of seven cards

        cards = new Card[52];
        int len = cards.length;
        int i = 0;

        for (Suits suit : Suits.values()) {
            for (Faces face : Faces.values()) {
                if (i <= len) {
                    cards[i] = new Card(face, suit);
                    i++;
                }
            }
        }

        shuffleCards();
    }


    public Card[] getCards() {
        Card[] temp = new Card[cards.length];
        for (int i = 0; i < cards.length; i++) {
            temp[i] = cards[i];
        }
        return temp;
    }

    public int getCurrentCard() {
        return currentCard;
    }

    public Card[] getHand() {
        Card[] temp = new Card[hand.length];
        for (int i = 0; i < hand.length; i++) {
            temp[i] = hand[i];
        }
        return temp;
    }


    public void setCards(Card[] cards) {
        this.cards = cards.clone();
    }

    public void setHand(Card[] hand) {
        this.hand = hand.clone();
    }


    public void shuffleCards() { // масив с номерата на позициите в тестето [0, 51]
        Random rand = new Random();
        int newPos;
        int[] positions = new int[52];
        boolean isHere;

        currentCard = 0;

        for (int i = 0; i < 52; i++) {

            do {
                isHere = false;
                newPos = rand.nextInt(52);

                for (int j = 0; j < i; ++j) {
                    if (positions[j] == newPos) {
                        isHere = true;
                        break;
                    }
                }
            } while (isHere);

            positions[i] = newPos;
        }// масивът с разбърканите позиции е създаден

        for (int i = 0; i < 52; i++) { //първата и някоя от другите карти, определени от positions масива, се разменят
            Card first = cards[0];
            cards[0] = cards[positions[i]];
            cards[positions[i]] = first;
        }

    }


    public void dealSeven() {

        int len = cards.length;

        for (int i = 0; i < 7; i++) {

           // if (currentCard >= len) { //ако тестето е свършило
            //    hand[i] = null;
            hand[i] = cards[currentCard];
            ++currentCard;
            }
    }


    public String printHand(Printable choice) {
        return choice.printChoice(hand);
    }
}
