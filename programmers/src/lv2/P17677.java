package lv2;

import java.util.ArrayList;
import java.util.Collections;

public class P17677 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int solution(String str1, String str2) {
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        
        ArrayList<String> multiSet1 = new ArrayList<>();
        ArrayList<String> multiSet2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        
        for(int i=0;i<str1.length()-1;i++) {
        	char first=str1.charAt(i);
        	char second=str1.charAt(i+1);
        	
        	if(first>='A' && first<='Z' && second>='A' && second<='Z') {
        		StringBuilder sb=new StringBuilder();
        		sb.append(first).append(second);
        		multiSet1.add(sb.toString());
        	}
        }
        
        for(int i=0;i<str2.length()-1;i++) {
        	char first=str2.charAt(i);
        	char second=str2.charAt(i+1);
        	
        	if(first>='A' && first<='Z' && second>='A' && second<='Z') {
        		StringBuilder sb=new StringBuilder();
        		sb.append(first).append(second);
        		multiSet2.add(sb.toString());
        	}
        }
        
        Collections.sort(multiSet1);
        Collections.sort(multiSet2);
        
        for(String s: multiSet1) {
        	if(multiSet2.remove(s)) {
        		 intersection.add(s);
        	}
        	union.add(s);
        }
        
        for(String s:multiSet2) {
        	union.add(s);
        }
        
        double jakard=0;
        
        if(union.isEmpty()){
        	jakard=1;
        }else {
        	jakard=(double)intersection.size()/(double)union.size();
        }
        
        
        return (int)(jakard*65536);
    }
}
