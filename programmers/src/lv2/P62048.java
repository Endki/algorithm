package lv2;

import java.math.BigInteger;

public class P62048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public long solution(int w, int h) {
        long answer = 1;
        int gcd=BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        answer=((long)w* (long)h) - ((((long)w/gcd) + ((long)h/gcd) -1) * gcd);
        return answer;
    }
}
