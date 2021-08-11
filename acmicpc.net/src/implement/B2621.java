package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B2621 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		List<card> list=new ArrayList<card>();
		
		for(int i=0;i<5;i++) {
			String[] input=br.readLine().split(" ");
			
			list.add(new card(input[0],Integer.parseInt(input[1])));
		}
		
		
		Collections.sort(list);
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println(list.get(i).color
		 * +" "+list.get(i).number); }
		 */
		
		System.out.println(getPoint(list));
		
	}
	
	public static int getPoint(List<card> list) {
		
		int[] no=new int[10];
		int max=list.get(4).number;
		List<String> COLOR=new ArrayList<String>();
		List<Integer> NUMBER=new ArrayList<Integer>();
		
		int chain=list.get(4).number-list.get(0).number;
		
		for(int i=0;i<5;i++) {
			card Card=list.get(i);
			
			no[Card.number]++;
			
			if(!NUMBER.contains(Card.number)) {
				NUMBER.add(Card.number);
			}
			
			if(!COLOR.contains(Card.color)) {
				COLOR.add(Card.color);
			}
		}
		
		// 1.카드 5장이 모두 같은 색이면서 숫자가 연속적일 때, 점수는 가장 높은 숫자에 900을 더한다. 예를 들어, 카드가 Y4, Y3, Y2, Y5, Y6 일 때 점수는 906(=6+900)점이다.
		if(COLOR.size()==1 && (NUMBER.size()==5 && chain==4)) {
			return 900+max;
		}
		
		// 2.카드 5장 중 4장의 숫자가 같을 때 점수는 같은 숫자에 800을 더한다. 예를 들어, 카드가 B3, R3, B7, Y3, G3 일 때 점수는 803(=3+800)점이다.
		if(NUMBER.size()==2) {
			if(no[NUMBER.get(0)]==4) {
				return 800+NUMBER.get(0);
			}else if(no[NUMBER.get(1)]==4) {
				return 800+NUMBER.get(1);
			}
		}
		
		// 3.카드 5장 중 3장의 숫자가 같고 나머지 2장도 숫자가 같을 때 점수는 3장이 같은 숫자에 10을 곱하고 2장이 같은 숫자를 더한 다음 700을 더한다. 예를 들어, 카드가 R5, Y5, G7, B5, Y7 일 때 점수는 757(=5x10+7+700)점이다.
		if(NUMBER.size()==2) {
			if(no[NUMBER.get(0)]==3 && no[NUMBER.get(1)]==2) {
				return 700+(NUMBER.get(0)*10)+NUMBER.get(1);
				
				
			}else if(no[NUMBER.get(0)]==2 && no[NUMBER.get(1)]==3) {
				return 700+(NUMBER.get(1)*10)+NUMBER.get(0);
			}
			
		}
		
		// 4.5장의 카드 색깔이 모두 같을 때 점수는 가장 높은 숫자에 600을 더한다. 예를 들어, 카드가 Y3, Y4, Y8, Y6, Y7 일 때 점수는 608(=8+600)점이다.
		if(COLOR.size()==1) {
			return 600+max;
		}
		
		// 5.카드 5장의 숫자가 연속적일 때 점수는 가장 높은 숫자에 500을 더한다. 예를 들어 R7, R8, G9, Y6, B5 일 때 점수는 509(=9+500)점이다.
		if(NUMBER.size()==5 && chain==4) {
			return 500+max;
		}
		
		// 6.카드 5장 중 3장의 숫자가 같을 때 점수는 같은 숫자에 400을 더한다. 예를 들어 R7, Y7, R2, G7, R5 일 때 점수는 407(=7+400)점이다.
		if(NUMBER.size()==3) {
			if(no[NUMBER.get(0)]==3) {
				return NUMBER.get(0)+400;
			}else if(no[NUMBER.get(1)]==3) {
				return NUMBER.get(1)+400;
			}else if(no[NUMBER.get(2)]==3){
				return NUMBER.get(2)+400;
			}
			
			
			
			// 7.카드 5장 중 2장의 숫자가 같고 또 다른 2장의 숫자가 같을 때 점수는 같은 숫자 중 큰 숫자에 10을 곱하고 같은 숫자 중 작은 숫자를 더한 다음 300을 더한다. 예를 들어, R5, Y5, Y4, G9, B4 일 때 점수는 354(=5X10+4+300)점이다.
			if(no[NUMBER.get(0)]==2 && no[NUMBER.get(1)]==2) {
				return 300+((Math.max(NUMBER.get(0), NUMBER.get(1))*10)+(Math.min(NUMBER.get(0), NUMBER.get(1))));
			}else if(no[NUMBER.get(0)]==2 && no[NUMBER.get(2)]==2) {
				return 300+((Math.max(NUMBER.get(0), NUMBER.get(2))*10)+(Math.min(NUMBER.get(0), NUMBER.get(2))));
			}else if(no[NUMBER.get(1)]==2 && no[NUMBER.get(2)]==2) {
				return 300+((Math.max(NUMBER.get(1), NUMBER.get(2))*10)+(Math.min(NUMBER.get(1), NUMBER.get(2))));
			}
		}
		
		
		// 8.카드 5장 중 2장의 숫자가 같을 때 점수는 같은 숫자에 200을 더한다. 예를 들어, R5, Y2, B5, B3, G4 일 때 점수는 205(=5+200)점이다.
		if(NUMBER.size()==4) {
			for(int i=0;i<NUMBER.size();i++) {
				if(no[NUMBER.get(i)]==2) {
					return 200+NUMBER.get(i);
				}
			}
		}
		
		
		// 9.위의 어떤 경우에도 해당하지 않을 때 점수는 가장 큰 숫자에 100을 더한다. 예를 들어, R1, R2, B4, B8, Y5 일 때 점수는 108(=8+100)점이다.
		return 100+max;
	}
}

	class card implements Comparable<card>{
		
		String color;
		int number;

		public card(String color,int number)  {
			super();
			this.number = number;
			this.color = color;
		}

		@Override
		public int compareTo(card o) {
			return this.number-o.number;
		}	
	}