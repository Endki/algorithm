package lv2;

import java.util.ArrayList;

public class P67257_2 {
	class Solution {
	    public long solution(String expression) {
	        long answer = 0;
	        //0~9 숫자 보이면 짜름
	        String[] numArr=expression.split("[^0-9]");
	        ArrayList<Long> numList=new ArrayList<Long>();
	        for(int i=0;i<numArr.length;i++){
	            numList.add(Long.parseLong(numArr[i]));
	        }
	        
	        String[] opArr=expression.split("[0-9]+");
	        ArrayList<String> opList=new ArrayList<String>();
	        for(int i=1;i<opArr.length;i++){
	            opList.add(opArr[i]);
	        }
	        
	        ArrayList<Long> numTemp;
	        ArrayList<String> opTemp;
	        
	        long max=0;
	        
	        numTemp=new ArrayList<Long>(numList);
	        opTemp=new ArrayList<String>(opList);
	        solve("+","-","*",numTemp,opTemp);
	        max=Math.max(max,Math.abs(numTemp.get(0)));
	        
	        numTemp=new ArrayList<Long>(numList);
	        opTemp=new ArrayList<String>(opList);
	        solve("+","*","-",numTemp,opTemp);
	        max=Math.max(max,Math.abs(numTemp.get(0)));
	        
	        numTemp=new ArrayList<Long>(numList);
	        opTemp=new ArrayList<String>(opList);
	        solve("-","+","*",numTemp,opTemp);
	        max=Math.max(max,Math.abs(numTemp.get(0)));
	        
	        numTemp=new ArrayList<Long>(numList);
	        opTemp=new ArrayList<String>(opList);
	        solve("-","*","+",numTemp,opTemp);
	        max=Math.max(max,Math.abs(numTemp.get(0)));
	        
	        numTemp=new ArrayList<Long>(numList);
	        opTemp=new ArrayList<String>(opList);
	        solve("*","-","+",numTemp,opTemp);
	        max=Math.max(max,Math.abs(numTemp.get(0)));
	        
	        numTemp=new ArrayList<Long>(numList);
	        opTemp=new ArrayList<String>(opList);
	        solve("*","+","-",numTemp,opTemp);
	        max=Math.max(max,Math.abs(numTemp.get(0)));
	        
	        
	        return max;
	    }
	    public void solve(String op1,String op2,String op3,ArrayList<Long> numList,ArrayList<String> opList){
	        calc(numList,opList,op1);
	        calc(numList,opList,op2);
	        calc(numList,opList,op3);
	    }
	    
	    public void calc(ArrayList<Long> numList,ArrayList<String> opList,String operand){
	        int index=0;
	        int leng=opList.size();
	        
	        while(index<leng){
	            if(operand.equals(opList.get(index))){
	                switch(operand){
	                        case "+":
	                            numList.set(index,numList.get(index) + numList.get(index+1));
	                            break;
	                        case "-":
	                            numList.set(index,numList.get(index) - numList.get(index+1));
	                            break;
	                        case "*":
	                            numList.set(index,numList.get(index) * numList.get(index+1));
	                            break;
	                }
	                numList.remove(index+1);
	                opList.remove(index);
	                index--;
	                leng--;
	            }
	            index++;
	        }
	    }
	}
}
