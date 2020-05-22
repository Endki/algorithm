package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5585 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int money=Integer.parseInt(br.readLine());
		
		money=1000-money;
		int count=0;
		while(money!=0) {
			if(money-500>=0) {
				money-=500;
				count++;
			}else if(money-100>=0) {
				money-=100;
				count++;
			}else if(money-50>=0) {
				money-=50;
				count++;
			}else if(money-10>=0) {
				money-=10;
				count++;
			}else if(money-5>=0) {
				money-=5;
				count++;
			}else if(money-1>=0) {
				money-=1;
				count++;
			}
		}
		System.out.println(count);
	}

}
