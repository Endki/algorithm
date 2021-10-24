package topInterviewQuestions;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] solve=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            solve[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=solve[i];
        }
    }
}
