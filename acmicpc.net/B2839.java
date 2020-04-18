import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {

	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int count=0;
		
		
		if(n>5) {
			n%=5;
			count++;
		}
		
	}
	

}
