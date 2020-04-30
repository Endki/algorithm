package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1297 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		int[] arr=new int[3];
		
		for(int i=0;i<3;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		
		double sol=Math.sqrt(Math.pow(arr[0],2)/(Math.pow(arr[1], 2)+Math.pow(arr[2], 2)));
		
		System.out.print((int)Math.floor(sol*arr[1])+" ");
		System.out.println((int)Math.floor(sol*arr[2]));
	}

}
