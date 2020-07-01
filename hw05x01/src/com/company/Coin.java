package com.company;

import java.util.Random;

public class Coin {

    enum Face {
        HEAD,
        TAIL;

        //randomizer for HEAD/TAIL
        public static Face getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    private Random rand = new Random();
    private Face face;

    public Coin(){
        face = Face.getRandom();
    }

    public Coin(Face face) {
        setFace(face);//using the setter for the c-tor
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public void flip() {
        face = Face.getRandom();//flip method changes the face randomly
    }

    public boolean isHeads() {
        return face == Face.HEAD;
    }

    public String toString() {
        return "Face: " + getFace();
    }


}
