public class Swap_Array {
    public static void main(String[] args) {
        int[] arr = {2, 14, 40, 21};
        swap(arr);

        for(int number : arr){
            System.out.println(number);
        }
    }

    public static void swap(int[] arr){
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
}
