package DFS_BFS;

public class Target_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 1, 1, 1, 1 };

		System.out.println(solution(numbers, 3));

	}

	static public int solution(int[] numbers, int target) {
		int start = numbers[0];
		int answer = 0;
		answer += dfs(start, 1, numbers, target); //양수 시작
		answer += dfs(-start, 1, numbers, target); // 마이너스 시작
		return answer;

	}

	static public int dfs(int prev, int index, int[] numbers, int target) {
		if (index >= numbers.length) {
			if (target == prev) {
				return 1;
			}
			return 0;
		}
		int cur1 = prev + numbers[index];
		int cur2 = prev - numbers[index];
		int ans = 0;
		ans += dfs(cur1, index + 1, numbers, target);
		ans += dfs(cur2, index + 1, numbers, target);
		return ans;
	}

}
