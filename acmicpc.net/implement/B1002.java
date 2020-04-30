package implement;
import java.util.Scanner;

public class B1002 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int T=input.nextInt();
		int x1=0,y1=0,r1=0;
		int x2=0,y2=0,r2=0;
		
		
		for(int i=0;i<T;i++) {
			x1=input.nextInt();
			y1=input.nextInt();
			r1=input.nextInt();
			x2=input.nextInt();
			y2=input.nextInt();
			r2=input.nextInt();
		
		
		int dx=x1-x2;
		int dy=y1-y2;
		
		int tmp;
		if(r1>r2) {
			tmp=r1;
			r1=r2;
			r2=tmp;
		}

		int add= r1+r2;
		add=add*add;
		int sub=r2-r1;
		sub=sub*sub;
		int d=dx*dx + dy*dy;
		
		if(sub<d && d<add) {
			System.out.println(2);
		}else if(d==add || (d==sub && d!=0)) {
			System.out.println(1);
		}else if(d<sub ||d>add) {
			System.out.println(0);
		}else if(d==0) {
			if(r1==r2) {
				System.out.println(-1);
			}else {
				System.out.println(0);
			}
		}
	}}

}
