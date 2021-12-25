import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2668 {
	
	static boolean[] visited;
	static ArrayList<Integer> list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N+1];
		visited=new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
		
		list=new ArrayList<Integer>();
		for(int i=1;i<=N;i++) {
			visited[i]=true;
			dfs(i, i, arr);
			visited[i]=false;
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public static void dfs(int start,int pivot,int[] arr) {
		if(visited[arr[start]]==false) {
			visited[arr[start]]=true;
			dfs(arr[start],pivot,arr);
			visited[arr[start]]=false;
		}
		
		if(arr[start]==pivot) {
			list.add(pivot);
		}
		
	}

}
