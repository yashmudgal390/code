import java.util.Scanner;

public class twoDtooneDsearch {

    // Binary Search on 2D Matrix using 1D logic
    public static boolean search(int arr[][], int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        int si = 0;
        int ei = rows * cols - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            int row = mid / cols;
            int col = mid % cols;

            int midVal = arr[row][col];

            if (midVal == target) {
                System.out.println("✅ Target found at: [" + row + "][" + col + "]");
                return true;
            } else if (midVal > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        System.out.println("❌ Target not found.");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements (row-wise, sorted format):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input target
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        // Call the search method
        search(matrix, target);

        sc.close();
    }
}
