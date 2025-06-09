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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    //System.out.println(a); 
    
    int currentNumber = 0;  
    
    for(int i = 0; i < a.size(); i++){
        
        //currentNumber = a.get(i); 
        
        for(int j = 0; j < a.size(); j++){
            
            if(i != j && a.get(i) == a.get(j)){
                
                //System.out.println("i is: " + i + ". j is: " + j + ". a.get(i) is: " + a.get(i) + ". a.get(j) is: " + a.get(j)); 
                
                System.out.println(a.get(j)); 

                a.remove(j);
                
            } else {
                currentNumber = a.get(i); 
            }
            
        }
        
    }
    return currentNumber; 
    }

}

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
