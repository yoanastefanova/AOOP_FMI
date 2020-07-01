package com;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(13) + 2;//size of the square matrix

        int array[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rand.nextInt(9);
            }
        }

    }
}
