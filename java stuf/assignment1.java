import java.util.Scanner;

public class assignment1 {


    // QUESTION ONE 
    public static boolean findrep (int num[]){
        for(int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                if (num[i]==num[j]) {
                    return false;

                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr []=new int [6];
        System.out.println("Enter the elements of array;");
        for(int i =0;i<6;i++){
            arr[i]= sc.nextInt();
            

        }
        sc.close();
        //System.out.println(findrep(arr));
        if (findrep(arr)) {
            System.out.println("array have no repeated elements");
        }
        else{
            System.out.println("have repeated elements ");
        }
    }
    
}
