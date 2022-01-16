package lv1;

public class P92334 {
	import java.util.*;
	class Solution {
	    public int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        
	        boolean[][] map=new boolean[id_list.length][id_list.length];
	        
	        for(int i=0;i<report.length;i++){
	            String[] input=report[i].split(" ");
	            String start=input[0];
	            String end=input[1];
	            
	            int idxX=0;
	            int idxY=0;
	            for(int j=0;j<id_list.length;j++){
	                if(id_list[j].equals(start)){
	                    idxX=j;
	                }
	                if(id_list[j].equals(end)){
	                    idxY=j;
	                }
	            }
	            
	            map[idxX][idxY]=true;
	        }
	        
	        for(int i=0;i<id_list.length;i++){
	            int count=0;
	            for(int j=0;j<id_list.length;j++){
	                if(map[j][i]){
	                    count++;
	                }
	            }
	            
	            if(count>=k){
	                for(int j=0;j<id_list.length;j++){
	                    if(map[j][i]){
	                        answer[j]++;
	                    }
	                }
	            }
	        }
	        
	        
	        
	        return answer;
	    }
	}
}
