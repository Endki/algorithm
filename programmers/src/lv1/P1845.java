package lv1;

import java.util.HashSet;

public class P1845 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2,3}));

	}
	
	static public int solution(int[] nums) {
		
		int max=nums.length/2;
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int poket:nums) {
			set.add(poket);
		}
		
		if(set.size()>max) {
			return max;
		}else {
			return set.size();
		}
		
		
		
		
	}
	
	

}
