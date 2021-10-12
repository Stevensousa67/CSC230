// Steven Sousa - 4Cs - Data Structure - 10/12/21

public class BubbleSort{
    public static void main(String[] args) {
        int [] arr =  {1,17,3,-7, 7, 2};
        bubble(arr);
        for(int i : arr){
            System.out.println(i);
        }
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