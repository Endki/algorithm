package implement;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1. 전체 치킨집 중에서 M개의 치킨집을 선택하고
 * 2. 선택된 M개의 치킨집 조합으로 도시의 치킨거리 계산
 * 3. 매번의 치킨집 조합으로 계산된 치킨거리 중 제일 작은 값 찾아서 업데이트
 */

public class B15686_2 {

	static int N;
	static int M;

	static ArrayList<Node> homes;
	static ArrayList<Node> chickens;

	static Node[] selected;
	static int Min_Dist = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		homes = new ArrayList<>();
		chickens = new ArrayList<>();

		selected = new Node[M];// 전체 치킨집중 M개 골라서 저장

		// input

		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				int val = sc.nextInt();

				if (val == 1) {
					homes.add(new Node(x, y));
				}
				if (val == 2) {
					chickens.add(new Node(x, y));
				}

			}
		}

		//M개의 치킨집을 선택
		select(0, 0);

		
		//최종값 출력
		System.out.println(Min_Dist);

	}

	private static void select(int start, int count) {
		if (count == M) {//한개의 조합이 완성
			chickenDistance(); //완성된 조합내용을 가지고 도시의 치킨 거리 계산 메소드
			return;
		}

		
		for(int i=start;i<chickens.size();i++) {
			selected[count]=chickens.get(i);
			select(start+1,count+1);
		}
		
	}
	
	//도시의 치킨 거리 계산
	public static void chickenDistance() {
		int sum=0;
		
		for(Node home:homes) {//각집에 대해 모든 치킨집과의 거리계산
			int min=Integer.MAX_VALUE;
			
			for(Node chicken : selected) {//모든 치킨집
				int dist=Math.abs(chicken.x-home.x)+Math.abs(chicken.y-home.y);
				min=Math.min(min, dist);
			}
			
			sum+=min;
			
			if(sum>Min_Dist) {
				return;
			}
		}
		
		Min_Dist=Math.min(Min_Dist, sum);
		
	}

	static public class Node {
		int x;
		int y;

		public Node(int x, int y) {

			this.x = x;
			this.y = y;
		}

	}
}
