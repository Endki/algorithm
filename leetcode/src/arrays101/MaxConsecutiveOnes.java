package arrays101;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength=0;
        int length=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(length>maxLength){
                    maxLength=length;
                }
                
                length=0;
                
                
            }else{
                length++;
            }
            
            
        }
        if(length>maxLength){
            maxLength=length;
        }
        return maxLength;
    }
}
