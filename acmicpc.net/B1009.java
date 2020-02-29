import java.util.Scanner;

public class B1009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int j = input.nextInt();
			int k = input.nextInt();

			j=j%10;
			switch (j) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				if(k%4==0) {
					System.out.println("6");
				}else if(k%4==1) {
					System.out.println("2");
				}else if(k%4==2) {
					System.out.println("4");
				}else if(k%4==3) {
					System.out.println("8");
				}
				break;
			case 3:
				if(k%4==0) {
					System.out.println("1");
				}else if(k%4==1) {
					System.out.println("3");
				}else if(k%4==2) {
					System.out.println("9");
				}else if(k%4==3) {
					System.out.println("7");
				}
				break;
			case 4:
				if(k%2==0) {
					System.out.println("6");
				}else if(k%2==1) {
					System.out.println("4");
				}
				break;
			case 5:
				System.out.println("5");
				break;
			case 6:
				System.out.println("6");
				break;
			case 7:
				if(k%4==0) {
					System.out.println("1");
				}else if(k%4==1) {
					System.out.println("7");
				}else if(k%4==2) {
					System.out.println("9");
				}else if(k%4==3) {
					System.out.println("3");
				}
				break;
			case 8:
				if(k%4==0) {
					System.out.println("6");
				}else if(k%4==1) {
					System.out.println("8");
				}else if(k%4==2) {
					System.out.println("4");
				}else if(k%4==3) {
					System.out.println("2");
				}
				break;
			case 9:
				if(k%2==0) {
					System.out.println("1");
				}else if(k%2==1) {
					System.out.println("9");
				}
				break;
			case 0:
				System.out.println("10");
				break;
			}

		}

	}

}
