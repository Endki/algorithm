package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1713 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//input
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int N=Integer.parseInt(br.readLine());
		
		int loop=Integer.parseInt(br.readLine());
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		
		
		
		int[] suArr=new int[101];
		int[] timeArr=new int[101];
		
		
		int time=0;
		int count=0;
		for(int i=0;i<loop;i++) {
			int suggestion=Integer.parseInt(stz.nextToken());
			time++;
			//4. 이미 있으면 추천받은 횟수만 증가시킨다.
			if(suArr[suggestion]>0) {
				suArr[suggestion]+=1;
			}else {
				count=countCheck(suArr);
				
				if(count<N) {
					suArr[suggestion]++;
					timeArr[suggestion]=time;
				}else {
					int minCount=1001;
					
					for(int j=0;j<101;j++) {
						if(suArr[j]==0) {
							continue;
						}
						minCount=Math.min(minCount, suArr[j]);
					}
					
					ArrayList<Integer> minSuggestStudentCount=new ArrayList<Integer>();
					
					for(int j=0;j<101;j++) {
						if(minCount==suArr[j]) {
							minSuggestStudentCount.add(j);
						}
					}
					
					if(minSuggestStudentCount.size()<2) {
						suArr[minSuggestStudentCount.get(0)]=0;
						timeArr[minSuggestStudentCount.get(0)]=0;
					}else {
						int minTime=10000;
						int index=0;
						for(int j=0;j<minSuggestStudentCount.size();j++) {
							
							
							
							if(minTime>timeArr[minSuggestStudentCount.get(j)]) {
								minTime=timeArr[minSuggestStudentCount.get(j)];
								index=minSuggestStudentCount.get(j);
							}
						}
						
						suArr[index]=0;
						timeArr[index]=0;
					}
					
					suArr[suggestion]++;
					timeArr[suggestion]=time;
				}
			}
//			System.out.println(Arrays.toString(timeArr));
		}
		
		for(int i=0;i<101;i++) {
			if(suArr[i]>0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static int countCheck(int[] arr) {
		int count=0;
		for(int i=1;i<101;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		return count;
	}


}
