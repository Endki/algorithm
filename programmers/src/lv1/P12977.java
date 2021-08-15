package lv1;

import java.util.HashMap;

public class P12977 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {1,2,7,6,4}));
		
	}
    public static int solution(int[] nums) {
        int answer = 0;

        
        int numsLength=nums.length;
        
        HashMap<Integer, Integer> hashmap=new HashMap<Integer, Integer>();
        
        for(int i=1;i<=3000;i++) {
        	int count=0;
        	for(int j=1;j<=i;j++) {
        		if(i%j==0) {
        			count++;
        		}
        	}
        	
        	if(count==2) {
        		hashmap.put(i, 1);
        	}
        }
        
        
        
        
        for(int i=0;i<numsLength;i++) {
        	for(int j=i;j<numsLength;j++) {
        		for(int k=j;k<numsLength;k++) {
        			if(i==j || i==k || j==k) {
        				continue;
        			}
        			int sum=nums[i]+nums[j]+nums[k];
        			if(hashmap.containsKey(sum)) {
        				answer++;
        			}
        		}	
        	}        	
        }
        

        return answer;
    }
}
