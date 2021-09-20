package lv2;

import java.util.Arrays;
import java.util.HashSet;

public class P640 {

	public static void main(String[] args) {
		System.out.println(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));

	}
    public static int[] solution(String s) {
        int[] answer = {};
        String[] input=s.replaceAll("[{}]", " ").trim().split(" ,");
        answer = new int[input.length];
        
        int index=0;
        Arrays.sort(input, (a,b)->(a.length()-b.length()));
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(String str : input){
            for(String st : str.split(",")){
                int a=Integer.parseInt(st.trim());
                if(set.contains(a)){
                    continue;
                }
                set.add(a);
                answer[index++]=a;
            }
        }
        
        return answer;
    }
}
