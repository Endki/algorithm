import java.util.Scanner;

public class B15953 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int t=input.nextInt();
		
		for(int i=0;i<t;i++) {
			int a=codeOne(input.nextInt());
			int b=codeTwo(input.nextInt());
			
			System.out.println(a+b);
		}

	}
	public static int codeOne(int a) {
		if(a==1) {
			return 5000000;
		}else if(a==2 || a==3) {
			return 3000000;
		}else if(a==4 || a==5 || a==6) {
			return 2000000;
		}else if(a==7 || a==8 || a==9 || a== 10) {
			return 500000;
		}else if(a==11 || a==12 || a==13 || a==14 || a==15) {
			return 300000;
		}else if(a==16 || a==17 || a==18 || a==19 || a==20 || a==21) {
			return 100000;
		}else {
			return 0;
		}	
	}
	
	public static int codeTwo(int a) {
		if(a==1) {
			return 5120000;
		}else if(a==2 || a==3) {
			return 2560000;
		}else if(a==4 || a==5 || a==6 || a==7) {
			return 1280000;
		}else if(a==8 || a==9 || a==10 || a== 11 || a==12 || a==13 || a==14 || a==15 ){
			return 640000;
		}else if(a==16 || a==17 || a==18 || a==19 || a==20 || a==21 || a==22 || a==23 || a==24 || a==25 || a==26 || a==27 || a==28 || a==29 || a==30 || a==31) {
			return 320000;
		}else {
			return 0;
		}	
		
	}
}
