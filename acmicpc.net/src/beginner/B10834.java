package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10834 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//벨트 형태에 따라 0은 정방향 회전 즉 + 
		//1은 역방향 회전 즉 -
		// 벨트 회전수랑 형태를 던져주면 마지막 결과물을 return 해라
		
		
		int M=Integer.parseInt(br.readLine());
		
		
		long count=1;
		
		
		int flag=0;
		for(int i=0;i<M;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			long a=Integer.parseInt(stz.nextToken());
			long b=Integer.parseInt(stz.nextToken());
			int c=Integer.parseInt(stz.nextToken());
			
			count=count*b/a;
			
			
			flag+=c;
		}
		
		
		System.out.println(flag%2+" "+count);
		
		
	
		

	}

}
