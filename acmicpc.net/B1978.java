import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1978 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] k=br.readLine().split(" ");
		int[] mirrorK=new int[n];
		for(int i=0;i<n;i++) {
			mirrorK[i]=Integer.parseInt(k[i]);
		}
		
		int count=0;
		for(int i=0;i<n;i++) {
			int modCount=0;
			for(int j=1;j<=mirrorK[i];j++) {
				if(mirrorK[i]%j==0) {
					modCount++;
				}
				
				if(modCount>2) {
					break;
				}
			}
			if(modCount==2) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
