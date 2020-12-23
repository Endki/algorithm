package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		StringTokenizer stz;
		String[][] arr=new String[n][2];
		
		for(int i=0;i<n;i++) {
			stz=new StringTokenizer(br.readLine());
			arr[i][0]=stz.nextToken();
			arr[i][1]=stz.nextToken();
		}


		Arrays.sort(arr,new Comparator<String[]>() {
			@Override
			public int compare(String[] var1,String[] var2) {
				return Integer.compare(Integer.parseInt(var1[0]), Integer.parseInt(var2[0]));
			}
			
		});
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i][0] +" "+arr[i][1]);
		}
		
		
		
	}

}
