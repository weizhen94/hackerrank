package blind75;

public class productButSelf {

    public int[] productExceptSelf(int[] nums) {

        int i = 0;
        int[] ans = new int[nums.length]; 

        while(i < nums.length){
            int multiply = 1; 
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    multiply = multiply * nums[j]; 
                }
            }
            ans[i] = multiply;
            i++; 
        }

        return ans; 
        
    }
    
}
