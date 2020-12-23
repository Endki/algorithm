package simulation;

import java.io.*;
import java.util.*;


public class B19237_2 {
    static int n,m,k;
    static Node map[][];
    static int dx[] = {0,-1,1,0,0};
    static int dy[] = {0,0,0,-1,1};
    static Shark[] shark;
    static ArrayList<Integer>list[][];
    static ArrayList<Tmp>tmp_list[];
    static boolean visited[][];
    
    static int ans=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String [] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]); //n * n 맵의 크기
        m = Integer.parseInt(t[1]);// 상어의 개수
        k = Integer.parseInt(t[2]); // 시간
        visited = new boolean[n+1][n+1];
        map = new Node[n][n];
        shark = new Shark[m+1];
        list = new ArrayList[m+1][5];
    
    
        for(int i=0; i<n; i++) {
            String[] map_input = br.readLine().split(" ");
            for(int j=0; j<n; j++) {
                int s_num = Integer.parseInt(map_input[j]);
                if(s_num==0) {
                    map[i][j] = new Node(0,0); 
                }
                else{
                    map[i][j] = new Node(s_num,k);
                    shark[s_num] = new Shark(i,j,0,true);
                }
            }
        }
        
        String[] dir_input = br.readLine().split(" ");
        for(int i=0; i<dir_input.length; i++) {
            shark[i+1].dir = Integer.parseInt(dir_input[i]);
        }
        
        for(int i=0; i<list.length; i++) {
            for(int j=1; j<5; j++) {
                list[i][j] = new ArrayList<>();
            }
        }
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=4; j++) {
                String [] tt = br.readLine().split(" ");
                for(int k=0; k<4; k++) {
                    list[i][j].add(Integer.parseInt(tt[k]));
                }
            }
        }
        
        
        solve();
        
    }
    public static void solve() {
        while(true) {
            visited = new boolean[n+1][n+1];
            tmp_list = new ArrayList[m+1];
            for(int i=1; i<=m; i++) {
                tmp_list[i] = new ArrayList<>();
            }
            if(ans>1000) {
                System.out.println(-1);
                break;
            }
            if(game_end()) {
                System.out.println(ans);
                break;
            }
            
            
            // 1. 상어가 움직인다.
            for(int i=1; i<=m; i++) {
                if(shark[i].flag==false) {  // 죽어있는 상어는 무시함
                    continue;
                }
                int x = shark[i].x;
                int y = shark[i].y;
                
                // 1-1 인접한 방향중 냄새가 없는칸이 있는지 확인하기
                if(isPossible(i)) {
                    // 1-2 우선순위에 따라 방향 결정하기
                    int change_dir = get_dir(i);
                    // 1-3 상어 위치 바꿔주기
                    int nx = x+dx[change_dir];
                    int ny = y+dy[change_dir];
                    shark[i].x = nx;
                    shark[i].y = ny;
                    shark[i].dir =change_dir;
                    // 1-4 해당칸에 냄새뿌릴 정보 저장
                    tmp_list[i].add(new Tmp(nx,ny));
                }
                else {  //2. 인접방향중 냄새없는 칸이 없다면 인접한 칸으로 돌아가기
                    int back_dir = rollback_dir(i);
                    // 2-1 상어위치 바꿔주기
                    int nx = x+dx[back_dir];
                    int ny = y+dy[back_dir];
                    shark[i].x = nx;
                    shark[i].y = ny;
                    shark[i].dir = back_dir;
                    map[nx][ny].num = i;
                    map[nx][ny].time=k;
                    visited[nx][ny] = true;
                }
            }
            
            for(int i=1; i<=m; i++) {
                if(tmp_list[i].size()==0) {
                    continue;
                }
                int tmp_x = tmp_list[i].get(0).x;
                int tmp_y = tmp_list[i].get(0).y;
                if(visited[tmp_x][tmp_y]) {
                    shark[i].flag = false;
                }
                else {
                    visited[tmp_x][tmp_y] = true;
                    map[tmp_x][tmp_y].num =i;
                    map[tmp_x][tmp_y].time =k;
                }
            }
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(map[i][j].num!=0 && !visited[i][j]) {
                        map[i][j].time--;
                        if(map[i][j].time==0) {
                            map[i][j].num=0;
                        }
                    }
                }
            }
            ans++;
        }
        
    }
    public static boolean game_end() {
        for(int i=2; i<=m; i++) {
            if(shark[i].flag==true) {
                return false;
            }
        }
        return true;
    }
    public static int rollback_dir(int s_num) {
        int x = shark[s_num].x;
        int y = shark[s_num].y;
        int dir = shark[s_num].dir;
        
        for(int i=0; i<4; i++) {
            int tmp_dir = list[s_num][dir].get(i);
            int nx = x+dx[tmp_dir];
            int ny = y+dy[tmp_dir];
            if(isRange(nx,ny) && map[nx][ny].num==s_num) {
                return tmp_dir;
            }
        }
        return 1000;
    }
    public static int get_dir(int s_num) {
        int x = shark[s_num].x;
        int y = shark[s_num].y;
        int dir =shark[s_num].dir;
        for(int i=0; i<4; i++) {
            int tmp_dir = list[s_num][dir].get(i);
            int nx = x+dx[tmp_dir];
            int ny = y+dy[tmp_dir];
            if(isRange(nx,ny) && map[nx][ny].num==0) {
                return tmp_dir;
            }
        }
        return 10000;
    }
    public static boolean isPossible(int s_num) {
        // 1. 일단 맵의 범위안에서만 탐색가능
        int x = shark[s_num].x;
        int y = shark[s_num].y;
        for(int i=1; i<=4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(isRange(nx,ny)) {
                if(map[nx][ny].num==0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isRange(int x ,int y) {
        if(x>=0 && y>=0 && x<n && y<n) {
            return true;
        }
        return false;
    }
}
class Shark{
    int x,y,dir;
    boolean flag;
    Shark(int x, int y, int dir,boolean flag){
        this.x=x;
        this.y=y;
        this.dir=dir;
        this.flag=flag;
    }
}
class Node{
    int num,time;
    Node(int num, int time){
        this.num = num;
        this.time=time;
    }
}
class Tmp{
    int x,y;
    Tmp(int x, int y){
        this.x=x;
        this.y=y;
    }
}