package implement;
import java.util.Scanner;

public class B1212 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		String k =input.next();
		int length=k.length();
		
		if(k=="0"&&length==1) {
			System.out.println("0");
		}
		char[] k2=k.toCharArray();
		
		
		System.out.print(last(k2[0]));
		for(int i=1;i<length;i++) {
			System.out.print(trans(k2[i]));
		}
		
	}

	public static String last(char a) {
	    String result="";
	    if (a == '1') result = "1";
	    else if (a == '2') result = "10";
	    else if (a == '3') result = "11";
	    else if (a == '4') result = "100";
	    else if (a == '5') result = "101";
	    else if (a == '6') result = "110";
	    else if (a == '7') result = "111";
	    return result;
	}
	public static String trans(char a) {
	    String result="";
	    if (a == '0') result = "000";
	    else if (a == '1') result = "001";
	    else if (a == '2') result = "010";
	    else if (a == '3') result = "011";
	    else if (a == '4') result = "100";
	    else if (a == '5') result = "101";
	    else if (a == '6') result = "110";
	    else if (a == '7') result = "111";
	    return result;
	}
}
