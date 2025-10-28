package blind75;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatingChar{

// You are given a string s consisting of only uppercase english characters and an integer k. You can choose up to k characters of the string and replace them with any other uppercase English character.

// After performing at most k replacements, return the length of the longest substring which contains only one distinct character.

// Example 1:

// Input: s = "XYYX", k = 2

// Output: 4
// Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with 'X's.

// Example 2:

// Input: s = "AAABABB", k = 1

// Output: 5
// Constraints:

// 1 <= s.length <= 1000
// 0 <= k <= s.length

    public int characterReplacement(String s, int k) {

        int ans = 0; 

        for(int i = s.length(); i >= 0; i--){
            for(int j = 0; j + i <= s.length(); j++){
                int maxf = 0; 
                char[] chars = s.substring(j, j+i).toCharArray();
                //System.out.println(Arrays.toString(chars));
                Map<Character, Integer> map = new LinkedHashMap<>();
                for(char c : chars){
                    map.put(c, map.getOrDefault(c, 0)+1);
                    maxf = Math.max(maxf, map.get(c));
                }
                //System.out.println(maxf);

                if(chars.length-maxf <= k){
                    return chars.length;
                }
            }
        }

        return 0; 
    }
    
}