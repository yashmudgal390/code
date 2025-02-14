
public class reverseArray {

    public static void revArray(int numbers[]){

        int first =0, end = numbers.length-1;
        while (first<end) {

            // swaping method for reversing the array.
            int temp = numbers[end];
            numbers[end]=numbers[first];
            numbers[first]=temp;

            first ++;
            end--;
        }

    }
    public static void main(String[] args) {
        
        int numbers[]= {1,2,3,4,5,6,7,8,9,10};

        // printing orignal array
        for(int i =0;i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        
        // calling function
        revArray(numbers);

        // printing reversed array
        for(int i =0;i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
        }

    }
}
