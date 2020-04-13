import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1952 {
	public static int sol=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		
		
		int m=Integer.parseInt(input[0]);
		int n=Integer.parseInt(input[1]);

		System.out.println(solve(m,n));
	}
	public static int solve(int n,int m) {
		if(n==1) {
			return 0;
		}
		else if(m==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(m==2) {
			return 3;
		}else {
			
			sol+=4+solve(n-2,m-2);
		}
		return sol;
		
	}

}
