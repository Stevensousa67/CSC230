import java.util.*;

public class Unique_Elements {
    public static void main(String [] args) {

        int[] orgArray = new int[] {0, 3, -2, 4, 2, 10, 22, 10, 20, 11, 22};
        Arrays.sort(orgArray);
        ArrayList<Integer> uniqueArray = new ArrayList<>();

        for(int i = 0; i < orgArray.length-1.; i++){
            if(i == 0){
                if(orgArray[i] != orgArray[i + 1]){
                    uniqueArray.add(orgArray[i]);
                }
            }
            else if(orgArray[i] != orgArray[i + 1] && orgArray[i] != orgArray[i - 1]){
                uniqueArray.add(orgArray[i]);
            }
        }
        System.out.println(uniqueArray);
    }
}
