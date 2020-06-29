package com;

import cards.*;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {

    private ArrayList<Card> cards;
    private int currentCard;

    public DeckOfCards() {
        currentCard = 0;
        cards = new ArrayList<>(52);

        for (SuitOfCard s : SuitOfCard.values()) {
            for (FaceOfCard f : FaceOfCard.values()) {
                cards.add(new Card(f, s));
            }
        }
    }

    public void shuffleCards() {
        Random random = new Random();
        int newPosition;
        boolean isPresent;
        int[] nArr = new int[52];

        currentCard = 0;

        for(int i =0;i<52;i++){
            do{
                isPresent = false;
                newPosition = random.nextInt(52);

                for(int j=0;j<i;++j){
                    if(nArr[j] == newPosition){
                        isPresent = true;
                        break;
                    }
                }
            } while(isPresent);

            nArr[i] = newPosition;
        }

        for (int i = 0; i < 52; i++) {

            Card c = cards.get(0);
            cards.set(0, cards.get(nArr[i]));
            cards.set(nArr[i], c);
        }
    }

    public Card[] dealFive() {
        Card[] result;
        int size = cards.size();

        result = new Card[5];

        for (int i = 0; i < 5; i++) {

            if (currentCard >= size) {
                return result;
            }

            result[i] = cards.get(currentCard);
            ++currentCard;
        }
        return result;
    }

    public void sortByFaceCards() {
        int size;
        //представяме елементите в enum класа като елеметни на масив
        ArrayList<FaceOfCard> faces = new ArrayList<>(Arrays.asList(FaceOfCard.values()));

        size = cards.size();

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (faces.indexOf(cards.get(j).getFace()) < faces.indexOf(cards.get(minIndex).getFace())) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Card c = cards.get(i);
                cards.set(i, cards.get(minIndex));
                cards.set(minIndex, c);
            }
        }
    }

    public void printBySuits() {
        ArrayList<Card> currentGroup;

        currentGroup = new ArrayList<>(52);

        for (SuitOfCard s : SuitOfCard.values()) {
            for (int i = currentCard; i < 52; i++) {
                Card currentCard = cards.get(i);
                if (currentCard.getSuit() == s) {
                    currentGroup.add(new Card(currentCard.getFace(), s));
                }
            }
            System.out.printf("%s - %s\n", s, currentGroup);
            currentGroup.clear();
        }
    }


    public ArrayList<FaceOfCard> getDistinctFaces() {
        ArrayList<FaceOfCard> distinctFaces;

        distinctFaces = new ArrayList<>(52);


        for (int i = currentCard; i < 52; i++) {
            distinctFaces.add(cards.get(i).getFace());
        }


        return distinctFaces;
    }
}


