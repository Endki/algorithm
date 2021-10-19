package arrays101;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        
        Arrays.fill(nums,0);
        
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
    }
}
