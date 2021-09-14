import java.util.Arrays;

public class Commodity_Cost {
    public static void main(String[] args){
        int[] price = {100, 180, 260, 310, 240, 535, 695};
        int[] price_sorted = sort(price);
        int max_value = price_sorted[6];
        int min_value = price_sorted[0];
        int buy_day = indexOf(price, min_value);
        int sell_day = indexOf(price, max_value);
        System.out.println("Best day to buy: " + buy_day);
        System.out.println("Best day to sell: " + sell_day);
    }
    public static int[] sort(int[] arr){
        Arrays.stream(arr).sorted();
        return arr;
    }
    public static int indexOf(int[] arr, int num){
        int counter = 0;
        for(int number : arr){
            if(arr[number] == num){
                counter = number;
                break;
            }
        }
        return counter;
    }
}
