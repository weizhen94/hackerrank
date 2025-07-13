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

class Cipher_1 {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    s.toLowerCase(); 
    
    String original = "abcdefghijklmnopqrstuvwxyz"; 
    String rotated = "cdefghijklmnopqrstuvwxyzab"; 
    String cipher = ""; 
    
    for(int i = 0; i < s.length(); i++){
        for(int j = 0; j < original.length(); j++){
            if(s.charAt(i) == '-'){
                cipher = cipher + "-"; 
            }
            
            if(s.charAt(i) == (original.charAt(j))){
                cipher = cipher + rotated.charAt(j); 
            }
        }
    }
    
    return cipher;  
    }

}

public class Cipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Cipher_1.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

