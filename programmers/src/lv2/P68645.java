package lv2;

public class P68645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int[] solution(int n) {
//    	https://minhamina.tistory.com/58
    	//n까지 순서대로 좌표를 변경 시켜서 넣어주는 방식!
    	//좌표를 순서대로 숫자를 넣어주는 방식은 없을까?
    	
    	
        int[] answer = new int[(n*(n+1))/2];
        int[][] matrix = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { 	
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                matrix[x][y] = num++;
            }
        }
        
        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) 
                	break;
                answer[k++] = matrix[i][j];
            }
        }

        return answer;
    }
}
