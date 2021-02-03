import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2660 {
	static final int INF=987654321;
	//왜 Integer.MAX_VALUE로는 안될까?
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[][] arr=new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(i!=j) {
					arr[i][j]=INF;
				}
			}
		}
		
		while(true) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			int x=Integer.parseInt(stz.nextToken());
			int y=Integer.parseInt(stz.nextToken());
			
			if(x==-1 && y==-1) {
				break;
			}
			arr[x][y]=1;
			arr[y][x]=1;
		}
		
		//플로이드  
		// 1 경유지
		// 2 출발지
		// 3 도착지
		
		for(int k=1;k<=N;k++) {
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					//경유하는거보다 바로가는게 오래걸리면
					if(arr[i][j]>arr[i][k]+arr[k][j]) {
						arr[i][j]=arr[i][k]+arr[k][j];
					}
				}
			}
		}
		
		
		int point=INF;
		int[] pointArr=new int[N+1];
		
		
		for(int i=1;i<=N;i++) {
			int temp=0;
			for(int j=1;j<=N;j++) {
				if(arr[i][j]!=INF) {
					temp=Math.max(temp, arr[i][j]);
					
				}
			}
			
			pointArr[i]=temp;
			point=Math.min(point, temp);
		}
		
		int count=0;
		
		for(int i=1;i<=N;i++) {
			if(point==pointArr[i]) {
				count++;
			}
		}
		
		System.out.println(point+" "+count);
		
		for(int i=1;i<=N;i++) {
			if(point==pointArr[i]) {
				System.out.print(i+" ");
			}
		}
	}

}
