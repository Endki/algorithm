import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5676 {
	
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(stz.nextToken());
			int K=Integer.parseInt(stz.nextToken());
			
			arr=new int[N+1];
			stz=new StringTokenizer(br.readLine());
			
			for(int i=1;i<=N;i++) {
				arr[i]=Integer.parseInt(stz.nextToken());
			}
			
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<K;i++) {
				stz=new StringTokenizer(br.readLine());
				String order=stz.nextToken();
				int a=Integer.parseInt(stz.nextToken());
				int b=Integer.parseInt(stz.nextToken());
				
				if(order.equals("C")) {
					arr[a]=b;
				}else {
					int sum=1;
					
					
					for(int j=a;j<=b;j++) {
						sum*=arr[j];
					}
					
					
					
					
					
					
					if(sum==0) {
						sb.append(0);
					}else if(sum>0) {
						sb.append("+");
					}else {
						sb.append("-");
					}
				}
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
		
		

	}
	
}
