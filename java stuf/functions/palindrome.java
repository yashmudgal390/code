import java.util.*;

public class palindrome {
    public static void pail(int n){
        int mynum=n;
        
        int rev = 0;
        while (n>0) {
             int ld=n%10;//to get last digit of num.
             rev =(rev*10) + ld;
             n =n/10;            
        }    
        if (mynum==rev) {//if both num are same then
            System.out.println(mynum+" is a palindrome number.");
            
        }
        else{
            System.out.println("it is not a palindrome number.");
        }
    } 
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        pail(n);//calling function to check .
        sc.close();
    }  

}
