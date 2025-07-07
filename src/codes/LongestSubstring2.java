package codes;

public class LongestSubstring2 {

    public static void main(String[] args) {
        String s = "AaaBBbCCcc"; 
        
        int[] result = findLongestRepeatingSubstring(s);
        
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findLongestRepeatingSubstring(String s) {
        String sLower = s.toLowerCase();

        int longestLength = 1;
        int localLength = 1;
        int longestPosition = 0;
        int currentStart = 0;

        for (int i = 1; i < sLower.length(); i++) {
            if (sLower.charAt(i) == sLower.charAt(i - 1)) {
                localLength++;
            } else {
                if (localLength > longestLength) {
                    longestLength = localLength;
                    longestPosition = currentStart;
                }
                localLength = 1;
                currentStart = i;
            }
        }

        // Final check for last group
        if (localLength > longestLength) {
            longestLength = localLength;
            longestPosition = currentStart;
        }

        return new int[]{longestLength, longestPosition};
    }
}

