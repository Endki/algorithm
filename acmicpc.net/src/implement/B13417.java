package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B13417 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 
		 int t=input.nextInt();
		 
		 String k;
		 
		 
		 
		 for(int i=0;i<t;i++) {
			 int t2=input.nextInt();
		
			 char[] m=new char[t2];
			 for(int j=0;j<t2;j++) {
				 k=input.next();
				 m[j]=k.charAt(0);
				 
			 }
			 
			 
			 
			 char[] n=new char[t2];
			 
			 
			 n[0]=m[0];
			 char tmp;
			 
			 for(int j=1;j<t2;j++) {
				 //앞에
				 
				 if(n[0]-'0'>=m[j]-'0') {
					for(int z=j;z>0;z--) {
						
						n[z]=n[z-1];	
						
					}
					n[0]=m[j];
				 }
				 //뒤에
				 else {
					 n[j]=m[j];
				 }
			 }
			 
			 for(int j=0;j<n.length;j++) {
				 System.out.print(n[j]);
			 }
			 System.out.println();
		 }
		 

	}

}
