package perM_comB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B6603 {
	static int[] arr,output;
	static boolean[] visited;
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		
		while(true) {
			stz=new StringTokenizer(br.readLine());
			N=Integer.parseInt(stz.nextToken());
			
			if(N==0) {
				break;
			}
			
			arr=new int[N];
			visited=new boolean[N];
			output=new int[6];
			
			for(int i=0;i<N;i++) {
				arr[i]=Integer.parseInt(stz.nextToken());
			}
			perM(0,0);
			System.out.println();
		}
		
		
		

		
	}
	
	static public void perM(int depth,int count) {
		
		if(depth==6) {
			//출력함수
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<N;i++) {
				if(visited[i] ) {
					sb.append(arr[i]).append(" ");
				}
			}
			System.out.println(sb.toString());
			
		}
		
		
		for(int i=count;i<N;i++) {
			
			visited[i]=true;
//			output[depth]=arr[i];
			perM(depth+1,i+1);
			visited[i]=false;
			
			
			
			
			
		}
		
	}

}
