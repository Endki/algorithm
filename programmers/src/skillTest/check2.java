package skillTest;

import java.util.ArrayList;
import java.util.Arrays;

public class check2 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1})));

	}
    static public int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        boolean[] arr=new boolean[201];
        
        Arrays.fill(arr, false);
        
        for(int i=0;i<numbers.length-1;i++) {
        	for(int j=1;j<numbers.length;j++) {
        		if(i!=j) {
        			arr[numbers[i]+numbers[j]]=true;
        		}
        	}
        }
        
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]) {
        		list.add(i);
        	}
        }

        answer=new int[list.size()];
        
        for(int i=0;i<list.size();i++) {
        	answer[i]=list.get(i);
        }
        
        
        return answer;
    }
}
