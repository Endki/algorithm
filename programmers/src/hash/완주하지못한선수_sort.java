package hash;

import java.util.Arrays;

public class 완주하지못한선수_sort {

	public static void main(String[] args) {

		String[] participant= {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant,completion));
		
	}
	 public static String solution(String[] participant, String[] completion) {
			String answer="";

			
			Arrays.parallelSort(participant);
			Arrays.parallelSort(completion);
			
		    for(int i = 0; i<completion.length;i++){
		        if(participant[i].equals(completion[i])){
		            continue;
		        }else {
		            answer = participant[i];
		            break;
		        }
		    }
		    if(answer.equals("")){
		        answer = participant[participant.length-1];
		    }
			
			
			
			return answer;
	    }
}
