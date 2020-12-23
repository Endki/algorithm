package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1259 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr;
		int n=-1;
		int pivot=0;
		boolean swt=false;
		
		while(true) {
			
			String k=br.readLine();
			int len=k.length();
			arr=new int[len];
			if(k.equals("0")) {
				break;
			}
			if(len%2==0) {
				pivot=(len/2);
				swt=true;
				
				for(int i=0;i<pivot;i++) {
					arr[i]=k.charAt(i)-48;
				}
				
				for(int i=pivot;i<len;i++) {
					if((k.charAt(i)-48)!=arr[(len-i)-1]) {
						swt=false;
					}
				}	
				
			}else {
				
				pivot=(len/2);
				swt=true;
				
				for(int i=0;i<pivot;i++) {
					arr[i]=k.charAt(i)-48;
				}
				
				for(int i=pivot+1;i<len;i++) {
					if((k.charAt(i)-48)!=arr[(len-i)-1]) {
						swt=false;
					}
				}	
				
			}
			
			if(swt) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
			
			
			
		}
		
		
	}

}
