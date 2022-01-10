package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S626 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int M=Integer.parseInt(stz.nextToken());
		
		String[] nameTag=new String[N];
		HashMap<String, boolean[]> map=new HashMap<String, boolean[]>();
		
		
		for(int i=0;i<N;i++) {
			String name=br.readLine();
			nameTag[i]=name;
			boolean[] sc=new boolean[25];
			for(int j=0;j<9;j++) {
				sc[j]=true;
			}
			for(int j=19;j<24;j++) {
				sc[j]=true;
			}
			
			map.put(name, sc);
		}
		
		for(int i=0;i<M;i++) {
			stz=new StringTokenizer(br.readLine());
			String name=stz.nextToken();
			int startTime=Integer.parseInt(stz.nextToken());
			int endTime=Integer.parseInt(stz.nextToken());
			
			boolean[] schedule=map.get(name);
			for(int j=startTime;j<endTime;j++) {
				schedule[j]=true;
			}
			map.put(name, schedule);
		}
		
		Arrays.sort(nameTag);
		
		for(int i=0;i<N;i++) {
			boolean[] schedule=map.get(nameTag[i]);
			
			StringBuilder sb=new StringBuilder();
			ArrayList<String> output=new ArrayList<String>();
			
			sb.append("Room ").append(nameTag[i]).append(":");
			System.out.println(sb.toString());
			sb.setLength(0);
			
			String startTime="0";
			for(int j=9;j<=18;j++) {
				if(!schedule[j] && startTime.equals("0")) {
					if(j==9) {
						startTime="09";
					}else if(j==18) {
						continue;
					}
					else {
						startTime=Integer.toString(j);
					}
				}
				
				if(!startTime.equals("0") && !schedule[j] && schedule[j+1]) {
					if(j==18) {
						output.add(startTime+"-"+Integer.toString(j));
					}else {
						output.add(startTime+"-"+Integer.toString(j+1));
					}
					startTime="0";
				}
			}
			
			if(output.isEmpty()) {
				System.out.println("Not available");
			}else {
				System.out.println(output.size()+" available:");
				for(int j=0;j<output.size();j++) {
					System.out.println(output.get(j));
				}
			}
			if(i!=N-1) {
				System.out.println("-----");
			}
			
		}
		
		
	}

}
