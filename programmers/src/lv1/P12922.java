package lv1;

public class P12922 {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	
	public static String solution(int n) {
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				sb.append("수");
			}else {
				sb.append("박");
			}
		}
		
		
		return sb.toString();
	}

}
