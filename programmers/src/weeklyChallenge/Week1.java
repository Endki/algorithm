package weeklyChallenge;

import java.io.IOException;

public class Week1 {

	public static void main(String[] args) throws IOException{
		System.out.println(solution(2500, 20, 2500));

	}

	public static long solution(int price, int money, int count) {
		
		long sum=0;
		
		for(int i=1;i<=count;i++) {
			sum+=price*i;
		}
		
		if(sum<=money) {
			return 0;
		}else {
			return sum-money;
		}
		
		
		
	}
}
