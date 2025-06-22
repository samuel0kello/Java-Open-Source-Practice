import java.util.HashMap;

public class ArraySubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize the map with 0 sum and count as 1 to handle subarrays that sum to k starting from index 0
        map.put(0, 1);
        
        int count = 0;
        int sum = 0;
        
        // Traverse through the array
        for (int num : nums) {
            sum += num;  // Update the cumulative sum
            
            // Check if (sum - k) is present in the map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);  // Increment count by the frequency of (sum - k)
            }
            
            // Update the map with the current cumulative sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;  // Return the total count of subarrays
    }

    public static void main(String[] args) {
        ArraySubarraySumEqualsK solution = new ArraySubarraySumEqualsK();
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(solution.subarraySum(nums, k));  // Output: 2
    }
}
