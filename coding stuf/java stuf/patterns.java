
import java.util.Scanner;

public class patterns {

    // public static void numberpyra() {
    //     int num=1;
    //     for(int i = 1; i<=4;i++){
    //         for (int j=1;j<=i;j++){
    //             System.out.print(num);
    //             num++;
    //         }
    //         System.out.println();
    //     }
        
        //For hollow rectangal
   
        // public static void hollowrecta(){ 
    //     for (int i=1;i<=4;i++ ){
    //         for(int j=1;j<=5;j++){
    //             if (i==1||i==4||j==1||j==5) {
    //                 System.out.print(" * ");
                    
    //             }
    //             else {
    //                 System.out.print("   ");
    //             }
    //         }
    //         System.out.println();
    //     }}
    
        //rotated half pyramid.
    // public static void rotaHalfPyra(){
        // for (int i=1;i<=4;i++){
        //     for (int j=1;j<=4-i;j++){
        //         System.out.print("   ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }}
    
            // inverted half pyramid with numbers .
    // public static void invHalfPyraNum(){
    //     for (int i =1;i<=5 ;i++){
    //         for (int j=1;j<=5-i+1;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }    }  

        //Floyrd's trangle.

    // public static void floydTran(int n){
    //     int num=1;
    //     for(int i=1;i<=n;i++){
    //         for (int j=1;j<=i;j++){
    //             System.out.print(num+" ");
    //             num++;
    //             }
    //             System.out.println();
    //     }
    // }

        // 0-1 triangle
    // public static void zotri(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1");
    //             }
    //             else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //         rigt angle rigt top.
    // public static void rart(int n){
    //     for(int i =1;i<=n;i++){
    //         for(int j =1;j<i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k =i ;k<=n;k++){
    //             System.out.print("*");
    //             }
    //             System.out.println();
    //     }
    // }


              //Butterfly pattern . 


//     public static void buttfly(int n ){
//        //loop for upper half .
//         for(int i=1;i<=n;i++){
//                 //for star before space.
//             for(int s=1;s<=i;s++){
//                 System.out.print(" * ");
//             }
//                 //loop for space in between.
//             for(int sp = 1; sp<=2*(n-i);sp++){
//                 System.out.print("   ");
//             }
//                 //loop for stars after space.
//             for(int s =1;s<=i;s++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//         //loop for lower half .
//             //condition for mirror image of the upper one .            
//         for(int i=n;i>=1;i--){
//             //for star before space.
//         for(int s=1;s<=i;s++){
//             System.out.print(" * ");
//         }
//             //loop for space in between.
//         for(int sp = 1; sp<=2*(n-i);sp++){
//             System.out.print("   ");
//         }
//             //loop for stars after space.
//         for(int s =1;s<=i;s++){
//             System.out.print(" * ");
//         }
//         System.out.println();
//     }
// }  
            
    //         // solide rhombus
    // public static void rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j =1; j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
        
    //     // hollow rhombus.
    // public static void holRho(int n){
    //     for(int i =1;i<=n ;i++){
    //         for(int j =1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j =1;j<=n;j++){
    //             if (i==1||i==n||j==1||j==n) {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
                
    //         }
    //         System.out.println();

    //     }
    // }

    //         //diamond pattern.
    // public static void diamond(int n){
    //     // for upper half
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         // for odd number of stars is printed.
    //         for(int j=1;j<=(2*i)-1;j++){
    //             System.out.print("*");
    //         }
    //        System.out.println();
    //     }
    //     // formirror image.
    //     for(int i=n;i>=1;i--){
                
        
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=(2*i)-1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     }
    // }

    // // palindrome triangle
    // public static void paliTri(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int sp =1;sp<=n-i;sp++){
    //             System.out.print("   ");
    //         }
    //         for(int j =i;j>=1;j--){
    //             System.out.print(" "+j+" ");
    //         }
    //         for(int j=2;j<=i;j++){
    //             System.out.print(" "+j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

        // reversed number triangle.
    
    // public static void revnumtri(int n){
    //     for (int i =1;i<=n;i++){
    //         for (int j =1;j<=i-1;j++){
    //             System.out.print(" ");
    //         }
    //         for (int j =i;j<=n;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

            // mirror image of upper one.

    // public static void mirrrevnum(int n){
    //     for (int i =1 ;i<= n;i++){
            
    //          for (int j =1;j<=i-1;j++){
    //             System.out.print(" ");
    //             }
    //          for (int j =i;j<=n;j++){
    //             System.out.print(j+" ");
    //             }
    //           System.out.println();
                    
    //             }
    //          for (int i =n;i>=1;i--){
    //            for (int j =1;j<=i-1;j++){
    //              System.out.print(" ");
    //              }
    //             for (int j =i;j<=n;j++){
    //              System.out.print(j+" ");
    //              }
    //              System.out.println();
    //          }                 
    //     }
    
        // hollow triangle.

    // public static void holtri(int n){
        // for(int i=1;i<=n;i++){
        //     for(int j =1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=1;j<=(2*i-1);j++){
        //         if (j==1||i==n||j==(2*i-1)) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    // }

    // reverse hollow triangle

    // public static void revholtri(int n ){
    //     for(int i=n;i>=1;i--){
    //         for(int j =1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for (int j=1;j<=(2*i-1);j++){
    //             if (j==1||i==n||j==(2*i-1)) {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();

    //     }
    //     for(int i=1;i<=n;i++){
    //         for(int j =1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for (int j=1;j<=(2*i-1);j++){
    //             if (j==1||i==n||j==(2*i-1)) {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }    
    // }

    //         // ho;;ow diamond
    // public static void holdia(int n ){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k=1;k<=(2*i-1);k++){
    //             if (k==1||k==(2*i-1)) {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    //     for(int i=n-1;i>=1;i--){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k=1;k<=(2*i-1);k++){
    //             if (k==1||k==(2*i-1)) {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }   
    //         System.out.println();         
    //     }
    // }
// Java Program to implement
        // Pascal's Triangle

    // // Pascal function
    public static void printPascal(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {

                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
    
        int n = sc.nextInt();
        printPascal(n);
        sc.close();
    }
}