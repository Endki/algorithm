import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N+1];
		int indexE=0;
		while(N-->0) {
			String[] input=br.readLine().split(" ");
			
			switch (input[0]) {
			case "push_back":
				
				arr[indexE]=Integer.parseInt(input[1]);
				indexE++;
				break;
			case "push_front":
				
				for(int i=indexE;i>0;i--) {
					arr[i]=arr[i-1];
				}
				
				arr[0]=Integer.parseInt(input[1]);
				indexE++;
				break;
			case "front":
				if(arr[0]==0) {
					System.out.println(-1);
				}else {
					System.out.println(arr[0]);
				}
				break;
			case "back":
				
				if(indexE==0) {
					System.out.println(-1);
				}else {
					System.out.println(arr[indexE-1]);
				}
				break;
			case "size":
				System.out.println(indexE);
				break;
			case "empty":
				if(arr[0]==0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "pop_front":
				if(arr[0]==0) {
					System.out.println(-1);
				}else {
					System.out.println(arr[0]);
					
					for(int i=0;i<=indexE;i++) {
						arr[i]=arr[i+1];
					}
					arr[indexE]=0;
					indexE--;
					
				}
				break;
			case "pop_back":
				if(indexE==0) {
					System.out.println(-1);
				}else {
					System.out.println(arr[indexE-1]);
					indexE--;
					arr[indexE]=0;
				}
				
				
				break;
			}
		}
		
	}

}
