package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B10040 {

	public static void main(String[] args) {
	
		
		Scanner input= new Scanner(System.in);
		
		
		int N=input.nextInt();
		int M=input.nextInt();
		
		int[] play=new int[N];
		int[] choice=new int[M];
		int[] count=new int[N];
		
		/*
		 * Arrays.fill(play, 0); Arrays.fill(choice, 0);
		 */
		
		for(int i=0;i<N;i++) {
			play[i]=input.nextInt();
			count[i]=0;
		}
		
		
	
		for(int i=0;i<M;i++) {
			choice[i]=input.nextInt();
		}
		
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(play[j]<=choice[i]) {
					count[j]+=1;
					break;
				}
				
			}
		}
		int max=0;
		int index=0;
		for(int i=0;i<N;i++) {
			if(count[i]>max) {
				max=count[i];
				index=i+1;
				
			}
		}
		
		System.out.println(index);
	}

}
