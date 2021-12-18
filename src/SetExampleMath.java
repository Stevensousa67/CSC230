import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class SetExampleMath {
    public static void main(String[] args) {
        Set<Integer> setA = setOf(1, 2, 3, 4);
        Set<Integer> setB = setOf(2, 4, 6, 8);

        Set<Integer> iSet = new HashSet<>(setA);
        iSet.retainAll(setB);
        System.out.print("Intersect ");
        System.out.println(iSet);

        Set<Integer> uSet = new HashSet<>(setA);
        uSet.addAll(setB);
        System.out.print("Union ");
        System.out.println(uSet);

        Set<Integer> diffSetA = new HashSet<>(setA);
        diffSetA.removeAll(setB);
        System.out.print("Relative Complement(Difference)A ");
        System.out.println(diffSetA);

        Set<Integer> diffSetB = new HashSet<>(setB);
        diffSetB.removeAll(setA);
        System.out.print("Relative Complement(Difference)B ");
        System.out.println(diffSetB);
    }
     static Set<Integer> setOf(Integer... values) {
            return new HashSet<Integer>(Arrays.asList(values));
        }


    }