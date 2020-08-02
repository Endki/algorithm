package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2805 {

	public static void main(String[] args) throws IOException{
	
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        int tc = Integer.parseInt(br.readLine());
        for(int t=1; t<=tc; t++) {
            int n = Integer.parseInt(br.readLine());
            int sum=0;
            for(int i=n/2; i>=0; i--) {
                String input = br.readLine();
                for(int j=i; j<n-i; j++) {
                    sum += input.charAt(j)-'0';
                }
            }
            for(int i=1; i<=n/2; i++) {
                String input = br.readLine();
                for(int j=i; j<n-i; j++) {
                    sum += input.charAt(j)-'0';
                }
            }
            System.out.println("#" + t + " " + sum);
        }
	}

}
