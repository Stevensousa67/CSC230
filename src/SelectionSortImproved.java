// Steven Sousa - 4Cs - Data Structure - 10/13/21

import java.util.Random;

public class SelectionSortImproved{
    public static void main(String [] args) throws InterruptedException{
        int [] arr = new int[1000];
        Random randNum = new Random();

        for (int i = 0; i < arr.length; i++) {
            // Make randNum range from 1 to 5000 so that the chances of a repeated number may be lowered.
            arr[i] = randNum.nextInt(1, 5000);
        }

        long startTime = System.nanoTime();
        selectionSort(arr);//sorting array using selection sort

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Selection Sort execution time in nanoseconds: " + timeElapsed);
    }
    public static void selectionSort(int[] arr){

        int arrLength = arr.length;
        int temp;

        for(int i = 0; i < arrLength - 1; i++){
            int index = i;
            for (int j = i + 1; j < arrLength; j++){
                if (arr[j] < arr[index]){
                    index = j;  //searching for lowest index
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}