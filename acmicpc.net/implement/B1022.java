package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String[][] arr=new String[][] {
		{"37","36","35","34","33","32","31"},
		{"38","17","16","15","14","13","30"},
		{"39","18"," 5"," 4"," 3","12","29"},
		{"40","19"," 6"," 1"," 2","11","28"},
		{"41","20"," 7"," 8"," 9","10","27"},
		{"42","21","22","23","24","25","26"},
		{"43","44","45","46","47","48","49"}
		};
		
		

		
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		int r1=Integer.parseInt(stz.nextToken());
		int c1=Integer.parseInt(stz.nextToken());
		int r2=Integer.parseInt(stz.nextToken());
		int c2=Integer.parseInt(stz.nextToken());
		
		//start r1,c1 end r2,c2
		
		//문제의 힌트 
		//r2-r1>=0 && r2-r1<=49 
		//c2-c1>=0 && c2-c1<=4
		//출력 : r2-r1+1 이 끝
		
		//무엇을 위한 힌트냐 -> 최대 출력 배열크기가 200 
		//모든 수를 배열에 입력해줄 수 없다. -> 수학문제?
		//
		
		//출력
		
		for(int i=0;i<r2-r1+1;i++) {
			for(int j=0;j<c2-c1+1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
