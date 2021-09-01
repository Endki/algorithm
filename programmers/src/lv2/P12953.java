package lv2;

public class P12953 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{2,6,8,14}));

	}
    public static int solution(int[] arr) {
        int answer = arr[0];
        
        
     
        
        for(int i=1;i<arr.length;i++) {
        	answer=lcm(answer,arr[i]);
        }
        
        
        return answer;
        
        
        
    }
    public static int gcd(int a,int b) {
  
    	while(b!=0) {
    		int temp=a%b;
    		a=b;
    		b=temp;
    	}
    	
    	return a;
    }
    public static int lcm(int a,int b) {
    	return (a*b)/gcd(a,b);
    }
}
