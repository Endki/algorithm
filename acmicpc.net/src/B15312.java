import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15312 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] alpha = new int[] { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };

		String a = br.readLine();
		String b = br.readLine();
		
		int[] aArr=new int[a.length()];
		int[] bArr=new int[b.length()];
		
		for(int i=0;i<a.length();i++) {
			aArr[i]=alpha[a.charAt(i)-'A'];
			
		}
		
		
		
		
		
	}

}
