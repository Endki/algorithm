package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*191016*/

public class B6378 {

	public static void main(String[] args) throws IOException {

		BufferedReader inputk = new BufferedReader(new InputStreamReader(System.in));

		String input;

		StringBuilder output = new StringBuilder();

		for(;;) {
			input=inputk.readLine();
			if(input.length()==1){
                
			    if(Integer.parseInt(input)==0) {
			    	break;
			    }
            }
			output.append(digital_root(input) + "\n");
		}

		System.out.println(output.toString());

	}

	public static int digital_root(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			sum += input.charAt(i) - '0';
		} // ?””ì§??„¸ ë£¨íŠ¸ ê³„ì‚°

		if (sum < 10) {
			return sum;
		} else {
			return digital_root(String.valueOf(sum));
		}

	}

}
