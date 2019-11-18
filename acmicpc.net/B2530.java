import java.util.Scanner;

public class B2530 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		int hour=input.nextInt();
		int min=input.nextInt();
		int sec=input.nextInt();
		int plussec=input.nextInt();


		sec+=plussec;

		min+=sec/60;
		sec%=60;

		hour+=min/60;
		min%=60;

		hour%=24;
		System.out.println(hour+" "+min+" "+sec);

	}

}
