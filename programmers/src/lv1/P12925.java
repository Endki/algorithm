package lv1;

public class P12925 {

	public static void main(String[] args) {
		System.out.println(solution("1234"));

	}
    public static int solution(String s) {
        String temp="";
        if(s.charAt(0)=='-') {
        	temp=s.substring(1);
        	return -1*(Integer.parseInt(temp));
        }else if(s.charAt(0)=='+') {
        	temp=s.substring(1);
        	return Integer.parseInt(temp);
        }
        
        
        return Integer.parseInt(s);
    }
}
