package lv3;

public class P92335 {

	public static void main(String[] args) {
		
		String itos=Integer.toString(437674, 3);
		
		String[] arr=itos.split("0");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.println(isPrime(Integer.parseInt(arr[i])));
		}
		
		
	}

	public int solution(int n, int k) {
        int answer = 0;
        
        String itoS=Integer.toString(n,k);
        String[] arr=itoS.split("0");
        for(int i=0;i<arr.length;i++) {
            if(arr[i].length()==0){
                continue;
            }
		    if(isPrime(Long.parseLong(arr[i]))){
                answer++;
            }
			
		}
        
        return answer;
    }
    public static boolean isPrime(long number) {
		if(number==1) {
			return false;
		}
		
		for(long i=2;i*i<=number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
