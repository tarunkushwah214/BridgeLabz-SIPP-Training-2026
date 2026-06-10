import java.util.HashSet;
import java.util.Arrays;

public class WarehouseStock {

    // Max and Min
    public static void maxmin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    // Total Stock
    public static void totalStock(int arr[]) {
        int totalStock = 0;

        for (int i = 0; i < arr.length; i++) {
            totalStock += arr[i];
        }

        System.out.println("Total Stock: " + totalStock);
    }

    // Detect Duplicates
    public static void findDuplicates(int arr[]) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate Elements: " + duplicates);
    }

    // Rotate Array by k positions (Right Rotation)
    public static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, n);

        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(arr));
    }

    // Transpose of 2D Shelf Grid
    public static void transpose(int grid[][]) {
        int rows = grid.length;
        int cols = grid[0].length;

        int trans[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = grid[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int arr[] = {54, 98, 67, 55, 23, 67, 54};

        maxmin(arr);
        totalStock(arr);
        findDuplicates(arr);

        rotateArray(arr, 2);

        int shelf[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transpose(shelf);
    }
}