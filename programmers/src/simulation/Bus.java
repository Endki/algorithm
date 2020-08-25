package simulation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bus {
	public static void main(String[] args) {
//		System.out.println(solution(1, 1, 5, new String[] {"01:20", "12:31", "13:52", "14:03"}));
//		System.out.println(solution(1, 1, 5, new String[] { "08:00", "08:01", "08:02", "08:03" }));
//		System.out.println(solution(2, 10, 2, new String[] {"09:10", "09:09", "08:00"}));
//		System.out.println(solution(2, 1, 2, new String[] {"09:00", "09:00", "09:00", "09:00"}));
//		System.out.println(solution(1, 1, 5, new String[] {"00:01", "00:01", "00:01", "00:01", "00:01"}));
//		System.out.println(solution(1, 1, 1, new String[] {"23:59"}));
//		System.out.println(solution(10, 60, 2, new String[] { "09:00", "09:00" }));

//		System.out.println(solution(16, 60, 45, new String[] {"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
	}

	static public String solution(int n, int t, int m, String[] timetable) {
		String answer = "";
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

		while (!qu.isEmpty()) {
			if (m > qu.size()) {
				// 대기자보다 태울 수 있는 사람 수 가 많으면 막차 타도된다.
				return transTime(lastBusTime);
			}

			// 대기자와 좌석 숫자가 동일

			if (m == qu.size()) {
					for (int i = 0; i < m; i++) {

						if (qu.peek() <= lastBusTime) {
							if (qu.size() == 1) {
								// 마지막 자리 1분 일찍 간다.
								return transTime(qu.peek() - 1);
							}
							qu.poll();
						} else if (qu.peek() > lastBusTime) {
							// 남은 친구가 이미 지각인 경우 마지막 시간에 맞춰서 타면된다.
							return transTime(lastBusTime);
						}
					}
				
			}

			// 사이즈가 더 큰경우
			// 앞에 차 타는 경우
			for (int i = 0; i < m; i++) {
				// 먼저 가소~

				if (qu.peek() <= realBusTime) {
					qu.poll();
				}

			}
			// 다음 차 시간
			realBusTime += t;
		}
		// output
		return answer;
	}

	public static String transTime(int min) {
		int hour = min / 60;

		if (hour >= 24) {
			hour -= 24;
		}

		String output = String.format("%02d", hour);
		output += ":";
		output += String.format("%02d", min % 60);

		return output;
	}
}
