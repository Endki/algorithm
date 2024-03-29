package lv2;

import java.util.Arrays;
import java.util.Comparator;

public class P42746 {

	public static void main(String[] args) {
		
		int[] numbers=new int[] {6,10,2};
		int[] numbers2=new int[] {3,30,34,5,9};
		
		System.out.println(solution(numbers));
		System.out.println(solution(numbers2));

	}
    public static String solution(int[] numbers) {
        
        String[] input=new String[numbers.length];
        
        for(int i=0;i<numbers.length;i++) {
        	input[i]=String.valueOf(numbers[i]);
        }
        
        Arrays.sort(input,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return (o2+o1).compareTo(o1+o2);
			}
        	
        });
        
        if(input[0].equals("0")) {
        	return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String str: input) {
        	sb.append(str);
        }
        
        
        return sb.toString();
    }
}
