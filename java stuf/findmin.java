


// public class findmin 

    
// {
//     public static void findLargestAndSmallest(int number[]) {
//         int largestNum = Integer.MIN_VALUE;
//         int smallestNum = Integer.MAX_VALUE;

//         // Iterate through the array to find the largest and smallest numbers
//         for (int i = 0; i < number.length; i++) {
//             if (number[i] > largestNum) {
//                 largestNum = number[i];
//             }
//             if (number[i] < smallestNum) {
//                 smallestNum = number[i];
//             }
//         }

//         // Print both the largest and smallest numbers
//         System.out.println("Largest number: " + largestNum);
//         System.out.println("Smallest number: " + smallestNum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15};
//         findLargestAndSmallest(numbers);
//     }
// }




public class findmin {
    public static int maxmin(int numbers[]){

        int largeNum= Integer.MIN_VALUE;
        int smallNum= Integer.MAX_VALUE;

        for(int i=0; i <numbers.length;i++){
            if (largeNum <numbers[i]) {
                largeNum= numbers[i];

                
            }
            if (smallNum> numbers[i]) {
                smallNum=numbers[i];
            }
            }
            System.out.println("smallest number is "+smallNum);
            return largeNum;
        }
    public static void main(String args[]){
        int numbers[] ={1,3,4,3,5,2,6,4,34,54,46,56,5};
        // maxmin(numbers);
        System.out.println("largest number is "+maxmin(numbers));

    }
}

