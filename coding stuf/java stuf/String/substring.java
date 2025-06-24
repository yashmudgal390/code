
public class substring {
    public static String Substr(String str ,int si , int ei){
        String subStr ="";
        for(int i = si ; i< ei ; i++){
            subStr += str.charAt(i);

        }
        return subStr;
    }
    public static void main (String args []){
        String str = "HelloWorld";
        System.out.println(Substr(str, 0, 5));
        System.out.println(str.substring(0,5));//inbulid function for substring .
    }
}
