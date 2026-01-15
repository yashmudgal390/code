import java.util.*;
public class prEvenInRang 

    
{

    public static boolean isprime(int n){
       boolean isprime =true;
        if(n==2){
            return true;
        }
        for(int i =2;i<=Math.sqrt(n );i++){
            if(n%i==0){// checking codition if satisfy then not prime.
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){//loop for cheking that every no. of range is prime or not 
            if(isprime( i)){//calling the funtion ton check that is prime or not .
                System.out.print(i+" , ");//i isprime is true then it will print the number in range.
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = sc.nextInt();
        primeinrange(n);
    }
}

