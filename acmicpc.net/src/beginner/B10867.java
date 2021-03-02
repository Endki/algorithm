package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10867 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		boolean[] arr=new boolean[1001];
		boolean[] arr2=new boolean[1001];
		int N=Integer.parseInt(br.readLine());
		StringTokenizer stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int k=Integer.parseInt(stz.nextToken());
			
			if(k>=0) {
				arr[k]=true;
			}else {
				arr2[k*-1]=true;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=1000;i>0;i--) {
			if(arr2[i]) {
				sb.append(i*-1).append(" ");
			}
		}
		
		for(int i=0;i<1001;i++) {
			if(arr[i]) {
				sb.append(i).append(" ");
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
