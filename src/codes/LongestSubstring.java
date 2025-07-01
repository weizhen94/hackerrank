package codes;

import java.util.Scanner;

public class LongestSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int[] result = findLongestRepeatingSubstring(s);
        
        System.out.println(result[0] + " " + result[1]);
    }

    /**
     * Finds the length and starting index of the longest repeating character substring.
     * @param s the input string
     * @return an array where:
     *         result[0] = length of longest substring
     *         result[1] = starting index of longest substring
     */
    public static int[] findLongestRepeatingSubstring(String s) {
        // Your code here
        return new int[]{0, 0}; // Placeholder return
    }
}

