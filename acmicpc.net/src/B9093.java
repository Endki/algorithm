import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B9093 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			StringBuilder sb=new StringBuilder();
			
			while(stz.hasMoreTokens()) {
				
				String k=stz.nextToken();
				Stack<Character> stack=new Stack<Character>();
				
				if(k.length()>1) {
					for(int i=0;i<k.length();i++) {
						stack.add(k.charAt(i));
					}
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
				}else {
					sb.append(k);
				}
				
				
				
				sb.append(" ");
				
				
				
			}
			System.out.println(sb.toString());
			
		}

	}

}
