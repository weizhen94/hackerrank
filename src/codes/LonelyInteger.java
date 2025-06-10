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

    a.sort(null); 
    
    int currentNumber = 0;  
    
    for(int i = 0; i < a.size() - 1; i++){
        
        //currentNumber = a.get(i); 
            
            if(a.get(i) != a.get(i+1)){

              if(i == 0){
                System.out.println("inside (i == 0): a.get(i) = " + a.get(i) + ". a.get(i+1) = " + a.get(i+1)); 
                currentNumber = a.get(i);
                System.out.println("Current number is: " + currentNumber); 
              }

              if(i + 2 < a.size() && a.get(i+1) != a.get(i+2)){
                System.out.println("inside (a.get(i+1) != a.get(i+2): a.get(i) = " + a.get(i) + ". a.get(i+1) = " + a.get(i+1) + ". a.get(i+2) = " + a.get(i+2)); 
                currentNumber = a.get(i+1);
                System.out.println("Current number is: " + currentNumber); 
              }

              if(i == a.size() - 1){
                System.out.println("inside (i == a.size() - 1): a.get(i) = " + a.get(i) + ". a.get(i+1) = " + a.get(i+1)); 
                currentNumber = a.get(i+1);
                System.out.println("Current number is: " + currentNumber); 
              }
                
                //System.out.println("i is: " + i + ".  is: " + j + ". a.get(i) is: " + a.get(i) + ". a.get(j) is: " + a.get(j)); 
                
                //System.out.println(a.get(j)); 

                //a.remove(j);
                
            } 
            // else {
            //     currentNumber = a.get(i); 
            //     System.out.println("Current number is: " + currentNumber); 
            // }
            
        
        
    }
    //System.out.println("Current number is: " + currentNumber); 
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

        int result = Result.lonelyinteger(a);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
