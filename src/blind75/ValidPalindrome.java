package blind75;

import java.util.Arrays;

public class ValidPalindrome {

        public boolean isPalindrome(String s) {

        // or can do char[] c = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray(); 
        // use [^A-Za-z0-9] if you want to keep the capital letters
        char[] c = s.toLowerCase().replaceAll(" ", "").replaceAll("\\p{Punct}", "").toCharArray(); 

        if(Arrays.toString(c).equals("[]")){
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
