package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B13460 {
	static char[][] map;
	static int N,M,count;
	
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	
	static class Ball{
		int x;
		int y;
//		boolean color;
		int count;
		
		public Ball(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count=count;
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		N=Integer.parseInt(stz.nextToken());
		M=Integer.parseInt(stz.nextToken());
		map=new char[N][M];
		Ball red=null,blue=null;
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j]=input.charAt(j);
				if(map[i][j]=='R') {
					red=new Ball(i,j,0);
				}
				if(map[i][j]=='B') {
					blue=new Ball(i,j,0);
				}
			}
		}
		
		Queue<Ball> Red_qu=new LinkedList<Ball>();
		Queue<Ball> Blue_qu=new LinkedList<Ball>();
		boolean redflag = false;
		boolean blueflag = false;

		//초기화
		Red_qu.offer(red);
		Blue_qu.offer(blue);
		count=0;
		
		while(!Red_qu.isEmpty() && !Blue_qu.isEmpty()) {
			
			Ball B1=Red_qu.poll();
			Ball B2=Blue_qu.poll();
			
			if(B1.count<10) {
				for (int i = 0; i < 4; i++) {

					Ball redBall = new Ball(B1.x, B1.y, B1.count);
					Ball blueBall = new Ball(B2.x, B2.y, B2.count);
					map[redBall.x][redBall.y] = 'R';
					map[blueBall.x][blueBall.y] = 'B';

					redflag = false;
					blueflag = false;

					// 한번 기울이면 장애물을 만날때까지는 계속 이동하므로 while문을 사용
					while (true) {

						if (map[redBall.x + dx[i]][redBall.y + dy[i]] == 'O') {
							redflag = true;
							map[redBall.x][redBall.y] = '.';
							redBall.x = redBall.x + dx[i];
							redBall.y = redBall.y + dy[i];
						}

						// 파란구슬이 구멍에 빠지면 기우는 것을 멈춤
						if (map[blueBall.x + dx[i]][blueBall.y + dy[i]] == 'O') {
							blueflag = true;
							break;
						}
						// 빨간구슬, 파란구슬 둘 다 움직일 수 없는 경우 멈춤
						// 파란구슬이 장애물(벽,빨간구슬)에 막히고, 빨간구슬도 장애물에 막히거나 빨간구슬이 구멍이 빠진 경우
						if ((map[redBall.x + dx[i]][redBall.y + dy[i]] != '.' || redflag)
								&& map[blueBall.x + dx[i]][blueBall.y + dy[i]] != '.')
							break;

						if (map[redBall.x + dx[i]][redBall.y + dy[i]] == '.' && !redflag) {
							map[redBall.x][redBall.y] = '.';
							redBall.x = redBall.x + dx[i];
							redBall.y = redBall.y + dy[i];
							map[redBall.x][redBall.y] = 'R';
						}
						if (map[blueBall.x + dx[i]][blueBall.y + dy[i]] == '.') {
							map[blueBall.x][blueBall.y] = '.';
							blueBall.x = blueBall.x + dx[i];
							blueBall.y = blueBall.y + dy[i];
							map[blueBall.x][blueBall.y] = 'B';
						}
					}

					if (redflag && !blueflag) {
						count = B1.count + 1;
						System.out.println(count);
						return;
					}

					if (blueflag)
						count = -1;
					else {
						Red_qu.offer(new Ball(redBall.x, redBall.y, B1.count + 1));
						Blue_qu.offer(new Ball(blueBall.x, blueBall.y, B2.count + 1));
					}

					if (map[redBall.x][redBall.y] == 'R')
						map[redBall.x][redBall.y] = '.';
					if (map[blueBall.x][blueBall.y] == 'B')
						map[blueBall.x][blueBall.y] = '.';
				}
			}else {
				count=-1;
			}
			

		}	
	}

}
