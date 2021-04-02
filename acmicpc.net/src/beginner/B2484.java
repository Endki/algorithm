package beginner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2484 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int testCase = Integer.parseInt(br.readLine());

		int max = 0;

		for (int i = 0; i < testCase; i++) { // 입력받은 테스트케이스 만큼 반복
			int[] arr = new int[4]; // 입력 받은 주사위의 결과를 저장할 배열

			int sameCount = 0; // 앞, 뒤의 주사위 결과가 같은 지를 저장하는 변수
			int diffCount = 0; // 앞, 뒤의 주사위 결과가 다른 지를 저장하는 변수
			int flag = 0; // 같은 눈이 2개씩 두 쌍이 나오는 경우를 구별하기 위한 변수

			int sameNumber = 0; // 같은 주사위의 결과가 어떤 것인 지 저장하는 변수

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 4; j++) { // 주자위의 결과를 입력받음
				arr[j] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr); // 주사위 결과의 배열 정렬

			for (int j = 0; j < 3; j++) {
				if (arr[j] == arr[j + 1]) { // 앞, 뒤의 주사위의 결과가 같은 경우
					sameCount++;
					sameNumber = arr[j];
				} else if (arr[j] != arr[j + 1] && j == 1) { // 앞, 뒤의 주사위의 결과가 다른 경우 (같은 눈이 2개씩 두 쌍이 나오는 경우)
					diffCount++;
					flag++;
				} else // 앞, 뒤의 주사위의 결과가 다른 경우
					diffCount++;
			}

			int result = 0;

			/** 변수의 내용을 보고 상금 액수 계산 */
			if (sameCount == 3 && diffCount == 0)
				result = 50000 + sameNumber * 5000;
			else if (sameCount == 2 && diffCount == 1 && flag == 0)
				result = 10000 + sameNumber * 1000;
			else if (sameCount == 2 && diffCount == 1 && flag == 1)
				result = 2000 + arr[0] * 500 + arr[2] * 500;
			else if (sameCount == 1 && diffCount == 2)
				result = 1000 + sameNumber * 100;
			else if (sameCount == 0 && diffCount == 3)
				result = arr[3] * 100;

			if (result > max) // 가장 큰 상금 액수 계산
				max = result;

		}

		bw.write(max + "\n");
		bw.close();

	}
	
}
