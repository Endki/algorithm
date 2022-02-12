import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B18870 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		int[] mirror=arr.clone();
		Arrays.parallelSort(mirror);
		
		// -10 -9 2 2 4
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		int index=0;
		for(int i=0;i<N;i++) {
			if(!map.containsKey(mirror[i])) {
				map.put(mirror[i], index++);
				
			}
			
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.println(sb.toString());
		
		
		
	}

}
