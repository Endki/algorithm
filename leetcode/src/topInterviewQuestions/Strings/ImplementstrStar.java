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
    	
    	//니들이 더 크면 계산할 필요없음
        if(haystack.length() < needle.length())return -1;
        
        	//니들이 없으면 무조건 0임
           if(needle.length() == 0)return 0;
           
           
           for(int i = 0;i< haystack.length();i++){
        	   
        	   //예외처리
               if(i + needle.length() > haystack.length())break;
               
               //첫글자와 끝 글자가 같으면 로직 실행
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
