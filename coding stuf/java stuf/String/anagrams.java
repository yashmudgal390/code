import java.lang.reflect.Array;
import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {

        String str1 ="Erath";
        String str2 = "heart";

        // first we will convert both the strings to lower case so we dont have to campare differently for both upper case and lower case.


        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        if (str1.length() == str2.length()) {


            // convert string into array so that we can sort them and it is easy to campare .

            char[] str1chararray =str1.toCharArray();
            char[] str2chararray =str2.toCharArray();

            // sort

            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);

            Boolean result =Arrays.equals(str1chararray, str2chararray);

            if (result) {
                System.out.println(str1+" and "+str2+" are anagram of each other");
                
            }
            else{
                System.out.println(str1+" and "+str2+" are not anagram of each other" );
            }
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagram of each other" );
        }
    }
    
}
