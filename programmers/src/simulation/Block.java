package simulation;

public class Block {

	public static void main(String[] args) {

//		System.out.println(solution(4, 5, new String[] { "CCBDE", "AAADE", "AAABF", "CCBBF" }));
//		System.out.println(solution(6, 6, new String[] { "TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ" }));
//		System.out.println(solution(4, 4, new String[] { "AAAAA","AUUUA","AUUAA","AAAAA" }));
//		System.out.println(solution(2, 2, new String[] { "AA","AA"}));
//		System.out.println(solution(2, 2, new String[] { "AA","AB"}));
//		System.out.println(solution(3, 2, new String[] { "AA","AA","AB"}));
//		System.out.println(solution(4, 2, new String[] { "CC","AA","AA","CC"}));
//		System.out.println(solution(6, 2, new String[] { "DD","CC","AA","AA","CC","DD"}));
//		System.out.println(solution(8, 2, new String[] { "FF","AA","CC","AA","AA","CC","DD","FF"}));
//		System.out.println(solution(6, 2, new String[] { "AA","AA","CC","AA","AA","DD"}));
		
	}

	static boolean visit[][];
	static boolean flag;

	
	//전형적인 시뮬레이션 문제 = 하라는 대로 하면 된다.
	static public int solution(int m, int n, String[] board) {
		int answer = 0;
		char[][] arr = new char[m][n];
		

		// input
		for (int i = 0; i < m; i++) {
			arr[i] = board[i].toCharArray();
		}

		flag = false;
		// solve
		
		//지울게 있는 경우에만
		while (!flag) {
			visit = new boolean[m][n];
			
			flag=true;
			
			//check
			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					SqureCheck(i, j, arr);
				}
			}
			//delete
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(visit[i][j]==true) {
						arr[i][j]='0';
						answer++;
					}
				}
			}
			
			//drop
			
			for(int i=1;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j]=='0') {
						
						for(int k=i;k>0;k--) {
							arr[k][j]=arr[k-1][j];
								
						}
						arr[0][j]='0';
					}
				}
			}

			
		}
		return answer;
	}

	static void SqureCheck(int x, int y, char[][] arr) {
		char K = arr[x][y];
		if (K == arr[x + 1][y] && K == arr[x][y + 1] && K == arr[x + 1][y + 1] && K!='0') {
			
			visit[x][y] = true;
			visit[x + 1][y] = true;
			visit[x][y + 1] = true;
			visit[x + 1][y + 1] = true;
			
			flag=false;
		}
	}
}
