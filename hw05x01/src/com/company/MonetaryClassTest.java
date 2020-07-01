package com.company;

public class MonetaryClassTest {

    public static void main(String[] args) {
        MonetaryCoin mon = new MonetaryCoin(3);
        MonetaryCoin mon2 = new MonetaryCoin(1);
        MonetaryCoin mon3 = new MonetaryCoin(5);
        mon.setFace(Coin.Face.HEAD);
        int sum = 0;
        sum = mon.getValue() + mon2.getValue() + mon3.getValue();
        System.out.println(sum);


        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());
        mon.flip();
        System.out.println(mon.getFace());

    }

}

