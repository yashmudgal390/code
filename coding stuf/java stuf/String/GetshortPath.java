
public class GetshortPath {
    public static float Shortpath(String path){
        int x =0;
        int y= 0;

        for(int i =0 ; i<path.length();i++){
            char dir =path.charAt(i);

            if( dir == 'E'){
                x++;
            }

            else if( dir == 'W'){
                x--;
            }

            else if( dir == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main (String args[]){
        String path ="WNEENESENNN";
        System.out.println(Shortpath(path));

    }
    
}
