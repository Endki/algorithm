package arrays101;

import java.util.ArrayList;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<Integer>();
        ArrayList<Integer> even=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        
        
        for(int i=0;i<even.size();i++){
            nums[i]=even.get(i);
        }
        
        int eSize=even.size();
        for(int i=0;i<odd.size();i++){
            nums[i+eSize]=odd.get(i);
        }
        
        return nums;
    }
}
