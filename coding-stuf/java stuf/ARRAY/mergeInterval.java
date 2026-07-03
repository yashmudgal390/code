import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class mergeInterval {
    public static int[][] merge(int[][]intervals){
        int n = intervals.length;

        Arrays.sort(intervals , (a ,b )-> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int i = 1; i<n ; i++){
            int []lastele = result.get(result.size()-1);
            
            if(lastele[1]>=intervals[i][0] && lastele[1]<=intervals[i][1]){
                lastele[1]= intervals[i][1];

            }
            else if(lastele[1]<intervals[i][0]){
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        int ans[][] = merge(intervals);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
    
}
