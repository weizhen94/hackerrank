package blind75;

public class MostWater {

// You are given an integer array heights where heights[i] represents the height of the ith bar.

// You may choose any two bars to form a container. Return the maximum amount of water a container can store.

// Example 1:



// Input: height = [1,7,2,5,4,7,3,6]

// Output: 36
// Example 2:

// Input: height = [2,2,2]

// Output: 4
// Constraints:

// 2 <= height.length <= 1000
// 0 <= height[i] <= 1000

    public int maxArea(int[] heights) {

        int area = 0; 
        int maxArea = 0; 

        for(int i = 0; i < heights.length; i++){
            for(int j = 0; j < heights.length; j++){
                if(i != j && heights[i] < heights[j]){
                    int width = j - i; 
                    if(width < 0){
                        width = width * -1; 
                    }
                    area = heights[i]* width; 
                } else if(i != j && heights[i] > heights[j]){
                    int width = j - i; 
                    if(width < 0){
                        width = width * -1; 
                    }
                    area = heights[j]* width; 
                } else {
                    int width = j - i; 
                    if(width < 0){
                        width = width * -1; 
                    }
                    area = heights[j]* width; 
                }
                if(area > maxArea){
                maxArea = area;
                }
            }
        }
        
        return maxArea; 
        
    }
    
}
