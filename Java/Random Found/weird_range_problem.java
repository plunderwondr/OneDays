import java.util.*;
import java.io.*;

class weird_range_problem{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
//        int numberOfQueries=in.nextInt();
        int numberOfQueries= 1;
        int a = 5;
        int b = 3 ;
        int n = 5;
        int sum = 0;
        List<Integer> tempArray = new ArrayList<Integer>();
        for(int i=0;i<numberOfQueries;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();

            sum = 0;
            int addToArray;
            for( int j = 0; j < n ; j++ )
            {
                sum  = a;
                addToArray = (int) (b*Math.pow(2,(j) ));
                tempArray.add(addToArray);
                for( int k =  0; k < tempArray.size(); k++)
                {
                	sum+=tempArray.get(k);
                }
                System.out.print(sum + " ");
            } // for j 
            System.out.print("\n");
        } // for i 



        in.close();
    }
}