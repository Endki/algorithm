package arrays101;

import java.util.ArrayList;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> solve=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                    solve.add(0);
                    solve.add(0);
            }else{
                solve.add(arr[i]);
            }
        }
        

        for(int i=0;i<arr.length;i++){
            arr[i]=solve.get(i);
        }
    }
}
