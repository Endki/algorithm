
public class P12914 {

	public static void main(String[] args) {
		System.out.println(solution(4));
		System.out.println(solution(3));
		

	}
	
	static int count;
	static int[] arr;
    static public long solution(int n) {
        long answer = 0;
        count=0;
        int[] arr=new int[n+1];
        recusive(0, n);
        
        
        return count;
    }
    
    static public void recusive(int depth,int endPoint) {
    	//base case
    	if(depth==endPoint) {
    		count++;
    		count%=1234567;
    		return;
    	}
    	
    	if(depth>endPoint) {
    		return;
    	}
    	
    	//recursive
    	recusive(depth+1, endPoint);
    	recusive(depth+2, endPoint);
    }
    
}
