package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1094 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

		int x=Integer.parseInt(br.readLine());
		
		int sixFour=64;
		
		int temp=0;
		int temp2=x;
		int count=0;
		
		if(x==64) {
			System.out.println("1");
			return;
		}
		
		while(true) {
			sixFour=sixFour/2;
			
			if(x>=sixFour) {
				temp+=sixFour;
				count++;
				if(temp2==temp) {
					break;
				}
				x-=sixFour;
			}
		}
		System.out.println(count);
	
		
	}

}
