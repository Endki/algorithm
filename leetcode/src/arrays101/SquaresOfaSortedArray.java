package arrays101;

import java.util.ArrayList;
import java.util.Collections;

public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            list.add((int)Math.pow(nums[i],2));
        }
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        
        return nums;
    }
}
