import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1357 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		String[] input=br.readLine().split(" ");
		char[] x=input[0].toCharArray();
		char[] y=input[1].toCharArray();
		
		for(int i=x.length-1;i>=0;i--) {
			sb.append(x[i]);
		}
		int a=Integer.parseInt(sb.toString());
		sb.setLength(0);
		for(int i=y.length-1;i>-1;i--) {
			sb.append(y[i]);
		}
		int b=Integer.parseInt(sb.toString());
		int sum=a+b;
		sb.setLength(0);
		
		char[] output=String.valueOf(sum).toCharArray();
		for(int i=output.length-1;i>-1;i--) {
			sb.append(output[i]);
		}
		int solve=Integer.parseInt(sb.toString());
		
		System.out.println(solve);
		
	}

}
