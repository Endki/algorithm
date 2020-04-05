import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int sum=0;
		int max=0;
		
		for(int i=0;i<4;i++) {
			StringTokenizer stn=new StringTokenizer(br.readLine());
			
			int a=Integer.parseInt(stn.nextToken());
			int b=Integer.parseInt(stn.nextToken());
			
			sum+=b;
			sum-=a;
			if(max<sum) {
				max=sum;
			}
			
			
		}
		
		System.out.println(max);
	}

}
