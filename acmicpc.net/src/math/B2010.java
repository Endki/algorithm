package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2010 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=Integer.parseInt(br.readLine());
		}

		sum-=(n-1);
		System.out.println(sum);
	}

}
