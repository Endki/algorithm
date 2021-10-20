package arrays101;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] flag=new boolean[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            flag[nums[i]]=true;
        }
        
        List<Integer> output=new ArrayList<Integer>();
        
        for(int i=1;i<flag.length;i++){
            if(!flag[i]){
                output.add(i);
            }
        }
        
        return output;
    }
}
