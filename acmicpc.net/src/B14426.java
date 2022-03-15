import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14426 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int M=Integer.parseInt(stz.nextToken());
		
		
		String[] arr=new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine();
		}
		
		
		int answer=0;
		for(int i=0;i<M;i++) {
			String k=br.readLine();
			
			for(int j=0;j<N;j++) {
				if(arr[j].startsWith(k)) {
					answer++;
					break;
				}
			}
		}
		
		

		System.out.println(answer);
	}

}
