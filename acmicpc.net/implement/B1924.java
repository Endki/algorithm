package implement;
import java.util.Scanner;

public class B1924 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
	
		for (int i = 2; i <= x; i++) {
			if (i == 5 || i == 7 || i == 10 || i == 12) {
				y += 30;
			} else if (i == 3) {
				y += 28;
			}else {
				y+=31;
			}
		}
		int tmp=y%7;
		
		
		switch (tmp) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}

	}

}
