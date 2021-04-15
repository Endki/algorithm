import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2789 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		String cam="CAMBRIDGE";
		
		StringBuilder sb=new StringBuilder();
		
		input=input.replaceAll("[CAMBRIDGE]", "");

		System.out.println(input);
	}

}
