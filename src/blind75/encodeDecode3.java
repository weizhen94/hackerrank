package blind75;

import java.util.ArrayList;
import java.util.List;

public class encodeDecode3 {

    public String encode(List<String> strs) {

        String encoded = ""; 

        for(String s : strs){
            encoded = encoded + s + "."; 
        }

        return encoded; 

    }

    public List<String> decode(String str) {

        List<String> strs = new ArrayList<>();

        char[] chars = str.toCharArray(); 

        int start = 0; 

        for(int end = 0; end < chars.length; end++){
            if(chars[end] == '.'){
                strs.add(str.substring(start, end));
                start = end + 1; 
            } 
        }

        return strs; 

    }
    
}
