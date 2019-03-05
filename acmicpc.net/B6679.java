import java.util.Arrays;

public class B6679 {

	public static void main(String[] args) {

		int A=0,B=0,C=0;
		int sumA=0,sumB=0,sumC=0;
		int[] ArrayA=new int[4];
		int[] ArrayB=new int[4];
		int[] ArrayC=new int[4];
		
		for(int i=1000;i<10000;i++) {
			//10진수
			ArrayA[3]=i/1000;
			ArrayA[2]=(i%1000)/100;
			ArrayA[1]=((i%1000)%100)/10;
			ArrayA[0]=i%10;
			
			for(int j=0;j<4;j++) {
				sumA+=ArrayA[j];
			}
		//	System.out.println(sumA+" : AAAAA");
			//12진수
			ArrayB[3]=i/1728;
			ArrayB[2]=(i%1728)/144;
			ArrayB[1]=((i%1728)%144)/12;
			ArrayB[0]=i%12;
			for(int j=0;j<4;j++) {
				sumB+=ArrayB[j];
			}	
		//	System.out.println(sumB+" : BBBBB");
			//16진수
			ArrayC[3]=i/(16*16*16);
			ArrayC[2]=(i%(16*16*16))/(16*16);
			ArrayC[1]=((i%(16*16*16))%(16*16))/16;
			ArrayC[0]=i%16;
			for(int j=0;j<4;j++) {
				sumC+=ArrayC[j];
			}	
		//	System.out.println(sumC+" : CCCCC");
			
			if(sumA==sumB) {
				if(sumA==sumC) {
					System.out.println(i);
				}
			}
			sumA=0;
			sumB=0;
			sumC=0;
		}
	}

}
