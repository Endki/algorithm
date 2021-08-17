package lv1;

public class P12916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    boolean solution(String s) {

        int countP=0;
        int countY=0;
        for(int i=0;i<s.length();i++){
            char input=s.charAt(i);
            
            if(input=='y' ||input=='Y'){
                countY++;
            }else if(input=='p' || input=='P'){
                countP++;
            }
        }
        
        if(countY==countP){
            return true;
        }else{
            return false;
        }
        
        
    }
}
