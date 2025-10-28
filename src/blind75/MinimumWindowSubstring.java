package blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Given two strings s and t, return the shortest substring of s such that every character in t, including duplicates, is present in the substring. If such a substring does not exist, return an empty string "".

// You may assume that the correct output is always unique.

// Example 1:

// Input: s = "OUZODYXAZV", t = "XYZ"

// Output: "YXAZ"
// Explanation: "YXAZ" is the shortest substring that includes "X", "Y", and "Z" from string t.

// Example 2:

// Input: s = "xyz", t = "xyz"

// Output: "xyz"
// Example 3:

// Input: s = "x", t = "xy"

// Output: ""

public class MinimumWindowSubstring {

    class Solution {
    public String minWindow(String s, String t) {

        // if(s.length()<t.length()) return "";

        int start = 0, r = 0, min = s.length();
        
        Map<Integer, String> map = new HashMap<>(); 

        for(int l = 0; l < s.length(); l++){

            List<Character> list = new ArrayList<>(); 
            char[] c = t.toCharArray();
            for(char chars : c){
                list.add(chars);
            }

            if(t.contains(String.valueOf(s.charAt(l)))){
                //System.out.println("contains: " + s.charAt(l));
                start = l; 
                r = l+1; 
                //System.out.println("list before: " + list);
                list.remove((Character) s.charAt(l));
                //System.out.println("list after: " + list);

                while(!list.isEmpty() && r < s.length()){
                    //System.out.println("list in: " + list);
                    if(list.contains(s.charAt(r))){
                        list.remove((Character) s.charAt(r));
                    }
                    r++;
                    //System.out.println("list final: " + list + ". r is: " + r);
                }

                if(list.isEmpty()){
                    min = Math.min(min, (r-l));
                    //System.out.println("mins is: " + min + ". substring is: " + s.substring(l,r));
                    map.put((r-l), s.substring(l,r));
                }
            }
        }

        if(map.get(min) == null){
            return "";
        } else {
            return map.get(min); 
        }
    }
}

    
}
