public class trapedrainwater {
    public static int trapwater(int height[]){
        int n = height.length;
        int trapedwater =0;
        // left maxboundry 
        int leftmax[]= new int [n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        // rightmax boundary

        int rightmax[]=new int [n];
        rightmax[n-1]=height[n-1];
        for(int i = n-2; i>=0 ; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        // loop

        for (int i =0 ;i<n;i++){
            // water level 
            int waterlevel=Math.min(leftmax[i], rightmax[i]);

            //  traped water 

            trapedwater += waterlevel-height[i];
        }
        return trapedwater;
    }

    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        System.out.println(" Traped  rain  water  between  bars  is  :  "+trapwater(num));
    }
    
}
