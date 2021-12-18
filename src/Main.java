import java.util.Arrays;

class Main3{
    public static void main(String args[]) {
        //define input array and print
        int heap_Array[] = {5,12,8,11,23,9,7,2,17};
        System.out.println("Input Array:" + Arrays.toString(heap_Array));
        //call HeapSort method for given array
        HeapSort hs = new HeapSort();
        hs.heap_sort(heap_Array);
        //print the sorted array
        System.out.println("Sorted Array:" + Arrays.toString(heap_Array));
    }
}