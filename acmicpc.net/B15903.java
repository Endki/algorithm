import java.util.PriorityQueue;
import java.util.Scanner;

public class B15903 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long CardCount=input.nextLong();
		long CardCom=input.nextLong();

		PriorityQueue<Long> priQue= new PriorityQueue<Long>();

		for(int i=0;i<CardCount;i++){
			priQue.add(input.nextLong());
		}

		for(int j=0;j<CardCom;j++) {
			long temp=priQue.poll();
			temp+=priQue.poll();

			priQue.add(temp);
			priQue.add(temp);
		}

		long sum=0;
		while(!priQue.isEmpty()) {
			sum+=priQue.poll();
		}
		System.out.println(sum);

	}

}
