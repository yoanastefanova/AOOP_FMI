package sample;

import java.util.Arrays;

public class Permutations {

    private static int count;

    private static int factorial(int n) {
        if (n == 0 || n == 1) {//всяко рек извикване е с постоянна сложност, имаме н извиквания
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int[][] permutations(int[] arr) { // Memory n!*n - много
        int[][] result = new int[factorial(arr.length)][arr.length];
        //първо проверяваме пермутациите с първата цифра, намираме пермутациите на останалите 3 числа;
        // след това отиваме на второто число, като разменим местата на 1вото и 2рото число;
        // след като приключим с втората стъпка, връщаме числата на предишните им места
        //когато стигнем последния индекс, спираме рекурсията

        computePermutations(0, arr, result);
        return result;
    }

    private static void computePermutations(int currentIndex, int[] arr, int[][] result) {
        //void, т.к. подаваме реф към обект result, тоест промените ще му се отразят
        if (currentIndex == arr.length - 1) {//дъно
            int[] perm = Arrays.copyOf(arr, arr.length);
            result[count] = perm;// result[count++]
            count++;
            return;
        }
        int temp;
        for (int i = currentIndex; i < arr.length; i++) {// сложност n, n! на брой рек извиквания => n!*n
            temp = arr[currentIndex];
            arr[currentIndex] = arr[i];
            arr[i] = temp;

            computePermutations(currentIndex + 1, arr, result);

            temp = arr[currentIndex];
            arr[currentIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
