package lv1;

public class P12930 {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));

	}
    public static String solution(String s) {
    	StringBuilder sb=new StringBuilder();
    	
    	String[] k=s.split("");
    	
    	int count=0;
    	for(String input : k) {
    		count = input.contains(" ") ? 0 : count+1;
    		
    		if(count%2==0) {
    			sb.append(input.toLowerCase());
    		}else {
    			sb.append(input.toUpperCase());
    		}
    	}
    	
    	
        return sb.toString();
    }

}
