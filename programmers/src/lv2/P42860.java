package lv2;

public class P42860 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int solution(String name) {
        int answer = 0;
        
        int min=name.length()-1;
        
        for(int i=0;i<name.length();i++) {
        	char c=name.charAt(i);
        	
        	int mov=(c-'A'<'Z' - c+1)? (c-'A'):('Z' -c +1);
        	answer +=mov;
        	
        	
            int next=i+1;
            
            
            while(next<name.length() && name.charAt(next)=='A') {
            	next++;
            }
            
            min=Math.min(min, (i*2)+name.length()-next);
        }
        
        

        
        
        return answer+=min;
    }
}
