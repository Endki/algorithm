package data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B11000 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n][2];
		
		for(int i = 0; i < n ; i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(stz.nextToken());
			}
		}
		//2차월 배열 정렬 0번쨰 열 다음 1번째 열 기준(다중 배열 정렬)
		Arrays.sort(arr, new Comparator<int[]>() {
		    public int compare(int[] o1, int[] o2) {
		    	 if(o1[0] == o2[0]) {
	                   return o1[1] - o2[1];
		    	 }else {
		    		 return o1[0] - o2[0]; 
		    	 }
	           }
	        });
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
                        int end = arr[i][1];
                        //i 번째 강의의 끝나는 시간 저장
                        if(!pQ.isEmpty() && pQ.peek() <= arr[i][0])
                            //큐가 비어있지 않고 && pQ의 첫번째 값이 배열의 
                            //i 번째 강의의 시작시간보다 같거나 작으면
                            pQ.poll();
                            //pQ의 값을 하나 제거
                        pQ.offer(end);
                        //if문이 실행되지 않을시 end값 저장
                    }
                    System.out.println(pQ.size());
                    //남은 큐 값을 출력하면 전체 진행가능한 강의 수가 나옴

	}

}
