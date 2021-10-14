// Steven Sousa - 4Cs - Data Structure - 10/13/21
// 12.8 seconds

import java.util.Random;

class BubbleSort{
    public static void main(String[] args) {
        int [] arr = new int[100000];
        Random randNum = new Random();

        for (int i = 0; i < arr.length; i++) {
            // Make randNum range from 1 to 500000 so that the chances of a repeated number may be lowered.
            arr[i] = randNum.nextInt(1, 500000);
        }

        long startTime = System.nanoTime();
        bubble(arr);

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);;
    }

    public static void bubble(int[] arr){
        int inOrd = 0;

        while(inOrd < arr.length) {
            for (int i=1; i < arr.length-inOrd; i++){
                if (arr[i-1] > arr[i]){
                    swap( arr,i-1,i);
                }

            }
            inOrd++;
        }
    }
    public static void swap(int[]arr,int bi, int i) {
        int temp = arr[bi];
        arr[bi] = arr[i];
        arr[i] = temp;
    }
}