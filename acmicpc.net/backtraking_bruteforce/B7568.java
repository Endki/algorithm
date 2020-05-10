package backtraking_bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		int n=Integer.parseInt(br.readLine());
		
		int[][] arr=new int[3][n];
		for(int i=0;i<n;i++) {
			stz=new StringTokenizer(br.readLine());
			arr[0][i]=Integer.parseInt(stz.nextToken());
			arr[1][i]=Integer.parseInt(stz.nextToken());
			arr[2][i]=1;
		}
	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[0][i]>arr[0][j] && arr[1][i]>arr[1][j]) {
					arr[2][j]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[2][i]);
		}
	}

}
