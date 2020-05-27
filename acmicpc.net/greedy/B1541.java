package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    String[] input = br.readLine().split("\\-");

	    int minResult = 0;

	    for (int i = 0; i < input.length; i++) {
	        int calcNum = calc(input[i]);

	        if (i == 0) calcNum *= -1;
	        minResult -= calcNum;
	    }

	    System.out.println(minResult);
		
	}
	private static int calc(String str) {
	    String[] subNums = str.split("\\+");
	    int result = 0;

	    for (String item : subNums) {
	        result += Integer.parseInt(item);
	    }
	    return result;
	}
}
