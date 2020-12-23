package simulation;
import java.util.Arrays;
import java.util.Scanner;

public class B1592 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int m=input.nextInt();
		int l=input.nextInt();
		
		
		int[] arr=new int[n+1];

		
		arr[1]=1;
		int where=1;
		int num=0;
		while(arr[where]<m) {
			
			//Â¦¼ö
			if(arr[where]%2==0) {
				for(int i=0;i<l;i++) {
					where--;
					if(where<1) {
						where=n;
					}
				}
				
				arr[where]+=1;
				num++;
			}
			//È¦¼ö
			else {
				for(int i=0;i<l;i++) {
					where++;
					if(where>n) {
						where=1;
					}
				}
				arr[where]+=1;
				num++;
			}
		}
		System.out.println(num);
	}

}
