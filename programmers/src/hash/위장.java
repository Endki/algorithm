package hash;
import java.util.HashMap;
import java.util.Set;

public class 위장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] input= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		
		System.out.println(solution(input));

	}

    public static int solution(String[][] clothes) {
        int answer = 1;
        
        
        HashMap<String, Integer> hash=new HashMap<String, Integer>();
        
        for(int i=0;i<clothes.length;i++) {
        	hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 0)+1);
        }
        
        Set<String> keySet=hash.keySet();
        for(String key: keySet) {
        	answer *=hash.get(key)+1;
        }

        return answer-1;
    }
	
	
}
