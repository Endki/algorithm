package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1057 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		
		int n=Integer.parseInt(s[0]);
		int kim=Integer.parseInt(s[1]);
		int lim=Integer.parseInt(s[2]);
		int count=0;
		
		while(kim!=lim) {
			kim=kim/2+kim%2;
			lim=lim/2+lim%2;
			count++;
			
		}
		
		
		System.out.println(count);
		br.close();
	}

}
