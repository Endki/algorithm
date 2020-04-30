package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2355 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] k=br.readLine().split(" ");
		long start=Long.parseLong(k[0]);
		long end=Long.parseLong(k[1]);
		
		
		if(start<end) {
			
			long temp=start;
			start=end;
			end=temp;
		}
		
		System.out.println(((start-end+1)*(end+start))/2);
	}

}
