
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetExample {

    public static void main(String[] args) {
     Set<String> nameSet = new TreeSet<String>();
        nameSet.add("Kirk");
        nameSet.add("Bones");
        nameSet.add("Spock");
        nameSet.add("Scotty");
        nameSet.add("Uhura");
        nameSet.add("Chekov");
        nameSet.add("Sulu");
        nameSet.add("Spock");
        System.out.print("Names: ");
        System.out.println(nameSet);
        System.out.println( nameSet.contains("Data"));
    }
}