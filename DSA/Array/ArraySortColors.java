import java.util.Arrays;

public class ArraySortColors {
    public void sortColors(int[] nums) {
        // Step 1: Count the number of 0s, 1s, and 2s
        int[] count = new int[3]; // count[0] for 0s, count[1] for 1s, count[2] for 2s
        for (int num : nums) {
            count[num]++;
        }

        // Step 2: Modify the array based on the count
        int index = 0;
        // Fill the array with 0s
        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }
        // Fill the array with 1s
        for (int i = 0; i < count[1]; i++) {
            nums[index++] = 1;
        }
        // Fill the array with 2s
        for (int i = 0; i < count[2]; i++) {
            nums[index++] = 2;
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Original array: " + Arrays.toString(nums));

        ArraySortColors sorter = new ArraySortColors();
        sorter.sortColors(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
