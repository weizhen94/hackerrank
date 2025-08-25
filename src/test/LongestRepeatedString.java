package test;

// Have the function SearchingChallenge(str) take the str parameter being passed and determine if there is some substring that appears at least twice in the string. 
// The substring must be at least 2 characters in length. For example: if str is "aabecaa" then your program should return "yes aa" because the substring "aa" appears twice. 
// If the string is "abbbaac" then your program should return "no null". The input string will only contain lowercase alphabetic characters. If there are multiple substrings that 
// appear more than once, return the longest one. If the longest repeating substring has the same length, return the one that appears first in the string.


public class LongestRepeatedString {

    public String longestSubstring (String s){
        
        int n = s.length(); 

        for(int len = n; len >= 1; len--){
            for(int i = 0; i + len <= n; i++){
                System.out.println("len is: " + len + ". i is: " + i); 

                String sub = s.substring(i, i + len); 
                System.out.println("sub is: " + sub);

                int count = 0; 
                int idx = s.indexOf(sub, 0); 
                System.out.println("idx is: " + idx);

                while(idx != -1){

                    System.out.println("inside while loop");
                    count++; 
                    System.out.println("count is: " + count);

                    if(count >= 2) return "Yes " + sub; 

                    idx = s.indexOf(sub, i + 1); 
                    System.out.println("idx in while loop is: " + idx);
                }
            }
        }

        return "No Null"; 
    }
    
    
    public static void main(String[] args){

        String s = "abcabcxyz"; 

        LongestRepeatedString lrs = new LongestRepeatedString(); 
        String answer = lrs.longestSubstring(s); 
        System.out.println(answer); 
    }
    
}
