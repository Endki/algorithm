package lv1;

public class P67256 {

	public static void main(String[] args) {

		
		System.out.println(solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
	}

	
    public static String solution(int[] numbers, String hand) {
        
        StringBuilder sb=new StringBuilder();
        int recentL=10;
        int recentR=12;
        
        for(int i=0;i<numbers.length;i++) {
        	switch (numbers[i]) {
			case 1:
				sb.append("L");
				recentL=1;
				break;
				
			case 4:
				sb.append("L");
				recentL=4;
				break;
				
			case 7:
				sb.append("L");
				recentL=7;
				break;
				
			case 3:
				sb.append("R");
				recentR=3;
				break;
				
			case 6:
				sb.append("R");
				recentR=6;
				break;
				
			case 9:
				sb.append("R");
				recentR=9;
				break;
				
			default:
				int leftLength=getLength(recentL, numbers[i]);
				int rightLength=getLength(recentR, numbers[i]);
				
				if(leftLength>rightLength) {
					sb.append("R");
					recentR=numbers[i];
				}else if(leftLength<rightLength) {
					sb.append("L");
					recentL=numbers[i];
				}else {
					if(hand.equals("right")) {
						sb.append("R");
						recentR=numbers[i];
					}else {
						sb.append("L");
						recentL=numbers[i];
					}
				}
				
				break;
			}
        }
        
        return sb.toString();
    }

	public static int getLength(int index, int number) {
		index = (index == 0) ? 11 : index;	
		number = (number == 0) ? 11 : number;

		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int numberX = number / 3;
		int numberY = 1;

		return Math.abs(x-numberX) + Math.abs(y-numberY);
	}
}
