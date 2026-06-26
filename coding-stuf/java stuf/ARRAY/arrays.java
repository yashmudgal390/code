
// import java.util.*;

// public class arrays 

    
// {
//     public static void main(String[] args) {
//         int marks[] = new int[50]; // Array declaration with size 50
//         Scanner sc = new Scanner(System.in);

//         // Input values for the first two indices of the array
//         System.out.print("Enter marks for Physics: ");
//         marks[0] = sc.nextInt();
        
//         System.out.print("Enter marks for Chemistry: ");
//         marks[1] = sc.nextInt();

//         // Output the entered marks
//         System.out.println("Physics marks: " + marks[0]);
//         System.out.println("Chemistry marks: " + marks[1]);
//         System.out.println("Percentage: " + ((marks[0] + marks[1]) / 2) + "%");
//         sc.close(); // Close the scanner
//     }
// }

public class arrays{
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++){
            if (largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main (String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Largest number in the array is : "+largestNum(arr));
    }
}