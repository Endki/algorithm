package weeklyChallenge;

import java.util.Arrays;

public class Week4 {

	public static void main(String[] args) {
		
		String[] table= {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages= {"PYTHON", "C++", "SQL"};
		int[] preference= {7, 5, 5};
		
		
		System.out.println(solution(table, languages, preference));

	}
    public static String solution(String[] table, String[] languages, int[] preference) {
        Arrays.sort(table);
        String[] name=new String[5];
        int[] solve=new int[5];
        
        for(int i=0;i<5;i++) {
        	String[] arr=table[i].split(" ");
        	//0 = name, 1~5 lang / 1 - 5 , 2 - 4 , 3 - 3 , 4 - 2 , 5 - 1
        	name[i]=arr[0];
        	for(int j=1;j<arr.length;j++) {
        		for(int k=0;k<languages.length;k++) {
        			if(languages[k].equals(arr[j])) {
        				
        				
        				solve[i]+=(6-j)*preference[k];
        				break;
        			}
        		}
        	}
        }

        int index=0;
        int max=-1;
        for(int i=0;i<5;i++) {
        	if(max<solve[i]) {
        		index=i;
        		max=solve[i];
        	}
        }
        return name[index];
    }
}
