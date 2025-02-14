public class java {

    public static void main(String args[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int a =1;a<=i;a++){
//                 System.out.print(" * ");
//             }
//             for(int b =1;b<=2*(n-i);b++){
//                 System.out.print("   ");
//             }
//             for(int a =1;a<=i;a++){
//                 System.out.print(" * ");
//         }
//         System.out.println();
//     }
//         for(int i=n;i>=1;i--){
//             for(int a =1;a<=i;a++){
//                 System.out.print(" * ");
//         }
//             for(int b =1;b<=2*(n-i);b++){
//                 System.out.print("   ");
//         }
//             for(int a =1;a<=i;a++){
//                 System.out.print(" * ");
//         }   
//         System.out.println();
//     }
// }}
// int n= 5;

// for(int i=1; i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int s=1;s<=n;s++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=(2*i)-1;j++){
//         System.out.print("*");
//     }
//    System.out.println();
// }
// for(int i=n;i>=1;i--){
        

// for(int j=1;j<=n-i;j++){
//     System.out.print(" ");
// }
// for(int j=1;j<=(2*i)-1;j++){
//     System.out.print("*");
// }
// System.out.println();
// }
for(int i= 1;i<=n;i++)
{
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=i;j>=1;j--){
        System.out.print(j);
    }
    for(int j=2;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}





    }}