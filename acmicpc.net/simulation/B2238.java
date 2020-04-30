package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2238 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int count = Integer.parseInt(input[1]);

		int[] map = new int[10001];
		String[] st_map = new String[10001];
		for (int i = 0; i < count; i++) {
			String[] input2 = br.readLine().split(" ");
			int zc = Integer.parseInt(input2[1]);
			map[zc]++;

			if (st_map[zc] == null) {
				st_map[zc] = input2[0];
			}
		}
		int temp=0;
		int min=1000000;
		for(int i=0;i<10001;i++) {
			if(map[i]!=0 && map[i]<min) {
				min=map[i];
				temp=i;
			}
		}
		System.out.println(st_map[temp]+" "+temp);
	}

}
