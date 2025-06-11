package codes;

import java.io.*;
import java.util.*;

class Result4 {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     * 
     * Given an array of integers, where all elements but one occur twice, find the unique element.
Example

a = [1, 2, 3, 4, 3, 2, 1]

The unique element is 4.
Function Description
Complete the lonelyinteger function in the editor below.
lonelyinteger has the following parameter(s):
int a[n]: an array of integers
Returns
int: the element that occurs only once
Input Format
The first line contains a single integer,n, the number of integers in the array.
The second line contains n space-separated integers that describe the values in a.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    //System.out.println(a); 

    //a.sort(null); 
    
    // int currentNumber = 0;  

    List<Integer> b = new LinkedList<>(); 
    
    for(int i = 0; i < a.size(); i++){
        
        //currentNumber = a.get(i); 
        System.out.println("i = " + i + ". a.get(i) = " + a.get(i)); 

        for(int j = i + 1; j < a.size(); j++){

          System.out.println("j = " + j + ". a.get(j) = " + a.get(j)); 

          if(a.get(i) == a.get(j)){

            b.add(a.get(j)); 
            System.out.println("removed j = " + j + ". a.get(j) = " + a.get(j)); 
            a.remove(j);
          }

        }
        
    }

    for(int k = 0; k < a.size(); k++){

      System.out.println("k = " + k + ". a.get(k) = " + a.get(k)); 

      for(int l = 0; l < b.size(); l++){

        System.out.println("l = " + l + ". b.get(l) = " + b.get(l)); 

        if(a.get(k) == b.get(l)){

          System.out.println("removed k = " + k + ". a.get(k) = " + a.get(k)); 
          a.remove(k); 

        }

      }

    }
     int currentNumber = a.get(0); 
     System.out.println("Current number is: " + currentNumber); 
    return currentNumber; 
    }

}

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new LinkedList<>();
        a.add(1);  
        a.add(2);  
        a.add(4);  
        a.add(3);  
        a.add(3);  
        a.add(2);  
        a.add(1);  
        // Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        int result = Result4.lonelyinteger(a);

        System.out.println("Lonely integer is: " + result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
