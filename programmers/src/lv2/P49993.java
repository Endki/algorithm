package lv2;

public class P49993 {

	public static void main(String[] args) {
		System.out.println(('C'-'A'));

	}
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTree : skill_trees) {
            String temp = skillTree;
            
            for (int i = 0; i < skillTree.length(); i++) {
                String s = skillTree.substring(i, i+1);
                if (!skill.contains(s)) {
                    temp = temp.replace(s, "");
                }
            }
            
            if (skill.indexOf(temp) == 0)
                answer++;
        }
 
        return answer;
    }
}
