package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2596 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		String[] input=new String[N+1];
		
		String k=br.readLine();
		
		for(int i=1;i<=N;i++) {
			input[i]=k.substring((6*(i-1)), 6*i);
		}

		System.out.println(solve(input));		
	}
	private static String solve(String[] input){
		
		StringBuilder sb=new StringBuilder();
		outer : for(int i=1; i<input.length; i++) {
			switch (input[i]) {
			case "000000":
				sb.append('A');
				break;
			case "100000":
				sb.append('A');
				break;
			case "010000":
				sb.append('A');
				break;
			case "001000":
				sb.append('A');
				break;
			case "000100":
				sb.append('A');
				break;
			case "000010":
				sb.append('A');
				break;
			case "000001":
				sb.append('A');
				break;
			case "001111":
				sb.append('B');
				break;
			case "101111":
				sb.append('B');
				break;
			case "011111":
				sb.append('B');
				break;
			case "000111":
				sb.append('B');
				break;
			case "001011":
				sb.append('B');
				break;
			case "001101":
				sb.append('B');
				break;
			case "001110":
				sb.append('B');
				break;
			case "010011":
				sb.append('C');
				break;
			case "110011":
				sb.append('C');
				break;
			case "000011":
				sb.append('C');
				break;
			case "011011":
				sb.append('C');
				break;
			case "010111":
				sb.append('C');
				break;
			case "010001":
				sb.append('C');
				break;
			case "010010":
				sb.append('C');
				break;
			case "011100":
				sb.append('D');
				break;
			case "111100":
				sb.append('D');
				break;
			case "001100":
				sb.append('D');
				break;
			case "010100":
				sb.append('D');
				break;
			case "011000":
				sb.append('D');
				break;
			case "011110":
				sb.append('D');
				break;
			case "011101":
				sb.append('D');
				break;
			case "100110":
				sb.append('E');
				break;
			case "000110":
				sb.append('E');
				break;
			case "110110":
				sb.append('E');
				break;
			case "101110":
				sb.append('E');
				break;
			case "100010":
				sb.append('E');
				break;
			case "100100":
				sb.append('E');
				break;
			case "100111":
				sb.append('E');
				break;
			case "101001":
				sb.append('F');
				break;
			case "001001":
				sb.append('F');
				break;
			case "111001":
				sb.append('F');
				break;
			case "100001":
				sb.append('F');
				break;
			case "101101":
				sb.append('F');
				break;
			case "101011":
				sb.append('F');
				break;
			case "101000":
				sb.append('F');
				break;
			case "110101":
				sb.append('G');
				break;
			case "010101":
				sb.append('G');
				break;
			case "100101":
				sb.append('G');
				break;
			case "111101":
				sb.append('G');
				break;
			case "110001":
				sb.append('G');
				break;
			case "110111":
				sb.append('G');
				break;
			case "110100":
				sb.append('G');
				break;
			case "111010":
				sb.append('H');
				break;
			case "011010":
				sb.append('H');
				break;
			case "101010":
				sb.append('H');
				break;
			case "110010":
				sb.append('H');
				break;
			case "111110":
				sb.append('H');
				break;
			case "111000":
				sb.append('H');
				break;
			case "111011":
				sb.append('H');
				break;
			default:
				sb.setLength(0);
				sb.append(i);
				break outer;
				
			}
			
		}
	
		return sb.toString();
	}
	
}
