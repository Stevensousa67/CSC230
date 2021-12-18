// Credit for this code goes to https://www.techiedelight.com/convert-max-heap-min-heap-linear-time/ for explaining the
// logic of this exercise.

import java.util.Arrays;

public class MaxHeapToMinHeap {
    public static void main(String[] args){

        int[] arr = {9, 4, 7, 1, -2, 6, 5};
        System.out.println(Arrays.toString(arr));
        minHeap.convert(arr);
        System.out.println(Arrays.toString(arr));
    }
    class minHeap{

        private static int LEFT(int i){
            return (2 * i + 1);
        }
        private static int RIGHT(int i){
            return (2 * i + 2);
        }

        private static void heapify(int[] arr, int i, int size){
            int left = LEFT(i);
            int right = RIGHT(i);
            int smallest = i;

            if(left < size && arr[left] < arr[i]){
                smallest = left;
            }
            if(right < size && arr[right] < arr[smallest]){
                smallest = right;
            }
            if(smallest != i){
                swap(arr, i, smallest);
                heapify(arr, smallest, size);
            }
        }

        private static void swap(int[]arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        private static void convert(int[] arr){
            int i = (arr.length - 2) / 2;
            while(i >= 0){
                heapify(arr, i--, arr.length);
            }
        }
    }
}
