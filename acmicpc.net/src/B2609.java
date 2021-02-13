import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(stz.nextToken());
		int b=Integer.parseInt(stz.nextToken());
		
		int first=Math.max(a, b);
		int second=Math.min(a, b);
		int N=0;
		while(second!=0) {
			N=first%second;
			first=second;
			second=N;
		}
		
		System.out.println(first);
		System.out.println((a*b)/first);
		
		
		
		
		

	}

}
