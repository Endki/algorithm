package topInterviewQuestions.Strings;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9,9})));
		
	}
    public static int[] plusOne(int[] digits) {
    	int index=digits.length-1;

    	digits[index]+=1;
    	for(int i=index;i>-1;i--) {
    		if(digits[i]==10) {
    			if(i!=0) {
    				digits[i-1]+=1;
    				digits[i]=0;
    			}else {
    				
    				digits[i]=0;
    				
    				int[] arr=new int[digits.length+1];
    				
    				for(int j=0;j<digits.length;j++) {
    					arr[j+1]=digits[j];
    				}
    				
    				arr[0]=1;
    				
    				return arr;
    			}
    		}
    	}
    	
    	
        return digits;
    }
    
    //똑똑한 사람이 많다..
    //나는 다 바꾸는 걸 선택했지만
    //이 사람은 맨 앞자리 비교로 보다 쉬운 로직으로 구현했다
    public int[] plusOne2(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                break;
            }
            else
            {
                digits[i]=0;
            }
        }
        if(digits[0]==0)
        {
            digits=new int[digits.length+1];
            digits[0]=1;
            return digits;
        }
        return digits;
    }
}
