package topInterviewQuestions.Strings;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] arrS=new int[26];
        
        for(int i=0;i<s.length();i++){
            arrS[s.charAt(i)-'a']++;
        }
        
        int[] arrT=new int[26];
        
        for(int i=0;i<t.length();i++){
            arrT[t.charAt(i)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(arrS[i]!=arrT[i]){
                return false;
            }
        }
        return true;
        
    }
}
