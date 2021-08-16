package lv1;

public class P12919 {

	public static void main(String[] args) {
		

	}
    public static String solution(String[] seoul) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		sb.append("김서방은 ").append(i).append("에 있다");
        		return sb.toString();
        	}
        }
        return answer;
    }
}
