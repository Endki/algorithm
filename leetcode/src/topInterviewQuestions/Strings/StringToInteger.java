package topInterviewQuestions.Strings;

public class StringToInteger {

	public static void main(String[] args) {
//		System.out.println(myAtoi("-42qweqweqwe"));
		System.out.println(myAtoi("words and 987"));

	}

	public static int myAtoi(String s) {
		s = s.trim();
		if (s == null || s.length() == 0) {
			return 0;
		}
		;
		char firstChar = s.charAt(0);
		int sign = 1, start = 0, len = s.length();
		long sum = 0;
		if (firstChar == '+') {
			sign = 1;
			start++;
		} else if (firstChar == '-') {
			sign = -1;
			start++;
		}
		for (int i = start; i < len; i++) {
			if (!Character.isDigit(s.charAt(i)))
				return (int) sum * sign;
			sum = sum * 10 + s.charAt(i) - '0';
			if (sign == 1 && sum > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}

		return (int) sum * sign;
	}
}
