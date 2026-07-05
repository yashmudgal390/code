public class removeDuplicate {
    public static int removeDupli(int arr[]){
        int n = arr.length;
        if(n<0){
            return n;
        }
        int key = 1;
        for(int i =1; i<n; i ++){
            if(arr[i]!= arr[i-1]){
                arr[key]= arr[i];
                key++;
            }
        }
        return key;
    }
 public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,4,5,5};
        int n = removeDupli(arr);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
