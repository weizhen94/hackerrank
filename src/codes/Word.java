package codes;

import java.util.LinkedList;
import java.util.List;

public class Word {

    public String isValidWordGrid(List<String> words){
        words.size(); 
        int i = 0;
        //char letters = ' ';  
        char[] letters = new char[words.size()]; 

        while(i < words.size()){
            for(String wordString : words){
            letters[i] = wordString.charAt(i); 
            }
            List<String> oneWord = new LinkedList<>();
            oneWord.add(new String(letters));
            if(oneWord.add(new String(letters)).equals(words.get))
            i++; 
        }

        return ""; 
    }
    
    public static void main(String args[]){

        List<String> words = new LinkedList<>(); 
        words.add("ball"); 
        words.add("area"); 
        words.add("lead"); 
        words.add("lady"); 

        Word word = new Word(); 
        String validString = word.isValidWordGrid(words); 
        System.out.println("Is valid? " + validString); 
    }
}
