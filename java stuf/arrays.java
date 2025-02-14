
import java.util.*;

public class arrays 

    
{
    public static void main(String[] args) {
        int marks[] = new int[50]; // Array declaration with size 50
        Scanner sc = new Scanner(System.in);

        // Input values for the first two indices of the array
        System.out.print("Enter marks for Physics: ");
        marks[0] = sc.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        marks[1] = sc.nextInt();

        // Output the entered marks
        System.out.println("Physics marks: " + marks[0]);
        System.out.println("Chemistry marks: " + marks[1]);

        sc.close(); // Close the scanner
    }
}
