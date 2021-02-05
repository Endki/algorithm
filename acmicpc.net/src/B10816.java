import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10816 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<N;i++) {
			int k=Integer.parseInt(stz.nextToken());
			
			if(map.containsKey(k)) {
				map.put(k, map.get(k)+1);
			}else {
				map.put(k, 1);
			}
		}
		
		int M=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int k=Integer.parseInt(stz.nextToken());
			if(map.containsKey(k)) {
				sb.append(map.get(k)).append(" ");
			}else {
				sb.append(0).append(" ");
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
