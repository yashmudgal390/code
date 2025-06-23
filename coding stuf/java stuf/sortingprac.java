public class sortingprac {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Corrected swap operation
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selection(int arr[]){
        for(int i =0 ;i<arr.length -1;i++){
            int minpost =i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minpost]>arr[j]) {
                    minpost=j;
                }

            }
            int temp= arr[minpost];
            arr[minpost]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertion (int arr[]){
        
        for(int i =1;i<arr.length;i++){
        int curr =arr[i];
        int prev =i-1;
        
            while (prev >=0  &&  arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev --;
            
        }
        arr[prev +1]=curr;
        }
    }


    public static void coll(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i< arr.length;i++){
            largest =Math.max(largest,arr[ i]);
        }
        int count []= new int[largest+1];
        for(int i =0 ;i < arr.length;i++){
            count[arr[i]]++;
        }

        int j =0;
        for(int i =0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]) {
        int num[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};  // Input array
        // bubble(num);  // Sorting function call
        // selection(num);
        // insertion(num);
        coll(num);
        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
