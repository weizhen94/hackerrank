package blind75;

import java.util.Arrays;

// Given a string s, return true if it is a palindrome, otherwise return false.

// A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

// Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

// Example 1:

// Input: s = "Was it a car or a cat I saw?"

// Output: true
// Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

// Example 2:

// Input: s = "tab a cat"

// Output: false
// Explanation: "tabacat" is not a palindrome.

// Constraints:

// 1 <= s.length <= 1000
// s is made up of only printable ASCII characters.

public class ValidPalindrome {

        public boolean isPalindrome(String s) {

        // or can do String replaced = s.toLowerCase().replaceAll(" ", "").replaceAll("\\p{Punct}", "").toCharArray(); 
        // use [^A-Za-z0-9] if you want to keep the capital letters
        String replaced = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        char[] c = replaced.toCharArray(); 

        if(replaced.isBlank()){
            return true;
        }

        int start = 0;  
        int end = c.length-1; 

        while(start < end && c[start] == c[end]){
            if(start+1 == end){
                return true;
            }
            start++; 
            end--; 
        }

        if(start == end){
            return true;
        }

        return false; 
        
    }
    
}
