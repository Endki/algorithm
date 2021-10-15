package arrays101;

import java.util.ArrayList;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                arr.add(nums[i]);
            }
        }
        
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        
        
        return arr.size();
    }
}
