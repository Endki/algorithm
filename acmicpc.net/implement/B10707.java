package implement;
import java.util.Scanner;

public class B10707 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int A=input.nextInt(); // X사의 1리터당 요금
		int B=input.nextInt(); // Y사의 기본요금
		int C=input.nextInt(); // Y사의 상한 C
		int D=input.nextInt(); // Y사의 리터당 추가요금
		int P=input.nextInt(); // 한달간 수도의 양
		
		int Xsum=A*P;
		int Ysum=0;
		if(C>=P) {
			Ysum=B;
		}else {
			Ysum=B+D*(P-C);
		}
		
		if(Xsum>=Ysum) {
			System.out.println(Ysum);
		}else {
			System.out.println(Xsum);
		}
		
	}

}
