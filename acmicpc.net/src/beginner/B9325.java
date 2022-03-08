package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9325 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		
		while(T-->0) {
			int base=Integer.parseInt(br.readLine());
			
			int optionCount=Integer.parseInt(br.readLine());
			
			while(optionCount-->0) {
				String[] option=br.readLine().split(" ");
				
				base+=Integer.parseInt(option[0])*Integer.parseInt(option[1]);
			}
			
			System.out.println(base);
		}
		
	}

}
