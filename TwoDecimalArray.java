package SortArray;

import java.util.Arrays;
import java.util.Random;

public class TwoDecimalArray {
    int height;
    int width;
    int[][] array;

    public TwoDecimalArray() {
    }

    public TwoDecimalArray(int height, int width) {
        this.height = height;
        this.width = width;
        array = new int[height][width];
    }

    public void createArray() { //Array array
        //int[][] array = new int[0][0];
        Random random = new Random();
        for (int i = 0; i < height; i++) { //array.w
            for (int j = 0; j < width; j++) { //array.h
                array[i][j] = random.nextInt(0,9);
            }
        }
    }

    public void sortArray(){
        int sum = 0;
        int[] arrayOfSum = new int[height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (array[i][j] % 2 == 0){
                    sum += array[i][j];
                }
            }
            //System.out.println(sum);
            arrayOfSum[i] = sum;
            sum = 0;
        }
        System.out.println(Arrays.toString(arrayOfSum));
        int[] buffer = new int[width];
        int bufferSum = 0;
        boolean unSorted = true;
        while (unSorted){
            unSorted = false;

            for (int i = 0; i < arrayOfSum.length - 1; i++) {
                if (arrayOfSum[i] > arrayOfSum[i+1]){
                    buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;

                    bufferSum = arrayOfSum[i];
                    arrayOfSum[i] = arrayOfSum[i+1];
                    arrayOfSum[i+1] = bufferSum;

                    unSorted = true;
                }
            }
        }
    }

//    public static void createArray(TwoDecimalArray arr) { //Array array
//        //int[][] array = new int[0][0];
//        Random random = new Random();
//        for (int i = 0; i < arr.width; i++) { //array.w
//            for (int j = 0; j < arr.height; j++) { //array.h
//                arr.array[i][j] = random.nextInt(0,9);
//            }
//        }
//    }

    public void printArray(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
