package arrays101;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                
                if(arr[i]*2==arr[j]){
                    return true;
                }
            }
        }
        
        return false;
    }
}
