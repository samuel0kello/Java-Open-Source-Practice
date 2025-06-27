
/**
 * This program demonstrates the use of a do-while loop in Java.
 * The do-while loop executes the block of code at least once
 * before checking the condition, making it useful when the initial
 * execution is required regardless of the condition.
 * In this example, it calculates the sum of integers from 1 to 6.
 * The loop continues until the variable `i` exceeds 6.
 * The final sum is printed to the console.
 */
class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        // Do While Loop
        do {
            sum = sum + i;
            i++;           
        } while (i <= 6);
        
        System.out.println(sum);
    }
}