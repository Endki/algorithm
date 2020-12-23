package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1947 {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int test = Integer.parseInt(br.readLine());
        int[] test_count = new int[test]; 
        
        while(count!=test) {
            int fail_count = 0;
            int N = Integer.parseInt(br.readLine());
            Grade[] g = new Grade[N];
            for(int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                g[i] = new Grade(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            
            Arrays.sort(g); //first_grade 기준으로 정렬
            
            int min=100001;
            int ans=0;
            for(int i=0;i<N;i++){
                if(min>g[i].second_grade){
                    min=g[i].second_grade;
                    ans++;
                }
            }
            
            test_count[count] = ans;
            count++;
        }
        
        for(int i=0; i<test_count.length; i++) {
            System.out.println(test_count[i]);
        }
    }

}

class Grade implements Comparable<Grade>{
    int first_grade;
    int second_grade;
    
    public Grade(int first, int second) {
        first_grade = first;
        second_grade = second;
    }
 
    @Override
    public int compareTo(Grade arg0) {
        return Integer.compare(this.first_grade, arg0.first_grade);
    }
}


//version 1 = 시간 초과
//while (t > 0) {
//	int n = Integer.parseInt(br.readLine());
//	arr = new int[n][2];
//	int sum = 0;
//	for (int i = 0; i < n; i++) {
//		input = br.readLine().split(" ");
//		for (int j = 0; j < 2; j++) {
//			arr[i][j] = Integer.parseInt(input[j]);
//		}
//	}
//	for (int i = 0; i < n; i++) {
//		boolean swt=false;
//		for (int j = 0; j < n; j++) {
//			if (i != j) {
//				if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
//					swt=true;
//				}
//			}
//		}
//		if(swt) {
//			sum++;
//		}
//	}
//
//	System.out.println(n-sum);
//	t--;
//}
