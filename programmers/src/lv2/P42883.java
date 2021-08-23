package lv2;

public class P42883 {

	public static void main(String[] args) {
		System.out.println(solution("1924", 2));

	}
    public static String solution(String number, int k) {
        
        StringBuilder sb=new StringBuilder();
        
        
        if(number.charAt(0)=='0') {
        	return "0";
        }
        
        int index=0;
        char max;
        for(int i=0;i<number.length()-k;i++) {
        	max='0';
        	for(int j=index;j<=k+i;j++) {
        		if(max<number.charAt(j)) {
        			max=number.charAt(j);
        			index=j+1;
        		}
        	}
        	
        	sb.append(max);
        }
        
        
        return sb.toString();
    }
    
    
}
