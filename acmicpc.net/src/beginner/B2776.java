package beginner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B2776 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase=Integer.parseInt(br.readLine());
		
		while(testCase-->0) {
			int N=Integer.parseInt(br.readLine());
			
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			HashMap<Integer, Integer> hashmap=new HashMap<Integer, Integer>();
			for(int i=0;i<N;i++) {
				hashmap.put(Integer.parseInt(stz.nextToken()), 1);
			}
			
			
			int M=Integer.parseInt(br.readLine());
			
			stz=new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++) {
				if(hashmap.containsKey(Integer.parseInt(stz.nextToken()))) {
					bw.append("1");
					bw.append("\n");
				}else {
					bw.append("0");
					bw.append("\n");
				}
			}
		}
		bw.flush();

	}

}
