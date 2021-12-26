package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2511 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int[] aArr=new int[10];
		
		for(int i=0;i<10;i++) {
			aArr[i]=Integer.parseInt(stz.nextToken());
		}
		
		stz=new StringTokenizer(br.readLine());
		
		int[] bArr=new int[10];
		
		for(int i=0;i<10;i++) {
			bArr[i]=Integer.parseInt(stz.nextToken());
		}
		
		int aWin=0;
		int bWin=0;
		

		for(int i=0;i<10;i++) {
			if(aArr[i]>bArr[i]) {
				aWin+=3;
			}else if(aArr[i]<bArr[i]) {
				bWin+=3;
			}else {
				aWin+=1;
				bWin+=1;
			}
		}
		
		System.out.println(aWin+" "+bWin);
		
		if(aWin>bWin) {
			System.out.println("A");
		}
		
		if(aWin<bWin) {
			System.out.println("B");
		}
		
		if(aWin==bWin) {
			for(int i=9;i>-1;i--) {
				if(aArr[i]>bArr[i]) {
					System.out.println("A");
					return;
				}else if(aArr[i]<bArr[i]) {
					System.out.println("B");
					return;
				}
			}
			System.out.println("D");
		}
		
	}

}
