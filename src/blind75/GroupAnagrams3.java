package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams3 {

       public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>(); 
        
        for(int i = 0; i < strs.length; i++){
            char[] ordered = strs[i].toCharArray(); 
            Arrays.sort(ordered); 
            String orderedString = new String(ordered); 
            List<String> list = new ArrayList<>(); 
            if(map.containsKey(orderedString)){
                list = map.get(orderedString); 
                list.add(strs[i]); 
            } else {
                list.add(strs[i]);
            }
            map.put(orderedString, list); 
        }

        Collection<List<String>> returned2 = map.values();
        List<List<String>> returned = new ArrayList<List<String>>(); 
        for(List<String> s : returned2){
            returned.add(s); 
        }

        return returned; 
    }
    
}
