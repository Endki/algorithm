package data.structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class B1620 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input=br.readLine().split(" ");
		
		Map<String,String> poket=new HashMap<>();
		
		
		int n=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		
		for(int i=0;i<n;i++) {
			String pocketName=br.readLine();
			String pocketNum=Integer.toString(i+1);
			
			poket.put(pocketName,pocketNum );
			poket.put(pocketNum, pocketName);
			
			
		}
		for(int i=0;i<m;i++) {
			bw.append(poket.get(br.readLine())+"\n");
			
		}
		bw.flush();
	}

}
