import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13900 {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String[] k=br.readLine().split(" ");
		long sum=0;
		long sum2=0;
		for(int i=0;i<n-1;i++) {
			sum2+=Long.parseLong(k[i]);
			if(i+1<=n-1) {
			sum+=Long.parseLong(k[i+1])*sum2;
			}
		}

		System.out.println(sum);

	}

}
