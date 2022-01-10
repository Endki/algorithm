package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비밀메뉴 {

	 public static void main(String args[]) throws IOException
	    {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	        StringBuilder sb=new StringBuilder();

	        StringTokenizer stz=new StringTokenizer(br.readLine());

	        int M=Integer.parseInt(stz.nextToken());
	        int N=Integer.parseInt(stz.nextToken());
	        int K=Integer.parseInt(stz.nextToken());

	        stz=new StringTokenizer(br.readLine());

	        for(int i=0;i<M;i++){
	            sb.append(stz.nextToken());
	        }
	        String pswd=sb.toString();
	        stz=new StringTokenizer(br.readLine());
	        sb.setLength(0);
	        for(int i=0;i<N;i++){
	            sb.append(stz.nextToken());
	        }

	        if(sb.toString().contains(pswd)){
	            System.out.println("secret");
	        }else{
	            System.out.println("normal");
	        }


	    }
}
