import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10101 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int[] arr=new int[3];
		int sum=0;
		for(int i=0;i<3;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		
		
		
		if(arr[0]==60 && arr[0]==arr[1] && arr[1]==arr[2]) {
			System.out.println("Equilateral");
		}else if(sum==180 && (arr[0]==arr[1] || arr[1]==arr[2] || arr[0]==arr[2])) {
			System.out.println("Isosceles");
		}else if(sum==180 && (arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2])) {
			System.out.println("Scalene");
		}else {
			System.out.println("Error");
		}
		
		
		
		
	}
	

}
