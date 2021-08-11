package lv1;

import java.util.Arrays;

public class P77484 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new int[] {44, 1,0,0,31,25},new int[] {31,10,45,1,6,19})));
		System.out.println(Arrays.toString(solution(new int[] {0,0,0,0,0,0},new int[] {38,19,20,40,15,25})));
		System.out.println(Arrays.toString(solution(new int[] {45, 4,35,20,3,9},new int[] {20,9,3,45,4,35})));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer= new int[2];
		
		boolean[] win=new boolean[46];
		
		int hitCount=0;
		int zero=0;
		
		for(int i=0;i<6;i++) {
			win[win_nums[i]]=true;
		}
		
		for(int i=0;i<6;i++) {
			if(lottos[i]==0) {
				zero++;
			}
			if(win[lottos[i]]) {
				hitCount++;
			}
		}
		
		int max=hitCount+zero;
		
		int min=hitCount;
		
		answer[0]=getPrize(max);
		answer[1]=getPrize(min);
		
		
		return answer;
	}
	public static int getPrize(int count) {
		if(count==6) {
			return 1;
		}else if(count==5) {
			return 2;
		}else if(count==4) {
			return 3;
		}else if(count==3) {
			return 4;
		}else if(count==2) {
			return 5;
		}
		
		return 6;
	}
}
