package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SW4366 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int TC=Integer.parseInt(br.readLine());
		
		for(int T=1;T<=TC;T++) {
			String two=br.readLine();
			String three=br.readLine();
		
			//자리수 배열
			char[] parseTwo=two.toCharArray(); 
			char[] parseThree=three.toCharArray();
			
			
			//10진수로 변환시 사용할 배열
			long[] arrTwo=new long[two.length()];
			long[] arrThree=new long[three.length()*2];
			
			
			
			//2진수 변환 과정  
			for(int i=0;i<two.length();i++) {
				StringBuilder sb=new StringBuilder();
				char[] parseTwo2=parseTwo.clone();
				
				if(parseTwo[i]=='1') {
					parseTwo2[i]='0';
				}else {
					parseTwo2[i]='1';
				}
				
				for(int j=0;j<parseTwo2.length;j++) {
					sb.append(parseTwo2[j]);
				}
				arrTwo[i]=Long.parseLong(sb.toString(), 2);
			}
			
			
			//3진수 변환 과정
			boolean swt=false;
			int index=0;
			for(int i=0;i<parseThree.length;) {
				StringBuilder sb=new StringBuilder();
				char[] parseThree2=parseThree.clone();
				
				//2를 1로
				if(parseThree[i]=='2' && !swt) {
					parseThree2[i]='1';
					swt=true;
				}
				//2를 0으로
				else if(parseThree[i]=='2' && swt) {
					parseThree2[i]='0';
					swt=false;
					i++;
				}
				
				//0를 1로
				else if(parseThree[i]=='0' && !swt) {
					parseThree2[i]='1';
					swt=true;
				}
				//0를 2로
				else if(parseThree[i]=='0' && swt) {
					parseThree2[i]='2';
					swt=false;
					i++;
				}
				//1를 2로
				else if(parseThree[i]=='1' && !swt) {
					parseThree2[i]='2';
					swt=true;
				}
				//1을 0으로
				else if(parseThree[i]=='1' && swt) {
					parseThree2[i]='0';
					swt=false;
					i++;
				}
				
				for(int j=0;j<parseThree2.length;j++) {
					sb.append(parseThree2[j]);
				}
				arrThree[index++]=Long.parseLong(sb.toString(), 3);
			}
			
			
			//output
			long answer=0;
			boolean flag=false;
			
			for(int i=0;i<arrTwo.length;i++) {
				if(flag) {
					break;
				}
				for(int j=0;j<arrThree.length;j++) {
					if(arrTwo[i]==arrThree[j]) {
						answer=arrTwo[i];
						flag=true;;
					}
				}
			}
			System.out.println("#"+T+" "+answer);
		}

	}

}
