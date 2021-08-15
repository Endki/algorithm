package lv1;

public class P12948 {

	public static void main(String[] args) {

		System.out.println(solution("027778888"));
	}
    public static String solution(String phone_number) {
        
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<phone_number.length();i++) {
        	if(i>=phone_number.length()-4) {
        		sb.append(phone_number.charAt(i));
        	}else {
        		sb.append("*");
        	}
        }
        
        return sb.toString();
    }
}
