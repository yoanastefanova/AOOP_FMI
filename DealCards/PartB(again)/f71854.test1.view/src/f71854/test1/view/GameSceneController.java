package f71854.test1.view;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

import f71854.test1.model.*;

public class GameSceneController {


    //public TextArea txаSame;
    private DeckOfCards deck;
    private int[] countFaces; // counts of power of hand


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txaDeal;

    @FXML
    private TextArea txaSame;

    @FXML
    private Button btnDeal;

    @FXML
    private Button btnSame;

    @FXML
    void initialize() {
        deck = new DeckOfCards();
        countFaces = new int[13];
    }


    @FXML
    void btnDealOnAction() {
        deck.dealSeven();

        txaDeal.setText(deck.printHand(new Printable() {
            @Override
            public String printChoice(Card[] cards) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < deck.getHand().length; i++) {
                    sb.append(deck.getHand()[i]);
                    sb.append('\n');
                }
                return sb.toString();
            }
        }));
    }


    @FXML
    void btnSameOnAction() {
        txaSame.setText(deck.printHand(new Printable() {
            @Override
            public String printChoice(Card[] cards) {
                StringBuilder sb = new StringBuilder();
                countHand(deck.getHand());
                for (int i = 0; i < 13; i++) {
                    if (countFaces[i] == 2) {
                        sb.append(Faces.values()[i]);
                        sb.append('\n');
                    }
                }
                if (sb.equals("")) {

                    return "No such cards";

                } else
                    return sb.toString();
            }
        }));
    }


    void countHand(Card[] hand) {

        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getFace().equals(Faces.ACE)) {
                countFaces[0]++;
            }

            if (hand[i].getFace().equals(Faces.DEUCE)) {
                countFaces[1]++;
            }

            if (hand[i].getFace().equals(Faces.THREE)) {
                countFaces[2]++;
            }

            if (hand[i].getFace().equals(Faces.FOUR)) {
                countFaces[3]++;
            }

            if (hand[i].getFace().equals(Faces.FIVE)) {
                countFaces[4]++;
            }

            if (hand[i].getFace().equals(Faces.SIX)) {
                countFaces[5]++;
            }

            if (hand[i].getFace().equals(Faces.SEVEN)) {
                countFaces[6]++;
            }

            if (hand[i].getFace().equals(Faces.EIGHT)) {
                countFaces[7]++;
            }


            if (hand[i].getFace().equals(Faces.NINE)) {
                countFaces[8]++;
            }

            if (hand[i].getFace().equals(Faces.TEN)) {
                countFaces[9]++;
            }


            if (hand[i].getFace().equals(Faces.JACK)) {
                countFaces[10]++;
            }

            if (hand[i].getFace().equals(Faces.QUEEN)) {
                countFaces[11]++;
            }


            if (hand[i].getFace().equals(Faces.KING)) {
                countFaces[12]++;
            }

            if (hand[i].equals(null)) {
                System.out.println("No more cards");
            }
        }
    }
}




