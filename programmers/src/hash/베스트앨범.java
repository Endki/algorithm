package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 베스트앨범 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[] {500, 600, 150, 800, 2500})));
	}
    static public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        
        HashMap<String, Integer> maxValue=new HashMap<String, Integer>();
        ArrayList<Integer> indexList=new ArrayList<Integer>();
        
        //getOrDefault 로 개선 가능
        for(int i=0;i<genres.length;i++) {
        	if(maxValue.containsKey(genres[i])) {
        		maxValue.put(genres[i], maxValue.get(genres[i])+plays[i]);
        	}else {
        		maxValue.put(genres[i], plays[i]);
        	}
        }
        
        List<String> keyList=new ArrayList<String>(maxValue.keySet());
        
        Collections.sort(keyList, (o1,o2)-> (maxValue.get(o2)).compareTo(maxValue.get(o1)));
        
        for(String key : keyList) {
        	HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        	for(int i=0;i<genres.length;i++) {
        		if(key.equals(genres[i])) {
        			map.put(i, plays[i]);
        		}
        	}
        	List<Integer> keyList2=new ArrayList<Integer>(map.keySet());
        	keyList2.sort((s1,s2)->map.get(s2).compareTo(map.get(s1)));
        	
        	int j=0;
        	for(Integer c : keyList2) {
        		if(j>1) {
        			break;
        		}
        		indexList.add(c);
        		j++;
        	}
        	
        }
        answer = new int[indexList.size()];
        for(int i=0;i<indexList.size();i++) {
        	answer[i]=indexList.get(i);
        }
        
        return answer;
    }

}
