package blind75;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {

        char a = '('; 
        char b = ')'; 
        char c = '{'; 
        char d = '}'; 
        char e = '['; 
        char f = ']'; 

        List<Boolean> checkingList = new ArrayList<>(); 

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == a) checkingList.add(checkBracketForward(i, s, b));
            if(s.charAt(i) == b) checkingList.add(checkBracketBackward(i, s, a));
            
            if(s.charAt(i) == c) checkingList.add(checkBracketForward(i, s, d));
            if(s.charAt(i) == d) checkingList.add(checkBracketBackward(i, s, c));

            if(s.charAt(i) == e) checkingList.add(checkBracketForward(i, s, f));
            if(s.charAt(i) == f) checkingList.add(checkBracketBackward(i, s, e));

        }

        if(checkingList.contains(false)){
            return false; 
        } else {
            return true; 
        }
        
    }

    public boolean checkBracketForward(int i, String s, char c){

        if(i+1 < s.length() && s.charAt(i+1) == c) return true; 

        if(!s.contains(String.valueOf(c))) return false; 

        if(i < s.length()-1-i && s.charAt(s.length()-1-i) == c) return true; 

        return false; 

    }

    public boolean checkBracketBackward(int i, String s, char c){

        if(i-1 >= 0 && s.charAt(i-1) == c) return true; 

        if(!s.contains(String.valueOf(c))) return false; 

        if(i > s.length()-1-i && s.charAt(s.length()-1-i) == c) return true; 

        return false; 

    }

}
