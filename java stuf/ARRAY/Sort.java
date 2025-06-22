// import java.util.Arrays;

public class Sort {

    // BUBBLE SORT

    /*element at j place is compared with next element if element at j is greater than it is replaced with element at j+1. 
      this steps are continued till a sorted array is recived 
     */

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {  // Number of passes
            for (int j = 0; j < n - 1 - i; j++) {  // Comparisons in each pass
                if (arr[j] > arr[j + 1]) {  // Swap if the left is greater than the right
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    // SELECTION SORT

    //  in this sorting smallest element is shifted to the begning of of unsorted arrary.
     
    public static void selSort(int arr[]){
        // loop for counting turns.
        for(int i= 0;i<arr.length-1;i++){
            int minpost = i ;
            // loop for comparing min position with array.

            for(int j=i+1;j<arr.length;j++){
                if (arr[minpost] > arr[j]) {
                    minpost=j;
                }
            }
            // swaping num positons .
            int temp =arr[i];
            arr[i]=arr[minpost];
            arr[minpost]=temp;
        }
        
    }

    // INSERTION SORT 

// pick up an element from unsorted part and place it at right position in sorted part.

    public static void inseSort(int arr[]){
        for(int i =1;i<arr.length;i++){
            int curr = arr[i];
            int prev =i-1;

            // finding correst position .
            while (prev >=0 && arr[prev]>curr) {
                arr[prev + 1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }
    }

    // COUNTING SORT 

    public static void countSort(int arr[]){

        // finding the largest number in array
        int largest =Integer.MIN_VALUE;
        for (int i =0 ;i <arr.length ;i++){
            largest = Math.max(largest,arr[ i ]);
        }

        // creatng frequency array to get the count of elements 
        int count [] = new int[largest +1];

        for(int i =0 ;i<arr.length;i++){
            count[ arr[i]]++;
        }

        // loop for sorting 
        int j =0;
        for (int i =0 ; i<count.length ;i++){
            while (count[i] > 0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }




    public static void main(String[] args) {
        int num[] = {5, 4, 1, 3, 2};
        // inbuilt
        // Arrays.sort(num);
        // // bubbleSort(num);
        // // selSort(num);
        // // inseSort(num);
        countSort(num);
        // Print sorted array
        System.out.println("Sorted Array:");
        for (int i = 0;i<num.length;i++) {
            System.out.print(num[i] + " ");
        }
        
    }
}
