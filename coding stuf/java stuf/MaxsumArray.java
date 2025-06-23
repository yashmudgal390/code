//   //brute force.
// public class MaxsumArray {
//     public static void maxSSarray(int num[]){
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0; i< num.length;i++){
            
            
//             for(int j=i;j<num.length;j++){
//                 int sum=0;
//                 for(int k = i;k<=j;k++){
//                     sum+=num[k];
//                     System.out.print(num[k]+" ");
//                 }
//                 System.out.println("SUM :"+sum);
                
//                 if (maxsum<sum) {
//                     maxsum=sum;
//                 }
                
//             }
//             System.out.println();
//         }
//         System.out.println("Max Sum is :"+maxsum);
//     }
    
//     public static void main(String[] args) {
//         int numeber[]={2,4,6,8,10};
//         maxSSarray(numeber);
//     }
// }


// // // prefix sum
// public class MaxsumArray {

//     public static void maxSum(int num[]){
//       int sum =0;
//       int maxsum=Integer.MIN_VALUE;
//       int prefix[]=new int[num.length];
//       prefix[0]=num[0];
//       for (int i=1;i<prefix.length;i++){
//         prefix[i]=prefix[i-1]+num[i];
//       }
//       for(int i=0;i<num.length;i++){
//         for(int j =1;j<num.length;j++){
//           sum =i==0 ?prefix[j]:prefix[j-1];
//           if (maxsum<sum) {
//             maxsum=sum;
//           }
//         }
//       }
//       System.out.println("Max sum is :"+maxsum);
//     }
//     public static void main(String[] args) {
//          int numeber[]={2,4,6,8,10};
//         maxSum(numeber); 
//       }
//     }

  // // kadane's algorithem

  // public class MaxsumArray {
  
  //   public static void kadanes(int num[]){
  //     int ms=Integer.MIN_VALUE;
  //     int cs =0;
  //     for(int i =0;i<num.length;i++){
  //       cs =cs+ num[i];
  //       if (cs<0) {
  //         cs=0;
  //       }
  //       ms= Math.max(cs, ms);

  //     }
  //     System.out.println("max subarray sum is :"+ms);
  //   }
  //   public static void main(String[] args) {
  //   int num[ ]={-2,-3,4,-1,-2,1,5,-3};
  //   kadanes(num);     
  //   } 
  //  }

               
  public class MaxsumArray 
  
    
  {
    public static int maxSubarraySum(int numbers[]) {
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;
        
        // Check if all elements are negative & find the largest negative number
        for (int num : numbers) {
            if (num >= 0) {
                allNegative = false;
                break; // No need to continue checking
            }
            if (num > maxNegative) {
                maxNegative = num;
            }
        }

        // If all numbers are negative, return the largest negative number
        if (allNegative) {
            return maxNegative;
        }

        // Standard Kadane’s Algorithm
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int num : numbers) {
            currentSum += num;

            if (currentSum < 0) {
                currentSum = 0; // Reset sum if it goes negative
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers1[] = {-5, -1, -3, -8, -2}; // All negatives
        int numbers2[] = {-5, 1, -3, 4, -2, 6}; // Mix of negatives & positives

        System.out.println("Max Subarray Sum (All Negative): " + maxSubarraySum(numbers1));
        System.out.println("Max Subarray Sum (Mixed): " + maxSubarraySum(numbers2));
    }
}
