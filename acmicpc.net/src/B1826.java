import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1826 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		PriorityQueue<station> stations =new PriorityQueue<station>();
		int sum=0;
		for(int i=0;i<N;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			int L=Integer.parseInt(stz.nextToken());
			int F=Integer.parseInt(stz.nextToken());
			
			stations.add(new station(L, F));
			
			sum+=F;
		}

		StringTokenizer stz=new StringTokenizer(br.readLine());
		int goalL=Integer.parseInt(stz.nextToken());
		int goalF=Integer.parseInt(stz.nextToken());
		
		
		if(sum+goalL<goalF) {
			System.out.println(-1);
			return;
		}
		
		int cL=0;
		int rL=goalF;
		int cF=goalF;
		
		station station;
		int solve=0;
		PriorityQueue<station> reachableStations = new PriorityQueue<station>();
		while(rL<goalL) {
			
			while(!stations.isEmpty() && stations.peek().location<=rL) {
				reachableStations.add(stations.remove());
			}
			
			
			if(reachableStations.isEmpty()) {
				solve=-1;
				break;
			}
			
			station=reachableStations.remove();
			solve++;
			
			
			if(station.location<cL) {
				rL+=station.fuel;
				cF+=station.fuel;
			}else {
				int uF=station.location-cL;
				cL=station.location;
				cF=cF+station.fuel-uF;
				rL=cL+cF;
			}
		}
		
		System.out.println(solve);
		
	}
	public static class station implements Comparable<station>{
		int location;
		int fuel;
		
		public station(int location, int fuel) {
			this.location = location;
			this.fuel = fuel;
		}

		@Override
		public int compareTo(station o) {
			
			return this.fuel-o.fuel;
		}
		
		
		
	}

}
