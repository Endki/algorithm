package Graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B17471 {

	   static int N, minValue = Integer.MAX_VALUE;
	    static int arr[];
	    static int map[][];
	    static int check[];
	    static boolean visit[];
	    public static void main(String[] args) throws IOException {
	    	
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        N = Integer.parseInt(br.readLine());
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        arr = new int[N+1];
	        
	        
	        for(int i=1; i<=N; i++)
	            arr[i] = Integer.parseInt(st.nextToken());
	        
	        map = new int[N+1][N+1];
	        check = new int[N+1];
	        for(int i=1; i<=N; i++) {
	            st = new StringTokenizer(br.readLine());
	            int iter = Integer.parseInt(st.nextToken());
	            for(int j=1; j<=iter; j++) {
	                int val = Integer.parseInt(st.nextToken());
	                map[i][val] = 1;
	                map[val][i] = 1;
	            }
	        }
	        dfs(1);
	        if(minValue == Integer.MAX_VALUE)
	            System.out.println(-1);
	        else
	            System.out.println(minValue);
	        
	    }
	    private static void dfs(int count) {
	        // TODO Auto-generated method stub
	        if(count == N+1) {
	            int area1 = 0, area2 = 0;
	            for(int i=1; i<=N; i++) {
	                if(check[i] == 1)
	                    area1 += arr[i];
	                else
	                    area2 += arr[i];
	            }
	            visit = new boolean[N+1];
	            
	            int rs = 0;
	            for(int i=1; i<=N; i++) {
	                if(!visit[i]) {
	                    checkArea(i, check[i]);
	                    rs++;
	                }
	            }
	            if(rs == 2) {
	                if(minValue > Math.abs(area1 - area2))
	                    minValue =  Math.abs(area1 - area2);
	            }
	            return;
	        }
	        
	        check[count] = 1;
	        dfs(count+1);
	        
	        check[count] = 2;
	        dfs(count+1);
	    }
	    private static void checkArea(int index, int num) {
	        // TODO Auto-generated method stub
	        visit[index] = true;
	        for(int i=1; i<=N; i++) {
	            if(map[index][i] == 1 && !visit[i] && check[i]==num)
	                checkArea(i, num);
	        }
	    }

}
