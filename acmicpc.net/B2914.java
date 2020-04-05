import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2914 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer stk=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(stk.nextToken());
		int b=Integer.parseInt(stk.nextToken());
		
		System.out.println(((b-1)*a)+1);
	}
}
