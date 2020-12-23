package implement;
public class B4673 {

	public static void main(String[] args) {

		int[] arr = new int[10001];

		for (int i = 1; i < 10001; i++) {
			
			
			int count = solve(i);
			if(count<10000) {
			arr[count] = 10000;
			}
		}

		for (int i = 1; i < 10000; i++) {
			if (arr[i] != 10000) {
				System.out.println(i);
			}
		}
	}

	public static int solve(int n) {
		int sum = n;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
