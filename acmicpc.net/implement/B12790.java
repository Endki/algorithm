package implement;
import java.util.Scanner;

public class B12790 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		int numChar=input.nextInt();
		
		
		for(int i=0; i< numChar; i++) {
			int hp=input.nextInt();
			int mp=input.nextInt();
			int dmg=input.nextInt();
			int def=input.nextInt();
			
			int uphp=input.nextInt();
			int upmp=input.nextInt();
			int updmg=input.nextInt();
			int updef=input.nextInt();
			
			int sumhp=hp+uphp;
			int summp=mp+upmp;
			int sumdmg=dmg+updmg;
			int sumdef=def+updef;
			
			if(sumhp<1) {
				sumhp=1;
			}
			if(summp<1) {
				summp=1;
			}
			
			if(sumdmg<1) {
				sumdmg=0;
			}
			
			System.out.println(sumhp+5*summp+2*sumdmg+2*sumdef);
			
		}
		
		
		

	}

}
