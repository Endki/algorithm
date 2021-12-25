import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B2304 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int max=1;
		ArrayList<Integer> output=new ArrayList<Integer>();
		
		
		for(int i=N;i>=N/2;i--) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			
			list.add(N);
			list.add(i);
			
			int num=N-i;
			
			while(true) {
				if(num<0) {
					break;
				}
				list.add(num);
				num=list.get(list.size()-2)-list.get(list.size()-1);
				
			}
			
			if(max<list.size()) {
				max=list.size();
				output=list;
			}
		}
		
		System.out.println(max);
		for(int i=0;i<output.size();i++) {
			System.out.print(output.get(i)+" ");
		}
	}

}
	