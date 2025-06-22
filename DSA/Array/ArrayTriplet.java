import java.util.*;

public class ArrayTriplet {
    public List<int[]> threeSum(int[] nums) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;  // Skip duplicates

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(new int[] {nums[i], nums[left], nums[right]});

                    // Skip duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Move left pointer to get a larger sum
                } else {
                    right--;  // Move right pointer to get a smaller sum
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayTriplet ts = new ArrayTriplet();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<int[]> results = ts.threeSum(nums);
        for (int[] triplet : results) {
            System.out.println(Arrays.toString(triplet));
        }
    }
}

