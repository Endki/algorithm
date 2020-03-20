import java.util.Scanner;

public class B3054 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String k = input.next();
		
		int w = 1;
		for(int i = 0 ;i < k.length(); i++) {
			w += 4;
		}
		
		char[][] arr = new char[5][w];
		
		int at = 0;
		for(int i = 2 ;i < w; i+=4) {
			if(at % 3 == 2) {
				arr[0][i] = '*';
				arr[1][i] = '.';
				arr[2][i] = k.charAt(at);
				arr[3][i] = '.';
				arr[4][i] = '*';
				
				arr[0][i-1] = '.';
				arr[1][i-1] = '*';
				arr[2][i-1] = '.';
				arr[3][i-1] = '*';
				arr[4][i-1] = '.';
				
				arr[0][i-2] = '.';
				arr[1][i-2] = '.';
				arr[2][i-2] = '*';
				arr[3][i-2] = '.';
				arr[4][i-2] = '.';
				
				arr[0][i+1] = '.';
				arr[1][i+1] = '*';
				arr[2][i+1] = '.';
				arr[3][i+1] = '*';
				arr[4][i+1] = '.';
				
				arr[0][i+2] = '.';
				arr[1][i+2] = '.';
				arr[2][i+2] = '*';
				arr[3][i+2] = '.';
				arr[4][i+2] = '.';
			}else {
				arr[0][i] = '#';
				arr[1][i] = '.';
				arr[2][i] = k.charAt(at);
				arr[3][i] = '.';
				arr[4][i] = '#';
				
				arr[0][i-1] = '.';
				arr[1][i-1] = '#';
				arr[2][i-1] = '.';
				arr[3][i-1] = '#';
				arr[4][i-1] = '.';
				
				arr[0][i-2] = '.';
				arr[1][i-2] = '.';
				if(arr[2][i-2] != '*') arr[2][i-2] = '#';
				arr[3][i-2] = '.';
				arr[4][i-2] = '.';
				
				arr[0][i+1] = '.';
				arr[1][i+1] = '#';
				arr[2][i+1] = '.';
				arr[3][i+1] = '#';
				arr[4][i+1] = '.';
				
				arr[0][i+2] = '.';
				arr[1][i+2] = '.';
				arr[2][i+2] = '#';
				arr[3][i+2] = '.';
				arr[4][i+2] = '.';
			}
			
			at++;
		}
		
		
		for(int i = 0 ;i < 5; i++) {
			for(int j = 0 ; j < w; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		input.close();
	}

}
