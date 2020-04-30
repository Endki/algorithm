import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1500 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		
		long s=Integer.parseInt(input[0]);
		long k=Integer.parseInt(input[1]);
		
		long sol=1;
		
		long a=s/k;
		long b=s%k;
		
		
		
		while(k>0) {
			k--;
			if(b>0) {
				sol*=(a+1);
				b--;
			}else {
				sol*=a;
			}
		}
		

		System.out.println(sol);
	}
}
