package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		
		int sum=(k*(k-1)*(k-2)*(k-3))/24; 

		System.out.println(sum);

	}	
}
