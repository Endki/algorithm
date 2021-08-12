package lv1;

public class P81301 {

	public static void main(String[] args) {
		
		System.out.println(solution("one4seveneight"));
	}
	
	
	public static int solution(String s) {
		
		s=s.replace("one", "1").replace("zero", "0").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7").replace("eight", "8").replace("nine", "9");
		return Integer.parseInt(s);
	}
}
