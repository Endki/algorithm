package weeklyChallenge;

public class Week12 {
    public static boolean[] visited;
    public static int answer;
    public int solution(int k, int[][] dungeons) {
        visited=new boolean[dungeons.length];
        answer=0;
        dfs(k,0,dungeons);
        return answer;
    }
    
    public void dfs(int tired,int depth,int[][] dungeons){
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i] && tired>=dungeons[i][0]){
                visited[i]=true;
                dfs(tired-dungeons[i][1],depth+1,dungeons);
                visited[i]=false;
            }
        }
        answer=Math.max(depth,answer);
    }
       
}
