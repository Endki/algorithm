import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int h=input.nextInt();
		int m=input.nextInt();
		
		int min=h*60+m-45;
		
		h=min/60;
		m=min%60;
		
		
		if(m<0) {
			h=23;
			m+=60;
		}
		
		System.out.println(h+" "+m);
	}

}
