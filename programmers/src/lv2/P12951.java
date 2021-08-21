package lv2;

public class P12951 {

	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
		System.out.println(solution("aaaaa aaa"));
	}
    public static String solution(String s) {
    	
    	
        
        //대문자 65~90  
        //소문자 97~122
        //각 소문자에 -32해주면 됨
        StringBuilder sb=new StringBuilder();
        
        String pre=String.valueOf(s.charAt(0));
        sb.append(pre.toUpperCase());
        
        for(int i=1;i<s.length();i++) {
        	String now=String.valueOf(s.charAt(i));
        	
        	if(now.equals(" ")) {
        		sb.append(" ");
        	}else if (s.charAt(i - 1) == ' ') { // 전 문자열이 공백이면
                sb.append(now.toUpperCase()); // 대문자
            } else {
              sb.append(now.toLowerCase()); // 소문자
            }
        }
        
        
        return sb.toString();
    }
}
