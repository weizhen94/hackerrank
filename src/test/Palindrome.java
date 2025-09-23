package test;

import java.util.Scanner;

// Have the function SearchingChallenge(str) take the str parameter being passed and determine the largest substring within the string that is a palindrome. 
// The palindrome must be at least 2 characters in length. For example: if str is "abracecars" then your program should return "racecar" because it is the largest palindrome 
// within the string. The input string will only contain lowercase alphabetic characters. If there is no palindrome of at least 2 characters in length, return "no palindrome".

public class Palindrome {

    public static String SearchingChallenge(String str) {
        int n = str.length();
        if (n < 2) return "no palindrome";

        // just like doing 
        // int bestStart = 0; 
        // int bestLen = 0;
        int bestStart = 0, bestLen = 0;
        //System.out.println("bestStart: " + bestStart + ". bestLen: " + bestLen);

        for (int center = 0; center < n; center++) {
            // Odd-length palindrome: center at (center)
            int[] odd = expand(str, center, center);
            if (odd[1] > bestLen) {
                bestStart = odd[0];
                bestLen = odd[1];
            }

            // Even-length palindrome: center between (center, center+1)
            int[] even = expand(str, center, center + 1);
            if (even[1] > bestLen) {
                bestStart = even[0];
                bestLen = even[1];
            }
        }

        System.out.println("substring: " + str.substring(2, 9));

        if (bestLen >= 2) {
            return str.substring(bestStart, bestStart + bestLen);
        } else {
            return "no palindrome";
        }
    }

    // Expand while s[l] == s[r]; return {start, length} of the palindrome found
    private static int[] expand(String s, int l, int r) {
        int n = s.length();
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }
        // when loop stops, l and r are one step beyond the palindrome
        int start = l + 1; //2
        int len = r - l - 1; //7
        return new int[] { start, len };
    }

    // Coderbyte-style I/O wrapper
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine().trim();
        String input = "abracecars";
        System.out.println(SearchingChallenge(input));
    }
    
}
