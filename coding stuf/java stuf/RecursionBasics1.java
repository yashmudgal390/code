public class RecursionBasics1 {

    //print decreasing number .
    public static void printDec(int n ){
        if (n==1){//                     base class
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");//       print firstt 
        printDec(n-1);//                 recursion call after printing 
    }



    //print increasing number.
    public static void printIncr(int n ){
        if(n==1){//                      base class 
            System.out.print(n+" ");
            return ;
            }
            printIncr(n-1);//           recursion call first 
            System.out.print(n+" ");//  print after recursion
        } 



        //factorial 
        public static int fact(int n ){
            if(n==0){//                 base class
                return 1;
            }
            int fnm1 = fact(n-1);//     recursion calling 
            int fn = n*fnm1;//          multiplication after recursion 
            return fn ;
        }



        //calculated sum 
        public static int calsum(int n ){
            if (n==1) {//               base class
                return 1;
            }
            int snm1 = calsum(n-1);//   recursion calling
            int sn = n + snm1;//        added after recursion
            return sn ;
        }


        // fibonacchi series 
        public static int fibo(int n){
            if (n==0 || n==1) {
                return n ;
            }
            int fnm1 = fibo(n-1);
            int fnm2 = fibo(n-2);
            int fn = fnm1 + fnm2;
            return fn ;

        }

        //sorted array.
        public static boolean sortarr(int arr[],int i){
            if (i==arr.length-1) {
                return true;
            }
            if (arr[i]>arr[i+1]) {
                return false;
            }
            return sortarr(arr, i+1);
        }

        //first occurance
        public static int firstocc(int arr[],int key,int i){
            if (i==arr.length) {
                return -1;
            }
            if (arr[i]== key) {
                return i;
            }
            return firstocc(arr, key, i+1);
        }

        //last occurance
        public static int lastocc(int arr[],int key,int i){
            if (i==arr.length) {
                return -1;
            }
            int isfound = lastocc(arr, key, i+1);
            if (isfound == -1 && arr[i]==key) {
                return i;
            }
            return isfound;          
        }        


    public static void main (String args[]){
        int n = 5 ;
        //printDec(n);
        //printIncr(n);
        //System.out.print(calsum(n));
        // System.out.println(fact(n));
        //System.out.println(fibo(n));
        int arr[] ={1,2,3,4,5,1};
        //System.out.print(sortarr(arr, 0));

        System.out.print(lastocc(arr, n, 0));
    }
}
