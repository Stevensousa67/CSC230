// Steven Sousa - 4Cs - Data Structure - 10/13/21

import java.util.Random;

public class SelectionSort{
    public static void main(String [] args) throws InterruptedException{
        int [] arr = new int[1000];
        Random randNum = new Random();

        for (int i = 0; i < arr.length; i++) {
            // Make randNum range from 1 to 5000 so that the chances of a repeated number may be lowered.
            arr[i] = randNum.nextInt(1, 5000);
        }

        long startTime = System.nanoTime();
        selectionSorter(arr);//sorting array using selection sort

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Selection Sort execution time in nanoseconds: " + timeElapsed);
    }
    public static void selectionSorter(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;  //searching for lowest index
                }
            }
            swap(arr,index,i);
        }
    }
    public static void swap(int[] arr,int index, int i) {
        int smaller = arr[index];
        arr[index] = arr[i];
        arr[i] = smaller;
    }
}