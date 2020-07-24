package hash;
import java.util.Arrays;

public class 전화번호목록 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input= {"123","456","789"};
		String[] input2= {"12","123","1235","567","88"};
		String[] input3= {"45","21345"};
		
		
		System.out.println(solution(input));
		System.out.println(solution(input2));
		System.out.println(solution(input3));
	}
	
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.parallelSort(phone_book);
        
        for(int i=0;i<phone_book.length;i++) {
        	for(int j=i+1;j<phone_book.length;j++) {
        		
        		if(phone_book[j].startsWith(phone_book[i])) {
        			answer=false;
        			break;
        		}
        	}
        }
        
        
        
        return answer;
    }
}
