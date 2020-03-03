package src;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ava {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

        int[] result = {1,2,3,4};
        int upperBound = a.length - 1;

        for(int i = 0; i <= upperBound; i++)
        {
            result[i] = a[upperBound-i];
        }

        return result;

    }

    public static void main(String[] args) throws IOException {

    	int[] arr = { 3 , 2 , 1 , 4};
    	

        int[] res = reverseArray(arr);
        
        for(int i = 0; i < res.length;i++) {
        	System.out.print(res[i]);
        }

    }
}
