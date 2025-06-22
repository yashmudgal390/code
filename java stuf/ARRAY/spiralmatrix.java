// // import java.util.*;
// // public class spiralmatrix {

    

// // public static void spiralmatrix(int matrix[][]){
// //     int startrow = 0 ;
// //     int startcol = 0 ;
// //     int endrow = matrix.length-1;
// //     int endcol = matrix[0].length-1;

// //     while(startrow<=endrow && startcol<= endcol){

// //         // top
// //         for(int j = startcol ; j<=endcol;j++){
// //             System.out.print(matrix[startrow][j]);
// //         }

// //         //right
// //         for(int i = startrow + 1;i<=endrow;i++){
// //             System.out.print(matrix[i][endcol]);
// //         }

// //         // bottom
// //         for(int j =endcol-1;j>=startcol;j--){
// //             if(startcol==endcol){
// //                 break;
// //             }
// //             System.out.print(matrix[endrow][j]);
// //         }

// //         // left

// //         for(int i = endrow-1 ; i>=startrow+1;i--){
// //             if(startrow==endrow){
// //                 break;

// //             }
// //             System.out.print(matrix[i][startcol]);
// //         }
// //         startcol++;
// //         startrow++;
// //         endcol--;
// //         endrow--;
// //     }
// //     System.out.println();
// // }
// // public static void main(String[] args) {
    

// //  Scanner sc =new Scanner(System.in);
// //  System.out.print("enter number of rows :");
// //  int n = sc.nextInt();
// //  System.out.print("enter the number of coloumb :");
// //  int m = sc.nextInt();

// // //  int matrix[][]=  {{1,2,3},
// // //                    {4,5,6},
// // //                    {7,8,9}};
// // int matrix[][]=new int [n][m];
// //  System.out.print("enter the elements of matrix :");
// //  for(int i = 0; i<n;i++ ){
// //     for(int j=0;j<m;j++){
// //         matrix[i][j]= sc.nextInt();
// //     }
// //  } 
// //  spiralmatrix(matrix);
// //  sc.close();
// // }


// // }






// // import java.util.*;

// // public class spiralmatrix {
// //     public static void spiralmatrix(int matrix[][]) {
// //         int startrow = 0;
// //         int startcol = 0;
// //         int endrow = matrix.length - 1;
// //         int endcol = matrix[0].length - 1;

// //         while (startrow <= endrow && startcol <= endcol) {
// //             // **Top Row**
// //             for (int j = startcol; j <= endcol; j++) {
// //                 System.out.print(matrix[startrow][j] + " ");
// //             }

// //             // **Right Column**
// //             for (int i = startrow + 1; i <= endrow; i++) {
// //                 System.out.print(matrix[i][endcol] + " ");
// //             }

// //             // **Bottom Row (Prevent Duplicate Traversal)**
// //             if (startrow < endrow) {
// //                 for (int j = endcol - 1; j >= startcol; j--) {
// //                     System.out.print(matrix[endrow][j] + " ");
// //                 }
// //             }

// //             // **Left Column (Prevent Duplicate Traversal)**
// //             if (startcol < endcol) {
// //                 for (int i = endrow - 1; i > startrow; i--) {
// //                     System.out.print(matrix[i][startcol] + " ");
// //                 }
// //             }

// //             // Move to inner square
// //             startcol++;
// //             startrow++;
// //             endcol--;
// //             endrow--;
// //         }
// //         System.out.println(); // Move to the next line after output
// //     }

// //     public static void main(String[] args) {
// //         int matrix[][] = {
// //             {1, 2, 3},
// //             {4, 5, 6},
// //             {7, 8, 9}
// //         };

// //         System.out.println("Spiral Order of the Matrix:");
// //         spiralmatrix(matrix);
// //     }
// // }
//  import java.util.*;
//  public class spiralmatrix {
 
//     public static void spiralmat(int matrix[][]){
//         int strow = 0;
//         int stcol = 0;
//         int endrow =matrix.length-1;
//         int endcol = matrix[0].length-1;

//         while (strow<=endrow && stcol<=endcol) {
            
//             //top 
//             for(int j = stcol;j<=endcol;j++){
//                 System.out.print(matrix[strow][j]);
//             }

//             //right
//             for(int i =strow+1 ; i<=endrow;i++){
//                 System.out.print(matrix[i][endcol]);
//             }

//             //bottom
//             for(int j=endcol-1; j>=stcol; j--){
//                 if(stcol == endcol){
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j]);
//             }

//             //left
//             for(int i =endrow-1;i>=strow+1;i--){
//                 if(strow==endrow){
//                     break;
//                 }
//                 System.out.print(matrix[i][stcol]);

//             }
//             stcol++;
//             strow++;
//             endcol--;
//             endrow--;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter rows");
//         int n = sc.nextInt();
//         System.out.println("enter coloumb");
//         int m = sc.nextInt();
//         int matrix[][]=new int[n][m];
//         for(int i =0 ;i<n ;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         spiralmat(matrix);
//         sc.close();
//     }
//  }




import java.util.*;
public class spiralmatrix{
    public static void spiralmat(int mat[][]){
        int strow=0;
        int stcol=0;
        int endrow=mat.length-1;
        int endcol=mat[0].length-1;
        while(strow<=endrow && stcol<=endcol){
            // for top 
            for(int j=stcol;j<=endcol;j++){
                System.out.print(mat[strow][j]);
            }
            //for right

            for(int i =strow+1;i<=endrow;i++){
                System.out.print(mat[i][endcol]);
            }
            //buttom
            for(int j = endcol-1;j>=stcol;j--){
                System.out.print(mat[endrow][j]);
            }
            //left
            for(int i=endrow-1;i>=strow+1;i--){
                System.out.print(mat[i][stcol]);
            }
            stcol++;
            strow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int n = sc.nextInt();
        System.out.println("enter coloumb");
        int m = sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i =0 ;i<n ;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        spiralmat(matrix);
        sc.close();
    }
}
