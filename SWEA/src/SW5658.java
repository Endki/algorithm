import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SW5658 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(in.readLine());
		
		for(int t=1;t<=T;t++) {
			StringTokenizer st=new StringTokenizer(in.readLine());
			int N=Integer.parseInt(st.nextToken());
			int C=N/4;
			int K=Integer.parseInt(st.nextToken());
			char[] nums=in.readLine().toCharArray();
			
			TreeSet<String> set=new TreeSet<String>(new Comparator<String>() {

				@Override
				public int compare(String arg0, String arg1) {
					// TODO Auto-generated method stub
					return arg1.compareTo(arg0);
				}
			});
			
			
			
			int c=0;
			while(c++<C) {
				for(int i=0;i<N;i+=C) {
					String s="";
					for(int j=0;j<C;j++) {
						s+=nums[i+j];
					}
					set.add(s);
				}
				
				char temp=nums[N-1];
				for(int i=N-1;i>0;i--) {
					nums[i]=nums[i-1];
				}
				nums[0]=temp;
			}
			int k=0,ans=0;
			for(String s: set) {
				if(++k==K) {
					ans=Integer.parseInt(s,16);
					break;
				}
			}
			System.out.println("#"+t+" "+ans);
			
		}

	}

}
