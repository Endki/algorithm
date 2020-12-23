package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B4195 {
	static int[] parent;
	static int[] count;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int F=Integer.parseInt(br.readLine());
			HashMap<String,Integer> hashmap=new HashMap<String, Integer>();
			parent=new int[F*2+1];
			count=new int[F*2+1];
			int index=1;
			while(F-->0) {
				String[] input=br.readLine().split(" ");
			
				for(int i=0;i<2;i++) {
					if(!hashmap.containsKey(input[i])) {
						count[index]=1;
						parent[index]=index;
						hashmap.put(input[i], index++);
					}
				}
				
				int x=hashmap.get(input[0]);
				int y=hashmap.get(input[1]);
				union(x,y);
				
				System.out.println(count[find(x)]);
			}
		}
	}
	
	public static void union(int x,int y) {
		x=find(x);
		y=find(y);
		
		if(x!=y) {
			parent[x]=y;
			count[y]+=count[x];
		}
	}

	private static int find(int x) {
		if(x==parent[x]) {
			return x;
		}
			
		return parent[x]=find(parent[x]);
		
	}

}
