package codes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Word {

    public String isValidWordGrid(List<String> words){
        //words.size(); 
        int i = 0;
        char[] letters = new char[words.size()]; 
        List<String> oneWord = new LinkedList<>();

        while(i < words.size()){
            int j = 0;
            for(String wordString : words){
            System.out.println("wordString is: " + wordString); 
            letters[j] = wordString.charAt(i); 
            j++;
            System.out.println("letters is: " + Arrays.toString(letters)); 
            }
            oneWord.add(new String(letters));
            System.out.println("oneWord is: " + oneWord); 
            // Method 1: !words.contains(oneWord.get(i))
            // System.out.println("!words.contains(oneWord.get(i)) is : " + !words.contains(oneWord.get(i)));
            // if(!words.contains(oneWord.get(i))){
            //     return "NO"; 
            // } 

            // i++; 

            // Method 2: words.contains(oneWord.get(i))
            System.out.println("words.contains(oneWord.get(i)) is : " + words.contains(oneWord.get(i)));
            if(words.contains(oneWord.get(i))){
                i++;
            } else {
                return "NO"; 
            }
        }

        return "YES"; 
    }
    
    public static void main(String args[]){

        List<String> words = new LinkedList<>(); 
        // YES
        // words.add("ball"); 
        // words.add("area"); 
        // words.add("lead"); 
        // words.add("lady"); 

        //NO
        words.add("cool"); 
        words.add("deal"); 
        words.add("lamp");
        words.add("mood"); 

        Word word = new Word(); 
        String validString = word.isValidWordGrid(words); 
        System.out.println("Is valid? " + validString); 
    }
}
