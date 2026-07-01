
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Threesum {
    public static  List<List<Integer>> threeSum(int[] arr) {

List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(arr);
    int n = arr.length;

    for(int i =0 ; i<n; i++){
        if(arr[i] > 0) break; // since array is sorted, no three numbers can sum to zero if the first number is greater than zero
        if(i > 0 && arr[i] == arr[i-1]) continue; // skip duplicates for the first number

        int left = i + 1;
        int right = n - 1;

        while(left<right){
            int sum = arr[i] + arr[left] + arr[right];
            if(sum == 0){
                ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                while(left<right && arr[left] == arr[left+1]) left++; // skip duplicates for the second number
                while(left<right && arr[right] == arr[right-1]) right--; // skip duplicates for the third number
                left++;
                right--;
            } else if(sum < 0){
                left++;
            } else {
                right--;
            }
    }
    

}
return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
}

