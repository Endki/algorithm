package lv1;

public class P77884 {

	public static void main(String[] args) {
		
		System.out.println(solution(13, 17));

	}

	
    public static int solution(int left, int right) {
        int answer = 0;
        int[] arr=new int[1001];
        
        for(int i=1;i<1001;i++) {
        	int count=0;
        	for(int j=1;j<=i;j++) {
        		if(i%j==0) {
        			count++;
        		}
        	}
        	arr[i]=count;
        }
        for(int i=left;i<=right;i++) {
        	if(arr[i]%2==1) {
        		answer-=i;
        	}else {
        		answer+=i;
        	}
        }
        
        
        return answer;
    }
    
//    public static int cal(int num) {
//    	
//    	int count=0;
//    	
//    	for(int i=1;i<=num;i++) {
//    		if(num%i==0) {
//    			count++;
//    		}
//    	}
//    	
//    	System.out.println(num+" "+count);
//    	return count;
//    }
}
