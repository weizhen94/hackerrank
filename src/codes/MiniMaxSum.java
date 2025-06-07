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

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    Example
    arr = [1, 3, 5, 7, 9]
    The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9=24. The function prints
    16 24
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    arr.sort(null);
    System.out.println(arr);
    
    long min = (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3); 
    long max = (long) arr.get(4) + arr.get(1) + arr.get(2) + arr.get(3); 
    
    System.out.println(min + " " + max); 
    
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        List<Integer> arr = new LinkedList<>();
        arr.add(256741038); 
        arr.add(623958417); 
        arr.add(467905213); 
        arr.add(714532089); 
        arr.add(938071625); 

        Result2.miniMaxSum(arr);

        //bufferedReader.close();
    }
}

