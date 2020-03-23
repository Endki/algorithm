import java.util.Scanner;

public class B5612 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int count=input.nextInt();
		
		boolean check=true;
		
		int max=0;
		for(int i=0;i<n;i++) {
			count+=input.nextInt();
			count-=input.nextInt();
			
			if(count>max) {
				max=count;
			}
			if(count<0) {
				check=false;
			}
		}
		
		if(check==false) {
			System.out.println("0");
		}else {
		System.out.println(max);
		}
	}

}
