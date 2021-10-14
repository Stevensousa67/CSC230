// Steven Sousa - 4Cs - Data Structure - 10/12/21
// 13.1 seconds

import java.util.Random;

public class BubbleSortImproved {
    public static void main(String[] args) throws InterruptedException{

        int [] arr = new int[100000];
        Random randNum = new Random();

        for (int i = 0; i < arr.length; i++) {
            // Make randNum range from 1 to 500000 so that the chances of a repeated number may be lowered.
            arr[i] = randNum.nextInt(1, 5000000);
        }

        long startTime = System.nanoTime();
        bubble(arr);

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
    }

    public static void bubble(int[] arr) {
        int lastSwap = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            boolean sorted = true;
            int currentSwap = -1;

            for (int j = 0; j < lastSwap; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                    currentSwap = j;
                }
            }
            if (sorted) return;
            lastSwap = currentSwap;
        }
    }
}