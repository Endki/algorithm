package implement;
import java.util.Scanner;

public class B2851 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] arr=new int[10];
		
		int sum=0;
		int sum2=0;
		
		int tmp=0,tmp2=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			sum2=sum;
			if(sum>=100) {
				sum2-=arr[i];
				break;
			}
		}
		
		tmp=Math.abs(100-sum);
		tmp2=Math.abs(100-sum2);
		
		if(tmp<=tmp2) {
			System.out.println(sum);
		}else {
			System.out.println(sum2);
		}
		
	}

}
