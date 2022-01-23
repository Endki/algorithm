package lv2;

import java.util.ArrayList;
import java.util.List;

public class P87390 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//리턴자료형 변경해도 채점상 문제가 없다는 것을 처음 알았다
	  public List<Long> solution(int n, long left, long right) {
	        int[] answer;
	        List<Long> list=new ArrayList<Long>();

	        for(long i=left;i<=right;i++){
	            list.add(Math.max(i/n,i%n)+1);
	        }


	        return list;
	    }
	  
	    public int[] solution2(int n, long left, long right) {
	        int[] answer;
	        
	        List<Integer> list=new ArrayList<Integer>();
	        
	        for(long i=left;i<=right;i++){
	            list.add((int)Math.max(i/n,i%n)+1);
	        }
	        
	        answer=new int[list.size()];
	        
	        for(int i=0;i<list.size();i++){
	            answer[i]=list.get(i);
	        }
	        
	        return answer;
	    }
}
