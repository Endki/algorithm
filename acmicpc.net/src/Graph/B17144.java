package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B17144 {
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int R=Integer.parseInt(stz.nextToken());
		int C=Integer.parseInt(stz.nextToken());
		int T=Integer.parseInt(stz.nextToken());
		
		//input
		int[][] arr=new int[R][C];
		
		int[] winX=new int[2];
		int[] winY=new int[2];
		
		boolean flag=false;
		for(int i=0;i<R;i++) {
			stz=new StringTokenizer(br.readLine());
			for(int j=0;j<C;j++) {
				arr[i][j]=Integer.parseInt(stz.nextToken());
				if(arr[i][j]==-1) {
					if(!flag) {
						winX[0]=i;
						winY[0]=j;
						
						
						flag=true;
					}else {
						winX[1]=i;
						winY[1]=j;
					}
				}
			}
		}
		
		//solution
		while(T-->0) {
			//더해 줄 값들이 있는 배열 선언
			int[][] mirror=new int[R][C];
			
			//먼지 퍼지는 과정
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					
					//미세먼지가 있다면,
					if(arr[i][j]>0) {
						
						//몇번 퍼졌는지 확인할 카운트
						int count=0;
						
						
						//4방위 탐색
						for(int k=0;k<4;k++) {
							int rdx=i+dx[k];
							int rdy=j+dy[k];
							
							if(rdx<0 || rdy<0 || rdx>=R || rdy>=C || arr[rdx][rdy]==-1) {
								continue;
							}
							
							
							mirror[rdx][rdy]+=arr[i][j]/5;
							count++;
						}
						arr[i][j]-=(arr[i][j]/5)*count;
					}
				}
			}
			//퍼진 먼지 실제 배열로 돌려주는 과정
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					if(mirror[i][j]>0) {
						arr[i][j]+=mirror[i][j];
					}
				}
			}
			
			
			
			//work 공기청정기
			
			
			//흡수
			arr[winX[0]-1][winY[0]]=0;
			arr[winX[1]+1][winY[1]]=0;
			
			
			//위에 공청기
			
			//상
			for(int i=winX[0];i>0;i--) {
				arr[i][0]=arr[i-1][0];
			}
			//우
			for(int i=0;i<C-1;i++) {
				arr[0][i]=arr[0][i+1];
			}
			//하
			for(int i=0;i<winX[0];i++) {
				arr[i][C-1]=arr[i+1][C-1];
			}
			//좌
			for(int i=C-1;i>0;i--) {
				arr[winX[0]][i]=arr[winX[0]][i-1];
			}
			
			//아래 공청기
			
			//하
			for(int i=winX[1];i<R-1;i++) {
				arr[i][0]=arr[i+1][0];
			}
			//우
			for(int i=0;i<C-1;i++) {
				arr[R-1][i]=arr[R-1][i+1];
			}
			//상
			for(int i=R-1;i>winX[1];i--) {
				arr[i][C-1]=arr[i-1][C-1];
			}
			//좌
			for(int i=C-1;i>0;i--) {
				arr[winX[1]][i]=arr[winX[1]][i-1];
			}
		}
		
		
		arr[winX[0]][winY[0]+1]=0;
		arr[winX[1]][winY[1]+1]=0;

		//output
		int sum=0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(arr[i][j]==-1) {
					continue;
				}
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}
	

}
