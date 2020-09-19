package de;

import java.util.Arrays;

public class 추석트래픽 {

	public static void main(String[] args) {
		
//		System.out.println(solution(new String[] {"2016-09-15 01:01:01.000 3s"}));
		System.out.println(solution(new String[] {"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"}));
//		System.out.println(solution(new String[] {"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"}));
		System.out.println(solution(new String[] {"2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s", "2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s", "2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s", "2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s"}));
		
	}
	
    static public int solution(String[] lines) {
        int answer = Integer.MIN_VALUE;;
        int len=lines.length;
        if(len==1) {
        	return 1;
        }
        
        
        String[] hour=new String[len];
        String[] min=new String[len];
        String[] sec=new String[len];
        String[] com=new String[len];
        double[] StartTime=new double[len];
        
        double[] EndTime=new double[len];
        
        
        for(int i=0;i<lines.length;i++) {
        	String[] input=lines[i].split(" ");
        	String[] time=input[1].split(":");
        	
        	EndTime[i]=Integer.parseInt(time[0])*3600;
        	EndTime[i]+=Integer.parseInt(time[1])*60;
        	EndTime[i]+=Double.parseDouble(time[2]);
        	
        	com[i]=input[2].substring(0, input[2].length()-1);
        	
        	StartTime[i]=EndTime[i]-Double.parseDouble(com[i]);
        	StartTime[i]+=0.001;
        }

        for(int i=0;i<len;i++) {
        	int count=1;
        	for(int j=i+1;j<len;j++) {
        		if(EndTime[i]+1>StartTime[j]) {
        			count++;
        		}
        	}
        	if(count>answer) {
        		
        		answer=count;
        	}
        }
        
        
        return answer;
    }

}
