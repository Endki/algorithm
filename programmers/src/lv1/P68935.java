package lv1;

public class P68935 {

	public static void main(String[] args) {
		System.out.println(solution(45));

	}
    public static int solution(int n) {
        int answer = 0;
        
        
        String k=Integer.toString(n, 3);
        StringBuilder sb=new StringBuilder();
        
        for(int i=k.length()-1;i>-1;i--) {
        	sb.append(k.charAt(i));
        }
        
        answer = Integer.parseInt(sb.toString(), 3);
        
        
        return answer;
    }
}
