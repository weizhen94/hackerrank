package codes;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class ZigZagOwn {

    public static void main (String[] args) throws java.lang.Exception {

            int n = 13; 
            int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

            findZigZagSequence(a, n);
        
    }
   
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);

        int midIndex = (n-1)/2; //3
        int mid = a[midIndex]; 

        a[midIndex] = a[n-1]; 
        a[n-1] = mid; 

        int[] b = new int[n-(midIndex+1)]; 

        int i = 0; 
        int j = midIndex+1; 
        while(j < n){
            b[i] = a[j]; 
            i++; 
            j++; 
        }
        
        Arrays.sort(b);

        i = 0; 
        j = n-1;
        while(i < b.length){
            a[j] = b[i];
            j--; 
            i++; 
        }

        System.out.println(Arrays.toString(a));

    }
}





