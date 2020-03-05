import java.util.Scanner;

public class B10250 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int T = input.nextInt();
		int w = 0, h = 0, person = 0;

		// 입력
		for (int i2 = 0; i2 < T; i2++) {
			h = input.nextInt();
			w = input.nextInt();
			person = input.nextInt();
		

		int[][] hotel = new int[h][w];
		
		int max=Math.max(h, w);
		int[][] visit = new int[h][w];

		int personNum=0;
		int visitNum=0;
		String k;
		// 방 번호 입력
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				
				if (j <9) {
					k = Integer.toString(i+1) + "0" + Integer.toString(j + 1);
				} else {
					k = Integer.toString(i+1) + Integer.toString(j + 1);
				}
				hotel[i][j] = Integer.parseInt(k);				
			}
		}
		
		int x=0,y=0;
		
		for (int m = 0; m < w; m++) {
			for (int n = 0; n < h; n++) {
				visitNum++;
				visit[n][m]=visitNum;
				if(visit[n][m]==person) {
					x=n;
					y=m;
				}
			}
			
		}

		
		System.out.println(hotel[x][y]);
		
		}
	}

}
