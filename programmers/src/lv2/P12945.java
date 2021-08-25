package lv2;

public class P12945 {

	public static void main(String[] args) {
		System.out.println(solution(100000));

	}
    public static int solution(int n) {
        
        int[] arr=new int[100001];
        
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        
        for(int i=3;i<=n;i++) {
        	arr[i]=arr[i-2]+arr[i-1];
        }
        
        
        
        return arr[n]%1234567;
    }
}
