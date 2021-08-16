package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12935 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {4,3,2,1})));
		
	}
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        	
        
        int index=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
        	if(min>arr[i]) {
        		index=i;
        		min=arr[i];
        	}
        }
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++) {
        	if(index==i) {
        		continue;
        	}
        	list.add(arr[i]);
        }
        
        
        if(list.size()==0) {
        	answer = new int[1];
        	answer[0]=-1;
        }else {
	        for(int i=0;i<list.size();i++) {
	        	answer[i]=list.get(i);
	        }
        }
        return answer;
    }
}
