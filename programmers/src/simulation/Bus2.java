package simulation;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bus2 {
	public static void main(String[] args) {
//		System.out.println(solution(1, 1, 5, new String[] {"01:20", "12:31", "13:52", "14:03"}));
//		System.out.println(solution(1, 1, 5, new String[] { "08:00", "08:01", "08:02", "08:03" }));
//		System.out.println(solution(2, 10, 2, new String[] {"09:10", "09:09", "08:00"}));
//		System.out.println(solution(2, 1, 2, new String[] {"09:00", "09:00", "09:00", "09:00"}));
//		System.out.println(solution(1, 1, 5, new String[] {"00:01", "00:01", "00:01", "00:01", "00:01"}));
//		System.out.println(solution(1, 1, 1, new String[] {"23:59"}));
//		System.out.println(solution(10, 60, 2, new String[] { "23:01", "23:00" }));

//		System.out.println(solution(10, 60, 45, new String[] {"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
	}

	//시뮬레이션
	static public String solution(int n, int t, int m, String[] timetable) {
		String[] input = new String[2];// 시간 변환용
		Queue<Integer> qu = new LinkedList<Integer>();
		
		
		int lastBusTime = ((n - 1) * t) + 540;
		int realBusTime = 540;
		// input
		// 시간 순 정렬 작은 시간이 앞으로!
		Arrays.sort(timetable);
		for (int i = 0; i < timetable.length; i++) {
			input = timetable[i].split(":");
			int temp = Integer.parseInt(input[0]) * 60; // 시 변환
			temp += Integer.parseInt(input[1]); // 분 변환
			qu.offer(temp);
		}

		// solve
		while(true) {
			
			
			//막차가 되버림
			if(realBusTime==lastBusTime) {
				//좌석이 널널해 - 시간 맞춰서가면 탈 수 있다.
				if(qu.size()<m) { 
					return transTime(lastBusTime);
				}
				//좌석이 부족한 경우
				else if(qu.size()>=m) {
					
					//근데 사원들이 지각이래 - 시간 맞춰서가면 탈 수 있다.
					if(qu.peek()>lastBusTime) {
						return transTime(lastBusTime);
					}
					
					//지각 아니래 
					//대기자들 다 빼버리고 
					for(int i=0;i<m-1;i++) {
						qu.poll();
					}
					//꼴찌 1분 빠르게 
					return transTime(qu.poll()-1);
				}
			}
		
			//좌석 체크를 위한 index
			int count=0;
			
			//전체 인원 검색
			for(int i=0;i<qu.size();i++) {	
				//좌석이 꽉찼으면 아무리 일찍왔어도 못탐
				if(count==m) {
					break;
				}
				//대기자가 현재시간보다 일찍왔거나,정시에 도착했을경우
				if(qu.peek()<=realBusTime) {
					qu.poll(); //먼저 감
					count++;  //index 증가
				}
			}
			
			//현재 오는 버스 시간 증가
			realBusTime+=t;
		}

	}

	public static String transTime(int min) {
		int hour = min / 60;

		if (hour >= 24) {
			hour -= 24;
		}

		String output = String.format("%02d", hour)+":"+String.format("%02d", min % 60);
//		output += ":";
//		output += String.format("%02d", min % 60);

		return output;
	}
}
