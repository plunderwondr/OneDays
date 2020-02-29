package src;
import java.util.Scanner;

public class cin_statements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input integer ");
        int i = scan.nextInt();
        System.out.println("Please input Double ");
        double d = scan.nextDouble();
        String s = scan.nextLine();
        System.out.println("Please input String ");
        s = scan.nextLine();
        // Write your code here.


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}