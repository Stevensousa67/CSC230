// Steven Sousa - 4Cs - Data Structures - Lab 4 - 11/05/21

// import necessary classes
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Palindrome {

    private static Scanner input = new Scanner(System.in);
    private static Stack<Character> stack = new Stack<Character>();
    private static Queue<Character> queue = new LinkedList<Character>();
    private static String str;

    public static void isPalindromeStack(String str){

        // Insert string into stack
        // First we have to remove the special characters from the string and make the string lower case
        String modifiedString = str.toLowerCase().replaceAll("\\W", "");
        int strLength = modifiedString.length();

        // Now we insert the string into a stack
        int index = 0;
        while (index < strLength) {
            stack.push(modifiedString.charAt(index));
            index++;
        }

        // Now we create a reverse string of modifiedString using the stack
        String reverseModifiedString = "";
        while(!stack.isEmpty()){
            reverseModifiedString = reverseModifiedString + stack.peek();
            stack.pop();
        }

        // Finally, we compare modifiedString against reverseModifiedString to see if they are palindrome.
        System.out.println("Palindrome using Stack? " + modifiedString.equals(reverseModifiedString));
    }

    public static void isPalindromeQueue(String str){

        // Insert string into stack
        // First we have to remove the special characters from the string and make the string lower case
        String modifiedString = str.toLowerCase().replaceAll("\\W", "");
        int strLength = modifiedString.length();

        // Now we insert the string into a stack, so they can be in reverse order for the queue
        Stack<Character> tempStack = new Stack<Character>();
        int index = 0;
        while (index < strLength) {
            tempStack.push(modifiedString.charAt(index));
            index++;
        }

        // Now we add each element of the stack (which will be in reverse) and pop them out from the stack
        while(!tempStack.isEmpty()){
            queue.add(tempStack.peek());
            tempStack.pop();
        }

        // Now we create a reverse string of modifiedString using queue
        String reverseModifiedString = "";
        while(!queue.isEmpty()){
            reverseModifiedString = reverseModifiedString + queue.peek();
            queue.remove();
        }

        // Finally, we compare modifiedString against reverseModifiedString to see if they are palindrome.
        System.out.println("Palindrome using Queue? " + modifiedString.equals(reverseModifiedString));
    }

    public static void main (String[] args) {

        System.out.println("Enter a string to check if it's a palindrome.");
        str = input.nextLine();
        isPalindromeStack(str);
        isPalindromeQueue(str);
    }
}
