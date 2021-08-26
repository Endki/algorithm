package lv2;

import java.util.Arrays;

public class P42885 {

	public static void main(String[] args) {
		int[] people= {70,50, 80, 50};
		int[] people2= {70, 80, 50};
		System.out.println(solution(people, 100));
		System.out.println(solution(people2, 100));

	}

    public static int solution(int[] people, int limit) {
        int answer = 0;
        
        //제일 무게가 많이 나가는 사람과 적게 나가는 사람끼리 보내주면 된다.
        
        int left=0;
        int right=people.length-1;
        Arrays.sort(people);
        
        
        
        while(left<=right) {
        	if(people[left]+people[right]<=limit) {
        		left++;
        	}
        	
        	right--;
        	answer++;
        	
        }
        
        return answer;
    }
}
