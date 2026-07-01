public class findMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int count[]=new int[(n*n)+1];
        for(int[] row:grid){
            for(int num : row){
                count[num]++;
            }
        }
        int missing = -1, repeated = -1;
        for(int i=1; i<=(n*n); i++){
            if(count[i]==0) missing = i;
            else if(count[i]==2) repeated = i;
        }
        return new int[]{repeated, missing};
    }
}
