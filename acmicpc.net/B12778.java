import java.util.Scanner;

public class B12778 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);


		char[] C=new char[501];
		int[] N=new int[501];

		
//		System.out.println((char)('A'+1));


		int casenum=input.nextInt();
		for(int i=0;i<casenum;i++) {

			int num=input.nextInt();
			char gubun=input.next().charAt(0);


			//알파벳 -> 숫자
			if(gubun=='C') {

				for(int j=0;j<num;j++) {

					C[j]=input.next().charAt(0);
				}
				for(int k=0;k<num;k++) {
					System.out.print((int)C[k]-64+" ");
				}
			}

			//숫자 -> 알파벳
			else {
				for(int j=0;j<num;j++) {

					N[j]=input.nextInt();
				}
				for(int k=0;k<num;k++) {
					System.out.print((char)(N[k]+64)+" ");
				}

			}
			System.out.println();
			}
		}

	}
