import java.util.Scanner;

public class B5532 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double L=input.nextDouble();
		double A=input.nextDouble();
		double B=input.nextDouble();
		double C=input.nextDouble();
		double D=input.nextDouble();
		
		double max=0;
		double math=Math.ceil(B/D);
		double korean=Math.ceil(A/C);
		
		
		if((int)math<(int)korean) {
			System.out.println((int)L-(int)korean);
		}else {
			System.out.println((int)L-(int)math);
		}
		
		
	}

}
