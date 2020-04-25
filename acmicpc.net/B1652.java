import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1652 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		char[][] arr=new char[n][n];
	
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine().toCharArray();
		}
		int countX=0;
		for(int i=0;i<n;i++) {
			int count=0;
			
			for(int j=0;j<n;j++) {
				if(arr[i][j]=='.') {
					count++;
				}else {
					if(count>1) {
						countX++;
					}
					count=0;
				}
			}
			if(count>1) {
				countX++;
			}
		}
		
		int countY=0;
		for(int j=0;j<n;j++) {
			int count=0;
			for(int i=0;i<n;i++) {
				if(arr[i][j]=='.') {
					count++;
				}else {
					if(count>1) {
						countY++;
					}
					count=0;
				}
				
			}
			if(count>1) {
				countY++;
			}
			
		}
		System.out.println(countX+" "+countY);
	}


}
