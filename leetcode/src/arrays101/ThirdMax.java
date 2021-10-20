package arrays101;

import java.util.Arrays;
import java.util.Stack;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        
        
        Arrays.sort(nums);
        
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(nums[nums.length-1]);
        
        for(int i=nums.length-1;i>-1;i--){
            if(nums[i]==stack.peek()){
                continue;
            }else{
                stack.push(nums[i]);
            }
            
            
            if(stack.size()==3){
                return stack.pop();
            }
        }
        return stack.get(0);
    }
}
