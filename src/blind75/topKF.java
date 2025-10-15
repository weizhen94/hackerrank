package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topKF {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1); 
        }

        // to save the map into a list of int[] so that later can use the value of the map to do sorting
        List<int[]> list = new ArrayList<>(); 
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int[] array = new int[2]; 
            array[0] = entry.getValue(); 
            array[1] = entry.getKey(); 
            list.add(array); 
        }

        list.sort((a, b) -> {
            // sort the values in desc order
            int c = Integer.compare(b[0], a[0]); 
            //if there is no tie breaker for the values 
            if (c != 0) return c;
            //if there is tie breaker for the values, compare the keys as well
            return Integer.compare(b[1], a[1]);  
        });

        int[] answer = new int[k]; 
        for(int i = 0; i < k; i++){
            System.out.println("list is: " + Arrays.toString(list.get(i)));
            int[] iArray = list.get(i); 
            answer[i] = iArray[1]; 
        }

        return answer; 
        
    }

    public static void main(String[] args){

        int[] arr = {1, 2};
        topKF top = new topKF(); 
        System.out.println(Arrays.toString(top.topKFrequent(arr, 2)));  

    }
    
}
