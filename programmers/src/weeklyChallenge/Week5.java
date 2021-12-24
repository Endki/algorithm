package weeklyChallenge;

public class Week5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int solution(String word) {
	        int answer = 0;
	        
	        char arr[]=word.toCharArray();
	        
	        int count= arr.length;
	        int multi[]={781,156,31,6,1};
	        
	        while(count>0){
	            if(arr[arr.length-count]=='A'){
	                answer+=multi[arr.length-count]*0+1;
	            }
	            else if(arr[arr.length-count]=='E'){
	                answer+=multi[arr.length-count]*1+1;
	            }
	            else if(arr[arr.length-count]=='I'){
	                answer+=multi[arr.length-count]*2+1;
	            }
	            else if(arr[arr.length-count]=='O'){
	                answer+=multi[arr.length-count]*3+1;
	            }
	            else if(arr[arr.length-count]=='U'){
	                answer+=multi[arr.length-count]*4+1;
	            }
	            count--;
	        }
	        
	        return answer;
	    }
	}
}
