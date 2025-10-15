package blind75;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topK {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1); 
        }

        // using Collection to extract the value of map using map.values();  
        Collection<Integer> collectionList = map.values(); 
        // making a collection into a list so that you can sort 
        List<Integer> list = new ArrayList<>(collectionList); 
        // sorting in desc instead of asc 
        list.sort(Comparator.reverseOrder()); 

        Map<Integer, Integer> inverse = new HashMap<>(); 
        // to create an inverse map with value as the key so that you can use value to search for the key
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            inverse.put(entry.getValue(), entry.getKey()); 
        }

        int[] ans = new int[k]; 

        for(int i = 0; i < k; i++){
            ans[i] = inverse.get(list.get(i)); 
        }

        return ans; 
        
    }
    
}
