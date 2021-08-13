package lv1;

public class P70128 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}));

	}

    static public int solution(int[] a, int[] b) {
        
        int sum=0;
        
        for(int i=0;i<a.length;i++) {
        	sum+= (a[i]*b[i]);
        }
        return sum;
    }
}
