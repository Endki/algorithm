import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {

	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int count=0;
		
		
		if(n%5==0) {
			count=n/5;
		}else if(n%5==1) {
			count=n/5+1;
		}else if(n%5==2 && n>=12) {
			count=n/5+2;
		}else if(n%5==3) {
			count=n/5+1;
		}else if(n%5==4 && n>=9) {
			count=n/5+2;
		}else {
			count=-1;
		}
		
		System.out.println(count);
	}
	

}
