package lv2;

import java.util.Hashtable;

public class P12981 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        int index=1;
        int count=1;
        boolean flag=false;
        Hashtable<String, Integer> table=new Hashtable<String, Integer>();
        table.put(words[0], 1);
        
        for(int i=1;i<words.length;i++) {
        	index++;
        	if(index>n) {
        		index=1;
        		count++;
        	}
        	
        	
        	
        	
        	
        	if(table.containsKey(words[i]) || words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)) {
        		flag=true;
        		answer[1]=count;
        		break;
        	}
        	
        	table.put(words[i], 1);
        	
        }
        
        answer[0]=index;
        if(!flag) {
        	answer[0]=0;
        	answer[1]=0;
        }
        
        
        return answer;
    }
}
