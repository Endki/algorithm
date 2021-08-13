package lv1;

public class P12901 {

	public static void main(String[] args) {

		System.out.println(solution(5, 24));
	}
    public static String solution(int a, int b) {
        int sum = 0;
        String week[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int month[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        
        
        for(int i=0;i<a-1;i++){
            sum += month[i];
        }
        sum += b-1;
        String answer = week[sum%7];
        return answer;
      }

}
