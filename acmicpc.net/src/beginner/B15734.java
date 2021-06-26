package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15734 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int leftLeg=Integer.parseInt(stz.nextToken());
		int rightLeg=Integer.parseInt(stz.nextToken());
		int everyLeg=Integer.parseInt(stz.nextToken());
		
		
		while(everyLeg!=0) {
			if(leftLeg>rightLeg) {
				rightLeg++;
				everyLeg--;
			}else if(leftLeg<rightLeg){
				leftLeg++;
				everyLeg--;
			}else {
				if(everyLeg>=2) {
					leftLeg++;
					rightLeg++;
					everyLeg-=2;
				}else {
					break;
				}
			}

		}
		
		System.out.println(Math.min(rightLeg, leftLeg)*2);
		
	}

}
