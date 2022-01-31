import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2580 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[][] map=new int[9][9];
		
		
		//1. 가로 check
		//2. 세로 check.
		//3. 3.3 체크
		
		
		for(int i=0;i<9;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				map[i][j]=Integer.parseInt(stz.nextToken());
			}
		}
		sudoku(0,0,map);
		
	}
	public static void sudoku(int row, int col,int[][] map) {
		//행이 다 채워지면 row를 1 증가
		if(col==9) {
			sudoku(row +1,0,map);
			return;
		}
		
		if(row==9) {
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					sb.append(map[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
			System.exit(0);
		}
		
		if(map[row][col]==0) {
			for(int i=1;i<=9;i++) {
				if(possibility(row, col, i, map)) {
					map[row][col]=i;
					sudoku(row, col+1, map);
				}
			}
			map[row][col]=0;
			return;
		}
		sudoku(row,col+1,map);
	}
	
	
	public static boolean possibility(int row, int col, int value,int[][] map) {
		 
		// 같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (map[row][i] == value) {
				return false;
			}
		}
 
		// 같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (map[i][col] == value) {
				return false;
			}
		}
 
		// 3*3 칸에 중복되는 원소가 있는지 검사
		int set_row = (row / 3) * 3; // value가 속한 3x3의 행의 첫 위치
		int set_col = (col / 3) * 3; // value가 속한 3x3의 열의 첫 위치
 
		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (map[i][j] == value) {
					return false;
				}
			}
		}
 
		return true; // 중복되는 것이 없을 경우 true 반환
	}

}
