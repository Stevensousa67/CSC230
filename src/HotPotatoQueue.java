import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;


public class HotPotatoQueue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("Breski");
        queue.add("Steven");
        queue.add("Gabby");
        queue.add("Sofia");
        queue.add("Russel");
        hotPotato(queue);
    }

    public static void hotPotato(Queue<String> queue){
        Random rand = new Random();
        System.out.println(queue);
        while(queue.size() > 1) {
            int number = rand.nextInt(1000) + 1;
            for (int i = 0; i < number; i++) {
                queue.add(queue.remove());
            }
            queue.remove();
            System.out.println(queue);
        }
    }
}
