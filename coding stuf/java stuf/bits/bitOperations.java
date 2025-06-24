public class bitOperations {
    public static void EvenorOdd(int n ){
        int bitmask = 1;
        if ((n&bitmask) == 0 ) {
            System.out.println("it is an even number ");            
        }
        else {
            System.out.println("its an odd number");
        }
    }



    public static int Getbit(int n , int i){//to check whether its 0 or 1 at ith place .
        int bitmask = 1<< i;
        if ((n&bitmask) == 0) {
            return 0 ;
        }
        else{
            return 1 ;
        }
    }

    public static int setBit(int n ,int i ){// it convert number at ith position to 1 .
        int bitmask = 1<<i;
        return(n|bitmask);

    }

    public static int clearBit(int n ,int i ){
        int bitmarks = ~(1<<i);// it convert any number to 0 at ith position .
        return n&bitmarks;
    }

    public static int updatetheBit(int n , int i , int newbit){
        
        // if(newbit == 0){
        //     return clearBit(n, i);
        // }
        // else{
        //     return setBit(n, i);
        // }
        n =clearBit(n, i);
        int bitmask = newbit<<i;
        return n| bitmask;
    }

    public static int ClearlastIbits(int n , int i ){
        int bitmask = (-1)<< i;
        return n&bitmask;
    }
    public static int ClearbitInrange(int n ,int j,int i){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }
    
    public static boolean Powerof2(int n ){
        return (n & (n-1)) == 0 ;
    }

    public static int countsetbits(int n ){
        int count = 0;
        while (n>0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
public static int fastexpo(int a , int n ){
    int ans = 1; 
    while (n>0) {
        if ((n&1) != 0) {
            ans = ans * a;

        }
        a= a*a;
        n= n>> 1;
    }
    return ans;
}

public static void swapnum(int a ,int b ){
    System.out.println("number before swap  a ="+a+" , b="+b );
    a = a^b;
    b = b^a;
    a = a^b;
    System.out.println("number after swap  a ="+a+" , b="+b);
}

public static int incrInt(int n){
    return (-(~n));
}


    public static void main(String[] args) {
        int n=5;
        int a = 5;
        int b = 10;
        int j = 4;
        int i =2;
        int newbit = 1 ;
        for (char ch = 'A'; ch <='Z';ch++){
            System.out.print((char)(ch | ' ')+" ");
        }
        // System.out.println(Getbit(n, i));
        // System.out.println(setBit(n, i));
        // System.out.println(clearBit (n, i));
        // System.out.print(updatetheBit(n, i, newbit ));
        // System.out.print(ClearlastIbits(n,i));
        // System.out.print(ClearbitInrange(n, j, i));
        // System.out.print(Powerof2(n));
        // System.out.print(countsetbits(n));
        // System.out.print(fastexpo(a,a));
        // swapnum(a, b);
        // System.out.println(incrInt(n));
                // EvenorOdd(3);

    }
}
