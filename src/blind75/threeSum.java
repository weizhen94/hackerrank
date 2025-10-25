package blind75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.

// The output should not contain any duplicate triplets. You may return the output and the triplets in any order.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]

// Output: [[-1,-1,2],[-1,0,1]]
// Explanation:
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].

// Example 2:

// Input: nums = [0,1,1]

// Output: []
// Explanation: The only possible triplet does not sum up to 0.

// Example 3:

// Input: nums = [0,0,0]

// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.

// Constraints:

// 3 <= nums.length <= 1000
// -10^5 <= nums[i] <= 10^5

public class threeSum {

    public List<List<Integer>> threeSums(int[] nums) {

        List<List<Integer>> output = new ArrayList<List<Integer>>(); 
        Set<List<Integer>> filter = new HashSet<List<Integer>>();

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                    if(i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> sum = new ArrayList<>(); 
                        sum.add(nums[i]); 
                        sum.add(nums[j]);
                        sum.add(nums[k]);
                        sum.sort(null);
                        filter.add(sum);
                    }
                }
            }
        }

        Iterator<List<Integer>> iterator = filter.iterator();
        while(iterator.hasNext()){
            output.add(iterator.next());
        }

        return output;
        
    }
    
}
