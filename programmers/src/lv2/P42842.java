package lv2;

import java.util.Arrays;

public class P42842 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 2)));

	}
    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int height=0;
        int width=0;
        
        for(height=3;height<=(brown+4)/2;height++) {
        	
        	width=(brown+4)/2 -height;
        	
        	if(width<height) {
        		break;
        	}
        	
        	int yellowCount=(width-2) * (height -2);
        	if(yellow == yellowCount) {
        		break;
        	}
        }
        
        answer=new int[] {width,height};
        
        return answer;
    }
}
