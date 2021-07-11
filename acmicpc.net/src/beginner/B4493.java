package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4493 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int take=Integer.parseInt(br.readLine());
			int sum=0;
			while(take-->0) {
				String[] k=br.readLine().split(" ");
				
				sum+=RPS(k[0].charAt(0),k[1].charAt(0));
			}
			
			if(sum>0) {
				System.out.println("Player 1");
			}else if(sum<0) {
				System.out.println("Player 2");
			}else {
				System.out.println("TIE");
			}

			
		}

	}

	public static int RPS(char A,char B) {
		switch (A) {
		case 'R':
			if(B=='R') {
				return 0;
			}else if(B=='P') {
				return -1;
			}else {
				return 1;
			}
		case 'P':
			if(B=='R') {
				return 1;
			}else if(B=='P') {
				return 0;
			}else {
				return -1;
			}
			
		case 'S':
			if(B=='R') {
				return -1;
			}else if(B=='P') {
				return 1;
			}else {
				return 0;
			}
		}
		return 0;
	}
}
