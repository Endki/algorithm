import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String k=input.next();
		String[] arrK=new String[(k.length()/10)+1];
		int count=0;
		int temp=0;
		
		for(int i=0;i<k.length();i++) {
			count++;
			if(count==10) {
				arrK[temp]=k.substring(i-9, i+1);
				temp++;
				count=0;
			}else if(i==k.length()-1){
				arrK[temp]=k.substring(i-(k.length()%10)+1,k.length());
			}
		}
		
		for(int i=0;i<arrK.length;i++) {
			if(arrK[i]==null) {
				continue;
			}else {
				System.out.println(arrK[i]);
			}
		}
	}

}
