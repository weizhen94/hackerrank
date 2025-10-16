package blind75;

import java.util.ArrayList;
import java.util.List;

public class encodeDecode2 {

    public String encode(List<String> strs) {

        String encoded = ""; 

        for(String s : strs){
            System.out.println(s); 
            String l = String.valueOf(s.length()); 
            System.out.println(l); 
            encoded = encoded + l + "." + s; 
            System.out.println(encoded);
        }

        return encoded; 

    }

    public List<String> decode(String str) {

        char[] c = str.toCharArray(); 

        List<String> answer = new ArrayList<>();

        for(int i = 0; i < c.length; i++){
            if(c[i] == '.' && c[i] != '0'){
                int number = Integer.parseInt(String.valueOf(c[i-1])); 
                answer.add(str.substring(i+1, i+1+number));
            } 

            if(c[i] == '.' && c[i] == '0'){
                String s = String.valueOf(c[i-2]) + String.valueOf(c[i-1]);
                int number = Integer.parseInt(s); 
                answer.add(str.substring(i+1, i+1+number));
            } 
        }

        return answer; 
    }
    
}
