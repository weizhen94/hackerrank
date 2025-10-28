package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeat {

// Given a string s, find the length of the longest substring without duplicate characters.

// A substring is a contiguous sequence of characters within a string.

// Example 1:

// Input: s = "zxyzxyz"

// Output: 3
// Explanation: The string "xyz" is the longest without duplicate characters.

// Example 2:

// Input: s = "xxxx"

// Output: 1
// Constraints:

// 0 <= s.length <= 1000
// s may consist of printable ASCII characters.

    public int lengthOfLongestSubstring(String s) {

        int ans = 0; 
        int finalAns = 0; 

        for(int i = s.length(); i >= 0; i--){
            for(int j = 0; i + j <= s.length(); j++){
                //System.out.println("i is: " + i + ". j is: " + j);
                String sub = s.substring(j,i+j);
                //System.out.println("sub is: " + sub);
                char[] c = sub.toCharArray();

                // Set<Character> filter = new LinkedHashSet<>(); 
                // for(char chars : c){
                //     filter.add(chars);
                // }

                // List<Character> list = new LinkedList<>(); 
                // Iterator<Character> iterator = filter.iterator();
                // while(iterator.hasNext()){
                //     list.add(iterator.next());
                // }

                List<Character> forFilter = new LinkedList<>();
                for(char chars : c){
                    forFilter.add(chars);
                }
                
                List<Character> list = new LinkedList<>(new LinkedHashSet<>(forFilter));

                String compare = "";
                for(int k = 0; k < list.size(); k++){
                    compare = compare + String.valueOf(list.get(k));
                    ans++;
                //System.out.println("ans is: " + ans);
                }

                //System.out.println("compare is: " + compare);

                if(sub.equals(compare)){
                    //System.out.println("inside sub.equals(compare)");
                    finalAns = Math.max(finalAns, ans);
                }

                ans = 0; 
            }
        }

        return finalAns; 
        
    // int n = s.length();
    // int best = 0;
    // int left = 0;
    // Set<Character> seen = new LinkedHashSet<>();

    // for (int right = 0; right < n; right++) {
    //     // System.out.println("right is:" + right);
    //     // System.out.println("left is:" + left);
    //     char c = s.charAt(right);
    //     // System.out.println("c is:" + c);
    //     while (seen.contains(c)) {
    //         // System.out.println("removing: "+ s.charAt(left));
    //         seen.remove(s.charAt(left));
    //         left++;
    //         // System.out.println("new left is:" + left);
    //     }
    //     seen.add(c);
    //     // System.out.println("seen is:" + seen);
    //     best = Math.max(best, right - left + 1);
    //     // System.out.println("best is:" + best);
    // }
    // return best;
    }

    public static void main(String[] args){

        LongestSubstringWithoutRepeat sLong = new LongestSubstringWithoutRepeat();
        String s = "pwwkew";
        System.out.println(sLong.lengthOfLongestSubstring(s));

    }
    
}
