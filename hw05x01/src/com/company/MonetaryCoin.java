package com.company;

public class MonetaryCoin extends Coin {
    private int value;

    public MonetaryCoin(int val){
        value = val;
    }

    public int getValue(){
        return value;
    }

}
