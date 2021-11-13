package topInterviewQuestions.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
	//sort가 속도가 훨씬 빠르고 메모리도 적게 잡아먹게 나왔다. -> nums의 최대길이가 10000 이라서 그런것 같음메
	
	
	//sort  약 3ms / 42000KB
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
        if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
    
    //map  약 6ms / 46000KB
    public boolean containsDuplicate2(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],nums[i]);
            }
            
        }
        return false;
    }
}
