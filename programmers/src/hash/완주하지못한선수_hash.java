package hash;

import java.util.HashMap;

public class 완주하지못한선수_hash {

	public static void main(String[] args) {

		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		System.out.println(solution(participant, completion));
	}

	private static String solution(String[] participant, String[] completion) {
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();

		for (String arg : participant)
			hash.put(arg, hash.getOrDefault(arg, 0) + 1);
		for (String arg : completion)
			hash.put(arg, hash.get(arg) - 1);

		for (String key : hash.keySet()) {
			if (hash.get(key) != 0)
				return key;
		}
		
		return null;
	}

}
