import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2979 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		int[] arr=new int[100];
		int a=Integer.parseInt(input[0]);
		int b=Integer.parseInt(input[1]);
		int c=Integer.parseInt(input[2]);
		int count=3;
		int sum=0;
		int max=0;
		while(count>0) {
			String[] input2=br.readLine().split(" ");
			int m=Integer.parseInt(input2[0]);
			int n=Integer.parseInt(input2[1]);
			
			
			if(max<n) {
				max=n;
			}
			for(int i=m;i<n;i++) {
				arr[i]+=1;
			}
			

			
			count--;
		}
		for(int i=1;i<max;i++) {
			if(arr[i]==1) {
				sum+=a;
			}else if(arr[i]==2) {
				sum+=b*2;
			}else if(arr[i]==3) {
				sum+=c*3;
			}
		}
		System.out.println(sum);
		
	}
}
