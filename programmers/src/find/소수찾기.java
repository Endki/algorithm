package find;

import java.io.IOException;
 

	
public class 소수찾기 {

	static int N=4,R=2;
	static int[] solve= {1,2,3,4,5,6};;
	static int[] arr={1,2,3,4,5,6};;
	static int count=0;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		comb(0,0);
		System.out.println(count);
		System.out.println(solution("17"));
		
	}

	
	static public int solution(String numbers) {
		int answer=0;
		
		
		return answer;
	}
	
	static public void comb(int n,int start) {
		if(n==R) {
			count++;
			return;
		}
		
		for(int i=start;i<N;i++) {
			arr[n]=solve[i];
			comb(n+1,i+1);
		}
		
	}
}
