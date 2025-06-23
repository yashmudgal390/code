
public class practice {
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
        System.out.println(maxmin(numbers));

    }
}
