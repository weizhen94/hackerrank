package codes;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstring {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String s = scanner.nextLine();

        String s = "abcde"; 
        
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
        String sLower = s.toLowerCase(); 
        //System.out.println(sLower); 

        String[] letters = new String[sLower.length()];
        
        for(int i = 0; i < sLower.length(); i++){
            letters[i] = sLower.substring(i, i+1); 
        }

        int localLength = 1; 
        int localLengthCompare = 0; 
        int longestLength = 0; 
        int i = 0; 
        int localPosition = 0; 

        while(i < letters.length - 1){
            int n = i + 1; 
            System.out.println("letters " + i + ": " + letters[i] + ". letters " + n + ": " + letters[i+1]); 
            if(letters[i].equals(letters[i+1])){
                System.out.println("Inside equals"); 
                localLength++; 
                if(i == letters.length - 2){
                    System.out.println("Inside i == letters.length - 2"); 
                    System.out.println("localLength: " + localLength); 
                    localLengthCompare = localLength;
                    System.out.println("localLengthCompare: " + localLengthCompare); 
                    System.out.println("longestLength: " + longestLength); 
                    if(longestLength < localLengthCompare){
                    System.out.println("Inside longestLength < localLengthCompare"); 
                    longestLength = localLengthCompare; 
                    System.out.println("longestLength now is: " + longestLength);
                    localPosition = i+3 - longestLength; 
                    System.out.println("localPosition now is: " + localPosition);
                }
                }
            } else {
                System.out.println("Inside else, not equals"); 
                System.out.println("localLength: " + localLength); 
                localLengthCompare = localLength;
                localLength = 1; 
                System.out.println("localLengthCompare: " + localLengthCompare); 
                System.out.println("longestLength: " + longestLength); 
                if(longestLength < localLengthCompare){
                    System.out.println("Inside longestLength < localLengthCompare"); 
                    longestLength = localLengthCompare; 
                    System.out.println("longestLength now is: " + longestLength);
                    localPosition = i+2 - longestLength; 
                    System.out.println("localPosition now is: " + localPosition);
                }
            }
            i++; 
        }

        //System.out.println(longestLength); 
        System.out.println(localPosition); 

        return new int[]{localPosition, longestLength}; // Placeholder return
    }
}

