import java.util.*;
public class decTobin {

    public static void decTobin(int n){
        int dec =n;
        int pow =0;
        int bin=0;
        while (n>0) {
            int rem =n%2;
            bin =bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
                    
        }
        System.out.println("binary form of "+dec+"="+bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number to be converted in decimal:");
        int n = sc.nextInt();
        decTobin(n);
        sc.close();
    }
}