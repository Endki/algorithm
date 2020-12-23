package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1964 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long n=Long.parseLong(br.readLine());
		
		long sum=0;
		long count=4;
		for(int i=1;i<=n;i++) {
			if(i==1) {
				sum+=5;
			}else {
				sum+=count;
			}
			count+=3;
			sum=sum%45678;
		}
		System.out.println(sum);
	}

}
