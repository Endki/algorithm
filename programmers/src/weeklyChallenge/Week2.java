package weeklyChallenge;

public class Week2 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[][] {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}}));
		System.out.println(solution(new int[][] {{0,0},{0,0}}));
	}
	static public String solution(int[][] scores) {
		
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<scores.length;i++) {
			int maxIndex=i;
			int maxValue=scores[i][i];
			int minIndex=i;
			int minValue=scores[i][i];
			int sum=0;
			for(int j=0;j<scores.length;j++) {
				sum+=scores[j][i];
				if(i==j) {
					continue;
				}
				if(maxValue<=scores[j][i]) {
					maxIndex=j;
					maxValue=scores[j][i];
					
				}
				if(minValue>=scores[j][i]) {
					minIndex=j;
					minValue=scores[j][i];
				}
				
			}
			
			if(i==maxIndex) {
				sum-=maxValue;
				sum/=scores.length-1;
			}else if(i==minIndex) {
				sum-=minValue;
				sum/=scores.length-1;
			}else {
				sum/=scores.length;
			}
			sb.append(grade(sum));
		}
		
		
		
		return sb.toString(); 
	}
	
	static public String grade(int point) {
		
		if(point>=90) {
			return "A";
		}
		
		if(point>=80) {
			return "B";
		}
		if(point>=70) {
			return "C";
		}
		if(point>=50) {
			return "D";
		}
		
		

		return "F";
	}

}
