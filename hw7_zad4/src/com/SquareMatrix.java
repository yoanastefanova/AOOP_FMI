package com;

public class SquareMatrix {

    int dataArray[][];


    public SquareMatrix() {
        this(new int[][]{{0}});
    }

    public SquareMatrix(int[][] dataArray) {
        setDataArray(dataArray);
    }

    public SquareMatrix(SquareMatrix sm) {
        this(sm.getDataArray());
    }

    public void setDataArray(int[][] dataArray) {
        if (dataArray != null) {
            this.dataArray = new int[dataArray.length][dataArray.length];
            for (int i = 0; i < dataArray.length; i++) {
                for (int j = 0; j < dataArray.length; j++) {
                    this.dataArray[i][j] = dataArray[i][j];
                }
            }
        } else {
            this.dataArray = new int[][]{{0}};
        }
    }

    public int[][] getDataArray() {
        int copy[][] = new int[dataArray.length][dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                copy[i][j] = dataArray[i][j];
            }
        }
        return copy;
    }

    int maxRow;
    int maxCol;

    public int findMaxSum() {
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                if (i < dataArray.length - 2 && j < dataArray.length) {

                    int first = dataArray[i][j];
                    int sec = dataArray[i][j + 1];
                    int third = dataArray[i + 1][j];
                    int fourth = dataArray[i + 1][j + 1];


                    sum = first + sec + third + fourth;

                    if(maxSum < sum){
                        maxSum = sum;
                        maxRow=i;
                        maxCol = j;
                    }

                    if(sum<0){
                        sum=0;
                    }
                }
            }
        }

        return maxSum;
    }

    public void printAll(){
        System.out.printf("Max sum: &d\n", findMaxSum());
        System.out.printf("Submatrices with max sum: \n[%d, %d]\n", maxRow, maxCol);
    }

    @Override
    public String toString() {
        String result = "";
        int count = 0;

        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                result += String.valueOf(dataArray[i][j]);
                count++;
                if (count % dataArray.length == 0) {
                    result += "\n";
                }
            }

        }
        return result;
    }
}
