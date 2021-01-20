import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B1477 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stz = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(stz.nextToken());
		int M = Integer.parseInt(stz.nextToken());
		int L = Integer.parseInt(stz.nextToken());

		ArrayList<Integer> list = new ArrayList<Integer>();

		stz = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(stz.nextToken()));
		}

		while (M-- > 0) {
			Collections.sort(list);
			int max = Integer.MIN_VALUE;
			int index=0;
			for (int i = 0; i < list.size() - 1; i++) {
				int cal = list.get(i + 1) - list.get(i);
				
				if (cal > max) {
					max = cal;
					index=i;
				}
			}
			list.add((list.get(index+1)+list.get(index))/2);
		}
		int min=Integer.MAX_VALUE;
		Collections.sort(list);
		for (int i = 0; i < list.size() - 1; i++) {
			int cal = list.get(i + 1) - list.get(i);
			if (cal < min) {
				min = cal;
			}
		}
//		System.out.println(min);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
