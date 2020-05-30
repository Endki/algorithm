package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343 {
	static String result="";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String k=br.readLine();
		
		if(k.equals("X")) {
			System.out.println(-1);
			return;
		}
		
		char c;
		int count=0;
		
		for(int i=0;i<k.length();i++) {
			c=k.charAt(i);
			if(c=='X') {
				count++;
				if(i==k.length()-1) {
					if(count%2==1) {
						System.out.println(-1);
						return;
					}else {
						print(count);
					}
				}
			}else if( c=='.') {
				if(count%2==1) {
					System.out.println(-1);
					return;
					
				}else {
					print(count);
					result+=".";
					count=0;
				}
			}
		}
		
		
		
		System.out.println(result);
	}
	
    static void print(int size) {
        while (size > 0) {
            if (size >= 4) {
                result += "AAAA";
                size -= 4;
            } else {
                result += "BB";
                size -= 2;
            }
        }
    }
}
