package blind75;

import java.util.ArrayList;
import java.util.List;

// Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

// Please implement encode and decode

// Example 1:

// Input: ["neet","code","love","you"]

// Output:["neet","code","love","you"]
// Example 2:

// Input: ["we","say",":","yes"]

// Output: ["we","say",":","yes"]
// Constraints:

// 0 <= strs.length < 100
// 0 <= strs[i].length < 200
// strs[i] contains only UTF-8 characters.

public class encodeDecode {

    public String encode(List<String> strs) {

        String encoded = ""; 

        for(String s : strs){
            encoded = encoded + s + " "; 
        }

        return encoded; 

    }

    public List<String> decode(String str) {

        String[] sArray = str.split(" "); 

        List<String> answer = new ArrayList<>(); 

        for(String s : sArray){
            answer.add(s); 
        }

        return answer; 
    }
    
}
