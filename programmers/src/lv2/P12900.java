package lv2;

public class P12900 {
    public int solution(int n) {

        int a=1;
        int b=1;
        
        
        for(int i=0;i<n-1;i++){
            int c =(a+b)%1000000007;
            a=b;
            b=c;
            
        }
        
        
        return b;
    }
}
