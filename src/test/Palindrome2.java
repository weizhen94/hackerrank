package test;


// Have the function SearchingChallenge(str) take the str parameter being passed and determine the largest substring within the string that is a palindrome. 
// The palindrome must be at least 2 characters in length. For example: if str is "abracecars" then your program should return "racecar" because it is the largest palindrome 
// within the string. The input string will only contain lowercase alphabetic characters. If there is no palindrome of at least 2 characters in length, return "no palindrome".


public class Palindrome2 {

    public String palindrome(String word){
        int start = -1; 
        //so that later when checking for length(odd[1] or even[1]) against bestLength, you ensure that the palindrome is at least 2 characters
        int bestLength = 1; 

        for(int centre = 0; centre < word.length(); centre++){

            int[] odd = check(word, centre, centre); 
            if(odd[1] > bestLength){
                start = odd[0]; 
                bestLength = odd[1]; 
            }

            int[] even = check(word, centre, centre+1); 
            if(even[1] > bestLength){
                start = even[0]; 
                bestLength = even[1]; 
            }

        }

        if(start >= 0){
            return word.substring(start, start+bestLength); 
        }

        return "no palindrome";
    }

    public int[] check(String str, int i, int j){

        while(i>=0 && j < str.length() && str.charAt(i) == str.charAt(j)){
            i--; 
            j++; 
        }

        int start = i+1;
        int length = j-i-1;

        return new int[]{start, length}; 
    }

    public static void main(String[] args){
        String input = "aabe";
        Palindrome2 palindrome2 = new Palindrome2(); 
        System.out.println(palindrome2.palindrome(input)); 
    }
    
}
