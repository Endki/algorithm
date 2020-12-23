package implement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char[][] arr=new char[8][8];
		
		for(int i=0;i<8;i++) {
			arr[i]=br.readLine().toCharArray();
		}
		int count=0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if((i+j)%2==0 && arr[i][j]!='.') {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
