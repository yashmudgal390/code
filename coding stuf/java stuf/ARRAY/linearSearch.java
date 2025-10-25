

    

public static int ls(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if (numbers[i]==key) {
            return i;
        }}
       
            return -1;
    }
public static void main (String args[]){
    int numbers[]={2,4,5,6,7,10,11,12,15};
    Scanner sc = new Scanner(System.in);

    int key =sc.nextInt();
    int index=ls(numbers, key);
    if (index==-1) {
        System.out.println("Not Found ");
    }
    else{
        System.out.println(index);
    }
    sc.close();
}

