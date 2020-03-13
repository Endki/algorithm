import java.util.Arrays;
import java.util.Scanner;

public class B12791 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int t=input.nextInt();
		int[] songYear={1967,1969,1970,1971,1972,1973,1973,1974,1975,1976,1977,1977,1979,1980,1983,1984,1987,1993,1995,1997,1999,2002,2003,2013,2016};
		String[] songName= {"DavidBowie","SpaceOddity","TheManWhoSoldTheWorld","HunkyDory","TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars","AladdinSane","PinUps","DiamondDogs","YoungAmericans","StationToStation","Low","Heroes","Lodger","ScaryMonstersAndSuperCreeps","LetsDance","Tonight","NeverLetMeDown","BlackTieWhiteNoise","1.Outside","Earthling","Hours","Heathen","Reality","TheNextDay","BlackStar"};
		
		
//		System.out.println(Arrays.toString(songYear));
		int yearCount=0;
		for(int i=0;i<t;i++) {
			int s=input.nextInt();
			int e=input.nextInt();
			
			int count=0;
			for(int j=0;j<25;j++) {
				for(int k=s;k<=e;k++) {
					if(songYear[j]==k) {
						count++;
					}
				}
				
			}
			System.out.println(count);
			for(int m=0;m<25;m++) {
				for(int k=s;k<=e;k++) {
					if(songYear[m]==k) {
						System.out.print(songYear[m]+" ");
						System.out.println(songName[m]);
					}
				}
				
				
			}
		}

	}

}
