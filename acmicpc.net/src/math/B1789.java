package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1789 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long s=Long.parseLong(br.readLine());
		long sum=0;
		long i=1;
		while(true) {
			if(sum+i<=s) {
				sum+=i++;
			}else {
				break;
			}
		}
		System.out.println(i-1);

	}

}
