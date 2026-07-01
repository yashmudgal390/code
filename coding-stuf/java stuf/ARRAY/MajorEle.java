public class MajorEle {
    // Returns the majority element (> n/2 occurrences) or -1 if none.
    // public static int majorEle(int nums[]) {
    //      int n = nums.length;
    //     for (int i = 0 ; i<n;i++){
    //         int count = 0;
    //         for (int j =i;j<n;j++){
    //             if (nums[j]== nums[i]){
    //                 count++;
    //             } 
    //         }
    //         if (count>n/2){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }




    
    //voting algorithm for finding majority element
    public static int majorEle(int nums[]) {  
       int candidate = nums[0];
        int count = 0;
        
        for (int num : nums) {
            // If count falls to 0, we pick a new candidate
            if (count == 0) {
                candidate = num;
            }
            
            // If the current number matches the candidate, increment; 
            // otherwise, decrement
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
    public static void main(String args[]) {
        int arr[] = {1,1,1,1,1,1,1,6, 7, 8, 9};
        System.out.println("Majority element is : " + majorEle(arr));
    }
}
