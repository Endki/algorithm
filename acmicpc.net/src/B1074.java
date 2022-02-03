import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1074 {
	
	static int count=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(stz.nextToken());
		int r=Integer.parseInt(stz.nextToken());
		int c=Integer.parseInt(stz.nextToken());
		
		int size=(int)Math.pow(2, N);
		
		recursive(size, r,c);
		
		System.out.println(count);
	}

	public static void recursive(int size,int r,int c) {
		if(size==1) {
			return;
		}
		
		
		if(r<size/2 && c<size/2) {
			recursive(size/2, r, c);
		}else if(r<size/2 && c>=size/2) {
			count+=size*size/4;
			recursive(size/2, r, c-size/2);
		}else if(r>=size/2 && c<size/2) {
			count+=(size*size/4) * 2;
			recursive(size/2, r-size/2, c);
		}else if(r>=size/2 && c>=size/2) {
			count+=(size*size/4)*3;
			recursive(size/2, r-size/2, c-size/2);
		}
	}
}
