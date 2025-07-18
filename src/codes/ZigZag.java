package codes;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class ZigZag {

    /*
    In this challenge, the task is to debug the existing code to successfully execute all provided test files.
Given an array of n distinct integers, transform the array into a zig zag sequence by permuting the array elements. A sequence will be called a zig zag sequence if the first k elements in the sequence are in increasing order and the last k elements are in decreasing order, where k = (n+1)/2. You need to find the lexicographically smallest zig zag sequence of the given array.
Example.

a = [2, 3, 5, 1, 4]

Now if we permute the array as [1, 2, 5, 4, 3], the result is a zig zag sequence.
Debug the given function findZigZagSequence to return the appropriate zig zag sequence for the given input array.
Note: You can modify at most three lines in the given code. You cannot add or remove lines of code.
To restore the original code, click on the icon to the right of the language selector.
Input Format
The first line contains t the number of test cases. The first line of each test case contains an integer n, denoting the number of array elements. The next line of the test case contains n elements of array a.
Constraints

 (n is always odd)

Output Format
For each test cases, print the elements of the transformed zig zag sequence in a single line.
    */
    
    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
             int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
   }
   
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = ((n + 1)/2)-1;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
        System.out.println(Arrays.toString(a));
    
        int st = mid + 1; 
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];//temp = a[4] = 5;
            a[st] = a[ed];//a[4] = a[5] = 6
            a[ed] = temp;//a[5] = 5; 
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}




