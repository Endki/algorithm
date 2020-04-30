package backtraking.bruteforce;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1748 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n=Integer.parseInt(br.readLine());
		long sum=0;
		for(int i=1;i<=n;i*=10) {
			sum+=(n-i)+1;
		}
		System.out.println(sum);
	}	

}
