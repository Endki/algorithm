package lv1;

public class P12944 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1,2,3,4}));
	}
    public static double solution(int[] arr) {
        double answer = 0;
        
        for(int number : arr ) {
        	answer+=number;
        }
        
        answer/=arr.length;
        
        
        return answer;
    }
}
