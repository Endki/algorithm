import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2966 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());

		char[] Adrian = {'A','B','C','A','B','C','A','B','C','A','B','C'};
	    char[] Bruno = {'B','A','B','C','B','A','B','C','B','A','B','C'};
	    char[] Goran = {'C','C','A','A','B','B','C','C','A','A','B','B'};
	    
	    String temp=br.readLine().toUpperCase();

		
		int num=0;
		int[] arr=new int[3];
		for(int i=0;i<N;i++) {
			if(num%12==0) {
				num=0;
			}
			if(temp.charAt(i)==Adrian[num]) {
				arr[0]++;
			}
			if(temp.charAt(i)==Bruno[num]) {
				arr[1]++;
			}
			if(temp.charAt(i)==Goran[num]) {
				arr[2]++;
			}
			num++;
		}
		
		int max=-1;
		for(int i=0;i<3;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		for(int i=0;i<3;i++) {
			if(arr[i]==max) {
				switch (i) {
				case 0:
					System.out.println("Adrian");	
					break;
				case 1:
					System.out.println("Bruno");	
					break;
				case 2:
					System.out.println("Goran");	
					break;

				}
			}
		}
	}

}
