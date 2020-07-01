package providers;

import services.Cipherable;

import javax.crypto.Cipher;
import java.util.Random;

public class Wrapper {

    public int size;

    public Wrapper(int size) {
        setSize(size);
    }

    public Wrapper(){
        setSize(0);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cipherable makeFixedSelection() {
        return new FixedRandom();
    }


    public Cipherable makeFixedRandom() {
        return new FixedSelection();
    }


    //CLASS FIXED RANDOM

    private class FixedRandom implements Cipherable {


        public char[] getSecretChars(int seed) {
            // генерира една и съща последователност от произволно избрани
            //символи в интервала A-Z за всяка конкретна стойност на аргумента seed
            char[] res = new char[size];
            Random rand = new Random(seed);//всеки път ще изкарва една и съща последователност,
            //която зависи от параметъра seed

            for (int i = 0; i < size; i++) {
                res[i] = (char)(rand.nextInt(90-65) + 65);// [65,90]; ascii number ----> char
            }
            return res;
        }
    }


    //CLASS FIXED SELECTION

    class FixedSelection implements Cipherable {

        public char[] getSecretChars(int seed) {
            // генерира произволна последователност от seed произволно избрани
            //символи в интервала A-Z; записват се  в реда на генерирането им в масива с дължина size
            char[] res1 = new char[size];
            Random rand = new Random();

            if (seed > size) {
                seed = size;
            }

            for (int i = 0; i < seed; i++) {
                res1[i] = (char) (rand.nextInt(90 - 65) + 65);// ascii number ----> char
            }
            return res1;
        }
    }

}









