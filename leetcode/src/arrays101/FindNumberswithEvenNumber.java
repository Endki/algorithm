package arrays101;

public class FindNumberswithEvenNumber {
    public int findNumbers(int[] nums) {
        int answer=0;
        
        
        
        for(int i=0;i<nums.length;i++){
        	
        	
        	
            if(isCheckEven(Integer.toString(nums[i]).length())){
                answer++;
            }
        }
        
        return answer;
    }
    public boolean isCheckEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
}
