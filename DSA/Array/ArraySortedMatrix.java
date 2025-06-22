public class ArraySortedMatrix {
    public static boolean starircaseSearch(int matrix[] [], int key) {
        int row = 0, col = matrix[0].length-1;

        while( row < matrix.length && col >= 0) {
            if(matrix[row] [col] == key) {
                System.out.println("found key at ( " + row + "," + col+ ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main (String args[]) {
        int matrix[] [] = {{ 10, 20, 30, 40},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 33, 16}};
                            int key = 33;
       starircaseSearch(matrix, key);
    }
}
