import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11006 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt(br.readLine());
		
		while(t>0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			
			int normal=m*2;
			int sum=normal-n;
			
			
			
			bw.write(sum+" "+(m-sum)+"\n");
//			System.out.println(sum+" "+(m-sum));
			
			
			t--;
		}
		
		bw.flush();
	}

}
