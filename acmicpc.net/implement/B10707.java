package implement;
import java.util.Scanner;

public class B10707 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int A=input.nextInt(); // X���� 1���ʹ� ���
		int B=input.nextInt(); // Y���� �⺻���
		int C=input.nextInt(); // Y���� ���� C
		int D=input.nextInt(); // Y���� ���ʹ� �߰����
		int P=input.nextInt(); // �Ѵް� ������ ��
		
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
