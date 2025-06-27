
/**
 * This code demonstrates the use of a while loop in Java.
 * The while loop continues to execute as long as the condition is true.
 * In this example, it calculates the sum of integers from 1 to 6.
 * The loop increments the variable `i` until it exceeds 6.
 * The final sum is printed to the console.
 */
public class whileLoop {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        // While Loop
        while (i <= 6) {
            sum = sum + i;
            i++; // Increment
        }

        System.out.println(sum);
    }
}