import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B17281 {
	
	static boolean[] visited=new boolean[10];
	static int[] player=new int[10];
	static int point=0,N;
	static int[][] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N+1][10];
		
		for(int i=1;i<=N;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			for(int j=1;j<=9;j++) {
				arr[i][j]=Integer.parseInt(stz.nextToken());
			}
		}
		
		player[4]=1;
		visited[4]=true;
		Permutation(2);;
		System.out.println(point);
		
	}

	
	static void Permutation(int playerNum) {
		if(playerNum==10) {
			point=(Math.max(point, calc()));
			return;
		}
		
		for(int i=1;i<=9;i++) {
			if(!visited[i]) {
				visited[i]=true;
				player[i]=playerNum;
				Permutation(playerNum+1);
				visited[i]=false;
			}
		}
		
	}


	private static int calc() {
		int start=1;
		int temp=0;
		
		for(int i=1;i<=N;i++) {
			int[] point= {0,0,0,0,0};
			
			while(point[0]<3) {
				run(point,arr[i][player[start]]);
				if(start==9) {
					start=1;
				}else {
					start++;
				}
			}
			temp+=point[4];
		}
		
		
		return temp;
	}


	private static void run(int[] point, int num) {
		for(int i=0;i<num;i++) {
			point[4]+=point[3];
			point[3]=point[2];
			point[2]=point[1];
			point[1]=0;
		}
		point[num]++;
		
	}
}
