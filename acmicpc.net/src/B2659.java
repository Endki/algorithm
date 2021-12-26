import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(stz.nextToken());
		int b=Integer.parseInt(stz.nextToken());
		int c=Integer.parseInt(stz.nextToken());
		int d=Integer.parseInt(stz.nextToken());
		
		
		
		int min=getMin(a,b,c,d);
		
		
		boolean[] check=getCheck();
		
		
		
		
		int count=0;
		for(int i=1111;i<=min;i++) {
			if(check[i]) {
				count++;	
			}
					
		}
		
		System.out.println(count);
	}

	public static boolean[] getCheck() {
		boolean[] check=new boolean[10000];
		
		for(int a=1;a<10;a++) {
			for(int b=1;b<10;b++) {
				for(int c=1;c<10;c++) {
					for(int d=1;d<10;d++) {
						int min=getMin(a,b,c,d);
						
						if(!check[min]) {
							check[min]=true;
						}

					}
				}
			}
		}
		
		return check;
	}
	
	
	public static int getMin(int a,int b,int c,int d) {
		int min=9999;
		
		min=Math.min(min, a*1000+b*100+c*10+d);
		min=Math.min(min, b*1000+c*100+d*10+a);
		min=Math.min(min, c*1000+d*100+a*10+b);
		min=Math.min(min, d*1000+a*100+b*10+c);		
		
		
		
		return min;
	}
}
