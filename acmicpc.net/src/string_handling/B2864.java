package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2864 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		String a=stz.nextToken();
		String b=stz.nextToken();
		
		
		String tempMaxA=a.replaceAll("5", "6");
		String tempMaxB=b.replace("5", "6");
		
		String tempMinA=a.replace("6", "5");
		String tempMinB=b.replace("6", "5");
		
		int MaxA=Integer.parseInt(tempMaxA);
		int MaxB=Integer.parseInt(tempMaxB);
		
		int MinA=Integer.parseInt(tempMinA);
		int MinB=Integer.parseInt(tempMinB);
		
		System.out.print((MinA+MinB)+" "+(MaxA+MaxB));
	}

}
