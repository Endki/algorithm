package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1173 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int[] input=new int[5];
		for(int i=0;i<5;i++) {
			input[i]=Integer.parseInt(stz.nextToken());
		}
		int count=0;
		int heartBeat=input[1];
		if(input[1]+input[3]>input[2]) {
			System.out.println("-1");
			return;
		}
		else {
		while(input[0]>0) {

			if(heartBeat+input[3]<=input[2]) {
				count++;
				input[0]--;
				heartBeat+=input[3];
			}else{
				
				count++;
				heartBeat-=input[4];
				if(heartBeat<input[1]) {
					heartBeat=input[1];
				}
			}
			
			
		}
		
		System.out.println(count);
		}
		
		
		
		
	}

}
