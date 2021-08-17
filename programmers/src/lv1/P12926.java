package lv1;

public class P12926 {

	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));

	}
    public static String solution(String s, int n) {
        StringBuilder sb=new StringBuilder();
        
        
        for(int i=0;i<s.length();i++) {
        	char input=s.charAt(i);
        	int index=n;
        	
        	if(input>='A' && input<='Z') {
        		while(index-->0) {
        			if(input+1>'Z') {
        				input='A';
        			}else {
        				input++;
        			}
        		}
        		
        		sb.append((char)input);
        		
        	}else if(input==' ') {
        		sb.append(' ');
        	}else {
        		while(index-->0) {
        			
        			if(input+1>'z') {
        				input='a';
        			}else {
        				input++;
        			}
        		}
        		sb.append((char)input);
        	}
        }
        return sb.toString();
    }
}
