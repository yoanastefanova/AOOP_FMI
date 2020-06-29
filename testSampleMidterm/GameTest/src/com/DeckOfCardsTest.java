package com;

import java.util.Arrays;

public class DeckOfCardsTest {

    public static void main(String[] args) {

        System.out.println("\nSort test\n");

        DeckOfCards deck = new DeckOfCards();
        System.out.println("After construction:");
        System.out.println(deck.getDistinctFaces());
        System.out.println("After shuffle: ");
        deck.shuffleCards();
        System.out.println(deck.getDistinctFaces());
        System.out.println("After sort: ");
        deck.sortByFaceCards();
        System.out.println(deck.getDistinctFaces());

        System.out.println("\nDeal test\n");
        DeckOfCards deck1 = new DeckOfCards();
        deck1.shuffleCards();
        System.out.println("After shuffle(faces): ");
        System.out.println(deck1.getDistinctFaces());

        System.out.println("\nBegin dealing\n");
        for(int i =0;i<12;i++){
            System.out.println(Arrays.toString(deck1.dealFive()));
        }
    }
}
