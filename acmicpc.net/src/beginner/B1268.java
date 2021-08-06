package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B1268 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;

		int N = Integer.parseInt(bf.readLine());
		int[][] inputArr = new int[N][5];		
		int max = 0;			
		int answer = 0;

		for(int i=0; i<N; i++) {
			stz = new StringTokenizer(bf.readLine());
			for(int j=0; j<5; j++) {
				inputArr[i][j] = Integer.parseInt(stz.nextToken());
			}
		}

		for(int i=0; i<N; i++) {
			Set<Integer> result = new HashSet<>(); 

			for(int j=0; j<5; j++) {
				for(int k=0; k<N; k++) {
					if(inputArr[i][j] == inputArr[k][j] && k != i) {
						result.add(k);
					}
				}
			}
			
			if(max < result.size()) {
				max = result.size();
				answer = i;
			}
		}
		
		System.out.println(answer+1);

	}

}
