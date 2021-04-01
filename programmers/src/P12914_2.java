
public class P12914_2 {

	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(4));
		System.out.println(solution(3));
		

	}
	
    static public long solution(int n) {
        if(n==1) {
        	return 1;
        }
        
        int[] arr=new int[n+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<n+1;i++) {
        	arr[i]=(arr[i-2] +arr[i-1]) %1234567;
        }
        
        
        
        return arr[n];
    }
    
}
