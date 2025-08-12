package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {

    // method for removing duplicates 
//     for (int i = 0; i < answer.size(); i++) {
//         List<String> current = answer.get(i);
//         Iterator<List<String>> iterator = answer.listIterator(i + 1);
//         System.out.println("iterator is: " + iterator.toString());
//         while (iterator.hasNext()) {
//         List<String> next = iterator.next();
//         System.out.println("next is: " + next);
//         if (current.equals(next)) {
//             iterator.remove();
//         }
//     }
// }

public static void main(String args[]){

    String[] stringArray = {"act","pots","tops","cat","stop","hat"};  

    Duplicates duplicates = new Duplicates(); 
    List<List<String>> answer = duplicates.groupAnagrams(stringArray);

    System.out.println("answer is: " + answer); 

}

public List<List<String>> groupAnagrams(String[] strs) {
    LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
    for (String s : strs) {
        List<String> value = new ArrayList<>(); 
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        //map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        map.putIfAbsent(key, value); 
        map.get(key).add(s); 
    }
    return new ArrayList<>(map.values());
}

}


