import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B10825 {

	static public class Student implements Comparable<Student>{
		String name;
		int kor;
		int eng;
		int math;
		
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}

		@Override
		public int compareTo(Student o) {
			if(this.kor==o.kor) {
				if(this.eng==o.eng) {
					if(this.math==o.math) {
						return this.name.compareTo(o.name);
					}
					
					return o.math-this.math;
				}
				
				return this.eng-o.eng;
			}
			
			
			return o.kor-this.kor;
		}

	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		PriorityQueue<Student> pq=new PriorityQueue<Student>();
		for(int i=0;i<N;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			String name=stz.nextToken();
			int kor=Integer.parseInt(stz.nextToken());
			int eng=Integer.parseInt(stz.nextToken());
			int math=Integer.parseInt(stz.nextToken());
			pq.add(new Student(name, kor, eng, math));
		}
		
		while(!pq.isEmpty())
			System.out.println(pq.poll().name);
	}

}
