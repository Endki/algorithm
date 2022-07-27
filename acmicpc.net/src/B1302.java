import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B1302 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		int N=Integer.parseInt(br.readLine());
		
		int max=0;
		String output="";
		
		while(N-->0) {
			String input=br.readLine();
			
			if(hashmap.containsKey(input)) {
				hashmap.put(input, hashmap.get(input)+1);
			}else {
				hashmap.put(input, 1);
			}
		}
		
		for(String key : hashmap.keySet()) {
			int value = hashmap.get(key);
			
			if(max == value && output.compareTo(key) > 0 ) {
				max=value;
				output=key;
			}else if(max<value) {
				max=value;
				output=key;
			}
		}
		System.out.println(output);
	}


}
