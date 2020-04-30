package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B2783 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		int n=input.nextInt();
		
		double[] arr=new double[n+1];
		double[] arr2=new double[n+1];
		double[] arr3=new double[n+1];
		
		arr[0]=x;
		arr2[0]=y;
		
		arr3[0]=x/y*1000;
		
		for(int i=1;i<=n;i++) {
			arr[i]=input.nextDouble();
			arr2[i]=input.nextDouble();
			arr3[i]=arr[i]/arr2[i]*1000;
		}
		
		Arrays.parallelSort(arr3);;
		
		System.out.println(String.format("%.2f",arr3[0] ));

	}

}
