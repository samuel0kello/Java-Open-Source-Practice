
/**
 * This program demonstrates the use of a for loop in Java.
 * The for loop iterates from 1 to 6, summing the integers
 * from 1 to 6 and printing the final sum.
 * The loop continues until the variable `i` exceeds 6.
 * The final sum is printed to the console.
 */
public class ForLoop {

    public static void main(String[] args) {
        int sum = 0;

        // For Loop
        for (int i = 1; i <= 6; i++) {
            sum = sum + i;
        }
        
        System.out.println(sum); // Output the final sum
    }
}