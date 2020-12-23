package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stz.nextToken());
		int K = Integer.parseInt(stz.nextToken());

		double[][] SY = new double[2][7];
		

		for (int i = 0; i < N; i++) {
			stz = new StringTokenizer(br.readLine());

			//여학생
			if(Integer.parseInt(stz.nextToken())==0) {
				SY[0][Integer.parseInt(stz.nextToken())]++;
			}
			//남학생
			else {
				SY[1][Integer.parseInt(stz.nextToken())]++;
			}
		}
		int count=0;
		for(int i=1;i<7;i++) {
			if(SY[0][i]!=0) {
				count+=(Math.ceil(SY[0][i]/K));
			}
			
			if(SY[1][i]!=0) {
				count+=(Math.ceil(SY[1][i]/K));
			}
			
			
			
		}
		System.out.println(count);

	}

}
