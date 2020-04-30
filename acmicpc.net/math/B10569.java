package math;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10569 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt(br.readLine());
		
		while(t>0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int v=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			
			bw.write(2+e-v+"\n");
			
			t--;
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}
