package de;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Music {

	public static void main(String[] args) {
		System.out.println(solution("A#", new String[] { "13:00,13:02,HAPPY,B#A#"}));
		System.out.println(solution("ABCDEFG", new String[] { "12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF" }));
		

	}

	static public String solution(String m, String[] musicinfos) {
		String answer = "";
		int len = musicinfos.length;
		String[] sTime = new String[len];
		String[] eTime = new String[len];
		String[] mName = new String[len];
		String[] music = new String[len];
		int[] time = new int[len];

		// #->소문자 변경
		m = m.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("A#", "a").replace("G#", "g");
		
		// 분야별로 나누기
		for (int i = 0; i < len; i++) {
			String[] input = musicinfos[i].split(",");
			sTime[i] = input[0];
			eTime[i] = input[1];
			mName[i] = input[2];
			music[i] = input[3].replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("A#", "a")
					.replace("G#", "g");
			
		}

		// 시간 계산
		for (int i = 0; i < len; i++) {
			time[i] = calTime(sTime[i], eTime[i]);
			
		}

		// 악보 풀세팅

		ArrayList<String> sort=new ArrayList<String>();
		
		for (int i = 0; i < len; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < Math.max(music[i].length(), time[i]); j++) {
				sb.append(music[i].charAt(j % music[i].length()));
			}

			String k = sb.toString();
			if (k.contains(m)) {
				sort.add(musicinfos[i]);
			}

		}
		
		if(sort.isEmpty()) {
	    	return "(None)";
	    }
		
	    Collections.sort(sort, new Comparator<String>() {
	        @Override
	        public int compare(String o1, String o2) {
	            String arr[] = o1.split(",");
	            String arr2[] = o2.split(",");
	            int len1 = calTime(arr[0], arr[1]);
	            int len2 = calTime(arr2[0], arr2[1]);
	            if(len1==len2) {
	            	return len1-len2;
	            }
	            return len2 - len1;
	        }
	    });

	    
	    
	    
	    return sort.get(0).split(",")[2];
	    
	}
	public static int calTime(String sTime,String eTime) {
		String[] arr=sTime.split(":");
		String[] arr2=eTime.split(":");
		
		int sMin=Integer.parseInt(arr[0])*60+Integer.parseInt(arr[1]);
		int eMin=Integer.parseInt(arr2[0])*60+Integer.parseInt(arr2[1]);
		
		return eMin-sMin;
	}
}
