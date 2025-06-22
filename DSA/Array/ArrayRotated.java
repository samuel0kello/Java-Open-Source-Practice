public class ArrayRotated {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Found the target, return its index
            }

            if (nums[start] <= nums[mid]) {
                // Left half is sorted
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Target not found in the array
    }

    public static void main(String[] args) {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}

// Certainly, let's explain the concept of binary search for a rotated array in
// an easy-to-understand way.

// Imagine you have a sorted list of numbers written on a long strip of paper.
// If the list is perfectly sorted, you can easily find any number using a basic
// binary search.

// Now, let's say you fold the strip of paper at a random point and then twist
// it. This makes some numbers appear at the beginning and others at the end of
// the paper strip. This folded and twisted strip represents a "rotated array."

// Binary search for a rotated array works like this:

// 1. You start by looking at the number in the middle of the strip.

// 2. You compare the middle number to the number you're searching for (the
// target).

// 3. If the middle number is the target, you're done! You've found the target.

// 4. If the middle number is not the target, you need to decide which half of
// the strip to keep searching.

// - If the left half (from the middle to the beginning) is sorted (meaning the
// numbers are in increasing order), you check if the target number falls within
// that range. If it does, you continue searching in the left half.
// - If the left half is not sorted, it means the right half (from the middle to
// the end) is sorted. You check if the target number is within the right half
// and continue searching there.

// 5. You keep repeating this process: dividing the strip in half and checking
// the sorted half until you find the target number or conclude that it's not in
// the array.

// In summary, binary search for a rotated array is like looking for a number on
// a twisted strip of paper. You compare the middle number, determine which half
// is sorted, and continue searching in the sorted half until you find the
// target or conclude it's not there. This approach is more efficient than
// checking each number one by one, especially for large arrays.