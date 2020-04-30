package implement;
import java.util.Scanner;

public class B9625 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array= new int[46];
		
		int K=input.nextInt();
		
		array[0]=0;
		array[1]=1;
		array[2]=1;
		
		for(int i=3;i<K+1;i++) {
			array[i]=array[i-2]+array[i-1];
		}
		System.out.println(array[K-1]+" "+array[K]);
		
	}
	
	
	
	/*
	 * public static int fiboB(int k) {
	 * 
	 * if(k==0) { return 0; }else if(k==1) { return 1; }else {
	 * k=fiboB(k-2)+fiboB(k-1); }
	 * 
	 * 
	 * 
	 * return k; } public static int fiboA(int k) {
	 * 
	 * if(k==0) { return 1; }else if(k==1) { return 0; }else {
	 * k=fiboA(k-2)+fiboA(k-1); }
	 * 
	 * 
	 * 
	 * return k; }
	 */
}
