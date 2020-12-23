package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9517 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int k=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		
		int time=210;
		StringTokenizer stz;
		while(true) {
			stz=new StringTokenizer(br.readLine());
			int t=Integer.parseInt(stz.nextToken());
			String z=stz.nextToken();
			
			time-=t;
			if(time<0) {
				break;
			}
			if(z.equals("T")) {
				if(k==8) {
					k=1;
				}else {
					k++;
				}
			}
			
			
			
			
			
		}
		System.out.println(k);
		

	}

}
