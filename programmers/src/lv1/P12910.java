package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12910 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {5,9,7,10},5));
	}
    public static int[] solution(int[] arr, int divisor) {
        
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor==0) {
        		list.add(arr[i]);
        	}
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
        	answer[i]=list.get(i);
        }
        if(list.isEmpty()) {
        	return new int[] {-1};
        }
        return answer;
    }
}
