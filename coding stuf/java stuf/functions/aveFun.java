package functions;
import java.util.*;

public class aveFun {
    public static void aveg(int a, int b, int c ){
        float ave = (a+b+c)/3;
        System.out.println("the average of three number  "+a+" , "+b+" , "+c+" is "+ave+" .");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your number:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c =sc.nextInt();
        aveg(a, b, c);
    }
}
