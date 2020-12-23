package string_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10001];
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 1; i <= 10000; i++) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					bw.write(Integer.toString(i)+"\n");
				
				}
			}
		}
		br.close();
		bw.close();
	}

}
