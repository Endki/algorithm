package implement;
import java.util.Scanner;

public class B10708 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int m=input.nextInt();
		int[] target=new int[m];
		int[] point=new int[n];
		int[] temp=new int[n];
		
		for(int i=0;i<target.length;i++) {
			target[i]=input.nextInt();
		}
		int l=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				temp[j]=input.nextInt();	
			}
			
			
			int count=n;
			for(int j=0;j<n;j++) {
				if(temp[j]==target[i]) {
					count-=1;
					point[j]+=1;
				}
				
			}
			
			point[target[i]-1]+=count;
			
		}
		
		for(int i=0;i<point.length;i++) {
			System.out.println(point[i]);
		}
	}

}
