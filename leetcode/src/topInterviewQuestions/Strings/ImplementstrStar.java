package topInterviewQuestions.Strings;

public class ImplementstrStar {

	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issip"));
		
	}
    public static int strStr(String haystack, String needle) {
        
        if(haystack.contains(needle)){
            if(haystack.length()==0 || needle.length()==0){
                if(haystack.length()!=0){
                    return 0;
                }
                
                if(needle.length()!=0){
                    return -1;
                }
                
                return 0;
            }
            
            
        for(int i=0;i<haystack.length();i++){
            
            //첫글자가 같음
            if(haystack.charAt(i)==needle.charAt(0)){
            	int count=0;
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }else {
                    	count++;
                    }
                    
                }
                
                if(count==needle.length()) {
                	return i;
                }
            }
            
        }
            }else{
            return -1;
        }
        return 0;
    }
    
    
    //정답 코드
    public int strStrSolve(String haystack, String needle) {
        if(haystack.length() < needle.length())return -1;
           if(needle.length() == 0)return 0;
           for(int i = 0;i< haystack.length();i++){
               if(i + needle.length() > haystack.length())break;
               if(haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i + needle.length() - 1) == needle.charAt(needle.length() - 1)){
                   for(int j = 0;j< needle.length();j++){
                       if(haystack.charAt(i+j) != needle.charAt(j))break;
                       if(j == needle.length()-1)return i;
                   }
               }
           }
           return -1;
       }
    
}
