package arrays101;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        boolean[] list=new boolean[201];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                list[Math.abs(nums[i])+100]=true;
            }else{
                list[nums[i]]=true;
            }
        }
        ArrayList<Integer> output=new ArrayList<Integer>();
        
        for(int i=200;i>100;i--){
            if(list[i]){
                output.add((i-100)*-1);
            }
        }
        
        for(int i=0;i<101;i++){
            if(list[i]){
                output.add(i);
            }
        }
     
        for(int i=0;i<output.size();i++){
            nums[i]=output.get(i);
        }
        
        
        return output.size();
    }
}
