import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B2667 {
	
	static int t;
	static int count=0;
	static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		t=Integer.parseInt(br.readLine());
		
		
		arr= new int[t][t];
		
		for(int i=0;i<t;i++) {
			String k=br.readLine();
			for(int j=0;j<t;j++) {
				arr[i][j]=k.charAt(j)-48;
			}
		}
		
		int total=0;
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				if(arr[i][j]==1) {
					count=0;
					total++;
					solve(i,j);
					
					pq.add(count);
				}					
			}
		}
		System.out.println(total);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

	public static void solve(int x,int y) {
		arr[x][y]=0;
		count++;
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(0 <= nx && nx < t && 0 <= ny && ny < t) {
				if(arr[nx][ny]==1) {
					solve(nx,ny);
				}
			}
		}
	}
}
