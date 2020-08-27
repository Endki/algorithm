package de;

import java.util.Arrays;

public class AutoCom {

	public static void main(String[] args) {
		
//		System.out.println(solution(new String[] {"go", "gone", "guild"}));
//		System.out.println(solution(new String[] {"abc", "def", "ghi", "jklm"}));
//		System.out.println(solution(new String[] {"word", "war", "warrior", "world"}));
//		System.out.println(solution(new String[] {"aaaaa", "aaaab", "aaabb", "aabbb", "abbbb"}));
//		System.out.println(solution(new String[] {"q", "ware", "efr", "er", "f", "d"}));
		System.out.println(solution(new String[] {"user", "add", "addr", "qwe", "ss", "use","u"}));
		
	}

	
	
	/* 문제 이해
	 * 입력된 글자중에 먼저 입력한 글자와 겹치는 애들이 나오면 안됨
	 * 
	 * 아이디어 
	 * 
	 * map? set? table?
	 * 3중포문?
	 * 
	 * 단어를 넣으면 
	 * 셋에 저장한다.  ?
	 * 
	 * 
	 * 마지막 아이디어
	 * sort 하면 근처에 비슷한 애들끼리 있으니까
	 * 앞뒤로만 비교하면 되지 않을까?
	 * 
	 * 
	 */
	
    static public int solution(String[] words) {
        int answer = 0;
        Arrays.sort(words);
        
        System.out.println(Arrays.toString(words));
        
        
        for(int i=0;i<words.length;i++) {
        	int j;
        	
        	for(j=1;j<words[i].length();j++) {
        		boolean flag=false;
        		
        		if(i!=0) {
        			if(words[i-1].contains(words[i].substring(0, j))) {
        				flag=true;
        			}
        		}
        		
        		if(i!=words.length-1) {
        			if(words[i+1].contains(words[i].substring(0, j))) {
        				flag=true;
        			}
        		}
        		if(!flag) {
        			answer+=j;
        			break;
        		}
        	}
        	if(j==words[i].length()) {
        		answer+=j;
        	}
        }
        
        
        return answer;
    }
}
