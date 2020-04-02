import java.util.LinkedList;
import java.util.Scanner;

public class B1158 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> linked = new LinkedList<Integer>();

		int n = input.nextInt();
		int k = input.nextInt();
		int pivot=k-1;
		
		for (int i = 0; i < n; i++) {
			linked.addLast(i+1);
		}
		System.out.print("<");
		for (int i = 0; i <n; i++) {
			
			while(pivot>=linked.size()) {
				pivot-=linked.size();
			}
			
			if (i == n-1 ) {
				System.out.print(linked.remove(0));
			}else {
				
			System.out.print(linked.remove(pivot) + ", ");
			pivot+=k-1;
			}
		}
		System.out.println(">");
	}

}
