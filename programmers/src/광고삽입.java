import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 광고삽입 {

	public static void main(String[] args) {
		String[] logs=new String[] {"01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"};
		
		//총 시간 , 공익광고 시간 , 재생했던 구간 정보 
		System.out.println(solution("02:03:55", "00:14:15", logs));

		
		
	}
    static public String solution(String play_time, String adv_time, String[] logs) {
        String answer = "123";
        
        //문제의 요점은 시간이 가장 많이 겹치는 시간을 return 하면 되는거 같음!
        
        //convert
        int[] ad=new int[360000];
        int play_sec=convert_Time(play_time);
        int adv_sec=convert_Time(adv_time);
        
  
        for(int i=0;i<logs.length;i++) {
        	String[] input=logs[i].split("-");
        	int logs_start_sec=convert_Time(input[0]);
        	int logs_end_sec=convert_Time(input[1]);
        	for(int j=logs_start_sec;j<logs_end_sec;j++) {
        		ad[j]++;
        	}
        }
        
        int index=0;
        long sum=0;
        long maxSum=0;
        
        Queue<Integer> qu=new LinkedList<Integer>();
        
        for(int i=0;i<adv_sec;i++) {
        	sum+=ad[i];
        	qu.add(ad[i]);
        }
        maxSum=sum;
        for(int i=adv_sec;i<play_sec;i++) {
        	sum+=ad[i];
        	qu.add(ad[i]);
        	sum-=qu.poll();
        	
        	if(sum>maxSum) {
        		
        		index=i-adv_sec+1;
        		maxSum=sum;
        	}
        }
        
        
        answer=time_Convert(index);
        
        
        
        
        return answer;
    }
    
    static public int convert_Time(String time) {
    	StringTokenizer stz=new StringTokenizer(time,":");
        int h=Integer.parseInt(stz.nextToken())*3600;
        int m=Integer.parseInt(stz.nextToken())*60;
        int s=Integer.parseInt(stz.nextToken());
        
        int c_time=h+m+s;
    	
    	
    	return c_time;
    }
    
    static public String time_Convert(int time) {
    	StringBuilder sb=new StringBuilder();
    	int temp=time;
    	
    	int s=temp%60;
    	temp/=60;
    	int m=temp%60;
    	temp/=60;
    	int h=temp;
    	
    	if(h<10) {
    		sb.append("0");
    	}
    	sb.append(h).append(":");
    	
    	if(m<10) {
    		sb.append("0");
    	}
    	sb.append(m).append(":");
    	
    	if(s<10) {
    		sb.append("0");
    	}
    	sb.append(s);
    	
    	return sb.toString();
    }
}
