import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		int sum=a*b*c;
		
		int[] count=new int[10];
		
		String k=Integer.toString(sum);
		
		char k1;
		
		
		
		for(int i=0;i<k.length();i++) {
			k1=k.charAt(i);
			
			switch(k1) {
			case '0':
				count[0]+=1;
				break;
			case '1':
				count[1]+=1;
				break;
			case '2':
				count[2]+=1;
				break;
			case '3':
				count[3]+=1;
				break;
			case '4':
				count[4]+=1;
				break;
			case '5':
				count[5]+=1;
				break;
			case '6':
				count[6]+=1;
				break;
			case '7':
				count[7]+=1;
				break;
			case '8':
				count[8]+=1;
				break;
			case '9':
				count[9]+=1;
				break;
			}
		}
	
			for(int i=0;i<10;i++) {
				System.out.println(count[i]);
			}
		
	}

}
