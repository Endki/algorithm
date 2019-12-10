import java.util.Scanner;

public class B15904 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(solution(input.nextLine()));

	}


	public static String solution(String a) {
		char [] ucpc= {'U','C','P','C'};
		int count=0;

		for(int i=0;i<a.length();i++) {

			if(a.charAt(i)==ucpc[count]) {
				count++;
			}

			if(count==4) {
				return "I love UCPC";
			}

		}


		return "I hate UCPC";


	}
}
