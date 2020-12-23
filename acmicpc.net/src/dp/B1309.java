package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		long[][] arr=new long[n+1][3];
		Arrays.fill(arr[1], 1);
		
		
		for(int i=2;i<n+1;i++) {
			arr[i][0]=(arr[i-1][0]+arr[i-1][1]+arr[i-1][2])%9901;
			arr[i][1]=(arr[i-1][0]+arr[i-1][1])%9901;
			arr[i][2]=(arr[i-1][0]+arr[i-1][1])%9901;
		}
		long sum=0;
		for(int i=0;i<3;i++) {
			sum+=arr[n][i];
		}
		System.out.println(sum%9901);
		
		
		
	}

}
