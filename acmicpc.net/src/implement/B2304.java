package implement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2304 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int[] arr=new int[1001];
		
		
		for(int i=0;i<N;i++) {
			String[] input=br.readLine().split(" ");
			
			int x=Integer.parseInt(input[0]);
			int h=Integer.parseInt(input[1]);
			
			arr[x]=h;
		}
		
		int start=0;
		int end=1001;
		int max=0;
		int maxIndex=0;
		
		for(int i=0;i<1001;i++) {
			if(arr[i]>0) {
				start=i;
				break;
			}
		}
		
		for(int i=1000;i>-1;i--) {
			if(arr[i]>0) {
				end=i;
				break;
			}
		}
		
		for(int i=0;i<1001;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
		}

		int answer=0;
		
		
		int leftMax=0;
		for(int i=start;i<maxIndex;i++) {
			leftMax=Math.max(arr[i], leftMax);
			answer+=leftMax;
		}
		
		int rightMax=0;
		for(int i=end;i>maxIndex;i--) {
			rightMax=Math.max(arr[i], rightMax);
			answer+=rightMax;
		}
		System.out.println(answer+arr[maxIndex]);
	}
	

}
