package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 장애물_인식_프로그램 {

	 static int[] dx={0,0,-1,1};
	    static int[] dy={1,-1,0,0};
	    public static void main(String args[]) throws IOException
	    {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int N=Integer.parseInt(br.readLine());

	        int[][] map=new int[N][N];

	        for(int i=0;i<N;i++){
	            String input=br.readLine();
	            for(int j=0;j<N;j++){
	                map[i][j]=input.charAt(j)-'0';
	            }
	            
	        }

	        Queue<int[]> qu=new LinkedList<int[]>();
	        boolean[][] visited=new boolean[N][N];

	        int count=1;
	        for(int i=0;i<N;i++){
	            for(int j=0;j<N;j++){
	                if(map[i][j]==1 && !visited[i][j]){
	                    qu.add(new int[]{i,j});
	                    visited[i][j]=true;
	                    map[i][j]=count;
	                    while(!qu.isEmpty()){
	                        int[] index=qu.poll();
	                        int x=index[0];
	                        int y=index[1];

	                        for(int k=0;k<4;k++){
	                            int rdx=x+dx[k];
	                            int rdy=y+dy[k];

	                            if(rdx<0 || rdy<0 || rdx>=N || rdy>=N || visited[rdx][rdy] || map[rdx][rdy]==0){
	                                continue;
	                            }
	                            map[rdx][rdy]=count;
	                            visited[rdx][rdy]=true;
	                            qu.add(new int[]{rdx,rdy});
	                        }
	                    }
	                    count++;
	                }
	            }
	        }
	        // System.out.println(Arrays.deepToString(map));
	        int[] answer=new int[count];
	        for(int i=0;i<N;i++){
	            for(int j=0;j<N;j++){
	                if(map[i][j]!=0){
	                    answer[map[i][j]]++;
	                }
	            }
	        }
	        System.out.println(count-1);
	        Arrays.sort(answer);
	        for(int i=1;i<count;i++){
	            System.out.println(answer[i]);
	        }

	    }

}
