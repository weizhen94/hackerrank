package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams2 {

    public static void main(String[] args){

        String[] s = {"bat", "tab", "eat", "tea", "tan", "nat", "bat"}; 
        List<String> list = Arrays.asList(s); 
        GroupAnagrams2 groupAnagrams2 = new GroupAnagrams2(); 
        System.out.println("Answer is: " + groupAnagrams2.anagrams(list));

    }
    
    public List<List<String>> anagrams(List<String> list){

        Map<String, List<String>> map = new LinkedHashMap<>(); 

        for(String s : list){
            ArrayList<String> arrayList = new ArrayList<>(); 
            char[] charArray = s.toCharArray(); 
            Arrays.sort(charArray); 
            String arrayString = new String(charArray); 

            //map.computeIfAbsent(arrayString, k -> new ArrayList<>()).add(s); 
            map.putIfAbsent(arrayString, arrayList); 
            map.get(arrayString).add(s); 

        }

        return new ArrayList<>(map.values()); 
    }
}
