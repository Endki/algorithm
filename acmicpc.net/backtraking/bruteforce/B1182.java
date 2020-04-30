package backtraking.bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1182 {
		static int count=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int s=Integer.parseInt(input[1]);
		
		input=br.readLine().split(" ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		
		solve(0,0,s,n,arr);
		System.out.println(count);
		
		
		

	}
	public static void solve(int i, int sum,int s,int n,int[] arr) {
		if(i==n) {
			return;
		}
		if(sum+arr[i]==s) {
			count++;
		}
		solve(i+1,sum,s,n,arr);
		solve(i+1,sum+arr[i],s,n,arr);
		
	}
}
