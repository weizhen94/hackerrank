package codes; 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.
     * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10^-4 are acceptable.
Example

arr = [1, 1, 0, -1, -1]

There are 5 elements, two positive, two negative and one zero. Their ratios are 2/5 , 2/5 and 1/5 . Results are printed as:
0.400000
0.400000
0.200000
Function Description
Complete the plusMinus function in the editor below.
plusMinus has the following parameter(s):
int arr[n]: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.
Input Format
The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe .
Constraints


Output Format
Print the following  lines, each to  decimals:
proportion of positive values
proportion of negative values
proportion of zeros
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here

    System.out.println("This is the list: " + arr);
    
    double positive = 0; 
    double negative = 0; 
    double zero = 0; 
    
    int number = arr.size(); 
    
    for(int i = 0; i < number; i++){
        //System.out.println(arr.get(i));
        if(arr.get(i) > 0){
            positive++; 
        } else if(arr.get(i) < 0){
            negative++; 
        } else {
            zero++; 
        }
    }
    
    String decimalPositiveRatio = String.format("%.6f" , positive / number); 
    String decimalNegativeRatio = String.format("%.6f" , negative / number); 
    String decimalZeroRatio = String.format("%.6f" , zero / number); 
    
    System.out.println(decimalPositiveRatio);
    System.out.println(decimalNegativeRatio);
    System.out.println(decimalZeroRatio);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        //very nice way to convert string to String[] to List of Integer, wonder if I can do other conversions with it
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}