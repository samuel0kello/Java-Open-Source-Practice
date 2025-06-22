public class ArrayTrappingRainwater {

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;            // Left pointer
        int right = height.length - 1;  // Right pointer
        int leftMax = 0;         // Maximum height to the left of the current index
        int rightMax = 0;        // Maximum height to the right of the current index
        int totalWater = 0;      // Total water trapped

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] heights = {4,2,0,6,3,2,5};
        System.out.println("Total water trapped: " + trap(heights));
    }
}
