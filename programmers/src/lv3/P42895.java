package lv3;

public class P42895 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    static int answer=-1;
	    public int solution(int N, int number) {
	        
	        dfs(N,number,0,0);
	        return answer;
	    }
	    
	    public static void dfs(int N,int number,int depth,int sum){
	        if(depth>8){
	            return;
	        }
	        
	        if(number==sum){
	            if(answer==-1){
	                answer=depth;
	            }else{
	                answer=Math.min(answer,depth);
	            }
	        }
	        
	        int a=N;
	        
	        for(int i=1;i<=8-depth;i++){
	            dfs(N,number,i+depth,sum+a);
	            dfs(N,number,i+depth,sum-a);
	            dfs(N,number,i+depth,sum/a);
	            dfs(N,number,i+depth,sum*a);
	            a=(10*a)+N;
	        }
	    }
	
}
