package de;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ZIP {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("KAKAO")));
		
		

	}
    static public int[] solution(String msg) {
        int[] answer = {};
        //K,V
        //숫자를 출력해야 함으로, KEY값을 주면 VALUE를 출력하는 MAP을 사용한다.
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        Queue<Character> qu=new LinkedList<Character>();
        Queue<Integer> output=new LinkedList<Integer>();
        
        
        //단일 대문자 초기화
        for(int i=1;i<=26;i++) {
        	char b=(char) (64+i);
        	map.put(String.valueOf(b), i);
        }
        
        for(int i=0;i<msg.length();i++) {
        	qu.offer(msg.charAt(i));
        }
        int index=27;
        StringBuilder sb=new StringBuilder();
        
        while(!qu.isEmpty()) {
        	sb.append(qu.poll());
        	//있어
        	if(map.containsKey(sb.toString())) {
        		sb.append(qu.poll());
        		
        	}
        	
        	if(!map.containsKey(sb.toString())) {
        		output.offer(map.get(sb.substring(0, sb.length()-1)));
        		map.put(sb.toString(), index++);
        		sb.setLength(0);
        	}
        	
        	
        }
        
        
        answer=new int[output.size()];
        
        for(int i=0;i<answer.length;i++) {
        	answer[i]=output.poll();
        }
        
        return answer;
    }
}
