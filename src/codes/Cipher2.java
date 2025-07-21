package codes;

import java.io.*;

class cipher_2 {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     * 
     * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
Example


The alphabet is rotated by , matching the mapping above. The encrypted string is .
Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
Function Description
Complete the caesarCipher function in the editor below.
caesarCipher has the following parameter(s):
string s: cleartext
int k: the alphabet rotation factor
Returns
string: the encrypted string
Input Format
The first line contains the integer, , the length of the unencrypted string.
The second line contains the unencrypted string, .
The third line contains , the number of letters to rotate the alphabet by.
Constraints


 is a valid ASCII string without any spaces.
Sample Input
11
middle-Outz
2
Sample Output
okffng-Qwvb
Explanation
Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab

m -> o
i -> k
d -> f
d -> f
l -> n
e -> g
-    -
O -> Q
u -> w
t -> v
z -> b
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    k = k % 26; 
    
    String originalLower = "abcdefghijklmnopqrstuvwxyz"; 
    
    String frontLower = originalLower.substring(0, k);
    //System.out.println(front); 
    String backLower = originalLower.substring(k);
    //System.out.println(back); 
    String rotatedLower = backLower + frontLower; 
    //System.out.println(rotatedLower);
    
    String originalUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    
    String frontUpper = originalUpper.substring(0, k);
    //System.out.println(front); 
    String backUpper = originalUpper.substring(k);
    //System.out.println(back); 
    String rotatedUpper = backUpper + frontUpper; 
    //System.out.println(rotatedUpper);
    
    //String rotated = "cdefghijklmnopqrstuvwxyzab"; 
    String cipher = ""; 
    
    for(int i = 0; i < s.length(); i++){
        for(int j = 0; j < originalLower.length(); j++){
            // if(s.charAt(i) == '-'){
            //     cipher = cipher + "-"; 
            //     i = i + 1; 
            // }

            // if(String.valueOf(s.charAt(i)).matches("\\p{Punct}")){
            //     System.out.println(s.charAt(i)); 
            //     cipher = cipher + s.charAt(i); 
            //     i = i + 1; 
            //     if(i == s.length()-1){
            //         j = originalLower.length(); 
            //     }
            // }
            
            if(Character.isLowerCase(s.charAt(i)) && s.charAt(i) == (originalLower.charAt(j))){
                cipher = cipher + rotatedLower.charAt(j); 
            } else if (Character.isUpperCase(s.charAt(i)) && s.charAt(i) == (originalUpper.charAt(j))){
                cipher = cipher + rotatedUpper.charAt(j); 
            } else if (String.valueOf(s.charAt(i)).matches("\\p{Punct}")){
                cipher = cipher + s.charAt(i);
                j = originalLower.length();
            } else if (Character.isDigit(s.charAt(i))){
                cipher = cipher + s.charAt(i);
                j = originalLower.length();
            }
        }
    }
    
    return cipher;  
    }
}

    public class Cipher2 {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // String s = bufferedReader.readLine();

        // int k = Integer.parseInt(bufferedReader.readLine().trim());

        // String result = Result.caesarCipher(s, k);

        String s = "159357lcfd";
        int k = 98;

        String result = cipher_2.caesarCipher(s, k);

        System.out.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }

    
}

