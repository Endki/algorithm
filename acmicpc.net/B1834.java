import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1834 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		long n=Integer.parseInt(br.readLine());
		
		long sum=0;
		
		for(int i=1;i<n;i++) {
			sum+=(n*i+i);
		}
		System.out.println(sum);
		
	}

}
