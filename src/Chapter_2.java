// Steven Sousa / 4Cs / Data Structures / 10-4-21

public class Chapter_2 {
    /*
    Section 2.1 - Self-Check
        1)  a) O(n2)
            b) O(n)
            c) O(n)
            d) O(n2)

        3)  O(f(n))     f(2000)     f(4000)     f(8000)
            O(log n)     3.30        3.60        3.90
            O(n)         2000        4000        8000
            O(n log n)   6600        14400       31200
            O(n2)        4000000     16000000    64000000
            O(n3)      8000000000   64000000000  512000000000

    Section 2.2 - Programming
        1)  Write the following static method:

            // Replaces each occurrence of oldItem in aList with newItem.
            public static void replace(ArrayList<String> aList, String oldItem, String newItem){
                for(int i = 0; i < aList.size(); i++){
                    if (aList.get(i) == oldItem) {
                        aList.set(i, newItem);
                    }
                }
            }

        2) Write the following static method:

            // Deletes the first occurrence of target in aList.
            public static void delete(ArrayList<String> aList, String target){
                for(int i = 0; i < aList.size(); i++){
                    if(aList.get(i) == target){
                        aList.remove(i);
                        break;
                    }
                }
            }

    Section 2.3 - Self-Check
        1) What does the code do?
            A) It adds the values of myList index 0 with myList index 1, for a sum of 8.456

    Section 2.4 - Self-Check
        1) Trace the execution of the code. What are the contents of anArray after each loop?
            A) First loop: anArray = {0, 1, 2, 3, 3, 3, 3, 3}. Second loop: anArray = {0, 1, 2, 3, 3, 4, 5, 6}

        Programming
            1) Implement the indexOf method of the KWArrayList<E> class.

                public static void indexOf(E item){
                    for(int i = 0; i < theData.size(); i++){
                        if (theData.get(i) == item){
                            return i;
                        }
                        else{
                            return -1;
                    }
                }

     */
}
