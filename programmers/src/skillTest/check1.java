package skillTest;

import java.math.BigInteger;

public class check1{
	public static void main(String[] args) {
	
		BigInteger n =new BigInteger("50000000000000");
		
		
		for(int i=1;i<=500;i++) {
			
		System.out.println(i+" "+solution(i));
		}
		
	}
	static public long solution(long n) {
		
	      long answer = -1;
	      double doubleSqrt = Math.sqrt(n);
	      int intSqrt = (int)doubleSqrt;
	      return intSqrt == doubleSqrt ? (long)Math.pow(intSqrt+1,2) : -1; 
	}
}
