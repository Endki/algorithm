package math;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2965 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		
		
		if(c-b>b-a) {
	
		bw.write((c-b)-1+"\n");
		}else {
			bw.write((b-a)-1+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	

}
