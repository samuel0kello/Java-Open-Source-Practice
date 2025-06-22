public class ArraySearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {                    // more effecient
        // Check for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;    // Number of rows
        int n = matrix[0].length; // Number of columns
        
        // Start from the top-right corner
        int row = 0;
        int col = n - 1;
        
        // Iterate while the indices are within bounds
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Target found
            } else if (matrix[row][col] > target) {
                col--; // Move left if the current element is larger than target
            } else {
                row++; // Move down if the current element is smaller than target
            }
        }
        
        return false; // Target not found
    }

    public static void main(String[] args) {
        ArraySearchMatrix solution = new ArraySearchMatrix();
        
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        
        int target = 5;
        System.out.println(solution.searchMatrix(matrix, target)); // Output: true
        
        target = 20;
        System.out.println(solution.searchMatrix(matrix, target)); // Output: false
    }
}
