import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B11004 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int K=Integer.parseInt(stz.nextToken());
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(stz.nextToken()));
		}
		
		
		Collections.sort(list);
		
		System.out.println(list.get(K-1));
	}
}
