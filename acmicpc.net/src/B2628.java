import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B2628 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		
		
		
		int width=Integer.parseInt(stz.nextToken());
		int height=Integer.parseInt(stz.nextToken());
		
		int N=Integer.parseInt(br.readLine());
		
		ArrayList<Integer> garo=new ArrayList<Integer>();
		ArrayList<Integer> sero=new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			stz=new StringTokenizer(br.readLine());
			
			int flag=Integer.parseInt(stz.nextToken());
			int line=Integer.parseInt(stz.nextToken());
			
			if(flag==1) {
				sero.add(line);
			}else {
				garo.add(line);
			}
		}
		
		Collections.sort(garo);
		Collections.sort(sero);
		
		int H=0;
		int start=0;
		for(int i=0;i<sero.size();i++) {
			if(sero.get(i)-start>H) {
				H=sero.get(i)-start;
			}
			start=sero.get(i);
		}
		
		if(width-start>H) {
			H=width-start;
		}

		int W=0;
		start=0;
		
		for(int i=0;i<garo.size();i++) {
			if(garo.get(i)-start>W) {
				W=garo.get(i)-start;
			}
			start=garo.get(i);
		}
		
		if(height-start>W) {
			W=height-start;
		}
		System.out.println(W*H);
	}

}
