import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 합승택시요금 {

	
	static int[][] board;
	static int[][] costs;
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	
	public static void main(String[] args) {
		int[][] fares=new int[][] {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
		
		System.out.println(solution(6, 4, 6, 2, fares));
	}

	
	
    static public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        
        
        init(s,n,fares);
        
        calcMinCost(s);
        calcMinCost(a);
        calcMinCost(b);
        
        answer=costs[s][a]+costs[s][b];
        
        for(int mid=1;mid<=n;mid++){
            if(costs[s][mid]==987654321 || costs[mid][a]==987654321 || costs[mid][b]==987654321) continue;
            
            answer=Math.min(answer,costs[s][mid]+costs[mid][a]+costs[mid][b]);   
        }
        
        
        return answer;
    }
    
    
    public static class node{
    	int loc;
    	int cost;
		public node(int loc, int cost) {
			this.loc = loc;
			this.cost = cost;
		}
    }
    
    public static void init(int start,int n,int[][] fares) {
    	board=new int[n+1][n+1];
    	costs=new int[n+1][n+1];
    	
    	for(int i=0;i<=n;i++) {
    		list.add(new ArrayList<>());
    		Arrays.fill(costs[i], 987654321);
    		costs[i][i]=0;
    	}
    	
    	for(int i=0;i<fares.length;i++) {
    		int s=fares[i][0],e=fares[i][1];
    		list.get(s).add(e);
    		list.get(e).add(s);
    		board[s][e]=fares[i][2];
    		board[e][s]=fares[i][2];	
    	}
    	return;
    }
    
    public static void calcMinCost(int start) {
    	Queue<node> queue=new LinkedList<>();
    	queue.add(new node(start,0));
    	
    	while(!queue.isEmpty()) {
    		node node=queue.poll();
    		int now_loc=node.loc,cost=node.cost;
    		
            for(int i=0;i<list.get(now_loc).size();i++){
                int next_loc=list.get(now_loc).get(i);
                int next_cost=board[now_loc][next_loc]+cost;
                
                if(costs[start][next_loc]>next_cost){
                    costs[start][next_loc]=next_cost;
                    costs[next_loc][start]=next_cost;
                
                    queue.add(new node(next_loc,next_cost));
                }
            }
    	}
    }
}
