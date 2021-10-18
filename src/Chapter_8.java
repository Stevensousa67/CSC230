// Steven Sousa - 4Cs - Data Structures - 10/18/21

public class Chapter_8 {
    /*
    Self-Check 8.1:

    Indicate whether each of the following method calls is valid. Describe why it isn’t valid or, if it is valid,
    describe what it does. Assume people is an array of Person objects and peopleList is a List of Person objects.

    a. people.sort();
        Answer: Invalid
    b. Arrays.sort(people, 0, people.length -3);
        Answer: Valid
    c. Arrays.sort(peopleList, 0, peopleList.length - 3);
        Answer: Invalid
    d. Collections.sort(people);
        Answer: Invalid
    e. Collections.sort(peopleList, new ComparePerson());
        Answer: Valid
    f. Collections.sort(peopleList, 0, peopleList.size() - 3);
        Answer: Valid

    Self-Check 8.2:

    Show the progress of each pass of the selection sort for the following array. How many passes are needed?
    How many comparisons are performed? How many exchanges? Show the array after each pass.

    40 35 80 75 60 90 70 75 50 22

        Answer: 8 passes, 9 comparisons, and 7 exchanges.
            22 35 80 75 60 90 70 75 50 40
            22 35 40 75 60 90 70 75 50 80
            22 35 40 50 60 90 70 75 75 80
            22 35 40 50 60 90 70 75 75 80
            22 35 40 50 60 70 90 75 75 80
            22 35 40 50 60 70 75 90 75 80
            22 35 40 50 60 70 75 75 90 80
            22 35 40 50 60 70 75 75 80 90


    Self-Check 8.3:

    Sort the following array using insertion sort. How many passes are needed? How many comparisons are performed?
    How many exchanges? Show the array after each pass.

    40 35 80 75 60 90 70 75 50 22

        Answer: 9 passes, 10 comparisons, and 8 exchanges.
            35 40 80 75 60 90 70 75 50 22
            35 40 80 75 60 90 70 75 50 22
            35 40 75 80 60 90 70 75 50 22
            35 40 60 75 80 90 70 75 50 22
            35 40 60 75 80 90 70 75 50 22
            35 40 60 70 75 80 90 75 50 22
            35 40 60 70 75 75 80 90 50 22
            35 40 50 60 70 75 75 80 90 22
            22 35 40 50 60 70 75 75 80 90

    Programming 8.3.1

    Eliminate method insert in Listing 8.2 and write its code inside the for statement.

    Answer:
        public class InsertionSort {
            public static <T extends Comparable<T>> void sort(T[] table) {
                for (int nextPos = 1; nextPos < table.length; nextPos++) {
                    T nextVal = table[nextPos];

                    while(nextPos > 0 && nextVal.compareTo(table[nextPos-1] < 0){
                        table[nextPos] = table[nextPos -1];
                        nextPos--;
                    }
                    table[nextPos] = nextVal;
                }
            }
        }*/
}
