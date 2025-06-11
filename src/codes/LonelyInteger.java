package codes;

import java.io.*;
import java.util.*;

class Result4 {

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
    
    for(int i = 0; i < a.size(); i++){
        
        //currentNumber = a.get(i); 
        System.out.println("i = " + i + ". a.get(i) = " + a.get(i)); 

        for(int j = 1; j < a.size(); j++){

          System.out.println("j = " + j + ". a.get(j) = " + a.get(j)); 

          if(a.get(i) != a.get(j)){

              if(i == 0){
                System.out.println("inside (i == 0): a.get(i) = " + a.get(i) + ". a.get(i+1) = " + a.get(i+1)); 
                currentNumber = a.get(i);
                System.out.println("Current number is: " + currentNumber); 
              }

              if(i + 2 < a.size() && a.get(j) != a.get(j+1)){
                System.out.println("inside (a.get(i+1) != a.get(i+2): a.get(i) = " + a.get(i) + ". a.get(i+1) = " + a.get(i+1) + ". a.get(i+2) = " + a.get(i+2)); 
                currentNumber = a.get(i+1);
                System.out.println("Current number is: " + currentNumber); 
              }

              if(j == a.size() - 1){
                System.out.println("inside (i == a.size() - 1): a.get(i) = " + a.get(i) + ". a.get(i+1) = " + a.get(i+1)); 
                currentNumber = a.get(i+1);
                System.out.println("Current number is: " + currentNumber); 
              }

              System.out.println("Not inside any of the if statements. i is " + i + ". a.get(i) = " + a.get(i) + ". j is " + j + ". a.get(j) = " + a.get(j)); 
                
                //System.out.println("i is: " + i + ".  is: " + j + ". a.get(i) is: " + a.get(i) + ". a.get(j) is: " + a.get(j)); 
                
                //System.out.println(a.get(j)); 

                //a.remove(j);
                
            }

        }
        
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

        int result = Result4.lonelyinteger(a);

        System.out.println("Lonely integer is: " + result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
