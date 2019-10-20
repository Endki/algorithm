import java.util.Scanner;

public class B6321 {

	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);

		int num=br.nextInt();

		

		for(int i=0;i<num;i++) {
			String input = br.next();
			String[] STMP = input.split("");
			System.out.println("String #" + (i + 1));
			
			for (int j = 0; j < STMP.length; j++) {
				char tmp = STMP[j].charAt(0);
				tmp += 1;
				if (tmp == 91) {
					tmp = 65;
				}
				System.out.print(tmp);
			}
			System.out.println();
			System.out.println();
		}
	}

}
