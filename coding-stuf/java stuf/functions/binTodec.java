
 import java.util.*;

import javax.print.event.PrintEvent;
public class binTodec {
    public static void bintodec(int n){
        int pow=0;
        int binnum=n;
        int dec=0;
        while(n>0){
            int ld =n%10;//geting last digit of number.
            dec =dec +(ld*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("decimal number of "+binnum+"="+dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter binary nuber:");
        int n = sc.nextInt();
        bintodec(n);
        sc.close();
    }
    
}
