public class ArrayXOR {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR each number with the result
        }
        return result; // The single number will be left
    }

    public static void main(String[] args) {
        ArrayXOR solution = new ArrayXOR();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single number: " + solution.singleNumber(nums)); // Output: 4
    }
}
