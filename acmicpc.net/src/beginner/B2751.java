package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		Boolean[] arr=new Boolean[1000001];
		Boolean[] arr2=new Boolean[1000001];
		
		Arrays.fill(arr, false);
		Arrays.fill(arr2, false);
		
		while(N-->0) {
			int K=Integer.parseInt(br.readLine());
			
			if(K<0) {
				arr2[-1*K]=true;
			}else {
				arr[K]=true;
			}
		}
		
		for(int i=1000000;i>0;i--) {
			if(arr2[i]) {
				sb.append((-1*i)).append("\n");
			}
		}
		
		
		for(int i=0;i<1000001;i++) {
			if(arr[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb.toString());
	}

}
