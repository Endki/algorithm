import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25191 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int chicken=Integer.parseInt(br.readLine());
		
		String[] input=br.readLine().split(" ");
		int cola=Integer.parseInt(input[0]);
		int beer=Integer.parseInt(input[1]);
		
		cola/=2;
		
		int sum=cola+beer;
		
		
		System.out.println(Math.min(sum, chicken));
	}

}
