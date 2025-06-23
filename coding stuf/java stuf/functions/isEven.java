import java.util.*;

public class isEven {
    public static boolean isEven(int n){
        boolean isEven =true;
        if (n%2==0) {//checking condition 
            return true;}//returns true whwn com=ndition is true .
            else{
            return false;}//when false.
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        if (isEven(n)) {//is function retrns truse in that condition loops runs.
            System.out.println("the number is even.");            
        }
        else{//if not then print .
            System.out.println("the number is odd.");
        }
        sc.close();
    }
}
