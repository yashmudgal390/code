import java.util.*;

public class twodArray {
    public static void maxmin(int matrix[][]){
        int n =matrix.length;
        int m = matrix [0].length;
        int maxnum = Integer.MIN_VALUE;
        int minnum = Integer.MAX_VALUE;
        for(int i = 0 ; i< n ;i++){
            for(int j =0 ; j<m;j++){
                if (matrix[i][j]>maxnum){
                    maxnum=matrix[i][j];

                }
                if ( matrix[i][j]<minnum){
                    minnum=matrix[i][j];
                }
            }
        }
            System.out.println("Maximum value of matrix is :"+maxnum);
            System.out.println("Minmum value of matrix is :"+minnum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions of the matrix
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // Number of rows
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt(); // Number of columns

        int matrix[][] = new int[n][m]; // Declare matrix

        // Input elements of the matrix
        System.out.print("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The entered matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        maxmin(matrix);

        sc.close(); // Close scanner to avoid memory leaks
    }
}
