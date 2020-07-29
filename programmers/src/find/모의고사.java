package find;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(solution(arr)));
	}
	
    public static int[] solution(int[] answers) {
        int[] answer = answers;
        int len=answers.length;
        
        int[] mirr1= {1,2,3,4,5};
        int[] mirr2= {2,1,2,3,2,4,2,5};
        int[] mirr3= {3,3,1,1,2,2,4,4,5,5};
        
        int[] count=new int[3];
        
        for(int i=0;i<len;i++) {
        	if(answers[i]==mirr1[i%5]) {
        		count[0]++;
        	}
        	if(answers[i]==mirr2[i%8]) {
        		count[1]++;
        	}
        	if(answers[i]==mirr3[i%10]) {
        		count[2]++;
        	}
        }
        
        int max=Math.max(Math.max(count[0], count[1]), count[2]);
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(max==count[0]) {
        	list.add(1);
        }
        if(max==count[1]) {
        	list.add(2);
        }
        if(max==count[2]) {
        	list.add(3);
        }
        
        answer=new int[list.size()];
        for(int i=0;i<answer.length;i++) {
        	answer[i]=list.get(i);
        }
        
        
        return answer;
    }
}
