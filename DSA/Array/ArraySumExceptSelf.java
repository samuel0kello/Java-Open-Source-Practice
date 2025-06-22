public class ArraySumExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // The answer array to store the result
        int[] answer = new int[n];
        
        // Step 1: Fill the answer array with the product of elements to the left of each index
        answer[0] = 1;  // There is no element to the left of the first element
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }
        
        // Step 2: Traverse from right and update the answer array with the product of elements to the right
        int rightProduct = 1;  // Initially, there are no elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;  // Multiply the current value in answer by the right product
            rightProduct *= nums[i];  // Update the right product to include the current element
        }
        
        return answer;
    }

    public static void main(String[] args) {
        ArraySumExceptSelf solution = new ArraySumExceptSelf();
        
        // Example test case
        int[] nums = {1, 2, 3, 4};
        
        // Get the product array
        int[] result = solution.productExceptSelf(nums);
        
        // Print the result
        System.out.println("Product except self:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
