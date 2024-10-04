import java.util.Collections;
import java.util.Scanner;
import java.util.Stack; // Now using Stack instead of LinkedList

/**
 * The SortedStack program implements an application that reads a list of integers
 * from the command line input and stores them in a Stack, sorting them from
 * the smallest to the largest value.
 * 
 * <p>This program reads input from the console until the user provides no further input
 * and then outputs the sorted Stack.
 * 
 * @author Jonah Wilson
 * @since 2024-09-30
 */
public class SortedStack {

    /**
     * This is the main method which makes use of the Collections framework to sort
     * and store integers in a Stack.
     * 
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Create a Stack to store Integer values
        // Reuse of the Stack data structure from the java.util package
        Stack<Integer> numbers = new Stack<>();

        // Scanner to read input from the user
        // Reuse of the Scanner class for reading input from the command line
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (type 'exit' to finish):");

        // Read input and push numbers onto the stack
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Using the push method from the Stack class (code reuse of Stack methods)
                int number = scanner.nextInt();
                numbers.push(number);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Please enter a valid integer or 'exit' to finish.");
                }
            }
        }

        // Sort the Stack using Collections.sort
        // Reuse of the Collections.sort method to sort the stack (code reuse of sorting algorithm)
        Collections.sort(numbers);

        // Output the sorted Stack
        System.out.println("Sorted stack: " + numbers);

        // Peek the top element (optional, to show stack operation)
        if (!numbers.isEmpty()) {
            System.out.println("Top element (peek): " + numbers.peek());
        }

        // Close the scanner
        // Reuse of the close method from the Scanner class
        scanner.close();
    }
}

