package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B2804 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String a=input.next();
		String b=input.next();
		
		char[][] crossWard=new char[b.length()][a.length()];
		
		char[] aArr=a.toCharArray();
		char[] bArr=b.toCharArray();
		
		int x=0,y=0;
		boolean sWitch=true;
		
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				crossWard[j][i]='.';
				if(aArr[i]==bArr[j]&&sWitch==true) {
					sWitch=false;
					x=j;
					y=i;
				}
			}
		}
		
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				crossWard[x][i]=aArr[i];
				crossWard[j][y]=bArr[j];
			}
		}
		
		//예상 출력
		for(int i=0;i<b.length();i++) {
			for(int j=0;j<a.length();j++) {
				System.out.print(crossWard[i][j]);
			}
			System.out.println();
		}
		

	}

}
