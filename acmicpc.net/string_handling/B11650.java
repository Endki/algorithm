package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11650 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		int n=Integer.parseInt(br.readLine());
		
		int[][] arr=new int[n][2];
		
		
		
		for(int i=0;i<n;i++) {
			stz=new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				arr[i][j]=Integer.parseInt(stz.nextToken());
			}
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1,int[] o2) {
				
				if(o1[0]==o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}else {
					return Integer.compare(o1[0], o2[0]);
				}	
			}
		});
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
