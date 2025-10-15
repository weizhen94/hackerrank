package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hasDuplicate {
    public boolean hasDuplicate2(int[] nums) {
        System.out.println(Arrays.toString(nums)); 

        Map<Integer, Integer> checkDup = new HashMap<>(); 

        for(int i : nums){
            checkDup.put(i, checkDup.getOrDefault(i, 0) + 1);
            System.out.println("int is: " + i + ". count is: " + checkDup.get(i));
            if(checkDup.get(i) > 1) return true;  
        }

        return false; 
    }
}
