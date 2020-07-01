package providers;


import services.Cipherable;

import java.util.Arrays;


public class CipherGenerator {

    public static Result countDistinct(Cipherable cipher, int seed) {
        // пресмята броя на уникалните символи в масива от символи, генерирани от
        //метода getSecretChars(seed)
        char[] temp = cipher.getSecretChars(seed);
        boolean[] unique = new boolean[temp.length];
        Arrays.fill(unique, true);
        int counter = 0;


        for (int i = 0; i < temp.length - 1; i++) {

            for (int j = i + 1; j < temp.length; j++) {

                if (temp[i] == temp[j]) {
                    unique[i] = false;
                    unique[j] = false;
                }
            }
        }

        for (int i = 0; i < unique.length; i++) {
            if (unique[i] == true) {
                counter++;
            }
        }

        return new Result(temp, counter);
        //капсулира масива с генерираните символи и броят на
        //неповтарящите се символи
    }
}
