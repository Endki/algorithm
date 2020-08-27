package de;

import java.util.Arrays;

public class AutoCom2 {

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
        
        
        for(int i=0;i<words.length;i++) {
        	char[] arr;
        	char[] arr2;
        	//맨앞
        	if(i==0) {
        		arr=words[i].toCharArray();
        		arr2=words[i+1].toCharArray();
        		for(int j=0;j<Math.min(arr.length, arr2.length);j++) {
        			if(arr[j]!=arr2[j]) {
        				break;
        			}
        			answer++;
        		}
        		if(arr.length>=arr2.length) {
        			answer++;
        		}
  		if(answer==0) {
        			answer+=1;
        		}
        		
        	//맨끝
        	}else if(i==words.length-1) {
        		arr=words[i].toCharArray();
        		arr2=words[i-1].toCharArray();
        		
        		for(int j=0;j<Math.min(arr.length, arr2.length);j++) {
        			//
        			if(arr[j]!=arr2[j]) {
        				break;
        			}
        			answer++;
        		}
        		// if(arr.length>=arr2.length) {
        			answer++;
        		// }
        		
        	//그외
        	}else {
        		arr=words[i-1].toCharArray();
        		arr2=words[i+1].toCharArray();
        		char[] arr3=words[i].toCharArray();
        		int left=0;
        		int right=0;
        		
                //앞에꺼랑 비교
        		for(int j=0;j<Math.min(arr.length, arr3.length);j++) {
        			if(arr3[j]!=arr[j]) {
        				break;
        			}
        			left++;
        			
        		}
                
                //뒤에꺼랑 비교
        		for(int j=0;j<Math.min(arr2.length, arr3.length);j++) {
        			if(arr3[j]!=arr2[j]) {
        				break;
        			}
        			right++;
        		}
        		
        		int result=Math.max(left, right);
        		result+=1;
        		answer+=result;
        	}
        	
        	
        }
        
        
        return answer;
    }
}
