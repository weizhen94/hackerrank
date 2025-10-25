package blind75;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

// Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.

// A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.

// You must write an algorithm that runs in O(n) time.

// Example 1:

// Input: nums = [2,20,4,10,3,4,5]

// Output: 4
// Explanation: The longest consecutive sequence is [2, 3, 4, 5].

// Example 2:

// Input: nums = [0,3,2,5,4,6,1,1]

// Output: 7
// Constraints:

// 0 <= nums.length <= 1000
// -10^9 <= nums[i] <= 10^9

public class longestSequence {

    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums); 
        Set<Integer> intSet = new LinkedHashSet<>(); 
        for(int i : nums){
            intSet.add(i); 
        }
        //int[] treated = intSet.stream().mapToInt(Integer::intValue).toArray();
        Integer[] treated = intSet.toArray(new Integer[0]);
        
        int prevNums = 0; 
        int len = 0; 
        int saved = 0; 
        for(int i = 0; i < treated.length; i++){
            if(i == 0){
                prevNums = treated[i];
                len = 1; 
            } else {
                if((treated[i]-prevNums)==1){
                    prevNums = treated[i];
                    len++;
                } else {
                    len = 1; 
                    prevNums = treated[i];
                }
            }
            if(len > saved){
                saved = len; 
            }
        }

        return saved; 
        
    }
    
}
